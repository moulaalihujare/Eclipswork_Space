package com;


class A{
	
	
	int x=100;
}

class B extends A{
	
	int x=200;
	
	void disp1() {
		
		int x=300;
		
		System.out.println(" x local variable "+x);
		
		System.out.println(" x instance variable "+ this.x);

		System.out.println(" x super variable "+super.x);

	}
	
}

public class SuperAndThis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		B obj= new B();
		
		obj.disp1();
		
		
	}

}
