package com.htc.exercise161720;
import java.io.*;
import java.nio.file.*;

import static java.nio.file.StandardOpenOption.APPEND;
import static java.nio.file.StandardOpenOption.CREATE;
import static java.nio.file.StandardOpenOption.WRITE;


class Pet {
	private String name;
	
	public Pet(String name) {
		this.name = name;
    }
	  
    public Pet(){
    	
    }
	  
    public String getName() {
	  return name;
    }
	   
    public void setName(String name) {
        this.name = name;
    }
    
    public String toString() {
	     return "Pet Name:" + name;
	}
}

class Person implements Serializable {
	private static final long serialVersionUID = 1L;
	private String name;
	private transient Pet myPet;
	
	public Person(String name, Pet myPet) {
		super();
		this.name = name;
		this.myPet = myPet;
	}

	public String getName() {
		return name;
	}
		   
	public void setName(String name) {
		this.name = name;
	}
	
	public String toString() {
	     return "Person Name:" + name + " Pet: " + myPet;
	}
	
	private void writeObject(ObjectOutputStream out) throws IOException {
	     out.defaultWriteObject();// serailize non transient 
	     String name = myPet.getName();
	     out.writeObject(name);      // manual serialization 
	  }
	  
	  private void readObject(ObjectInputStream in)throws Exception {
	     in.defaultReadObject(); // deserilizing non transient 
	     String name = (String)in.readObject();
	     myPet = new Pet(name); // manula deserialization 
	  }	
}

public class PersonSerialize {

	  public static void main(String[] args)throws Exception  {

	    String fileName = "PersonSerialize.txt";
	    Path path = Paths.get(fileName);
	    //Write object to file
	    try(ObjectOutputStream out =
	           new ObjectOutputStream(new BufferedOutputStream(Files.newOutputStream(path, CREATE, WRITE, APPEND)))){
	     
	    	Pet dog = new Pet("Dog");     
	    	Person per = new Person("Persion 1",dog);
	    	out.writeObject(per);
	    }catch(IOException ioxe){
	    	ioxe.printStackTrace();
	        System.out.println("Error while writing");  
	    } 

	    //Read file to object 
	    try(ObjectInputStream in = 
	            new ObjectInputStream(
	             new BufferedInputStream(
	                     Files.newInputStream(path)))) {
	    
	    	Person per2 = (Person)in.readObject();
	    	System.out.println("Reading:" + per2);
	    }catch(IOException ioxe){
	        System.out.println("Error while reading");  
	    }catch(ClassNotFoundException clne){
	        clne.printStackTrace();
	    }
  }
}