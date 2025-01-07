
import java.util.EnumSet;


public class EnumDays {

	enum Days{
		MONDAY,
		TUESDAY,
		WEDNESDAY,
		THURSDAY,
		FRIDAY,
		SATURDAY,
		SUNDAY;
	}
	
	public static void main(String[] args) {
		
		EnumSet<Days> WeekDays;
		
		WeekDays= EnumSet.range(Days.MONDAY, Days.FRIDAY);
		
		System.out.println("WeekDays:" + WeekDays);
	}
}
