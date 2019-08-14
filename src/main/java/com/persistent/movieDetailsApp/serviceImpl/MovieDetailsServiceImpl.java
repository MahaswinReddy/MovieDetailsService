package com.persistent.movieDetailsApp.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import com.persistent.movieDetailsApp.service.MovieDetailsService;

public class MovieDetailsServiceImpl implements MovieDetailsService {
	@Override
	public List<String> getMovies(){
		List<String> list = new ArrayList<>();
		list.add("Chanti");
		list.add("Gangleader");
		list.add("AmmaRaajiNaama");
	   return list;
	}
}
