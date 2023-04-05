package com;

public class AadhaarCard {

	String name="Luffy";
	int aadhaarNo=1254;
	
	private AadhaarCard() {
		System.out.println("AadhaarCard Generated");
	}
	
	private static AadhaarCard ac;
	
	public static AadhaarCard getInstance() {
		if(ac==null) {
			ac = new AadhaarCard();
		}
		return ac;
	}
	
	@Override
	public String toString() {
		return "name: "+name+" AadhaarCardNo: "+aadhaarNo;
	}
}
