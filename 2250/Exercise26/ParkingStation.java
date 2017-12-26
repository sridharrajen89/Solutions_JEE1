package com.java.exercise2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class ParkingStation {
	ArrayList<ParkedBike> pbike = new ArrayList<ParkedBike>();	

//Constructor
	public ParkingStation(ArrayList<ParkedBike> pbike) {
		super();
		this.pbike = pbike;
	}
	
	
//Getter and Setter
	public ArrayList<ParkedBike> getPbike() {
		return pbike;
	}



	public void setPbike(ArrayList<ParkedBike> pbike) {
		this.pbike = pbike;
	}
	
	
//toString()
	@Override
	public String toString() {
		return "ParkingStation [pbike=" + pbike + "]";
	}

	public void display()
	{
	
		for(ParkedBike p : pbike)
		{
		System.out.println(p.bikeRegNo +" : " + p.bikeName);
		}
	}

	//parkBike method
	public void parkBike(ParkedBike bike)
	{
		pbike.add(bike);
		
	}
	
	//deParkBike method
	public int deParkBike(ParkedBike bike) 
	{
		int parkingcharges = 5;
		pbike.remove(bike);
		return parkingcharges;
	}
	
	public static void main(String[] args) throws ParseException
	{
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		java.util.Date parkedDate;
		java.util.Date deParkedDate;
		//= sdf.parse("1992-07-26");
		
		ArrayList<ParkedBike> pbike = new ArrayList<ParkedBike>();
		ParkedBike pbike1 = new ParkedBike(111,"Activa",60,40,3,sdf.parse("2017-07-01"),sdf.parse("2017-07-10"));
		pbike.add(pbike1);
		ParkedBike pbike2 = new ParkedBike(222,"Honda",60,40,3,sdf.parse("2017-07-02"),sdf.parse("2017-07-11"));
		pbike.add(pbike2);
		ParkedBike pbike3 = new ParkedBike(333,"Splender",60,40,3,sdf.parse("2017-07-03"),sdf.parse("2017-07-12"));
		pbike.add(pbike3);
		ParkedBike pbike4 = new ParkedBike(444,"Royal",60,40,3,sdf.parse("2017-07-04"),sdf.parse("2017-07-13"));
		pbike.add(pbike4);
		ParkingStation pstation = new ParkingStation(pbike);
		System.out.println("Total bikes in ParkingStation :" );
		pstation.display();
		
		System.out.println("Added bike to collection : ");
		ParkedBike pbike5 = new ParkedBike(555,"Suzuki",60,40,3,sdf.parse("2017-07-05"),sdf.parse("2017-07-14"));
		pstation.parkBike(pbike5);
		System.out.println(pbike5.bikeRegNo +" :" + pbike5.bikeName);
		
		System.out.println("Depark the bike : ");
		pstation.deParkBike(pbike2);
		System.out.println(pbike2.bikeRegNo +" :" + pbike2.bikeName);
	}
	
}
