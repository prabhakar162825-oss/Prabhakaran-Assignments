package com.index.pack;


	class Worker {
	    void calculateBonus() {
	        System.out.println("Calculating employee bonus...");
	    }
	}
	class Manager extends Worker {
		
	    void calculateBonus() {
	        System.out.println("Manager Bonus: 20% of salary");
	    }
	}
	class AppDev extends Worker{
	    void calculateBonus() {
	        System.out.println("Developer Bonus: 10% of salary");
	    }
	}
	class Intern extends Worker {
	    void calculateBonus() {
	        System.out.println("Intern Bonus: 5% of salary");
	    }
	}


public class EmployeeRP  {

	    public static void main(String[] args) {

	    	Worker emp;

	        emp = new Manager();
	        emp.calculateBonus();
	        emp = new AppDev();
	        emp.calculateBonus();
	        emp = new Intern();
	        emp.calculateBonus();
	    }
	}

