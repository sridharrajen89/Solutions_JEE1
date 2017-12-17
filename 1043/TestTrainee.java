/**
 * 
 */
package com.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Ramkey_IBM_PC
 * Excercise #1 - To test the Trainee and Batch class
 */
public class TestTrainee {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Date d1 = null;
		Date d2 = null;
		
		Trainee t1 = new Trainee(100, "Anamika", "309-111-2222", "test@gmail.com", 'F', 30);
		Trainee t2 = new Trainee(101, "Balu", "248-333-4444", "test@msn.com", 'M', 35);
		Trainee t3 = new Trainee(102, "Charlie", "217-555-6666", "test@hotmail.com", 'M', 25);
		Trainee t4 = new Trainee(103, "Devi", "405-777-8888", "test@yahoo.com", 'F', 40);
		Trainee t5 = new Trainee(104, "Edward", "733-999-4444", "test@rediffmail.com", 'M', 20);

		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t3);
		System.out.println(t4);
		System.out.println(t5);
		
		Trainee [] traineeList = {t1,t2,t3,t4,t5};
		
		String pattern = "MM/dd/yyyy";
	    SimpleDateFormat format = new SimpleDateFormat(pattern);
	    try {
	      d1 = format.parse("12/12/2017");
	      d2 = format.parse("01/26/2018");
	     } catch (ParseException e) {
	      e.printStackTrace();
	    }
		Batch b1 = new Batch (001, d1, d2, traineeList);
		
		System.out.println(b1);
		System.out.println(b1.getTrainee(107));
		System.out.println(b1.getTrainee(103));
		Trainee [] traineeGenderList = b1.getTrainees('M');
		System.out.println(traineeGenderList.length);
		for (int i=0;(i<traineeGenderList.length & traineeGenderList[i] != null);i++) {
			System.out.println(traineeGenderList[i]);
		}
		
	}

}
