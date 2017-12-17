package htc.test;

import java.io.Serializable;

public class Trainee extends Object implements Serializable {
	
	private int traineeId;
	private String traineeName;
	private long contactNo;
	private String email;
	private String gender;
	private int age;
	
//	public EntityClass() {
//		super();
//		traineeId = 101;
//		traineeName = "Vijay";
//		contactNo = 309664562;
//		email= "test@gmail.com";
//		gender="Male";
//		age= 16;
//	}
	
	public Trainee(int traineeId, String traineeName, int contactNo, String email, String gender, int age) {
		super();
		this.traineeId = traineeId;
		this.traineeName = traineeName;
		this.contactNo = contactNo;
		this.email= email;
		this.gender=gender;
		this.age= age;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + traineeId;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Trainee other = (Trainee) obj;
		if (traineeId != other.traineeId)
			return false;
		return true;
	}
	
	public int getTraineeId() {
		return traineeId;
	}
	public void setTraineeId(int traineeId) {
		this.traineeId = traineeId;
	}
	public String getTraineeName() {
		return traineeName;
	}
	public void setTraineeName(String traineeName) {
		this.traineeName = traineeName;
	}
	public long getContactNo() {
		return contactNo;
	}
	public void setContactNo(int contactNo) {
		this.contactNo = contactNo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
	
		return "EntityClass [TraineeId=" +traineeId +", Trainee Name ="+traineeName+", Contact--" +contactNo+", email=" + email+", Gender "+gender+", + age --" +age+"]";
	}
}
