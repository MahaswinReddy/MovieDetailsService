package com.persistent.movieDetailsApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.persistent.movieDetailsApp.service.MovieDetailsService;
@RestController
//@Controller
public class MovieDetailsController {
	
	@Autowired
	MovieDetailsService movieDetailsService;
	
	@GetMapping(value="/movies",produces=MediaType.APPLICATION_JSON_VALUE)
	public List<String> getAllMovies() {
		return movieDetailsService.getMovies();
	}

}
