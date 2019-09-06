package formTag_06_09_2019.spring.model;

import java.util.LinkedHashMap;
import java.util.Map;

public class Student {
	
	private String name;
	private String email;
	private LinkedHashMap<String,String> country;
	private String favoriteLanguage;
	private String cInstance;
	private String[] operatingSystems;
	
	
	public String[] getOperatingSystems() {
		return operatingSystems;
	}
	public void setOperatingSystems(String[] operatingSystems) {
		this.operatingSystems = operatingSystems;
	}
	public String getcInstance() {
		return cInstance;
	}
	public void setcInstance(String cInstance) {
		this.cInstance = cInstance;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Student() {
		super();
		country = new LinkedHashMap<String, String>();
		country.put("IN", "iNDIA");
	    country.put("VN", "Vietname");
	    country.put("CAN", "cANADA");
	    country.put("TV", "Tuvalu");
	}
	public Student(String name, String email) {
		super();
		this.name = name;
		this.email = email;
	}
	public Student(String name, String email, LinkedHashMap<String, String> country, String favoriteLanguage) {
		super();
		this.name = name;
		this.email = email;
		this.country = country;
		this.favoriteLanguage = favoriteLanguage;
	}
	public LinkedHashMap<String, String> getCountry() {
		return country;
	}
	public void setCountry(LinkedHashMap<String, String> country) {
		this.country = country;
	}
	public String getFavoriteLanguage() {
		return favoriteLanguage;
	}
	public void setFavoriteLanguage(String favoriteLanguage) {
		this.favoriteLanguage = favoriteLanguage;
	}
	
	

}
