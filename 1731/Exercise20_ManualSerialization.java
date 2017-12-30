package htc.assignments;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.nio.file.Path;
import java.nio.file.Paths;


class Pet
{
	private String typeOfPet;
	private double cost;

	public Pet(String typeOfPet, int cost) {
		super();
		this.typeOfPet = typeOfPet;
		this.cost = cost;
	}

	public Pet() {}


	public String getTypeOfPet() {
		return typeOfPet;
	}

	public void setTypeOfPet(String typeOfPet) {
		this.typeOfPet = typeOfPet;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

}

class Person implements Serializable{

	private String firstName;
	private String lastName;
	private String dateOfBirth;
	private transient Pet liking;  // Transient

	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", dateOfBirth=" + dateOfBirth
				+ ", liking=" + liking + "]";
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public Pet getLiking() {
		return liking;
	}

	public void setLiking(Pet liking) {
		this.liking = liking;
	}

	public Person(String firstName, String lastName, String dateOfBirth, Pet liking) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.liking = liking;
	}

	public Person() {}

	private void writeObject(ObjectOutputStream out) throws IOException { 
		out.defaultWriteObject();// serailize non transient  
		out.writeObject(firstName);        
		//		 out.String typeOfPet = liking.getTypeOfPet(); 
		out.writeDouble(liking.getCost());  
	} 

}

public class Exercise20_ManualSerialization {

	public static void main(String[] args) {

		try {
			FileOutputStream fos;
			String fileName = "C:\\\\HTC\\\\Serialization.txt"; 
			fos = new FileOutputStream(fileName);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			Pet liking =  new Pet("Cat", 1000);      
			Person pr = new Person("Jesus", "Christ", "01/01/1989", liking); 
			System.out.println("before:"+pr); 
			oos.writeObject(pr); 

			}
			catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}


	}	
}

