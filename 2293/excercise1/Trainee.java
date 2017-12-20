package excercise1;

public class Trainee {
	int traineeId;
	String traineeName;
	int contactNo;
	String email;
	String gender;
	int age;
	
	
	
	@Override
	public String toString() {
		return "Trainee [traineeId=" + traineeId + ", traineeName=" + traineeName + ", contactNo=" + contactNo
				+ ", email=" + email + ", gender=" + gender + ", age=" + age + "]";
	}
	public Trainee(int traineeId, String traineeName, int contactNo, String email, String gender, int age) {
		super();
		this.traineeId = traineeId;
		this.traineeName = traineeName;
		this.contactNo = contactNo;
		this.email = email;
		this.gender = gender;
		this.age = age;
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
	public int getContactNo() {
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
	
}
