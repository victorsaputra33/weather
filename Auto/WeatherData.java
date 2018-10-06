package Auto;

import java.util.ArrayList;
public class WeatherData implements Subject{

	public ArrayList observers;
	private float temperature;
	private float humidity;
	private float pressure;
	private float currentWind;
	private String setWindow;
	private float currentTime;

	public WeatherData(){
		observers = new ArrayList();
	}

	public void registerObserver(Observer o){
		observers.add(o);
	}
	public void removeObserver(Observer o){
		int i =observers.indexOf(o);
		if (i>=0) {
			observers.remove(i);
		}
	}
	
	public void notifyObserver(){
		for (int i = 0; i < observers.size() ; i++ ) {
			Observer observer =(Observer)observers.get(i);
			observer.update(temperature,humidity,pressure,currentWind,currentTime,setWindow);
		}
	}

	public float getTemperature(){
		return temperature;

	}
	public float getHumidity(){
		return humidity;

	}
	public float getPressure(){
		return pressure;
	}
	
	public float getCurrentWind(){
		return currentWind;

	}
	public String getSetWindow(){
		return setWindow;

	}
	public float getCurrentTime(){
		return currentTime;
	}
	
	public void measurementsChanged(){
		//float temp = getTemperature();
		//float humidity = getHumidity();
		//float pressure = getPressure();

		//currentConditionDisplays.update(temp,humidity,pressure);
		//statisticsDisplays.update(temp,humidity,pressure);
		//forecastDisplays.update(temp,humidity,pressure);
		notifyObserver();
	}
	public void setMeasurements(float temperature, float humidity,float pressure,float currentWind,float currentTime,String setWindow){
		this.temperature = temperature;
		this.humidity = humidity;
		this.currentWind = currentWind;
		this.currentTime = currentTime;
		
		
		 if(temperature != humidity) {
			 this.pressure = humidity - temperature;
			
		 } else {
		  this.pressure = pressure;
		 }
		
		 if(currentTime>=0 && currentTime<1800) {
			 if(currentWind>=0 && currentWind<15) {
				this.setWindow = "Open";
			 } else if(currentWind>=15 && currentWind<=20) {
				this.setWindow = "Close";
			 }
		 } else if(currentTime>=1800 && currentTime<=2400) {
			 this.setWindow = "Close";
		 }
		 
		
		measurementsChanged();
	}
}