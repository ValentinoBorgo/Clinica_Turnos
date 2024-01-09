package com.example.turnos_agendar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableDiscoveryClient
@ComponentScan(basePackages = "com.example.turnos_agendar.Configuración")
public class TurnosAgendarApplication {

	public static void main(String[] args) {
		SpringApplication.run(TurnosAgendarApplication.class, args);
	}

}
