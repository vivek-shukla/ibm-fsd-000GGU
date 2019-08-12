package comm.example;

public class MyDate {
    private int day;
    private int month;
    private int year;
    
    public void createDate(int d,int m,int y)
    {
    	if(d>30)
    	{
    		System.out.println("Day can't be greter than 30");
    		System.exit(0);
    	}
    	if(m>30)
    	{
    		System.out.println("Month can't be greter than 12");
    		System.exit(0);
    	}
    	if(y<1990 && y>2019) 
    	{
    		System.out.println("Wrong year ");
    		System.exit(0);
    	}
    	day = d;
    	month = m;
    	year = y;
    }
    public String getDate()
    {
    	return day+"-"+month+"-"+year; 
    }
    
}
