package Auto;

import java.util.Random;

public class Main{
	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		CurrentConditionDisplay currentDisplay = new CurrentConditionDisplay(weatherData);
		
		
		Random rand = new Random();
		float RandTemp = rand.nextInt(30)+1;
		float windFlow = rand.nextInt(20)+1;
		String setWindow ="Open"; //Open
		float randTime = rand.nextInt(2400)+0;
		float lastRandTemp = RandTemp;
		float initial = 0;
		float normalTemp=22;
	    
		
	    weatherData.setMeasurements(RandTemp,normalTemp,initial,windFlow,randTime,setWindow);
	        
	       
		
		
			

		
	}
}