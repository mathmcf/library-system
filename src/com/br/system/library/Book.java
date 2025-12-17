package com.br.system.library;

public class Book extends Item {

    private String author;
    private int pageNumber;

    public Book(Long id, String title, String author, int pageNumber) {
        super(id, title);
        this.author = author;
        this.pageNumber = pageNumber;
    }

    @Override
    public String printItem() {
        return title + " " + id + " " + author + " - " + pageNumber + " páginas";
    }
}

