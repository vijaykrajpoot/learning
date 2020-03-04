package org.vkrajput.learning.spring.boot.integration.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.vkrajput.learning.spring.boot.integration.config.IntegrationConfig;
import org.vkrajput.learning.spring.boot.integration.flow.MovieGateWay;
import org.vkrajput.learning.spring.boot.integration.model.Movie;

import javax.annotation.PostConstruct;

@RestController
@RequestMapping("movie")
public class MovieController {

    @Autowired
    private MovieGateWay movieGateWay;

//
//    @PostConstruct
//    void init() {
//
//        ApplicationContext ctx = new AnnotationConfigApplicationContext(IntegrationConfig.class);
//        movieGateWay = ctx.getBean(MovieGateWay.class);
//
//    }

    @PostMapping("/process")
    public void processMovie(@RequestBody Movie movie) {
        System.out.println("movieGateWay:" + movieGateWay);

        Message<Movie> movieMessage = MessageBuilder
                .withPayload(movie)
                .build();
        movieGateWay.processMovie(movieMessage);
    }


}

