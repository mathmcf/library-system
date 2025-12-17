package com.br.system.library;

import java.time.LocalDate;
import java.time.Month;

public class Magazine extends Item {

    private String editor;
    private final Month month;

    public Magazine(Long id, String title, String editor, LocalDate month) {
        super(id, title);
        this.editor = editor;
        this.month = month.getMonth();
    }

    @Override
    public String printItem() {
        return "Título: " + title + "Id: " + id + "Editor: " + editor + "Mês: " + month;
    }
}
