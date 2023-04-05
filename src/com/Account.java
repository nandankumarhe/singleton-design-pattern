package com;

public class Account {

	private static Account obj; // obj -> null;

	private Account() {
		System.out.println("Object Created");
	}

	public static void creatObject(){
		if(obj == null) {
			obj = new Account();
		}
		else  {
			System.out.println("Object Already Created");
		}
	}
}
