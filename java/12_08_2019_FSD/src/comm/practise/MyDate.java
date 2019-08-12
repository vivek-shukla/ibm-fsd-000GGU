package comm.practise;

public class MyDate { 
	private int day;
	private int month;
	private int year;
	
	public int getDay()
	{
		return day;
	}
	public int getMonth()
	{
		return month;
	}
	public int getYear()
	{
		return year;
	}
	public boolean setDay(int d)
	{
		if(d>30)
		{
			System.out.println("Invalid Day");
			return false;
		}
		day =  d;
		return true;
		
		
	}
	public boolean setMonth(int m)
	{
		if(m>12)
		{
			System.out.println("Invalid Month");
			return false;
		}
		month =  m;
		return true;
		
		
	}
	public boolean setYear(int y)
	{
		if(y<1990 && y>2019)
		{
			System.out.println("Invalid Year");
			return false;
		}
		year = y;
		return true;
		
		
	}

}
