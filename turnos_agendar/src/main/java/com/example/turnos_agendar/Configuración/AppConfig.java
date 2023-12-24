package com.example.turnos_agendar.Configuración;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class AppConfig {

    @Bean("apiPatients")
    public RestTemplate registerRestTemplate(){
        return new RestTemplate();
    }

}
