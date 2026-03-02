package com.index.pack;

import java.util.Scanner;

public class value {

    private static int value(int a) {
        if (a > 0) {
            return a * 10;
        }
        return 0;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value:");
        int num = sc.nextInt();

        int result = value(num);   

        System.out.println("Result: " + result);

        sc.close();
    }
}