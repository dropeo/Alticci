package org.alticci.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;

@Configuration
public class SwaggerConfiguration {

  @Bean
  public OpenAPI swagger() {
    return new OpenAPI()
        .info(new Info().title("API Alticci")
            .description("Projeto Alticci")
            .version("")
            .contact(
                new Contact()
                    .name("João Pedro de Oliveira")
                    .email("ptjpoliveira@gmail.com")
                    .url("https://github.com/dropeo")
                )
            );
  }
}