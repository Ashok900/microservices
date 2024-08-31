package com.asita.movie_info.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table( name="movie_info")
public class MovieInfo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "movie_id")
	private Integer id;
	@Column(name = "movie_name")
	private String movieName;
	@Column(name = "protagonist")
	private String protagonist;
	@Column(name = "heroin")
	private String heroin;
	@Column(name = "director")
	private String director;
	@Column(name = "producer")
	private String producer;
	@Column(name = "music_director")
	private String musicDirector;
	
}
