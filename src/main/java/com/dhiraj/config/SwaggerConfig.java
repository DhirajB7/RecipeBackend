package com.dhiraj.config;

import java.util.function.Predicate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

	@Bean

	public Docket docket() {

		return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo()).select()
				.apis(Predicate.not(RequestHandlerSelectors.basePackage("org.springframework.boot"))).build();

	}

	private ApiInfo apiInfo() {

		return new ApiInfoBuilder().title("Recipe API Documentation")
				.description("THIS IS DETAILS OF APIs FOR RECIPI APP").version("v1.0").termsOfServiceUrl("Open Source")
				.license("OPEN").build();

	}

}
