package com;

class Employee{
	
	
	public Employee() {
	
		
		System.out.println("Employee class object created..");
	}
	
public Employee(int x) {
	
		
		System.out.println(x+ "Employee parameter class object created..");
	}
	
}
class Manager extends Employee {
	
	
	
		
	public Manager() {
	    
	super(201);	
		
	System.out.println("Employee class object created..");
	
	}
}

public class ThisPara {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Manager mgr= new Manager();
				
	}

}
