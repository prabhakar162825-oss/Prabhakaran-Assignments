package com.index.pack;

abstract class Acc {
    abstract void calculateInterest();
}
class SavingsAccount extends Acc {

    void calculateInterest(){
        System.out.println("SavingsAccount Interest is Being Calculated");
    }
}

class CurrentAccount extends Acc {

    void calculateInterest() {
        System.out.println("CurrentAccount Interest is Being Calculated");
    }
}

public class AbstractM4 {
    public static void main(String[] args) {
       Acc sa = new SavingsAccount();
        sa.calculateInterest();
       Acc ca = new CurrentAccount();
        ca.calculateInterest();
        System.out.println();  
    }
}




