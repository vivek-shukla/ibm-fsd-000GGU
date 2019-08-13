package comm.example;

public class Book extends Product { 
	private String name;
	private String authorName;
	
	public Book() {
		super();
	}

	public Book(String name, String authorName) {
		super(13);
		this.name = name;
		this.authorName = authorName;
		super.incrementItem();
	}

	@Override
	public String toString() {
		return super.toString()+"Book \n name=" + name + ", authorName=" + authorName + "\n";
	}
	
	
	

}
