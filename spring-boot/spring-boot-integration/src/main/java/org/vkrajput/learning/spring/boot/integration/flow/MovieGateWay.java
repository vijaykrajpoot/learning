package org.vkrajput.learning.spring.boot.integration.flow;


import org.springframework.integration.annotation.Gateway;
import org.springframework.integration.annotation.MessagingGateway;
import org.springframework.messaging.Message;
import org.vkrajput.learning.spring.boot.integration.model.Movie;

@MessagingGateway(name = "movieGateWay", defaultRequestChannel = "movieDefaultRequestChannel")
public interface MovieGateWay {
    @Gateway
    void processMovie(Message<Movie> movie);

}