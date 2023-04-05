package com;

public class Citizen {

	public static void main(String[] args) {
	
		// internally -> PrimeMinister pm = new PrimeMinister();
		PrimeMinister pm = PrimeMinister.getInstance();

		System.out.println(pm);
		System.out.println("------------------------");
		System.out.println("Name: "+pm.name);
		System.out.println("Age: "+pm.age);
		
	}
}
