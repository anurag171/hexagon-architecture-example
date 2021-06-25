package com.hexagon.architecture.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hexagon.architecture.domain.Book;

public interface BookRepository extends JpaRepository<Book, String> {

}