package com;

class Min{
	
	void minValue(int arr[]) {
		
		int value =arr[0];
		
		for (int i=0; i<arr.length; i++) {
			
			
			if (value > arr[i]) 
				
				value =arr[i];	
		}

		
		System.out.println(value);
		
	}	

}

public class MinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			
		Min m= new Min();
		
        int []x= {10,9,6,8,2,3,30};
        
        m.minValue(x);
         
	}


}