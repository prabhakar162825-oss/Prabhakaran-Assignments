package com.index.pack;
import java.util.Scanner;

interface Payment1 {
 void processPayment(double amount);
}


class CreditCardPayment1 implements Payment1 {
 public void processPayment(double amount) {
     System.out.println("Processing Credit Card payment of ₹" + amount);
     System.out.println("Payment Successful via Credit Card\n");
 }
}

class UPIPayment1 implements Payment1 {
 public void processPayment(double amount) {
     System.out.println("Processing UPI payment of ₹" + amount);
     System.out.println("Payment Successful via UPI\n");
 }
}

class PayPalPayment1 implements Payment1 {
 public void processPayment(double amount) {
     System.out.println("Processing PayPal payment of ₹" + amount);
     System.out.println("Payment Successful via PayPal\n");
 }
}

public class InterfacePayment {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     Payment1 payment;

     System.out.println("=== Payment System ===");
     System.out.println("1. Credit Card");
     System.out.println("2. UPI");
     System.out.println("3. PayPal");
     System.out.print("Choose Payment Method: ");
     int choice = sc.nextInt();

     System.out.print("Enter Amount: ");
     double amount = sc.nextDouble();

     if (choice == 1) {
         payment = new CreditCardPayment1();
     } 
     else if (choice == 2) {
         payment = new UPIPayment1();
     } 
     else if (choice == 3) {
         payment = new PayPalPayment1();
     } 
     else {
         System.out.println("Invalid choice Made!");
         sc.close();
         return;
     }

     payment.processPayment(amount);

     sc.close();
 }
}

