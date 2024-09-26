package com.xworkz.exception2609;

public class InvalidAmountException extends RuntimeException {
	public InvalidAmountException() {
		super("Invalid amount provided.");
	}
}
