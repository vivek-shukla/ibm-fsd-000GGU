package assessment.displayState;

import java.util.ArrayList;
import java.util.List;

public class Country implements Comparable<Country> {
	private String name;
	private List<State> stateList = new ArrayList<State>();
    
	
	public Country(String name) {
		super();
		this.name = name;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public List<State> getStateList() {
		return stateList;
	}


	public void setStateList(List<State> stateList) {
		this.stateList = stateList;
	}
	public void addState(String stateName)
	{
		this.stateList.add(new State(stateName));
	}


	@Override
	public int compareTo(Country o) {
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
