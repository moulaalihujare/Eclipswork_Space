package com;
class MyException extends Exception{
	
	public MyException() {
		
		
	}
	
public MyException(String msg) {
		
	super(msg);
		
	}	
}

public class ThrowKey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=10;
		int b=4;
		
		try {
			
				if(a>b) {
				
			
				//throw new Exception();
				//throw new Exception("a is greater then b");
				//throw new Exception();
				//throw new ArithmeticException();
				throw new ArithmeticException("a is greater then b");
				//throw new MyException();
				//throw new MyException("a is greater then b");
			}
			
		}
			catch (Exception e) {				
				System.out.println(e);
			}
}
}
	