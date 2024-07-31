package aplication;

import entities.Account;
import entities.BusinessAccount;
import entities.SavesAccount;

public class App {
    public static void main(String[] args) {
        Account acc = new Account(1001, "Bagio", 0.0);
        BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);

        //Upcasting (Atributo de superclasse recebendo atributo de subclasse)
        Account acc1 = bacc;
        Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
        Account acc3 = new SavesAccount(1004, "Anna", 0.0, 0.01);

        //Downcasting
        BusinessAccount acc4 = (BusinessAccount)acc2;

        if(acc3 instanceof SavesAccount) {
            SavesAccount acc5 = (SavesAccount)acc3;
            System.out.println("Update!");
        }
    }
}
