package com;

public class TryWithMultipleCatchBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		int abc[]= {10,20};
		
		String str="10";
		
		try {
		
		//int a=10/0;
		//int b=10/abc[3];
		
		int sum=10+Integer.parseInt(str);
		
		System.out.println("Sum :"+sum);
		
		}
		
        catch(ArithmeticException e) {
			
		
        	System.out.println("Divide By Zero");
		}
		
		catch(ArrayIndexOutOfBoundsException e) {
			
			System.out.println("Array Index");
		}
		
		catch(Exception e) {
			
			//System.out.println("I will take care about the error !");
			System.out.println("generic Exception");
		}
		
	      System.out.println("Finish");
		
	}

}
