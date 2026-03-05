package com.index.pack;
import java.util.Scanner;

public class Withdraw {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int balance = 10000;
        
        System.out.println("Enter withdrawal amount:");
        int amount = sc.nextInt();
        
        if(amount > balance) {
            System.out.println("Insufficient Balance");
        }
        else if(amount <= 0) {
            System.out.println("Invalid Amount");
        }
        else {
            balance = balance - amount;
            System.out.println("Remaining Balance: " + balance);
        }
        
    }
}