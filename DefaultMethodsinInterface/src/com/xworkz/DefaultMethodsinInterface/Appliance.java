package com.xworkz.DefaultMethodsinInterface;

interface Appliance {
	void turnOn();

	default void turnOff() {
		System.out.println("Appliance turned off.");
	}
}
