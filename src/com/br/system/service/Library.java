package com.br.system.service;

import com.br.system.model.Item;
import com.br.system.model.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Library {

    private List<Item> itens;

    public Library() {
        this.itens = new ArrayList<>();
    }

    public void addItens(Item item) {
        this.itens.add(item);
    }

    public void printItens() {
        for (Item item : this.itens) {
            System.out.println(item.printItem());
        }
    }

    public String searchItemByTitle(String title) {

        for (Item item : this.itens) {
            if (item.getTitle().equals(title)) {
                return item.getTitle();
            }
        }

        return "";
    }

    public void getALoan(User user, Item item) throws Exception {

        boolean isItemAvailable = false;
        Item libraryItem = null;

        for (Item it : this.itens) {
            if (it.getId().equals(item.getId()) && it.getLoan() != null && !it.getLoan().isBorrowed()) {
                isItemAvailable = true;
                libraryItem = it;
            }
        }

        if (!isItemAvailable) {
            throw new Exception("O item não está disponível");
        }

        libraryItem.setLoan(new Loan(true, user));


    }

    public boolean checkLoan(Item item) {

        return item.getLoan().isBorrowed();
    }

    public Item returnAnItem(Item item) throws Exception {

        for (Item i : this.itens) {

            if (item.getId() == i.getId() && item.getLoan() != null && item.getLoan().isBorrowed()) {
                item.getLoan().setBorrowed(false);
                item.getLoan().setUser(null);
                return item;
            }

        }

        throw new Exception("O item encontrado não está emprestado");
    }


    public Map<Item, User> showAllBorrowedItens() {

        Map<Item, User> borrowedItens = new HashMap<>();

        for (Item i : this.itens) {
            if (checkLoan(i)) {
                borrowedItens.put(i, i.getLoan().getUser());
            }
        }

        return borrowedItens;
    }

}
