package comm.example;

public class Line extends Model {
    private int startPoint;
    private int endPoint;
    
    
	public Line() {
		super();
	}
    
	public Line(int startPoint, int endPoint) {
		super();
		this.startPoint = startPoint;
		this.endPoint = endPoint;
	} 
	

	public int getStartPoint() {
		return startPoint;
	}

	public void setStartPoint(int startPoint) {
		this.startPoint = startPoint;
	}

	public int getEndPoint() {
		return endPoint;
	}

	public void setEndPoint(int endPoint) {
		this.endPoint = endPoint;
	} 
	public int calculateLineLength()
	{
		return getEndPoint()-getStartPoint();
	}

	@Override
	public boolean isGreater(Object obj1, Object obj2) { 
		Line l1 = (Line)obj1;
		int l2 = ((Line)obj2).calculateLineLength();
		// TODO Auto-generated method stub
		return l1.calculateLineLength()>l2;
	}

	@Override
	public boolean isLess(Object obj1) { 
		int len = ((Line)obj1).calculateLineLength();
		// TODO Auto-generated method stub
		return this.calculateLineLength()<len;
	}

	@Override
	public boolean isEqual(Object obj) { 
		int len = ((Line)obj).calculateLineLength();
		// TODO Auto-generated method stub
		return this.calculateLineLength()==len;
	}

}
