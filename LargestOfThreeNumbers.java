package com.index.pack;
import java.util.Scanner;
public class LargestOfThreeNumbers {
public static void main(String[] args) {
	int Largest;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the value of A:");
	int a =sc.nextInt();
	System.out.println("Enter the value of B:");
	int b =sc.nextInt();
	System.out.println("Enter the value of C:");
	int c =sc.nextInt();
	if(a>b && a>c) {
		System.out.println("A is the Largest Value");
		System.out.println("Largest Value is " +a);
	}
	else if (b>c && b>a)
	{
		System.out.println("B is the Largest Value");
		System.out.println("Largest Value is " +b);
	
}
	else  {

	
		System.out.println("C is the Largest Value");
		System.out.println("Largest Value is " +c);
	
}

}
}
