package com.index.pack;
import java.util.Scanner;

public class Library {

    int MemberId;
    boolean MembershipType;

    Library() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Membership Id:");
        MemberId = sc.nextInt();

        System.out.println("Enter the Membership Type:");
        MembershipType = sc.nextBoolean();
    }

    void Display() {

        System.out.println("Member Id: " + MemberId);

        if (MembershipType == true) {
            System.out.println("Membership Type: Regular");
        } else {
            System.out.println("Membership Type: New User");
        }
    }

    public static void main(String[] args) {

        Library L = new Library();
        L.Display();

    }
}