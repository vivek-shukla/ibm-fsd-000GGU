package comm.league.model;

public class LeagueModel {
   
	int year;
	String title,sport;
	
	public LeagueModel() {
		super();
	}

	public LeagueModel(int year, String title, String sport) {
		super();
		this.year = year;
		this.title = title;
		this.sport = sport;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSport() {
		return sport;
	}

	public void setSport(String sport) {
		this.sport = sport;
	}
	
	
	
}
