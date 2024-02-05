package com.example.api_gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.config.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class ApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiGatewayApplication.class, args);
	}
        
        
        @Bean
        public WebMvcConfigurer corsConfigurer() {
	return new WebMvcConfigurer() {
            @Override
		public void addCorsMappings(org.springframework.web.servlet.config.annotation.CorsRegistry registry) {
                    //we can provide other routes, further than the "/**".
			registry.addMapping("/**").allowedOrigins("http://localhost:5173").allowedMethods("*").allowedHeaders("*");
		}
	};
}

}
