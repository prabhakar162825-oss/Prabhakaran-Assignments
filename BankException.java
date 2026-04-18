package com.index.pack;
import java.util.Scanner;

class MyException extends Exception {
    public MyException(String message) {
        super(message);
    }
}

public class BankException {

    public static int Balance = 10000;

    void WithdrawAmount(int Withdraw) throws MyException {

        if (Withdraw < 0) {
            throw new MyException("Amount Cannot Be Negative");
        } 
        else if (Balance < Withdraw) {
            throw new MyException("Insufficient Balance");
        } 
        else {
            Balance -= Withdraw;
            System.out.println("Withdrawal Successful!");
            System.out.println("Remaining Balance: " + Balance);
        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BankException bank = new BankException();

        System.out.print("Enter the Withdrawal Amount: ");
        int WithdrawAmount = sc.nextInt();

        try {
            bank.WithdrawAmount(WithdrawAmount);
        } 
        catch (MyException e) {
            System.out.println("Caught Exception : " + e.getMessage());
        }
        finally {
            System.out.println("Transaction Log : Attempted withdrawal = " + WithdrawAmount);
            System.out.println("Available Balance : " + Balance);
            System.out.println("Transaction Completed.");
        }

        sc.close();
    }
}