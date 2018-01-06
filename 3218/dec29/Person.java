package com.htc.dec29;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

@SuppressWarnings("serial")
public class Person implements Serializable 
{
	
	private transient Pet like;
	private String name;
	
	/**
	 * 
	 */
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param like
	 * @param name
	 */
	public Person(Pet like, String name) {
		this.like = like;
		this.name = name;
	}
	public Pet getLike() {
		return like;
	}
	public void setLike(Pet like) {
		this.like = like;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	private void writeObject(ObjectOutputStream out) throws IOException
	{
		out.defaultWriteObject();//serialize non-transient
		out.writeObject(like.getPname());
		out.writeObject(like.getPcost());
	}
	
	private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException
	{
		in.defaultReadObject(); // deserialize non-transient
		String pname = (String) in.readObject();
		String pcost = (String) in.readObject();
		like= new Pet(pname,pcost);
	}
	
	@Override
	public String toString() {
		return "Person [like=" + like + ", name=" + name + "]";
	}
	public static void main(String[] args) throws ClassNotFoundException {
		try
		{
		ObjectOutputStream out = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("Pet.txt")));	
		Pet like = new Pet("Bulldog","100");
		Person p = new Person(like,"Suresh");
		System.out.println("Before :" +p);
		out.writeObject(p);
		out.close();
		}
		catch(IOException ie)
		{
			ie.printStackTrace();
		}
		
		try
		{
		ObjectInputStream in = new ObjectInputStream(new BufferedInputStream(new FileInputStream("Pet.txt")));	
		Person p1 = (Person) in.readObject();
		System.out.println("After :" +p1);
		
		in.close();
		}
		catch(IOException ie)
		{
			ie.printStackTrace();
		}
		catch(ClassNotFoundException cn)
		{
			cn.printStackTrace();
		}
	}

}
