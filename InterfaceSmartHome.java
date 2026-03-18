package com.index.pack;
import java.util.Scanner;

interface SmartDevice {
 void turnOn();
 void turnOff();
}
class Fan implements SmartDevice {
 public void turnOn() {
     System.out.println("Fan is turned ON - Spinning started");
 }

 public void turnOff() {
     System.out.println("Fan is turned OFF - Spinning stopped");
 }
}
class Light implements SmartDevice {
 public void turnOn() {
     System.out.println("Light is turned ON - Room is bright");
 }

 public void turnOff() {
     System.out.println("Light is turned OFF - Room is dark");
 }
}
class AirConditioner implements SmartDevice {
 public void turnOn() {
     System.out.println("AC is turned ON - Cooling started");
 }

 public void turnOff() {
     System.out.println("AC is turned OFF - Cooling stopped");
 }
}

//Step 5: Main Class
public class InterfaceSmartHome {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     SmartDevice device;

     System.out.println("=== Smart Home System ===");
     System.out.println("1. Fan");
     System.out.println("2. Light");
     System.out.println("3. Air Conditioner");
     System.out.print("Choose Device: ");
     int choice = sc.nextInt();
     
     if (choice == 1) {
         device = new Fan();
     } 
     else if (choice == 2) {
         device = new Light();
     } 
     else if (choice == 3) {
         device = new AirConditioner();
     } 
     else {
         System.out.println("Invalid choice Made!");
         sc.close();
         return;
     }

     device.turnOn();
     device.turnOff();

     sc.close();
 }
}
