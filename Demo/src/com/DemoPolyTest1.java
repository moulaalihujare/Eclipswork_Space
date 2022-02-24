
package com;

interface X{
	
 void dis1();
 void dis2();
	
}

class Y implements X{
	
	public void dis1() {
			
		System.out.println("Y class override dis1 method");
	}
	public void dis2() {
		
		System.out.println("Y class override dis2 method");
	}
	
}

public class DemoPolyTest1 {

	public static void main(String[] args) {
			
		//X obj1= new X(); // interface and abstract can't allow to create object
		// but we can create the reference.
		
		Y obj2= new Y(); obj2.dis1(); obj2.dis2();
		X obj3= new Y(); obj3.dis1(); obj3.dis2();
			
	}
}
