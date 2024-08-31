package com.asita.movie_info.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.asita.movie_info.model.MovieInfo;
import com.asita.movie_info.repository.MovieInfoRepository;
import com.asita.movie_info.service.MovieInfoServiceImpl;

import jakarta.websocket.server.PathParam;

@RestController
@RequestMapping("/movie-info")
public class MovieResource {
	
	@Autowired
	private MovieInfoServiceImpl movieInfoService;
	
	@PostMapping("/add")
	public String addMovieInfo(@RequestBody MovieInfo movieInfo)throws Exception{
		
		try {
			return movieInfoService.addMovie(movieInfo);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	  }
	@GetMapping("/getAll")
	public List<MovieInfo> getMovieInfo() throws Exception{
		return movieInfoService.getMovie();
		
	}
	@PutMapping("/{id}")
	@ResponseStatus(code=HttpStatus.ACCEPTED)
	public MovieInfo update(@PathVariable int id,@RequestBody MovieInfo movieInfo ){
		return movieInfoService.update( id,movieInfo);
	
		
	}
	@DeleteMapping("delete/{id}")
	public void delete(@PathVariable int id) {
		movieInfoService.delete(id);
	}
	
	
}
