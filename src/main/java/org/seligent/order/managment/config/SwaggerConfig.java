package org.seligent.order.managment.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2 // swagger 2 is enabled through this annotation
/*
* There are some breaking changes in Spring Boot 2 with Swagger 2 which affect the auto configuration of Swagger UI.
* To configure support for Swagger UI with Spring Boot 2, you need to extend the class WebMvcConfigurationSupport and
* add two resource handlers.*/
public class SwaggerConfig extends WebMvcConfigurationSupport {

    /*
    * select() method returns an instance of ApiSelectorBuilder
    * which provides a way to control the endpoints exposed by Swagger.
    *
    *
    * Predicates for selection of RequestHandlers can be configured with the help of RequestHandlerSelectors and PathSelectors.
    *  Using any() for both will make documentation for your entire API available through Swagger.*/
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build();
    }

    @Override
    protected void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("swagger-ui.html")
                .addResourceLocations("classpath:/META-INF/resources/");
        registry.addResourceHandler("/webjars/**")
                .addResourceLocations("classpath:/META-INF/resources/webjars/");
    }
}
