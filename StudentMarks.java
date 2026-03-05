package com.index.pack;

public class StudentMarks {

    int rollNo;
    String name;
    int mark1, mark2, mark3;

    void calculateResult() {

        int total = mark1 + mark2 + mark3;
        double average = total / 3.0;
        String grade;

        if (average >= 80) {
            grade = "A";
        } 
        else if (average >= 60) {
            grade = "B";
        } 
        else if (average >= 40) {
            grade = "C";
        } 
        else {
            grade = "Fail";
        }

        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Total: " + total);
        System.out.println("Average: " + average);
        System.out.println("Grade: " + grade);
        System.out.println("----------------------");
    }

    public static void main(String[] args) {

    	StudentMarks s1 = new StudentMarks();
        s1.rollNo = 1;
        s1.name = "Prabha";
        s1.mark1 = 85; s1.mark2 = 80; s1.mark3 = 90;

        StudentMarks s2 = new StudentMarks();
        s2.rollNo = 2;
        s2.name = "Gokul";
        s2.mark1 = 70; s2.mark2 = 65; s2.mark3 = 60;

        StudentMarks s3 = new StudentMarks();
        s3.rollNo = 3;
        s3.name = "Jeeva";
        s3.mark1 = 50; s3.mark2 = 45; s3.mark3 = 40;

        StudentMarks s4 = new StudentMarks();
        s4.rollNo = 4;
        s4.name = "Manoj";
        s4.mark1 = 30; s4.mark2 = 35; s4.mark3 = 38;

        StudentMarks s5 = new StudentMarks();
        s5.rollNo = 5;
        s5.name = "Mugi";
        s5.mark1 = 90; s5.mark2 = 92; s5.mark3 = 88;

        s1.calculateResult();
        s2.calculateResult();
        s3.calculateResult();
        s4.calculateResult();
        s5.calculateResult();
    }
}