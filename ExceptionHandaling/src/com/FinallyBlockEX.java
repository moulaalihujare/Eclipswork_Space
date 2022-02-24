package com;

public class FinallyBlockEX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//**try , catch, and finally**//
		try{
			int i= 10/0;
			
			System.out.println(""+i);		
	}
	
		catch(Exception e){
		
		System.out.println("Exception generated");
	}
		
		finally{
			
		System.out.println("closes the all resorces");
	}
	
		
		//System.out.println("Normal code");

//**flaveor two
		try{
				int i= 10/0;
	
				System.out.println(""+i);		
	}

	finally{
	
				System.out.println("closes the all resorces");
	}

	}
}

