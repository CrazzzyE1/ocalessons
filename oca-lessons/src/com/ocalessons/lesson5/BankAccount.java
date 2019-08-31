package com.ocalessons.lesson5;

public class BankAccount {
    int id;
    double balance;

    public BankAccount(int id, double balance) {
        this.id = id;
        this.balance = balance;
    }

    public void popolneniu(double popolnennie) {
        balance += popolnennie;
    }
    public void snyatie(double snyatie) {
        balance -= snyatie;
    }

}
