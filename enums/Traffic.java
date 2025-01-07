
import java.lang.Enum;

public class Traffic {
	
	enum trafficLights{
		RED,
		YELLOW,
		GREEN;
		
		private String signal;
		
		private trafficLights(){
			
		}
		private trafficLights(String signal) {
			this.signal = signal;
		}
		
		public String getSignal() {
			return signal;
		}
		public void setSignal(String signal) {
			this.signal= signal;
		}
		
		
	}
	
	public static void main(String[] args) {
		trafficLights firstColor = trafficLights.GREEN;
		
		if(firstColor == trafficLights.RED) {
			
			firstColor.setSignal("Stop");
			System.out.println(firstColor.getSignal());
			
			
		}
		else if(firstColor == trafficLights.YELLOW) {
			firstColor.setSignal("Get ready");
			System.out.println(firstColor.getSignal());
		} 
		else if(firstColor == trafficLights.GREEN) {
			firstColor.setSignal("Go");
			System.out.println(firstColor.getSignal());
		} 
		else {
			System.out.println("The color is not in our set");
		}
	}
	

}
