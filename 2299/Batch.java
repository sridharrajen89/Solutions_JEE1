package htc.exercises.week1;

public class Batch extends Trainee{
	
	private int batchCode;
	private String startDate;
	private String endDate;
	Trainee[] trainee = new Trainee[10];	
	
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
	public Trainee[] getTrainee() {
		return trainee;
	}
	public void setTrainee(Trainee[] trainee) {
		this.trainee = trainee;
	}
	
	public Trainee[] getTrainee(int TraineeId) {
		return trainee;
	}
	
	public Trainee[] getTrainee(String gender) {
		return trainee;
	}

}
