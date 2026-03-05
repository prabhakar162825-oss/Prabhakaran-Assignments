package com.index.pack;

	import java.util.Scanner;
	public class Status {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter ur Username:");
		String Username=sc.nextLine();
		System.out.println("Enter Ur Password");
		String Password=sc.nextLine();
		
		
		String Validation;

		if (Username.equals("Prabha") && Password.equals("Pass28")) {
		    Validation = "Login Successful";
		}
		else if 
		 (!Username.equals("Prabha") && Password.equals("Pass28")) {
		    Validation = "Incorrect Username";
			}
		else if 
		(Username.equals("Prabha") && !Password.equals("Pass28")) {
		    Validation = "Incorrect Password";
		}
		else {
		
			Validation = "Enter Valid Login credentials";
		}
		
		System.out.println(Validation);


	}
	}
