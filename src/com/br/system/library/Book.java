package com.br.system.library;

public class Book extends Item {

    private String author;
    private int pageNumber;

    public Book(Long id, String titulo, String author, int pageNumber) {
        super(id, titulo);
        this.author = author;
        this.pageNumber = pageNumber;
    }

    @Override
    public String printItem() {
        return title + " " + id + " " + author + " - " + pageNumber + " páginas";
    }
}

