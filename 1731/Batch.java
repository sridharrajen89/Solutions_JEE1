package htc.test;

import java.io.Serializable;

public class Batch extends Object implements Serializable {
	
	public int batchCode;
	public String startDate;
	public String endDate;
	Trainee[] trainee = new Trainee[2];
	
	
//	public EntityClass() {
//		super();
//		traineeId = 101;
//		traineeName = "Vijay";
//		contactNo = 309664562;
//		email= "test@gmail.com";
//		gender="Male";
//		age= 16;
//	}
	
	public Batch(int batchCode, String startDate, String endDate) {
		super();
		this.batchCode = batchCode;
		this.startDate = startDate;
		this.endDate = endDate;
	}
	public int getBatchCode() {
		return batchCode;
	}

	public void setBatchCode(int batchCode) {
		this.batchCode = batchCode;
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


	
	@Override
	public String toString() {
//		return "EntityClass [gender=" + gender + "]";
//		return "EntityClass [TraineeId="  + traineeId + ", TraineeName="  + traineeName +"]";
	
		return "EntityClass [batchCode=" +batchCode +", startDate ="+startDate+", endDate--" +endDate+"]";
	}
	
}
