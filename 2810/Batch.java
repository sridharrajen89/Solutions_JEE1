package com.htc.Exc2;

import java.util.*;

public class Batch {
	
	private int batchCd;
	private String startDate;
	private String endDate;
	private Trainee Trainee[];

//Default Constructor 
	public Batch() {
		batchCd = 0;
		startDate = null;
		endDate = null;
		Trainee = null;
		
	}
	//Constructor overload
public Batch(int batchCd, String startDate, String endDate, com.htc.Exc2.Trainee[] trainee) {
	super();
	this.batchCd = batchCd;
	this.startDate = startDate;
	this.endDate = endDate;
	Trainee = trainee;
}
 
	
	@Override
public String toString() {
	return "Batch [batchCd=" + batchCd + ", startDate=" + startDate + ", endDate=" + endDate + ", Trainee="
			+ Arrays.toString(Trainee) + "]";
}
	public int getBatchCd() {
	return batchCd;
}
public void setBatchCd(int batchCd) {
	this.batchCd = batchCd;
}
public String getStartDate() {
	return startDate;
}
public void setStartDate(String startDate) {
	this.startDate = startDate;
}
public String getEndDate() {
	return endDate;
}
public void setEndDate(String endDate) {
	this.endDate = endDate;
}
public Trainee[] getTrainee() {
	return Trainee;
}
public void setTrainee(Trainee[] trainee) {
	Trainee = trainee;
}

	//methods
	public Trainee getTrainee(int traineeID) {
		for(int i=0; i<Trainee.length; i++) {
			if(Trainee[i].getTraineeId() == traineeID)
				return Trainee[i];			
		}
		return null;
	}
	
	public Trainee[] getTrainees(String gender) {           
		Trainee [] genderlist = new Trainee[5];
			int j = 0;
			for(int i=0; i<Trainee.length; i++)
				if(Trainee[i].getGender()== gender)
				{
					genderlist[j] = Trainee[i];
					j++;
				}
	return genderlist;
	}	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Trainee tr1	= new Trainee(101, "Pradeep",309777111,"pradeepr@gmail.com","M", 31);
		Trainee tr2	= new Trainee(102, "Appu",309777222,"appur@gmail.com","F", 28);
		Trainee tr3	= new Trainee(103, "uday",309777111,"udpr@gmail.com","M", 30);
		Trainee tr4	= new Trainee(104, "bobby",309777111,"boobya@gmail.com","M", 30);
		Trainee tr5	= new Trainee(105, "Raj",309777111,"rajendranr@gmail.com","M", 31);
		
		Trainee [] traineeList = {tr1,tr2,tr3,tr4,tr5};
		
		Batch b1 = new Batch(001,"12/01/2000","12/31/9999",traineeList);
		System.out.println(b1.getTrainee(102));
		Trainee[] genderInfo = b1.getTrainees("M");
		for (int i=0;(i<genderInfo.length & genderInfo[i] != null);i++) {
			System.out.println(genderInfo[i]);
		}	
	}

}