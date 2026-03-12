package com.index.pack;

public class LoginSystem{
	
	    void login(String username, String password) {
	        System.out.println("Login using Username and Password");
	        System.out.println("Username: " + username);
	        System.out.println("Login Successful");
	        System.out.println("----------------------");
	    }
	    void login(String email, String password, boolean isEmail) {
	        System.out.println("Login using Email and Password");
	        System.out.println("Email: " + email);
	        System.out.println("Login Successful");
	        System.out.println("----------------------");
	    }
	    void login(long mobileNumber, int otp) {
	        System.out.println("Login using Mobile Number and OTP");
	        System.out.println("Mobile Number: " + mobileNumber);
	        System.out.println("OTP Verified");
	        System.out.println("Login Successful");
	        System.out.println("----------------------");
	    }

	    public static void main(String[] args) {

	        LoginSystem ls = new LoginSystem();

	        ls.login("Prabha123", "Prabha123");              
	        ls.login("Prabha@gmail.com", "emailpass", true);   
	        ls.login(6374659373L, 4567);                     
	    }
	}