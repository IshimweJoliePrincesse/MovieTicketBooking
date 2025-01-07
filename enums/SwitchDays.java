
import java.lang.Enum;

public class SwitchDays {
	
	enum WeekDayOrWeekend{
		MONDAY,
		TUESDAY,
		WEDNESDAY,
		THURSDAY,
		FRIDAY,
		SATURDAY,
		SUNDAY;
	}
	
	public static void main(String[] args) {
		
		WeekDayOrWeekend one = WeekDayOrWeekend.MONDAY;
		
		switch(one) {
		case MONDAY:
			System.out.println(" Monday This is a weekday");
			
		case TUESDAY:
			System.out.println(" Tuesday This is a weekday");
			
		case WEDNESDAY:
			System.out.println("Wednesday This is a weekday");
			
		case THURSDAY:
			System.out.println("Thursday This is a weekday");
		
		case FRIDAY:
			System.out.println("Friday This is a weekday");
		
		case SATURDAY:
			System.out.println("Saturday This is a weekend");
		
		case SUNDAY:
			System.out.println("Sunday This is a weekend");
			
		}
		
	}

}
