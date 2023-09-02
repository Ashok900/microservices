package com.ex.openfeign.model.controller;



import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LibraryController {
	
	@GetMapping(path = "/library/{id}",produces = {MediaType.APPLICATION_JSON_VALUE})
	public void getLibraryData(@PathVariable("id")String id,@RequestParam("name")String name) {
		
	}
	
	@GetMapping(path = "/library2/{id}",produces = {MediaType.APPLICATION_JSON_VALUE})
	public void getLibraryData2(@PathVariable("id")String id,@RequestParam("name")String name) {
		
	}

}
