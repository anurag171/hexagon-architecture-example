package com.baeldung.hexagon.architecture.domain.entity.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.baeldung.hexagon.architecture.domain.entity.Book;

public interface BookRepository extends JpaRepository<Book, String> {

}