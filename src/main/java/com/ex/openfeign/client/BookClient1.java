package com.ex.openfeign.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import com.ex.openfeign.config.BookClientConfig1;
import com.ex.openfeign.fallback.BookFallBack1;
import com.ex.openfeign.model.Book;

@Component
@FeignClient(name = "${book-service-client.name}",
             url = "${book-service-client.domain-url}",
             configuration = BookClientConfig1.class,
             fallback = BookFallBack1.class)
public interface BookClient1 {
	
	  @GetMapping(path="${book-service-client.retrieve-book.url}")
	    Book getBookData(@PathVariable("id") String id, @RequestParam("name") String name);

}
