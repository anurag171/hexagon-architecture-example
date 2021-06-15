package com.hexagon.architecture.domain;

import java.util.Date;

import javax.persistence.Entity;

import lombok.Data;

@Entity
@Data
public class Book {

    private String title; 
    private String refNumber; 
    private String author;
    private Date yearOfPublication;
    private boolean issueStatus;
    private Date issueDate;

}
