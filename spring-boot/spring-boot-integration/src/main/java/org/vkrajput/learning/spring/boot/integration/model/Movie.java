package org.vkrajput.learning.spring.boot.integration.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class Movie {

    private String title;

    private List<String> actors;

    private MovieGenreEnum genre;

    private MovieCountryENUM movieCountry;

    private String director;

}
