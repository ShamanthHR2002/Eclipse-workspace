package com.xworkz.collection;

import java.io.Serializable;

public class MatchBox implements Serializable {

	private int cost;
	private String brand;

	public MatchBox(int cost, String brand) {
		super();
		this.cost = cost;
		this.brand = brand;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
}
