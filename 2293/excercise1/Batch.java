package excercise1;

import java.util.Arrays;

public class Batch {
	int batchCode;
	String startdate;
	String enddate;
	Trainee[] trainees = null;
	
	
	
	public Batch(int batchCode, String startdate, String enddate, Trainee[] trainees) {
		super();
		this.batchCode = batchCode;
		this.startdate = startdate;
		this.enddate = enddate;
		this.trainees = trainees;
	}

	public Trainee getTrainee(int traineeId) throws TraineeNotFoundException{
		boolean flag = false;
		for(Trainee trainee:trainees){
			if(trainee.getTraineeId() == traineeId) {
				flag = true;
				return trainee;
			}
		}
		
		if(flag == false) {
			throw new TraineeNotFoundException("Trainee not Found - trainee ID: "+traineeId);
		}
		return null;
	}
	
	public Trainee[] getTrainees(String gender) {
		Trainee[] resTrainee = new Trainee[5];
		int j = 0;
		for(int i=0;i<trainees.length;i++){
			if(trainees[i].getGender().equalsIgnoreCase(gender)) {
				//System.out.println(trainees[i].getGender() + "------------"+gender);
				resTrainee[j] = trainees[i];
				j++;
			}
		}
		return resTrainee;
	}
	
	public static void main(String args[]) {
		Trainee t1 = new Trainee(1, "Trainee1", 123451, "trainee1@gmail.com", "male", 21);
		Trainee t2 = new Trainee(2, "Trainee2", 123452, "trainee2@gmail.com", "female", 22);
		Trainee t3 = new Trainee(3, "Trainee3", 123453, "trainee3@gmail.com", "male", 23);
		Trainee t4 = new Trainee(4, "Trainee4", 123454, "trainee4@gmail.com", "female", 24);
		Trainee t5 = new Trainee(5, "Trainee5", 123455, "trainee5@gmail.com", "male", 25);
		
		Batch batch = new Batch(123, "12/07/2017", "1/27/2018", new Trainee[] {t1, t2, t3, t4, t5} );
		
		//getTrainee() test
		try {
			System.out.println(batch.getTrainee(2));
		} catch (TraineeNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//getTrainees() test
		for(Trainee trainee: batch.getTrainees("male")) {
			System.out.println(trainee);
		}
		
	}

	@Override
	public String toString() {
		return "Batch [batchCode=" + batchCode + ", startdate=" + startdate + ", enddate=" + enddate + ", trainees="
				+ Arrays.toString(trainees) + "]";
	}
}
