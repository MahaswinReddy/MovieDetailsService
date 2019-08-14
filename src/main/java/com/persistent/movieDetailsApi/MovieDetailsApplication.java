package com.persistent.movieDetailsApi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.persistent.movieDetailsApp.service.MovieDetailsService;
import com.persistent.movieDetailsApp.serviceImpl.MovieDetailsServiceImpl;

//@SpringBootApplication
//@EnableDiscoveryClient
@ComponentScan(basePackages= {"com.persistent.movieDetailsApp.controller"})
@EnableAutoConfiguration
@Configuration
@EnableWebMvc
public class MovieDetailsApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieDetailsApplication.class, args);
	}
	
	@Bean
	public MovieDetailsService getMovieDetails() {
		return new MovieDetailsServiceImpl();
	}

}
