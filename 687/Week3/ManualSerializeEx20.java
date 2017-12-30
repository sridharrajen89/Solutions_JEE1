package com.java.io;
import static java.nio.file.StandardOpenOption.APPEND;
import static java.nio.file.StandardOpenOption.CREATE;
import static java.nio.file.StandardOpenOption.WRITE;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.Serializable;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.File;

/**
 * Ex 20 - Manual Serialization
 * There is a class called Pet which is not a Serializable class. 
 * There is another class called Person which is Serializable and has Pet as a field.  
 * Write a manual serialization program to serialize the Person object  
*/

class Pet {
    private String petName;
    private String petBreed;
    private double petCost;

    public Pet() {
		super();
		this.petName = "";
		this.petBreed = "";
		this.petCost = 0;
	}
	/**
	 * @param petName
	 * @param petBreed
	 * @param petCost
	 */
	public Pet(String petName, String petBreed, double petCost) {
		super();
		this.petName = petName;
		this.petBreed = petBreed;
		this.petCost = petCost;
	}
	/**
	 * @return the petName
	 */
	public String getPetName() {
		return petName;
	}
	/**
	 * @param petName the petName to set
	 */
	public void setPetName(String petName) {
		this.petName = petName;
	}
	/**
	 * @return the petBreed
	 */
	public String getPetBreed() {
		return petBreed;
	}
	/**
	 * @param petBreed the petBreed to set
	 */
	public void setPetBreed(String petBreed) {
		this.petBreed = petBreed;
	}
	/**
	 * @return the petCost
	 */
	public double getPetCost() {
		return petCost;
	}
	/**
	 * @param petCost the petCost to set
	 */
	public void setPetCost(double petCost) {
		this.petCost = petCost;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((petName == null) ? 0 : petName.hashCode());
		return result;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pet other = (Pet) obj;
		if (petName == null) {
			if (other.petName != null)
				return false;
		} else if (!petName.equals(other.petName))
			return false;
		return true;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Pet [petName=" + petName + ", petBreed=" + petBreed + ", petCost=" + petCost + "]";
	}
   
}

@SuppressWarnings("serial")
class Person implements Serializable {

    private String personName;
    private char personGender;
    private transient Pet companion;
   /**
	 * 
	 */
	public Person() {
		super();
		this.personName = "";
		this.personGender = ' ';
		this.companion = null;
	}
	
/**
 * @param companion
 * @param personName
 * @param personGender
 */
public Person(String personName, char personGender, Pet companion) {
	super();
	this.personName = personName;
	this.personGender = personGender;
	this.companion = companion;
}
/**
 * @return the personName
 */
public String getPersonName() {
	return personName;
}

/**
 * @param personName the personName to set
 */
public void setPersonName(String personName) {
	this.personName = personName;
}

/**
 * @return the personGender
 */
public char getPersonGender() {
	return personGender;
}

/**
 * @param personGender the personGender to set
 */
public void setPersonGender(char personGender) {
	this.personGender = personGender;
}

/**
 * @return the companion
 */
public Pet getCompanion() {
	return companion;
}

/**
 * @param companion the companion to set
 */
public void setCompanion(Pet companion) {
	this.companion = companion;
}

/* (non-Javadoc)
 * @see java.lang.Object#hashCode()
 */
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((personName == null) ? 0 : personName.hashCode());
	return result;
}

/* (non-Javadoc)
 * @see java.lang.Object#equals(java.lang.Object)
 */
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Person other = (Person) obj;
	if (personName == null) {
		if (other.personName != null)
			return false;
	} else if (!personName.equals(other.personName))
		return false;
	return true;
}


/* (non-Javadoc)
 * @see java.lang.Object#toString()
 */
@Override
public String toString() {
	return "personName=" + personName + " personGender=" + personGender + "\n" +companion;
}

private void writeObject(ObjectOutputStream out) throws IOException {
     out.defaultWriteObject();                     // serialize non transient 
     out.writeObject(companion.getPetName());      // manual serialization 
     out.writeObject(companion.getPetBreed());     // manual serialization 
     out.writeDouble(companion.getPetCost());      // manual serialization 
  }
  
  private void readObject(ObjectInputStream in) throws Exception {
     in.defaultReadObject(); 						// deserializing non transient 
     String petName = (String)in.readObject();     // manual deserialization
     String petBreed = (String)in.readObject();    // manual deserialization
     double petCost = in.readDouble();             // manual deserialization 
     companion = new Pet(petName,petBreed,petCost);         // manual deserialization 
  }

	
 }

public class ManualSerializeEx20 {

  public static void main(String[] args)throws Exception  {
	String sep = File.separator;
    String fileName = "C:"+sep+"Java"+sep+"manual.txt";
    Path path = Paths.get(fileName);
    try(ObjectOutputStream out =
           new ObjectOutputStream(new BufferedOutputStream(
                 Files.newOutputStream(path, CREATE, WRITE, APPEND)))){
     Pet companion = 
           new Pet ("Angel", "labrador", 700.0);     
     Person person = new Person("Mahi", 'f', companion);
     System.out.println("before serialization:"+ person);
     out.writeObject(person);
    }catch(IOException ioxe){
    	ioxe.printStackTrace();
        System.out.println("Error while writing");  
    } 
    try(ObjectInputStream in = 
            new ObjectInputStream(
             new BufferedInputStream(
                     Files.newInputStream(path)))) {
    Person newPerson = (Person)in.readObject();
    System.out.println("after de serialization:"+ newPerson);
    }catch(IOException ioxe){
        System.out.println("Error while reading");  
    }catch(ClassNotFoundException clne){
        clne.printStackTrace();
    }
  }

}