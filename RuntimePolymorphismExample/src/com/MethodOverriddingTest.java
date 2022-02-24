package com;


class Bike{
	
	void speed() {
		
	System.out.println("60km/hr");
	}
	
}
class Honda extends Bike{
	
	void speed() {
		
		System.out.println("90 km /hr");
	}
	
	
	void color() {
		
		System.out.println("Black");
		
		
	}
}

class Pulsar extends Bike{
	
	void color() {
		
		System.out.println("Red");
		
	}
}

class Tvs extends Bike{
	
	
	
	
	
	
	void speed() {
		
	
		super.speed();
		System.out.println("70 km/hr");
		
		
	}
	
	void color() {
		
		System.out.println("blue");
		
	}
}


public class MethodOverriddingTest {

	
	
	
	public static void main(String[] args) {
		// TODO Auto-generhated method stub
		
		Honda h= new Honda();
		h.speed();
		h.color();
		Pulsar p= new Pulsar();
		p.color();
		p.speed();
		p.color();
		Tvs t= new Tvs();
		t.speed();
		t.color();

	}

}
