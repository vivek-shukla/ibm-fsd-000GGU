package comm.exception.practise;

public class NameNotValid extends Throwable {
	private static final long serialVersionUID = 7495820275638978957L; 
	private String message;
	
	public NameNotValid() {
		super();
	}

	public NameNotValid(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
	

}
