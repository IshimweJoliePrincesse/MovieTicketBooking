
import java.lang.Enum;

public class Seasons {
	
	enum Season{
		SPRING,
		SUMMER,
		AUTUMN,
		WINTER;
		
		private String description;
		
		private Season(String description) {
			this.description = description;
		}
		
		private Season() {
			
		}
		public void setDescription(String description) {
			this.description = description;
		}
		public String getDescription() {
			return description;
		}
	}
	
	public static void main (String[] args) {
		
		Season one = Season.SPRING;
		one.setDescription("The weather becomes milder");
		
		Season two = Season.SUMMER;
		two.setDescription("This the hot season");
		
		Season three = Season.WINTER;
		three.setDescription("This is the cold season");
		
		Season four = Season.AUTUMN;
		four.setDescription(" The temperature begins to drop during autumn");
		
		System.out.print("All the four seasons are: \n" +one+  ":" + one.getDescription()+"\n "+ two  + ":"+ two.getDescription()+"\n"+three +  ":" + three.getDescription()+"\n"+four  + ":"+four.getDescription());
	}
	

}
