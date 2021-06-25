package com.hexagon.architecture.domain.repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.hexagon.architecture.domain.Book;

public class BookRepositoryImpl implements BookRepository {

	private Map<String, Book> bookDB = new HashMap<>();

	@Override
	public void addBook(Book book) {
		bookDB.put(book.getTitle(), book);
	}

	@Override
	public Book getBook(String title) {
		return bookDB.get(title);
	}

	@Override
	public List<Book> getBooks() {

		return bookDB.values().stream().collect(Collectors.toList());
	}

}
