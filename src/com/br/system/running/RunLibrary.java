package com.br.system.running;

import com.br.system.library.*;

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
        String resultado = library.searchItemByTitle("O Poderoso Chefão");
        System.out.println(resultado);

        User user = new User(1L, "Ítalo", "italo@teste.com");
        User user2 = new User(2L, "Matheus", "matheus@teste.com");

        library.getALoan(user, item2);
        library.getALoan(user2, item1);

        System.out.println("------------------------------------------------------");
        boolean emprestimoVerificado = library.checkLoan(item2);
        System.out.println("Item foi emprestado? " + emprestimoVerificado);

        System.out.println("------------------------------------------------------");

        System.out.println("Informações do empréstimo: ");
        System.out.println();

        Map<Item, User> itensEmprestados = library.showAllBorrowedItens();
        int n = 0;
        for (Map.Entry<Item, User> i : itensEmprestados.entrySet()) {
            System.out.println("Item " + n + " : " + i.getKey().printItem() +
                    " \nestá emprestado para o usuário: " + i.getValue().imprimeUsuario()
            );
            n++;
            System.out.println();

        }

        System.out.println("------------------------------------------------------");
        Item iTemDevolvido = library.returnAnItem(item2);
        System.out.println("Item devolvido: " + iTemDevolvido.printItem());
    }
}