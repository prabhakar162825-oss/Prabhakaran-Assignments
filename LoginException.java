package com.index.pack;

import java.util.Scanner;

class InvalidUsernameException extends Exception {
    public InvalidUsernameException(String message) {
        super(message);
    }
}

class InvalidPasswordException extends Exception {
    public InvalidPasswordException(String message) {
        super(message);
    }
}

public class LoginException {

    public static String UserName = "Prabha";
    public static String Password = "Prabha123";

    void login(String username, String password) 
            throws InvalidUsernameException, InvalidPasswordException {

        if (!UserName.equals(username)) {
            throw new InvalidUsernameException("Invalid Username");
        } 
        else if (!Password.equals(password)) {
            throw new InvalidPasswordException("Invalid Password");
        } 
        else {
            System.out.println("Login Successful!");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        LoginException le = new LoginException();

        int attempts = 0;
        final int Maximun_Attempts = 3;

        while (attempts < Maximun_Attempts) {

            System.out.print("Enter Username: ");
            String user = sc.nextLine();

            System.out.print("Enter Password: ");
            String pass = sc.nextLine();

            try {
                le.login(user, pass);
                break;
            } 
            catch (InvalidUsernameException | InvalidPasswordException e) {
                attempts++;
                System.out.println("Caught Exception: " + e.getMessage());
            } 
            finally {
                System.out.println("Login Attempted for Username: " + user);
                System.out.println("Attempts left: " + (Maximun_Attempts - attempts));
                System.out.println("Login Attempt Completed.");
            }
        }

        if (attempts == Maximun_Attempts) {
            System.out.println("❌ Too many failed attempts. Program terminated.");
        }

        sc.close();
    }
}