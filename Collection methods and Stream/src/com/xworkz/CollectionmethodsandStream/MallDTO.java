package com.xworkz.CollectionmethodsandStream;

public class MallDTO {
	int id;
	String name;
	Location location;
	String owner;
	double landDimension;

	public MallDTO(int id, String name, Location location, String owner, double landDimension) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.owner = owner;
		this.landDimension = landDimension;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Location getLocation() {
		return location;
	}

	public String getOwner() {
		return owner;
	}

	public double getLandDimension() {
		return landDimension;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public void setLandDimension(double landDimension) {
		this.landDimension = landDimension;
	}

	@Override
	public String toString() {
		return "MallDTO [id=" + id + ", name=" + name + ", location=" + location + ", owner=" + owner
				+ ", landDimension=" + landDimension + "]";
	}
}
