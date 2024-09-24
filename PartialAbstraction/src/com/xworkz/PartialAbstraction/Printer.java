package com.xworkz.PartialAbstraction;

class Printer extends Machine {

	@Override
	public void shutdown() {

		System.out.println("shutdown in printer");
	}
}
