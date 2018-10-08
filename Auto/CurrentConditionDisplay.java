package Auto;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextArea;

public class CurrentConditionDisplay extends JFrame implements Observer, DisplayElement  {
	
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


	 //private int numClicks = 0;
	public CurrentConditionDisplay() {
		//super(title);
                //setLayout(new FlowLayout());
                //addWindowListener(this);
                //b = new Button("Click me");
                //add(b);
                //add(text);
                //b.addActionListener(this);
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
	//class lucifer implements ActionListener{
	//	public void actionPerformed(ActionEvent event){
	//		humidity = humidity+1;
	//	}
	//}

	  			  //   public void class additional(){
	     	//Float penambahan = humidity+1;
	    // }

	 
    
JTextField humidityButton = new JTextField(10);
	public void display(){
		 frame2.setTitle("WeatherProgram");
	     	     JLabel judul = new JLabel("Mode :");
	     JLabel judul2 = new JLabel("Blind :");
	     JLabel tempe = new JLabel("Temperature :");
	  	 JLabel judultext = new JLabel("");
	  	 judultext.setText(status);
		//JButton amount1 = new JButton("ON");
	  	 JLabel judultext3 = new JLabel("");
	  	 JLabel judultext2 = new JLabel("");
	  	judultext3.setText(Float.toString(humidity));
 		//judultext3.setText(Float.toString(a.displayHumidity()));
	 	//judultext3.setText(Float.toString(humidity+1));
	  	
	  	 //judultext3.setText(Float.toString(humidity+1));
	  	 judultext2.setText(setWindow);
	 

	   
	     
	     JTextArea textArea = new JTextArea(50,50);
	     textArea.setSize(400,400);
	     //comments.setText("Current Condition:"+temperature+"C degrees and"+"Normal Temperature"+humidity+" C degrees and we need: "+pressure+" to be a normal temperature");
	     textArea.setLineWrap(false);
         textArea.setWrapStyleWord(true);
    	 textArea.append("\n");
    	 add(textArea);
	     textArea.setText(buildText());
	     //JButton amount5 = new JButton("OFF");
	     JPanel panel = new JPanel(new GridBagLayout());
	 	 GridBagConstraints testing = new GridBagConstraints();
	 	
	 	 testing.gridx = 0;
	 	 testing.gridy = 0;
	 	 panel.add(tempe,testing);
	 	 
	 	 testing.gridx = 0;
	 	 testing.gridy = 1;
	   	 panel.add(judul,testing);
	   				
	   	 testing.gridx = 0;
	 	 testing.gridy = 2;
	 	 panel.add(judul2,testing);
	 	 //testing.gridx = 0;
	 	 //testing.gridy = 3;
	 	 //panel.add(amount1,testing);
	 		  		
	 	 testing.gridx = 6;
	   	 testing.gridy = 0;
	 	 panel.add(judultext3,testing);
	 		  		
	 	 testing.gridx = 6;
	 	 testing.gridy = 1;
	 	 panel.add(judultext,testing);
	 	 testing.gridx = 6;
	 	 testing.gridy = 2;
	 	 panel.add(judultext2,testing);
	 		  		
	 	 //testing.gridx = 6;
	 	 //testing.gridy = 3;
	  	 //panel.add(amount5,testing);
	 				
	 	 testing.gridx = 6;
	 	 testing.gridy = 4;
	 	 panel.add(textArea,testing);
	 	 
	 	frame2.add(panel);
		frame2.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame2.setVisible(true);

		 	//displayHumidity display = new displayHumidity();
	  		//amount1.addActionListener(display);
			//ActionListener listenerClose = new BackEndBankOut();
	  		
	  		      //ActionListener listener2 = new displayHumidity();
      				//amount1.addActionListener(listener2);

      					// ActionListener listener = new humidityButton();
      // amount1.addActionListener(listener);
		
		//System.out.println("Current Condition:"+temperature+"C degrees and"+"Normal Temperature"+humidity+" C degrees and we need: "+pressure+" to be a normal temperature");
		//System.out.println("Wind Flow:"+currentWind+"MPH and"+" currentTime: "+currentTime+" & window status:  "+setWindow);


	}
	private String  buildText(){
			//String Builder sb = new StringBuilder();
			String a = "Current Condition:"+temperature+"\nC degrees and"+"Normal Temperature"+humidity+"\n C degrees and we need: "+pressure+"\n to be a normal temperature\n"+"\nWind Flow:"+currentWind+"\nMPH and"+"currentTime: "+currentTime;
			
			//System.out.println();
	
			//System.out.println();
			return a;
	}
		    
			// class displayHumidity implements ActionListener
	  		//{
	  		//	public void actionPerformed(ActionEvent event)
	  		//	{	
//
	  			//	float testing;
	  			//	testing = a;
	  			//	testing = humidity+1;
	  			//	humidity++;
//

	  			
	  			//}
	  			
	  		//}


	  		   //  class humidityButton implements ActionListener {
        //public void actionPerformed(ActionEvent event)
        //{
        //humidityButton.setText(Float.toString(humidity+1));
        //    }
       // }
}