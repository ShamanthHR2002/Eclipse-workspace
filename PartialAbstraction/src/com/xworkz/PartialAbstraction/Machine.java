package com.xworkz.PartialAbstraction;

public abstract class Machine {
	void operate() {
		System.out.println("Operating in machine");
	}

	abstract void shutdown();
}
