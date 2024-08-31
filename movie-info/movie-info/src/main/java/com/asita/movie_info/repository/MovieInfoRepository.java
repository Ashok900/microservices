package com.asita.movie_info.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.asita.movie_info.model.MovieInfo;

public interface MovieInfoRepository extends JpaRepository<MovieInfo, Integer>{

}
