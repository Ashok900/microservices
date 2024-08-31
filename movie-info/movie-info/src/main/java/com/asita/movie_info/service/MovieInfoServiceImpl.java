package com.asita.movie_info.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import com.asita.movie_info.model.MovieInfo;
import com.asita.movie_info.repository.MovieInfoRepository;

@Service
public class MovieInfoServiceImpl {
	
	@Autowired
	private MovieInfoRepository movieInfoRepository;

	
	public String addMovie(MovieInfo movieInfo) throws Exception {
		
		try {
			movieInfoRepository.save(movieInfo);
		}catch (Exception e) {
			throw new Exception(e.getMessage());
		}
		
	
		return movieInfo.getMovieName()+" added successfully";
	}

	public List<MovieInfo> getMovie()throws Exception  {
		
		List<MovieInfo> details = movieInfoRepository.findAll();
		return details;
		
		
	}
	public MovieInfo update(int id, MovieInfo movieInfo) {
		MovieInfo u = movieInfoRepository.findById(id).get();
		if(Objects.nonNull(movieInfo.getMovieName())&&!"".equalsIgnoreCase(movieInfo.getMovieName())) {
			u.setMovieName(movieInfo.getMovieName());
		}
		if(Objects.nonNull(movieInfo.getProtagonist())&&!"".equalsIgnoreCase(movieInfo.getProtagonist())) {
			u.setProtagonist(movieInfo.getProtagonist());
		}

		return movieInfoRepository.save(u) ;
	
	}
	public void delete(int id) {
		MovieInfo m = movieInfoRepository.findById(id).get();
		movieInfoRepository.delete(m);
	}

}
