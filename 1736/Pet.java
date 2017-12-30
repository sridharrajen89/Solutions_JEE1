package com.htcinc.oops.day12;

public class Pet {
	private String name;
	private String breed;
	private double price;
	public Pet(String name, String breed, double price) {
		super();
		this.name = name;
		this.breed = breed;
		this.price = price;
	}
	
	public Pet(String name, double price) {
		super();
		this.name = name;
		this.breed = "";
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Pet [name=" + name + ", breed=" + breed + ", price=" + price + "]";
	}

	

}
