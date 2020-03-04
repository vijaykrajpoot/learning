package org.vkrajput.learning.spring.boot.integration.flow;


import org.springframework.integration.annotation.Filter;
import org.springframework.integration.annotation.MessageEndpoint;
import org.vkrajput.learning.spring.boot.integration.model.Movie;
import org.vkrajput.learning.spring.boot.integration.model.MovieCountryENUM;

@MessageEndpoint
public class IndianMovieCountryFilter {

    @Filter(inputChannel = "router::IndiaMovieChannel")
    public boolean isIndianMovie(Movie movie) {
        return movie.getMovieCountry().equals(MovieCountryENUM.INDIA);
    }
}
