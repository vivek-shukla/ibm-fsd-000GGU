package comm.collection;

public class TennisCoach implements Coach {
    private String name;
    private Level level;
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Tennis coach workout";
	}
	public TennisCoach() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Level getLevel() {
		return level;
	}
	public void setLevel(Level level) {
		this.level = level;
	}
	public void createCoach(String name,Level level)
	{
		this.name = name;
		this.level = level;
	}
	public String getCoachDetails()
	{
		StringBuilder sb = new StringBuilder();
		sb.append("Workout: "+getDailyWorkout());
		sb.append("\n Namet: "+getName());
		sb.append("\n Level: "+getLevel());
		sb.append("\n Level Code: "+level.getLevelCode());
		return sb.toString();
		
	}
	

}
