import java.lang.Enum;

public class EnumComparison {

    
    enum Day {
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY,
        SUNDAY
    }

    public static void main(String[] args) {
       
        Day day1 = Day.TUESDAY;
        Day day2 = Day.FRIDAY;

        
        int ordinal1 = day1.ordinal();
        int ordinal2 = day2.ordinal();

       
        System.out.println("Ordinal of " + day1 + ": " + ordinal1);
        System.out.println("Ordinal of " + day2 + ": " + ordinal2);

       
        if (ordinal1 < ordinal2) {
            System.out.println(day1 + " comes before " + day2);
        } else if (ordinal1 > ordinal2) {
            System.out.println(day1 + " comes after " + day2);
        } else {
            System.out.println(day1 + " and " + day2 + " are the same.");
        }
    }
}
