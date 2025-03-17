package it.uniroma3.siw.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


import it.uniroma3.siw.service.MovieService;
//PROVARE A SCRIVERE A MANO SE NON FUNZIONA

@Controller
    public class MovieController {

    @Autowired MovieService movieService;

    @GetMapping("/movie/{id}")
    public String getMovie(@PathVariable("id") Long id, Model model) {
        model.addAttribute("movie",this.movieService.getMovieById(id));
        return "movie.html";
    }

    @GetMapping("/movie")
    public String showMovies(Model model) {
        model.addAttribute("movies",this.movieService.getAllMovies());
        return "movies.html";
    }
}
