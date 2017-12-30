package com.htcinc.oops.day12;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class PersonMain {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
		File fileName = new File("C:\\Users\\Nagender\\Desktop\\HTC Java\\Dec 29, 2017\\Person.ser");
		
		Pet pet=new Pet("Pet1","Breed1",100.23);
		Person person=new Person(pet, "John McEnroe");
		
		System.out.println("Before Serialization :" + person);
		ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(fileName));
		oos.writeObject(person);
		
		ObjectInputStream ois=new ObjectInputStream(new FileInputStream(fileName));
		Person perDeSer= (Person) ois.readObject();
		
		System.out.println("Output after deserialization :" + perDeSer);
		
		//Issue with not retrieving (or saving) transient fields
		
		
	}

}
