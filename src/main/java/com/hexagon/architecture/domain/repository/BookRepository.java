package com.hexagon.architecture.domain.repository;

import java.util.List;

import com.hexagon.architecture.domain.Book;

public interface BookRepository {

    void addBook(Book book); 
    Book getBook(String title); 
    List<Book> getBooks();
}
