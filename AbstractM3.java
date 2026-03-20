package com.index.pack;

abstract class Transportion {
    abstract void BookTicket();
}
class Bus1 extends Transportion {

    void BookTicket() {
        System.out.println("Bus Ticket is Booked");
    }
}

class Train1 extends Transportion{

    void BookTicket() {
        System.out.println("Train Ticket is Booked");
    }
}

public class AbstractM3 {
    public static void main(String[] args) {
        Transportion bus = new Bus1();
        bus.BookTicket();
       Transportion train = new Train1();
        train.BookTicket();
        System.out.println();  
    }
}




