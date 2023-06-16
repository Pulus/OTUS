package Lecture13_Homework;

import Lecture13_Homework.Object.*;

public class Mast {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Client clientKP = new Client("Kaurov Pavel", "15.09.1995");

        bank.addClientAndAccount(clientKP, new Account(1,"USD"));
        bank.addAccount(new Account(2,"USD",100.0F), clientKP);

        Client clientII = new Client("Ivanov Ivan", "16.10.1996");
        bank.addClientAndAccount(clientII, new Account(3,"RUB", 1_000_000.0F));
        bank.addAccount(new Account(4,"USD"), clientII);

        bank.findClient(new Account(2));
        bank.getAccount(new Client("Kaurov Pavel", "15.09.1995"));
        System.out.println();

        bank.findClient(new Account(4));
        bank.getAccount(new Client("Ivanov Ivan", "16.10.1996"));
    }
}
