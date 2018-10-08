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
		String status = "ON";
		float randTime = rand.nextInt(2400)+0;
		float lastRandTemp = -1; //InitialforLastTemp
		float lastWindFlow = -1; //InitialForLastWind
		float lastRandTime = -1; //InitialForLastTime
		float initial = 0;	
		float normalTemp=22;
	    
		while(true) {
			if(isSame(RandTemp, lastRandTemp) || isSame(windFlow, lastWindFlow) || isSame(randTime, lastRandTime)) {
			 RandTemp = rand.nextInt(30)+1;
			 windFlow = rand.nextInt(20)+1;
			 randTime = rand.nextInt(2400)+0;
			}
			weatherData.setMeasurements(RandTemp,normalTemp,initial,windFlow,randTime,setWindow,status);
			lastRandTemp = RandTemp;
			lastRandTime = randTime;
			lastWindFlow = windFlow;
		}
		
	}

	private static boolean isSame(float Random, float lastRandom) {
		return Random == lastRandom;
	}
}