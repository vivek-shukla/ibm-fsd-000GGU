package comm.collection;

public enum Level {
  HIGH(3),
  MEDIUM(2),
  LOW(1);
	private int levelcode;

	private Level(int levelcode) {
		this.levelcode = levelcode;
	}
	public int getLevelCode()
	{
		return this.levelcode;
	}
	
}
