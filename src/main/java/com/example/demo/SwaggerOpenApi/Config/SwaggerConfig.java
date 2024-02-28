package com.example.demo.SwaggerOpenApi.Config;

import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
public class SwaggerConfig {
    @Bean
    GroupedOpenApi apiV1() {
        return GroupedOpenApi  .builder().group("v1").pathsToMatch("/v1/**").build();
    }
}
