package comm.myInterface;

public class Monkey implements LivingThings {
    private String name; 
    
	public Monkey() {
		super();
	}

	public Monkey(String name) {
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
	public void walk() {
		System.out.println("Monkey\n Name:"+getName()+"can walk");
		// TODO Auto-generated method stub
	}

}
