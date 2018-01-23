package htc.test.user;

public class RegisteredUser{
	
	private String name;
	private int dateOfBirth;
	private String gender;
	private String profession;
	private String email;
	private String password;
	
	public RegisteredUser() {
		super();
		this.name = "";
		this.dateOfBirth = 0;
		this.gender = "";
		this.profession = "";
		this.email = "";
		this.password = "";
	}

	public RegisteredUser(String name, int dateOfBirth, String gender, String profession, String email, String password) {
		super();
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.gender = gender;
		this.profession = profession;
		this.email = email;
		this.password = password;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RegisteredUser other = (RegisteredUser) obj;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		return true;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(int dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getProfession() {
		return profession;
	}
	public void setProfession(String profession) {
		this.profession = profession;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		return result;
	}
	
	@Override
	public String toString() {
		return "Registration [name=" + name + ", dateOfBirth=" + dateOfBirth + ", gender=" + gender + ", profession="
				+ profession + ", email=" + email + ", password=" + password + "]";
	}
}
