package com.company.oop.assignmentOne;

public class BankAccount {
    int id;
    double balance;
    public BankAccount(double balance) {
        this.balance = balance;
    }
    public BankAccount() {
        balance = 0;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void withdraw(double amount) {
        if (amount < balance)
            balance = balance - amount;
        else
            System.out.println("Balance is not enough");

        System.out.println("balance is : "+balance );

    }

    public void deposit(double amount) {
        balance = balance + amount;
        System.out.println("balance is : "+balance );
    }
}
