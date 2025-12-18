package com.br.system.service;

import com.br.system.model.User;

public class Loan {

    private boolean isBorrowed;
    private User user;

    public Loan(boolean isBorrowed, User user) {
        this.isBorrowed = isBorrowed;
        this.user = user;
    }

    public Loan() {
        this.isBorrowed = false;
    }

    public void setBorrowed(boolean borrowed) {
        this.isBorrowed = borrowed;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }


}
