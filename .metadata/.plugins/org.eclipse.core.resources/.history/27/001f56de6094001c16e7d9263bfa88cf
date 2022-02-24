package com;

abstract class A{
	
	abstract void dis1();
	
}

class B extends A{
	
	void dis1() {
		
		
		System.out.println("B class override dis1 method");
	}
	void dis2() {
		
		System.out.println("B class own dis2 method");
	}
	
	
}

 class C extends B{
	 
	 void dis2() {
		 
		 System.out.println("C class overried dis2 method");
	 }
 }




public class RunTimePoly {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

		//A obj1= new A(); obj1.dis1();
		//B obj2= new B(); obj2.dis1(); obj2.dis2();

		//B obj5 = new C(); obj5.dis2();
		
	    //B obj4= new A(); // cant possible;
		
		
		A obj3= new B(); obj3.dis1();
			
		
	}

}
