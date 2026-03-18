package com.index.pack;
import java.util.Scanner;

interface Vehicle {
 void startEngine();
 void stopEngine();
}
class Car implements Vehicle {
 public void startEngine() {
     System.out.println("Car engine starts with key ignition");
 }

 public void stopEngine() {
     System.out.println("Car engine stops");
 }
}
class Bike implements Vehicle {
 public void startEngine() {
     System.out.println("Bike engine starts with self/kick start");
 }

 public void stopEngine() {
     System.out.println("Bike engine stops");
 }
}
class Truck implements Vehicle {
 public void startEngine() {
     System.out.println("Truck engine starts with heavy-duty ignition");
 }

 public void stopEngine() {
     System.out.println("Truck engine stops");
 }
}

public class InterfaceVehicleSystem {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     Vehicle v;

     System.out.println("=== Vehicle System ===");
     System.out.println("1. Car");
     System.out.println("2. Bike");
     System.out.println("3. Truck");
     System.out.print("Choose Vehicle: ");
     int choice = sc.nextInt();
     
     if (choice == 1) {
         v = new Car();
     } 
     else if (choice == 2) {
         v = new Bike();
     } 
     else if (choice == 3) {
         v = new Truck();
     } 
     else {
         System.out.println("Invalid choice Made!");
         sc.close();
         return;
     }

     v.startEngine();
     v.stopEngine();

     sc.close();
 }
}
