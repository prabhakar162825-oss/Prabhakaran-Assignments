package com.index.pack;
import java.util.Scanner;

public class ArrayAddition {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n]; 
        
        System.out.println("Enter " + n + " numbers:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Array elements are:");
        for(int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
            int sum = 0 ;
            for(int i1 = 0 ; i1 < n; i1++) {
            	sum = sum +arr[i1];
            }	
            	System.out.println("Sum of Elements :"+sum);
           }
        }
    

