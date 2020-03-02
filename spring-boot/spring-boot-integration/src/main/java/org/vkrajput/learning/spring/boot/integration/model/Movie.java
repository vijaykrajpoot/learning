package org.vkrajput.learning.spring.boot.integration.model;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Setter
@Getter
public class Movie {

    private String title;

    private List<String> actors;

    private MovieGenreEnum genre;

    private LocalDate releaseDate;

    private LocalTime runningTime;

    private String director;
}
