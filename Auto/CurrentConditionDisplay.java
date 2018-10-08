package Auto;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class CurrentConditionDisplay extends JFrame implements Observer, DisplayElement {
	
	//Initial JFrame size
	private static final int FRAME_WIDTH = 1000;
  	private static final int FRAME_HEIGHT = 1000;
  	JFrame frame2 = new JFrame();

	//Initial attribute
	private float temperature;
	private float humidity;
	private float pressure;
	private float currentWind;
	private String setWindow;
	private float currentTime;
	private String status;
	private Subject weatherData;
	
	public CurrentConditionDisplay() {
	}
	

	public CurrentConditionDisplay(Subject weatherData){
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	public void update(float temperature, float humidity,float pressure,float currentWind,float currentTime,String setWindow,String status){
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		this.currentWind = currentWind;
		this.currentTime = currentTime;
		this.setWindow = setWindow;
		this.status = status;
		display();
	}
	
	public void display(){
		 frame2.setTitle("WeatherProgram");
	     JLabel judul = new JLabel("Mode");
	     JLabel judul2 = new JLabel("Blind");
	  	 JLabel judultext = new JLabel("");
	  	 judultext.setText(status);
	  	 JLabel judultext2 = new JLabel("");
	  	 judultext2.setText(setWindow);
	     JButton amount1 = new JButton("ON");
	     
	     JTextArea textArea = new JTextArea(50,50);
	     textArea.setSize(400,400);
	     //comments.setText("Current Condition:"+temperature+"C degrees and"+"Normal Temperature"+humidity+" C degrees and we need: "+pressure+" to be a normal temperature");
	     textArea.setLineWrap(false);
         textArea.setWrapStyleWord(true);
    	 textArea.append("\n");
    	 add(textArea);
	     textArea.setText(buildText());
	     JButton amount5 = new JButton("OFF");
	     JPanel panel = new JPanel(new GridBagLayout());
	 	 GridBagConstraints testing = new GridBagConstraints();
	 	
	 	 testing.gridx = 0;
	 	 testing.gridy = 0;
	 	 panel.add(judul,testing);
	 	 
	 	 testing.gridx = 0;
	 	 testing.gridy = 1;
	   	 panel.add(judul2,testing);
	   				
	   	 testing.gridx = 0;
	 	 testing.gridy = 2;
	 	 panel.add(amount1,testing);
	 		  		
	 	 testing.gridx = 6;
	   	 testing.gridy = 0;
	 	 panel.add(judultext,testing);
	 		  		
	 	 testing.gridx = 6;
	 	 testing.gridy = 1;
	 	 panel.add(judultext2,testing);
	 		  		
	 	 testing.gridx = 6;
	 	 testing.gridy = 2;
	  	 panel.add(amount5,testing);
	 				
	 	 testing.gridx = 6;
	 	 testing.gridy = 4;
	 	 panel.add(textArea,testing);
	 	 
	 	frame2.add(panel);
		frame2.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame2.setVisible(true);
		
		System.out.println("Current Condition:"+temperature+"C degrees and"+"Normal Temperature"+humidity+" C degrees and we need: "+pressure+" to be a normal temperature");
		System.out.println("Wind Flow:"+currentWind+"MPH and"+" currentTime: "+currentTime+" & window status:  "+setWindow);

		
	}
	private String  buildText(){
			//String Builder sb = new StringBuilder();
			String a = "Current Condition:"+temperature+"\nC degrees and"+"Normal Temperature"+humidity+"\n C degrees and we need: "+pressure+"\n to be a normal temperature\n"+"\nWind Flow:"+currentWind+"\nMPH and"+"currentTime: "+currentTime;
			
			//System.out.println();
	
			//System.out.println();
			return a;
		}
}