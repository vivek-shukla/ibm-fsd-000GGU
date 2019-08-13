package comm.SingletonPattern;

public class Messaging { 
	private static String message;
	
	private static Messaging messageObj;

	private Messaging(String message) {
		super();
		this.message = message;
	}

	private Messaging() {
		super();
	}

	public String getMessage() {
		return message;
	}

	public static void setMessage(String msg) {
		message = msg;
	}

	
	public static Messaging setMessageObj()
	{
		if(messageObj==null)
		{
			messageObj = new Messaging();
		}
		else
		{
			Messaging.setMessage("");
		}
		return messageObj;
	} 
	 public static Messaging setMessageObj(String _msg)
	{     
		if(messageObj==null)
		{
			messageObj = new Messaging(_msg);
		}
		else {
		     Messaging.setMessage(_msg);
		}
	    
		return messageObj;
	}

	@Override
	public String toString() {
		return "Messaging [message=" + message +"]";
	}
	

}
