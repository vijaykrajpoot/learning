package org.vkrajput.learning.spring.boot.integration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * Hello world!
 */
@SpringBootApplication
public class SpringIntegrationApp {
    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(SpringIntegrationApp.class, args);
        int counter = 0;
        for (String name : applicationContext.getBeanDefinitionNames()) {
            System.out.println( (counter++) + " : Bean Names: " + name);
        }
    }
}
