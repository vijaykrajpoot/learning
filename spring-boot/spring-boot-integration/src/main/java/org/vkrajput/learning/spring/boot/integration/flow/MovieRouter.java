package org.vkrajput.learning.spring.boot.integration.flow;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.integration.annotation.MessageEndpoint;
import org.springframework.integration.annotation.Router;
import org.vkrajput.learning.spring.boot.integration.model.Movie;

@MessageEndpoint
public class MovieRouter {
    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Router(inputChannel = "movieDefaultRequestChannel")
    public String findNextRouter(Movie movie) {

        logger.info("Movie.getMovieCountry ==>" + movie.getMovieCountry());

        switch (movie.getMovieCountry()) {
            case INDIA:
                return "router::IndiaMovieChannel";
            case USA:
                return "router::USAMovieChannel";
            case CHINA:
                return "router::CHINAMovieChannel";
            case SPAIN:
                return "router::SPAINMovieChannel";
            case FRANCE:
                return "router::FRANCHMovieChannel";
        }

        return "router::NULLMovie";
    }


}
