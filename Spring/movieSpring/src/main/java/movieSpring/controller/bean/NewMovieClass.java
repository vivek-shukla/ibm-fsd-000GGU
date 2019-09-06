package movieSpring.controller.bean;

public class NewMovieClass {
	private int id;
	private String name;
	private String director;
	
	

	public NewMovieClass() {
		super();
	}

	public NewMovieClass(String name, String director) {
		super();
		this.name = name;
		this.director = director;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	
   
	

}
