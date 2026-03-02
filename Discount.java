package com.index.pack;
import java.util.Scanner;
public class Discount {
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int PurchaseAmount=sc.nextInt();
		double Discount = (PurchaseAmount > 5000) ?
				PurchaseAmount * 0.10 : 0;
		System.out.println("Discount Amount"+ Discount);
		
	}
	

}
