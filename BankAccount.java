package com.index.pack;

public class BankAccount {

    int accountNumber;
    String accountHolderName;
    double balance;

    void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Deposited: " + amount);
    }

    void withdraw(double amount) {

        if (amount > balance) {
            System.out.println("Insufficient Balance");
        } else {
            balance = balance - amount;
            System.out.println("Withdrawn: " + amount);
        }
    }

    void displayBalance() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: " + balance);
        System.out.println("----------------------");
    }

    public static void main(String[] args) {

        BankAccount a1 = new BankAccount();
        a1.accountNumber = 1001;
        a1.accountHolderName = "Prabha";
        a1.balance = 10000;

        BankAccount a2 = new BankAccount();
        a2.accountNumber = 1002;
        a2.accountHolderName = "Jeeva";
        a2.balance = 15000;

        a1.deposit(2000);
        a1.withdraw(5000);
        a1.displayBalance();

        a2.deposit(3000);
        a2.withdraw(20000);
        a2.displayBalance();
    }
}