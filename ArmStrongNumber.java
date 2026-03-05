package com.index.pack;
import java.util.Scanner;

public class ArmStrongNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();

        int original = num;
        int remainder;
        int result = 0;

        while (num > 0) {
            remainder = num % 10;
            result = result + (remainder * remainder * remainder);
            num = num / 10;
        }

        if (result == original) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not an Armstrong Number");
        }
    }
}