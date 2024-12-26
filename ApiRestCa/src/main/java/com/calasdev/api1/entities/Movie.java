package com.calasdev.api1.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Title must not be blank and must be between 1 and 100 characters
    @NotBlank(message = "Title is mandatory")
    @Size(max = 100, message = "Title cannot be longer than 100 characters")
    private String title;

    // Director must not be blank and must be between 1 and 50 characters
    @NotBlank(message = "Director is mandatory")
    @Size(max = 50, message = "Director's name cannot be longer than 50 characters")
    private String director;

    // Genre must not be blank and must be between 1 and 30 characters
    @NotBlank(message = "Genre is mandatory")
    @Size(max = 30, message = "Genre cannot be longer than 30 characters")
    private String genre;


}
