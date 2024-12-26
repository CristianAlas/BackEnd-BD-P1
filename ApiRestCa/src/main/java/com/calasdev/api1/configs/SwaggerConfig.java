package com.calasdev.api1.configs;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition(
    info = @io.swagger.v3.oas.annotations.info.Info(
            title = "API REST CA",
            version = "1.0",
            description = "API REST CA"
    )
)
public class SwaggerConfig {


}
