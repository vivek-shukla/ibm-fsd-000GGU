package assessment.sortByMobile;

public class Contact implements Comparable<Contact> {
     private String name,email,mobile,address;
	
    public Contact() {
		super();
	}

	public Contact(String name, String email, String mobile, String address) {
		super();
		this.name = name;
		this.email = email;
		this.mobile = mobile;
		this.address = address;
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

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public int compareTo(Contact o) { 
		if(Integer.parseInt(this.getMobile())==Integer.parseInt(o.getMobile()))
		 return 0;
		else if(Integer.parseInt(this.getMobile())>Integer.parseInt(o.getMobile()))
		 return -1;
		else
			return 1;	
	}

}
