package com.ex.openfeign.service;

import org.springframework.stereotype.Service;

import com.ex.openfeign.client.BookClient1;
import com.ex.openfeign.client.BookClient2;
import com.ex.openfeign.model.Book;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class LibararyService {
	
	private final BookClient1 bookClient1;
	private final BookClient2 bookClient2;

	public Book getBookData1ForId(String id, String name) {
		return bookClient1.getBookData(id, name);

	}

	public Book getBookData2ForId(String id, String name) {
		return bookClient2.getBookData(id, name);

	}
}
