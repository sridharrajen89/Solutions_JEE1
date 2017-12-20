package com.htc.javaweek1;
import java.util.Scanner;
public class Batch extends Trainee{
	private String batchCode;
	private String startdate;
	private String enddate;
	Trainee trainee[];
	
	public void readInputs() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the New HTC Batch Code ");
		batchCode=sc.nextLine();
		System.out.println("Enter the New HTC Batch Start Date ");
		startdate=sc.nextLine();
		System.out.println("Enter the New HTC Batch End Date ");
		enddate=sc.nextLine();
		sc.close();
	}
	public void display() {
		System.out.println("Output..");
		System.out.println("Batch Code--"+batchCode);
		System.out.println("Batch Start Date--"+startdate);
		System.out.println("Batch End Date----"+enddate);
	}
	
	@Override
	public void getTrainee(int traineeId) {
		System.out.println("TraineeId Detail from getTrainee Method@ Batch Class --"+traineeId);	
	}
	@Override
	public Trainee[] getTrainees(String traineeGender) {
		System.out.println("TraineeGender Detail from getTrainees Method@ Batch Class --"+traineeGender);
		return null;
	}
	
	public static void main(String[] args) {
		Batch batch1=new Batch();
		batch1.readInputs();
		batch1.display();
		batch1.getTrainee(101);
		batch1.getTrainees("Female");
		System.out.println("Methods called from Trainee Class..");
		Trainee employee1=new Trainee(100,"Vaithilingam",123,"test@test.com","Male","06/25/1945");
		System.out.println(employee1.toString());
		employee1.getTrainee(102);
		employee1.getTrainees("Male");		
		
	}
}
