package com.example.clinica.Configuración;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.AbstractDiscoveryClientOptionalArgs;
import com.netflix.discovery.EurekaClientConfig;
import com.netflix.discovery.shared.transport.TransportClientFactory;
import com.netflix.discovery.shared.transport.jersey.TransportClientFactories;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import java.util.Collection;
import java.util.Optional;

@Configuration
public class AppConfig {

    // Agrega la definición del bean AbstractDiscoveryClientOptionalArgs
    @Bean
    public AbstractDiscoveryClientOptionalArgs optionalArgs() {
        return new CustomDiscoveryClientOptionalArgs();
    }

    // Puedes personalizar esta clase según tus necesidades
    // O simplemente dejarla en blanco si no necesitas personalizaciones específicas.
    public static class CustomDiscoveryClientOptionalArgs extends AbstractDiscoveryClientOptionalArgs {
    }

    @Configuration
    public static class CustomEurekaClientConfig {
    }

    @Bean
    public TransportClientFactories transportClientFactories() {
        return new TransportClientFactories() {
            @Override
            public TransportClientFactory newTransportClientFactory(EurekaClientConfig eurekaClientConfig, Collection collection, InstanceInfo instanceInfo) {
                return null;
            }

            @Override
            public TransportClientFactory newTransportClientFactory(EurekaClientConfig eurekaClientConfig, Collection collection, InstanceInfo instanceInfo, Optional optional, Optional optional1) {
                return null;
            }
        };
    }

}
