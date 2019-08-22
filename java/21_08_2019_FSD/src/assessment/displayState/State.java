package assessment.displayState;

public class State implements Comparable<State> {
    private String name;
    
	public State() {
		super();
	}

	public State(String name) {
		super();
		this.name = name;
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

	@Override
	public int compareTo(State o) {
		// TODO Auto-generated method stub
		int flag = 0;
		if(this.getName().equals(o.getName()))
		 return 0;
		else
		{ 
			for(int i=0;i<this.getName().length();i++)
			{
				if( this.getName().charAt(i) < o.getName().charAt(i) )
				{
					flag = 1;
				}
			}
			if(flag==0)
			{
				return -1;
			}
			else
				return 1;
		}
		
		
	}

}
