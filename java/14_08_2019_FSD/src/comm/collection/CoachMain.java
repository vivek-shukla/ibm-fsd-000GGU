package comm.collection;
import static java.lang.System.in;
import static java.lang.System.out;
import java.util.Scanner;
public class CoachMain {
    public static Scanner scanner = new Scanner(in);
	public static void main(String[] args) { 
		String coachName;
		out.println("Enter Coach Name: ");
		coachName = scanner.next();
		TennisCoach tCoach = new TennisCoach();
		tCoach.createCoach(coachName,Level.MEDIUM);
		out.println(tCoach.getCoachDetails());
		Level h = Level.LOW;
		System.out.println(h.getLevelCode());
		
		
		// TODO Auto-generated method stub

	}

}
