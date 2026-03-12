package com.index.pack;

public class StudentP  {

    int studentId;
    String studentName;
    int marks;

    StudentP(int id, String name, int m) {
        this.studentId = id;
        this.studentName = name;
        this.marks = m;
    }

    void calculateGrade() {

        System.out.println("Student ID: " + studentId);
        System.out.println("Student Name: " + studentName);
        System.out.println("Marks: " + marks);

        if (marks >= 90) {
            System.out.println("Grade: A");
        } 
        else if (marks >= 75) {
            System.out.println("Grade: B");
        } 
        else if (marks >= 50) {
            System.out.println("Grade: C");
        } 
        else {
            System.out.println("Result: Fail");
        }

        System.out.println("*********************");
    }

    public static void main(String[] args) {

        StudentP s1 = new StudentP(1119, "Prabha", 92);
        StudentP s2 = new StudentP(1068, "Jeeva", 98);

        s1.calculateGrade();
        s2.calculateGrade();
    }
}