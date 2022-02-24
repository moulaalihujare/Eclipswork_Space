package com;

public class ForeachSimple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []a= {20,21,30,80};
		
		int sum=0;
		
		for (int m:a) {
			
			System.out.println(" Readed element is given :"+m);
		
			sum=sum+m;
			
		}
		
		System.out.println(" Addition of all readed elements is :"+sum);
			
}
}