package spring_webapp_05_09_2019.spring;

public class Student {

	private int id;
	private String name;
	private String email;
	
	public Student() {
		super();
	}

	public Student(int id, String name, String email) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", email=" + email + "]";
	}
	
}
