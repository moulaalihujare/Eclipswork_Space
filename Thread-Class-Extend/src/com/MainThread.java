package com;

public class MainThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ThreadShample th= new ThreadShample();
		th.start();
		
		ThreadShample2 th2= new ThreadShample2();
		th2.start();

		Thread1 th3= new Thread1();
		
		Thread tR= new Thread(th3);
		
		tR.start();	
		
	}

}
