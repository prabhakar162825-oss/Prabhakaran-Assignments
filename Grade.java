package com.index.pack;
import java.util.Scanner;
public class Grade {
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int Mark=sc.nextInt();
		char Grade;
		
		if 
		   (Mark>=95)
		   Grade='A';
		else if 
		   (Mark >= 75)
		   Grade='B';
		else if
			(Mark >=60)
		    Grade='C';
		else
		    Grade='F';
		System.out.println("Grade:"+Grade);
		}
	
	}

