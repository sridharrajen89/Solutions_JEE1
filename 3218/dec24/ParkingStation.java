package com.htc.dec24;

import java.util.ArrayList;
import java.util.Date;

public class ParkingStation 
{
	private ArrayList<ParkedBike> pb = new ArrayList<ParkedBike>();
		/**
	 * @param pb
	 */
	public ParkingStation(ArrayList<ParkedBike> pb) {
		super();
		this.pb = pb;
	}

	public ArrayList<ParkedBike> getPb() {
		return pb;
	}

	public void setPb(ArrayList<ParkedBike> pb) {
		this.pb = pb;
	}

	public void parkBike(ParkedBike obj)
	{
		if(obj!=null) {
			pb.add(obj);
			System.out.println("Bike is added successfully."+obj);
		}
	}
	
	public void deParkBike(ParkedBike obj)
	{
		if(obj!=null) {	
			pb.remove(obj);
			System.out.println("Bike is removed successfully");
		}
	}
	
	public static void main(String args[])
	{
		    ArrayList<ParkedBike> pblist = new ArrayList<ParkedBike>();
		    ParkingStation ps = new ParkingStation(pblist);
			ParkedBike pb = new ParkedBike("AP01 CW 4454","12/25/2017","12/26/2017",5.0);
			pblist.add(pb);
			ps.parkBike(pb);
			ParkedBike pb1 = new ParkedBike("AP09 CK 1265","12/24/2017","12/26/2017",10.0);
			pblist.add(pb1);
			ps.parkBike(pb1);		
			ps.deParkBike(pb1);
	}
}
