import java.lang.Enum;

public class IterableEnums {
	
	enum Color{
		RED,
		GREEN,
		BLUE;
	}
	
	public static void main(String[] args) {
		Color colors = Color.RED;
		for(Color c:colors.values()) {
			System.out.println(c.name());
		}
	}

}