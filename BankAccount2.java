package com.index.pack;

public class BankAccount2  {

    int accountNumber;
    String accountHolderName;
    double balance;

    BankAccount2(int accNo, String name, double bal) {
        this.accountNumber = accNo;
        this.accountHolderName = name;
        this.balance = bal;
    }

    void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Amount Deposited: " + amount);
    }

    void displayBalance() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Current Balance: " + balance);
    }

    public static void main(String[] args) {

        BankAccount2 acc1 = new BankAccount2(1001, "Arun", 5000);

        acc1.deposit(2000);
        acc1.displayBalance();
    }
}