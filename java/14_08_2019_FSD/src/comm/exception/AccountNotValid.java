package comm.exception;

public class AccountNotValid extends Throwable {
 
	private static final long serialVersionUID = 5340498174268368023L; // otogenerated id 
    private String message;
	public AccountNotValid(String message) {
		super();
		this.message = message;
	}
	public AccountNotValid() {
		super();
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
    
}
