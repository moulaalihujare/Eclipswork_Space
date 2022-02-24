package com;

class A{
	
 final int a=10;
	
	
	void dis() {
		
		System.out.println(a);
	}
}

class B extends A{

	
	void dis() {
		
		super.dis();
		System.out.println("here the method is overide");
	}
	
}

public class Finalkey {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	B newB= new B();
	newB.dis();
		
	}

}
