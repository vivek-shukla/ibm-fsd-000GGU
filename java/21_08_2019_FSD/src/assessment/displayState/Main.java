package assessment.displayState;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String countryState;
		int count;
		Set<Country> countrySet = new TreeSet<Country>();
		System.out.println("Enter the number of entries ");
		Scanner scanner = new Scanner(System.in);
		count = scanner.nextInt();
		
		for(int i=0;i<count;i++)
		{   boolean flag=false;
			countryState = scanner.next();
			String[] arrCountryState = countryState.split(Pattern.quote("|"),2);
			System.out.println(arrCountryState[1]);
			for(Country country:countrySet)
			{ 
				if(arrCountryState[0].equals(country.getName()))
				{
					flag = true;
					country.addState(arrCountryState[1]);
				}
			}
			if(flag==false)
			{
				Country country = new Country(arrCountryState[0]);
				country.addState(arrCountryState[1]);
				countrySet.add(country);
			}
		}
		for(Country countries:countrySet)
		{
			System.out.println(countries.getName()+"-");
			for(State states: countries.getStateList())
			{
				System.out.println(states.getName());
			}
		}
	}
}
