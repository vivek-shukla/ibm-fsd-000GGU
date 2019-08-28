package comm.model;

public class EmployeeModel {
  
	String name,password,email,country;
	int eId;
    
	public EmployeeModel() {
		super();
	}

	public EmployeeModel(String name, String password, String email, String country,int eId) {
		super();
		this.name = name;
		this.password = password;
		this.email = email;
		this.country = country;
		this.eId = eId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int geteId() {
		return eId;
	}

	public void seteId(int eId) {
		this.eId = eId;
	}
	
}
