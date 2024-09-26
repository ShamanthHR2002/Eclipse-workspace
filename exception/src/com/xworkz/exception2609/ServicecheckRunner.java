package com.xworkz.exception2609;

public class ServicecheckRunner {
	public static void main(String[] args) throws InvalidEmailException {
		Servicecheck service = new Servicecheck();

		service.save("shamanthhr@524gmail.com");

		service.AcceptPrice(20);
	}
}
