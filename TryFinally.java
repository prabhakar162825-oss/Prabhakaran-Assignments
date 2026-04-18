package com.index.pack;
public class TryFinally {
	

    static String testMethod() {
        try {
            System.out.println("Inside try block");
            return "Prabha";
        } finally {
            System.out.println("Inside finally block");
            return "PrabhaKaran";
        }
    }

    public static void main(String[] args) {
        String result = testMethod();
        System.out.println("Returned value: " + result);
    }
}