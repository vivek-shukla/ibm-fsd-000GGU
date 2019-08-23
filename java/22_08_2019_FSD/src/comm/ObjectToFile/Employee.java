package comm.ObjectToFile;

import java.io.Serializable;

public class Employee implements Serializable {
     private String id,name,email;
     private transient String addresss;

	private static final long serialVersionUID = 3745245481602622259L; // this id is marker
    
	public Employee() {
		super();
	}

	public Employee(String id, String name, String email, String addresss) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.addresss = addresss;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddresss() {
		return addresss;
	}

	public void setAddresss(String addresss) {
		this.addresss = addresss;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	

}
