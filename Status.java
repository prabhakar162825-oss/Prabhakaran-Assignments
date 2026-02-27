package com.index.pack;
import java.util.Scanner;
public class Status {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	String Username=sc.nextLine();
	System.out.println("Enter ur Username:");
	String Password=sc.nextLine();
	System.out.println("Enter Ur Password");
	
	String Status;

	if (Username.equals("Prabha") && Password.equals("Keerthi28")) {
	    Status = "Login Successful";


	System.out.println(Status);


}
}
}
