package com.hexagon.architecture.service;

import java.util.List;

import com.hexagon.architecture.domain.Book;

public interface BookService {

	void addBook(Book book);

	Book getBook(String title);

	List<Book> getBooks();
}