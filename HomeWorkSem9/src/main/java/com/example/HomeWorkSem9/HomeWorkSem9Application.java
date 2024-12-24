package com.example.HomeWorkSem9;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class HomeWorkSem9Application {

	public static void main(String[] args) {
		SpringApplication.run(HomeWorkSem9Application.class, args);
	}

	@Bean
	public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
		return builder.routes()
				.route("ServiceProducts",r->r.path("/serviceProducts/**")
						.uri("http://localhost:8081/"))
				.route("ServiceCart",r->r.path("/serviceCart/**")
						.uri("http://localhost:8082/"))
				.route("ServiceFeedback",r->r.path("/serviceFeedback/**")
						.uri("http://localhost:8083/")).build();

	}

}
