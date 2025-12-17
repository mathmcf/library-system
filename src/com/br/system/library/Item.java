package com.br.system.library;

public abstract class Item {

    protected Long id;
    protected String title;
    protected Loan loan;

    public void setLoan(Loan loan) {
        this.loan = loan;
    }

    public Item(Long id, String title) {
        this.id = id;
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }

    public Long getId() {
        return this.id;
    }

    public Loan getLoan() {
        return this.loan;
    }

    public abstract String printItem();
}
