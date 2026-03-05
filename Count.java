package com.index.pack;
import java.util.Scanner;
public class Count {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value: ");
		int i=sc.nextInt();
		
	int count=0;
	while(i!=0) {
		i= i/10;
				count++;
	}
	System.out.println("Count: "+count);
	return;
	}

}

