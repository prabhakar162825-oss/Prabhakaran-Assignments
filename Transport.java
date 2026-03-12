package com.index.pack;

  class TransportN  {

    void calculateFare() {
        System.out.println("Calculating transport fare");
    }
}
class Bus extends TransportN {
    void calculateFare() {
        System.out.println("Bus Fare: ₹10 per km");
    }
}
class Train extends TransportN {
    void calculateFare() {
        System.out.println("Train Fare: ₹5 per km");
    }
}
class Taxi extends TransportN {
    void calculateFare() {
        System.out.println("Taxi Fare: ₹15 per km");
    }
}

  public class Transport {

    public static void main(String[] args) {

        TransportN t;
        t = new Bus();
        t.calculateFare();
        t = new Train();
        t.calculateFare();
        t = new Taxi();
        t.calculateFare();
    }
}
