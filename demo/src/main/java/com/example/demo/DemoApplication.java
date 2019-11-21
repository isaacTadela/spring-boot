package com.example.demo;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	
	@Bean
	public Docket swaggerConfiguration() {
		// Return a prepared Docket instance(not docker)
		return new Docket(DocumentationType.SWAGGER_2)
				.select().apis(RequestHandlerSelectors.basePackage("com.example.demo"))
				.build().apiInfo(apiDettails());
	}
	
	private ApiInfo apiDettails() {
		return new ApiInfo(
				"Inventory  API",
				"Since i am new to swagger used the JavaBrains tutorial",
				"1.0",
				"I 'ould like to receive your feedback even if I did not pass",
				new springfox.documentation.service.Contact("Itzhak Tadela", "https://github.com/isaacTadela/spring-boot" , "iitzhakk@gmail.com"),
				"API License",
				"https://github.com/isaacTadela",
				Collections.emptyList()
				);
	}

}
