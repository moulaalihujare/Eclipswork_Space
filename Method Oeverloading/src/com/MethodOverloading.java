package com;

class Demo{
	
   static int add(int a, int b, int c) {
   
   return (a+b+c);
   
   }
	
   static double add(double a, double b,  double c) {
	   
	 return (a+b+c);  
   }
}

public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(Demo.add(20, 30, 40));
		System.out.println(Demo.add(10.9, 10.8, 10.0));
		
		
		
	}

}
