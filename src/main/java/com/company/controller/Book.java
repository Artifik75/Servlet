package com.company.controller;

public class Book {
    private String Title;
    private String Author;
    private int year;

    public Book(String title, String author, int year) {
        Title = title;
        Author = author;
        this.year = year;
    }

    public String getTitle() {
        return Title;
    }

    public String getAuthor() {
        return Author;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Book{" +
                "Title='" + Title + '\'' +
                ", Author='" + Author + '\'' +
                ", year=" + year +
                '}';

    }
}
