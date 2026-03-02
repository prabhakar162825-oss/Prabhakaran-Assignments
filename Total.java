package com.index.pack;
import java.util.Scanner;
public class Total {
private static int availablestock;

public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Req Stock Quantity:");
	int StockQuantity=sc.nextInt();
	int availablestock = 1000;
	int total;
		
	if(availablestock <=1000)
	{
	total= availablestock - StockQuantity;
	}
	
	else {
		total=0;
	}
	
	System.out.println("The available Stock is " +availablestock);
	System.out.println("The available Stock is " +total);
	
}
}
