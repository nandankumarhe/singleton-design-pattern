package com;

public class PrimeMinister {

//	Rule no.3
	private static PrimeMinister pm;
	
	String name="Mr. Modi";
	int age= 72;
	
	// Rule no.1
	private PrimeMinister() {
		System.out.println("PrimeMinister Elected");
	}
	
	// Rule no.2
	public static PrimeMinister getInstance() {
		if(pm == null) {
			pm = new PrimeMinister();
		}
		
		return pm;	// return new PrimeMinister();
	}
	
	@Override
	public String toString() {
		return "Name : "+name + " Age : "+age;
	}
}

// Student.getInstance() -> Student s = new Student();
// Pen.getInstance() -> Pen p = new Pen();
