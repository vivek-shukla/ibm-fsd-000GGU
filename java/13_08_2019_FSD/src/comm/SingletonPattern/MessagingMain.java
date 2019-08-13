package comm.SingletonPattern;

public class MessagingMain {
    public static void main(String[] args)
    {
    	Messaging m = Messaging.setMessageObj();
    	System.out.println(m);
    	Messaging m1 = Messaging.setMessageObj("Hello Message");
    	System.out.println(m1);
    	System.out.println(m==m1);
    }
}
