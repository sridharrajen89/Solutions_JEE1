
package test.com;
import java.io.Serializable;
import java.util.Date;

public class Trainee implements Serializable{
	
	int traineeId;
	private String traineeName;
	private int contactNo;
	private String email;
	String gender;
	private int age;
		
//overloaded constructor
	public Trainee(int traineeId, String traineeName, int contactNo, String email, String gender, int age) {
		super();
		System.out.println("overloaded constructor is fired");
		this.traineeId = traineeId;
		this.traineeName = traineeName;
		this.contactNo = contactNo;
		this.email = email;
		this.gender = gender;
		this.age = age;
	}

//default constructor	
public Trainee() {
	// TODO Auto-generated constructor stub
	traineeId = 0;
	traineeName = "NULL";
	contactNo = 0;
	email = "NULL";
	gender = "NULL";
	age = 0;
	
}


//Setters
	public void setTraineeId(int traineeId) {
		this.traineeId = traineeId;
	}

	public void setTraineeName(String traineeName) {
		this.traineeName = traineeName;
	}

	public void setContactNo(int contactNo) {
		this.contactNo = contactNo;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public void setAge(int age) {
		this.age = age;
	}

//Getters

	public int getTraineeId() {
		return traineeId;
	}

	public String getTraineeName() {
		return traineeName;
	}

	public int getContactNo() {
		return contactNo;
	}
	
	public String getEmail() {
		return email;
	}

	public String getGender() {
		return gender;
	}

	public int getAge() {
		return age;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + contactNo;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((gender == null) ? 0 : gender.hashCode());
		result = prime * result + traineeId;
		result = prime * result + ((traineeName == null) ? 0 : traineeName.hashCode());
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
		if (age != other.age)
			return false;
		if (contactNo != other.contactNo)
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (gender == null) {
			if (other.gender != null)
				return false;
		} else if (!gender.equals(other.gender))
			return false;
		if (traineeId != other.traineeId)
			return false;
		if (traineeName == null) {
			if (other.traineeName != null)
				return false;
		} else if (!traineeName.equals(other.traineeName))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Trainee [traineeId=" + traineeId + ", traineeName=" + traineeName + ", contactNo=" + contactNo
				+ ", email=" + email + ", gender=" + gender + ", age=" + age + "]";
	}


}
