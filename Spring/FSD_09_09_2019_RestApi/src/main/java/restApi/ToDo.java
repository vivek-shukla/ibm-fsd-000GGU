package restApi;

import java.util.UUID;

public class ToDo { 
	
	String id;
	String description;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public ToDo( String description) {
		super();
		this.id=UUID.randomUUID().toString();
		this.description = description;
	}
	public ToDo() {
		super();
	}
	

}
