package org.vkrajput.learning.spring.boot.integration.flow;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.integration.annotation.Filter;
import org.springframework.integration.annotation.MessageEndpoint;
import org.vkrajput.learning.spring.boot.integration.model.Movie;
import org.vkrajput.learning.spring.boot.integration.model.MovieCountryENUM;

@MessageEndpoint
public class IndianMovieCountryFilter {

    Logger logger = LoggerFactory.getLogger(this.getClass());


    @Filter(inputChannel = "router::IndiaMovieChannel")
    public boolean isIndianMovie(Movie movie) {
        logger.info("Filtering India Movies");
        return movie.getMovieCountry().equals(MovieCountryENUM.INDIA);
    }
}
