package org.vkrajput.learning.spring.boot.integration.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.integration.annotation.IntegrationComponentScan;
import org.springframework.integration.annotation.MessagingGateway;
import org.springframework.integration.channel.DirectChannel;
import org.springframework.integration.config.EnableIntegration;
import org.springframework.messaging.MessageChannel;
import org.vkrajput.learning.spring.boot.integration.flow.MovieGateWay;

@Configuration
@ComponentScan("org.vkrajput.learning.spring.boot.integration")
@EnableIntegration
@IntegrationComponentScan("org.vkrajput.learning.spring.boot.integration")
public class IntegrationConfig {

    @Bean
    public MessageChannel movieDefaultRequestChannel() {
        return new DirectChannel();
    }
}
