

import java.util.ArrayList;
public class WeatherData implements Subject{

	public ArrayList observers;
	private float temperature;
	private float humidity;
	private float pressure;
	private float currentWind;
	private String setWindow;
	private String status;
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
			observer.update(temperature,humidity,pressure,currentWind,currentTime,setWindow,status);
		}
	}

	public float getTemperature(){
		return temperature;

	}
	public  float getHumidity(){
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
	
	public String getStatus(){
		return status;
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
	public void setMeasurements(float temperature, float humidity,float pressure,float currentWind,float currentTime,String setWindow,String status){
		this.temperature = temperature;
		this.humidity = humidity;
		this.currentWind = currentWind;
		this.currentTime = currentTime;
		this.status = status;
		
		
		 if(isNotSame(temperature, humidity)) {
			 this.pressure = humidity - temperature;
			 if(isHot(humidity)) {
				this.status = "ON"; 
			 }else {
				this.status = "OFF";
			 }
		 } else {
		  this.pressure = pressure;
		  this.status = "OFF";
		 }
		
		 if(atMorning(currentTime)) {
			 if(isNormalWind(currentWind)) {
				this.setWindow = "Open";
			 } else if(isStrongWind(currentWind)) {
				this.setWindow = "Close";
			 }
		 } else if(atNight(currentTime)) {
			 this.setWindow = "Close";
		 }
		 
		
		measurementsChanged();
	}

	private boolean isNotSame(float temperature, float humidity) {
		return temperature != humidity;
	}

	private boolean isHot(float humidity) {
		return temperature>humidity;
	}

	private boolean isStrongWind(float currentWind) {
		return currentWind>=15 && currentWind<=20;
	}

	private boolean isNormalWind(float currentWind) {
		return currentWind>=0 && currentWind<15;
	}

	private boolean atNight(float currentTime) {
		return currentTime>=1800 && currentTime<=2400;
	}

	private boolean atMorning(float currentTime) {
		return currentTime>=0 && currentTime<1800;
	}
}