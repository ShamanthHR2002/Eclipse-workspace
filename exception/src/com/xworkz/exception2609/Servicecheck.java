package com.xworkz.exception2609;

public class Servicecheck {

	public void save(String email) throws InvalidEmailException {

		if (email != null && email.contains("@") && email.contains(".com")) {
			System.out.println("Valid email...");
		} else {
			System.out.println("Invalid email...");
			throw new InvalidEmailException();
		}
	}

	public void AcceptPrice(int price) throws InvalidAmountException {
		if (price > 0 && price <= 100) {
			System.out.println("Valid amount...");
		} else {
			System.out.println("Invalid amount...");
			throw new InvalidAmountException();
		}
	}
}
