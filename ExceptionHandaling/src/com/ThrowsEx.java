package com;

public class ThrowsEx {
	
	static void dis1() throws Exception{
		
		try {
		
		int a=10/0;
		
		}
		catch(Exception e){
		
		System.out.println("Dis1 is Handling Exception");
		}
		
		System.out.println("Thhis Dis1 Method");
	}
	
	static void dis2() throws Exception{
		
		dis1();
		System.out.println("Thhis Dis2 Method");
		
	}
	
	public static void main(String[] args) {
	
	// TODO Auto-generated method stub

		try {
			
	 	dis2();
	 	
		}catch (Exception e) {}
		
		System.out.println("this one is main method !");
		
		
	}

}
