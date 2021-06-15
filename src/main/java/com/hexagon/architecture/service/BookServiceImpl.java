package com.hexagon.architecture.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.hexagon.architecture.domain.Book;
import com.hexagon.architecture.domain.repository.BookRepository;

public class BookServiceImpl implements BookService {
    
    @Autowired
    BookRepository bookRepository;

    @Override
    public void addBook(Book book) {
        
        bookRepository.addBook(book);
    }

    @Override
    public Book getBook(String title) {
        return bookRepository.getBook(title);
    }

    @Override
    public List<Book> getBooks() {
        return bookRepository.getBooks();
    }

}