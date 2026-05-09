package INTERVIEW;

import java.util.*;

public class EmployeeSalarySystem {
    public static void main(String[] args) {

        Map<Integer, Double> employeeMap = new HashMap<>();

        employeeMap.put(101, 50000.0);
        employeeMap.put(102, 60000.0);
        employeeMap.put(103, 70000.0);

        int searchId = 102;

        if(employeeMap.containsKey(searchId)) {
            System.out.println("Salary: " + employeeMap.get(searchId));
        } else {
            System.out.println("Employee ID not found");
        }

        employeeMap.put(102, 65000.0);

        System.out.println("Updated Salary: " + employeeMap.get(102));

        int missingId = 105;

        if(employeeMap.containsKey(missingId)) {
            System.out.println(employeeMap.get(missingId));
        } else {
            System.out.println("Employee ID 105 not found");
        }
    }
}