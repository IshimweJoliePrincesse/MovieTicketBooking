import java.lang.Enum;

public class Planets {
	
	enum Planet{
		
		MERCURY,
		VENUS,
		EARTH,
		MARS; 
		
		public void PlanetWithLife() {
			System.out.println("Earth is an habitable planet");
		}
		
		
		
	}
	
	public static void main(String[] args) {
		Planet three = Planet.EARTH;
		
		
		three.PlanetWithLife();
	}

}