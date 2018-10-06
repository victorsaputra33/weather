package Auto;

public class CurrentConditionDisplay implements Observer, DisplayElement {
	private float temperature;
	private float humidity;
	private float pressure;
	private float currentWind;
	private String setWindow;
	private float currentTime;
	private Subject weatherData;
	

	public CurrentConditionDisplay(Subject weatherData){
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	public void update(float temperature, float humidity,float pressure,float currentWind,float currentTime,String setWindow){
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		this.currentWind = currentWind;
		this.currentTime = currentTime;
		this.setWindow = setWindow;
		display();

	}
	public void display(){
		System.out.println("Current Condition:"+temperature+"C degrees and"+"Normal Temperature"+humidity+" C degrees and we need: "+pressure+" to be a normal temperature");
		System.out.println("Wind Flow:"+currentWind+"MPH and"+" currentTime: "+currentTime+" & window status:  "+setWindow);
	}
}