package com.index.pack;
import java.util.Scanner;

class MyException extends Exception {
    public MyException(String message) {
        super(message);
    }
}

public class StudentException {
    void StudentGrade(int Mark,String Name) throws MyException {

        if (Mark < 0 || Mark >100) {
            throw new MyException("Invalid Mark");
        } 
        else if (Name==null || Name.isBlank()) {
            throw new MyException("Invalid Data");
        } 
        else {
            System.out.println("Name: " + Name);
            System.out.println("Mark :"+Mark);
   
        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StudentException bank = new StudentException();

        System.out.print("Enter the Student Name :");
        String Name = sc.nextLine();
        System.out.print("Enter the Student Mark :");
        int Mark = sc.nextInt();
        

        try {
            bank.StudentGrade(Mark,Name);
        } 
        catch (MyException e) {
            System.out.println("Caught Exception : " + e.getMessage());
        }
        finally {
            System.out.println("Student Detail Fetched");
            System.out.println("Student Name : " + Name);
            System.out.println("Student Mark : " + Mark);
            System.out.println("Process Completed.");
        }

        sc.close();
    }
}



