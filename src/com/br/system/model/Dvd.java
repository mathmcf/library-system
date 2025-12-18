package com.br.system.model;

public class Dvd extends Item {

    private String director;

    public Dvd(Long id, String title, String director) {
        super(id, title);
        this.director = director;
    }


    @Override
    public String printItem() {
        return "Título: " + title + "; Id: " + id + "; Diretor: " + director;
    }
}
