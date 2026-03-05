package com.index.pack;

public class Employeee {

    int empId;
    String empName;
    double basicSalary;

    void calculateSalary() {

        double hra = basicSalary * 0.20;
        double da = basicSalary * 0.10;
        double bonus = 0;

        if (basicSalary > 50000) {
            bonus = basicSalary * 0.05;
        }

        double grossSalary = basicSalary + hra + da + bonus;

        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + empName);
        System.out.println("Gross Salary: " + grossSalary);
        System.out.println("----------------------");
    }

    public static void main(String[] args) {

        Employeee e1 = new Employeee();
        e1.empId = 101;
        e1.empName = "Jeeva";
        e1.basicSalary = 60000;

        Employeee e2 = new Employeee();
        e2.empId = 102;
        e2.empName = "Prabha";
        e2.basicSalary = 45000;

        Employeee e3 = new Employeee();
        e3.empId = 103;
        e3.empName = "Gokul";
        e3.basicSalary = 52000;

        e1.calculateSalary();
        e2.calculateSalary();
        e3.calculateSalary();
    }
}