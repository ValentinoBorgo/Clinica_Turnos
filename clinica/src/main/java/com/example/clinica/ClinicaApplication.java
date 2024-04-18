package com.example.clinica;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
@EnableDiscoveryClient
public class ClinicaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClinicaApplication.class, args);
	}
        
        @Bean
        public WebMvcConfigurer corsConfigurer() {
	return new WebMvcConfigurer() {
            @Override
		public void addCorsMappings(CorsRegistry registry) {
                    //we can provide other routes, further than the "/**".
			registry.addMapping("/**")
                                .allowedOrigins("*")
                                .allowedMethods("POST","PUT","DELETE","OPTIONS","GET")
                                .allowedHeaders("*");
		}
	};
}

}
