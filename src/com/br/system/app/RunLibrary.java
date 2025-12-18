package com.br.system.app;

import com.br.system.service.*;
import com.br.system.model.Book;
import com.br.system.model.Dvd;
import com.br.system.model.Item;
import com.br.system.model.User;

import java.util.Map;

public class RunLibrary {
    public static void main(String[] args) throws Exception {

        Dvd item1 = new Dvd(1L, "O Poderoso Chefão", "Francis Ford Coppola");
        Book item2 = new Book(2L, "Vidas Secas", "Graciliano Ramos", 80);
        Loan loan2 = new Loan();
        Loan loan1 = new Loan();
        item2.setLoan(loan2);
        item1.setLoan(loan1);
        Library library = new Library();
        library.addItens(item1);
        library.addItens(item2);

        library.printItens();
        String result = library.searchItemByTitle("O Poderoso Chefão");
        System.out.println(result);

        User user = new User(1L, "Ítalo", "italo@teste.com");
        User user2 = new User(2L, "Matheus", "matheus@teste.com");

        library.getALoan(user, item2);
        library.getALoan(user2, item1);

        System.out.println("------------------------------------------------------");
        boolean checkedLoan = library.checkLoan(item2);
        System.out.println("Item foi emprestado? " + checkedLoan);

        System.out.println("------------------------------------------------------");

        System.out.println("Informações do empréstimo: ");
        System.out.println();

        Map<Item, User> borrowedItens = library.showAllBorrowedItens();
        int n = 0;
        for (Map.Entry<Item, User> i : borrowedItens.entrySet()) {
            System.out.println("Item " + n + " : " + i.getKey().printItem() +
                    " \nestá emprestado para o usuário: " + i.getValue().printUser()
            );
            n++;
            System.out.println();

        }

        System.out.println("------------------------------------------------------");
        Item returnedItem = library.returnAnItem(item2);
        System.out.println("Item devolvido: " + returnedItem.printItem());
    }
}