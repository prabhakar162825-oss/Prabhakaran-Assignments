package com.index.pack;

public class Employee1 {
int empid;
String name;

Employee1(){
	empid= 1119;
	name="Not Assigned";
	
}
void Display() {
	System.out.println("Employee ID: "+empid);
	System.out.println("Employee Name: "+name);
}
public static void main(String[] args) {
	Employee1 E1=new Employee1();
	E1.Display();
}
}
