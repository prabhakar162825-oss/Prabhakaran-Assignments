package com.index.pack;
import java.util.Scanner;

public class PNZ {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Value:");
        int num = sc.nextInt();

   
        if (num >0) {
            System.out.println("Value is Positive");
        }
        else if (num < 0) {
            System.out.println("Value is Negative");
        }
        else {
            System.out.println("Value is Zero");
        }
    }
}
