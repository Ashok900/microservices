package com.ex.openfeign.fallback;

import com.ex.openfeign.client.BookClient1;
import com.ex.openfeign.model.Book;

public class BookFallBack1 implements BookClient1{

	@Override
	public Book getBookData(String id, String name) {
		return new Book("123","wizpath","Technicalblog");
	}

}
