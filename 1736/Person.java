package com.htcinc.oops.day12;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Person implements Serializable{
	private transient Pet pet;
	private String name;
	
	public Person(Pet pet, String name) {
		super();
		this.pet = pet;
		this.name = name;
	}

	public Pet getPet() {
		return pet;
	}

	public void setPet(Pet pet) {
		this.pet = pet;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [pet=" + pet + ", name=" + name + "]";
	}
	

	public void writeObject(ObjectOutputStream oos) throws IOException {
		oos.defaultWriteObject(); 				//Serializing non-transient fields
		String name=pet.getName();
		oos.writeObject(name); 		//Manual Serializing transient fields
		oos.writeObject(pet.getBreed());
		oos.writeObject(pet.getPrice());		//Manual Serializing transient fields
		
	}
	
	public void readObject(ObjectInputStream ois) throws ClassNotFoundException, IOException {
		ois.defaultReadObject();				//Deserializing non-transient fields

		String petName=(String) ois.readObject(); //Deserializing transient fields
		System.out.println("ReadObject : " + petName);

		String petBreed=(String) ois.readObject(); //Deserializing transient fields
		double petPrice=ois.readDouble();
		pet=new Pet(petName, petBreed, petPrice);			//Deserializing transient fields
		System.out.println("ReadObject : " + petBreed + " " + petPrice);
		
	}
	

}
