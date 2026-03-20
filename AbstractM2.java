package com.index.pack;

abstract class Food1 {
    abstract void prepare();
}
class Pizza extends Food1 {
      void prepare() {
        System.out.println("Pizza's Preparing process is Ongoing");
    }
}

class Burger extends Food1{

    void prepare() {
        System.out.println("Burger's Preparing process is Ongoing");
    }
}

public class AbstractM2 {
    public static void main(String[] args) {
        Food1 pizza = new Pizza();
        pizza.prepare();
        Food1 burger = new Burger();
        burger.prepare();
        System.out.println();

    }
}




