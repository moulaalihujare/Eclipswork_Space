package com;

public class CallbyValue {

	int v= 500;
	
	void change(int v) {
		
		v=v+100;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		CallbyValue o = new CallbyValue();
		
		
		System.out.println("Before making Changes: "+o.v);
		
		o.change(500);
		
		System.out.println("After making Chnages:  "+o.v);
		

	}

}
