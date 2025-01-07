import java.lang.Enum;

public class DaysOfWeek{

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
	 Days one = Days.MONDAY;
	 Days two = Days.TUESDAY;
	 Days three = Days.WEDNESDAY;
	 Days four = Days.THURSDAY;
	 Days five = Days.FRIDAY;
	 Days six = Days.SATURDAY;
	 Days seven = Days.SUNDAY;
	 
	 
	 System.out.println("The days of the week are:" +one + " , "  + two +", " + three +", " + four + ", " + five + ", " +  six +", " + seven);
 }

	

}
