package com.index.pack;

class PaymentN {

    void processPayment() {
        System.out.println("Processing payment...");
    }
}
class CreditCardPayment extends PaymentN{
    void processPayment() {
        System.out.println("Payment processed using Credit Card.");
    }
}
class DebitCardPayment extends PaymentN {
    void processPayment() {
        System.out.println("Payment processed using Debit Card.");
    }
}
class UPIPayment extends PaymentN {
    void processPayment() {
        System.out.println("Payment processed using UPI.");
    }
}
public class Payment {
    public static void main(String[] args) {

        PaymentN p;

        p = new CreditCardPayment();
        p.processPayment();

        p = new DebitCardPayment();
        p.processPayment();

        p = new UPIPayment();
        p.processPayment();
    }
}
