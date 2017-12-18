package com.htc.week1;
import java.util.Arrays;

	public class Batch {

		String batchcode;
		int startdate;
		int enddate;
		Trainee trainees[];
		
		public Batch(String batchcode, int startdate, int enddate, Trainee[] trainees) {
			super();
			this.batchcode = batchcode;
			this.startdate = startdate;
			this.enddate = enddate;
			this.trainees = trainees;
		}

		public void display() {
			for(int i=0;i<trainees.length;i++)
			{
				System.out.println(trainees[i]);
			}
		}	

		//Overloaded method
		public Trainee getTrainee(int traineeID)
		{
			Trainee tr = new Trainee();
			for(int i=0;i<trainees.length;i++)
			{
				if(trainees[i].traineeid==traineeID)
					tr = trainees[i];
			}
			return tr;
		}
		
		//Overloaded method
		public Trainee[] getTrainee(String gender)
		{
			Trainee[] tr = new Trainee[trainees.length];
			for(int i=0;i<trainees.length;i++)
			{
				if(trainees[i].gender.equals(gender)) { 
					tr[i]= trainees[i];	
			}
			}
			
			return tr;
		}
		
		@Override
		public String toString() {
			return "Batch [batchcode=" + batchcode + ", startdate=" + startdate + ", enddate=" + enddate + ", trainees="
					+ Arrays.toString(trainees) + "]";
		}
		
	}


