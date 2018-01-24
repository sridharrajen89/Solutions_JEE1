
public class RegisterUser {
	private String name;
	private String pass;
	private String email;
	private String country;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public RegisterUser() {
		super();
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public RegisterUser(String name, String pass, String email, String country) {
		super();
		this.name = name;
		this.pass = pass;
		this.email = email;
		this.country = country;
	}
	@Override
	public String toString() {
		return "RegisterUser [name=" + name + ", pass=" + pass + ", email=" + email + ", country=" + country + "]";
	}
	
	

}
