package test.com;

import static java.nio.file.StandardOpenOption.APPEND;
import static java.nio.file.StandardOpenOption.CREATE;
import static java.nio.file.StandardOpenOption.WRITE;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

class Pet{
	private String petname;
	private int petage;
	
//overloaded constructor
	public Pet(String petname, int petage) {
		super();
		this.petname = petname;
		this.petage = petage;
	}
//default constructor
	public Pet() {
		this.petname ="NULL";
		this.petage=0;
	}
//getters and setters
	public String getPetname() {
		return petname;
	}
	public int getPetage() {
		return petage;
	}
	public void setPetname(String petname) {
		this.petname = petname;
	}
	public void setPetage(int petage) {
		this.petage = petage;
	}
	@Override
	public String toString() {
		return "Pet [petname=" + petname + ", petage=" + petage + "]";
	}
}

class Person implements Serializable{
	private transient Pet mypet;  // has-a relationship
	private String personname;
	private String interest;
	
//overloaded constructor
	public Person(Pet mypet, String personname, String interest) {
		super();
		this.mypet = mypet;
		this.personname = personname;
		this.interest = interest;
	}
//Getters and setters
	public Pet getMypet() {
		return mypet;
	}

	public String getPersonname() {
		return personname;
	}

	public String getInterest() {
		return interest;
	}

	public void setMypet(Pet mypet) {
		this.mypet = mypet;
	}

	public void setPersonname(String personname) {
		this.personname = personname;
	}

	public void setInterest(String interest) {
		this.interest = interest;
	}
	
	@Override
	public String toString() {
		return "Person [mypet=" + mypet + ", personname=" + personname + ", interest=" + interest + "]";
	}
	
	private void writeObject(ObjectOutputStream out) throws IOException {
	     out.defaultWriteObject();// Serialize non transient 
	     String name = mypet.getPetname();
	     out.writeObject(name);      // manual serialization 
	     out.writeDouble(mypet.getPetage()); // manual serialization 
	  }
	  
 }

public class Manualserialization {

	public static void main(String[] args) {
		 String sep=File.separator;
		 String fileName = (sep+"HTC Java training docs"+sep+"manual.ser");
		 Path path = Paths.get(fileName);
		 try(ObjectOutputStream out = new ObjectOutputStream(new BufferedOutputStream(
		    		Files.newOutputStream(path, CREATE, WRITE, APPEND)))){
		    
		 Pet mypet= new Pet("Dog",10);
		 Person pe=new Person (mypet,"Sahi","petlover");	
		 System.out.println("Person class"+pe);
		 out.writeObject(pe);		 
		 }
		 catch (IOException ioxe){
		    	System.out.println("error while writing");
		    	ioxe.printStackTrace();
    	
		    }
	    }
 }



