package com;

public class MainClass {

	public static void main(String[] args) {
		
		AadhaarCard ac = AadhaarCard.getInstance();
				
		// when toString is overriden
		System.out.println(ac);
		
		// when toString is not overriden
		System.out.println("Name: "+ac.name);
		System.out.println("AadhaarCard No: "+ac.aadhaarNo);
		
	}
}
