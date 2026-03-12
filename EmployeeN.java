package com.index.pack;

 class EmployeeN {
	int empId;
	String empName;
	double Salary;
	EmployeeN(int a,String n,double d){
		this.empId=a;           
	    this.empName=n;
	    this.Salary=d;
	}
	void displayEmployeeN(){
	
	
	System.out.println("The EmpId is: "+empId);
	System.out.println("The EmpName is: "+empName);
	System.out.println("The Salary is: "+Salary);
	
}
}
public class Employee2 {
	public static void main(String[] args) {
	
		EmployeeN s=new EmployeeN(1119,"Prabha",65000.74582);
		EmployeeN s1=new EmployeeN(1068,"Jeeva",75500.74582);
		EmployeeN s2=new EmployeeN(1095,"Manoj",88000.74582);
		
		s.displayEmployeeN();
		s1.displayEmployeeN();
		s2.displayEmployeeN();
		}
}
