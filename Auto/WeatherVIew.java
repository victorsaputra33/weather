package Auto;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.*;
import javax.swing.JTextField;

public class WeatherVIew extends JFrame{

	//private JLabel mode = new JLabel("Mode :");
	private static final int FRAME_WIDTH = 600;
  	private static final int FRAME_HEIGHT = 400;

		//private JTextField firstFloor = new JTextField(10);
	//private JLabel additionLabel = new JLabel("+");
	//private JTextField destinationNumber = new JTextField(10);
	//private JButton actionButton = new JButton("Action");
	//private JTextField calcSolution = new JTextField(10);
 	
	//private WeatherVIew theView;
	WeatherVIew(){

	
   	JFrame frame2 = new JFrame();
   		  frame2.setTitle("WeatherProgram");
   		  JLabel judul = new JLabel("Mode");
   		  JLabel judul2 = new JLabel("Blind");
   		  JLabel judultext = new JLabel("");
   		  JLabel judultext2 = new JLabel("");
   		  JButton amount1 = new JButton("ON");
   		  JTextArea comments = new JTextArea("HELLO");

   		 
   		  //JButton amount2 = new JButton("200000");
   		  //JButton amount3 = new JButton("500000");
   		  //JButton amount4 = new JButton("750000   ");
   		  JButton amount5 = new JButton("OFF");
   		  //JButton amount6 = new JButton("2000000");
   		  //JButton amount7 = new JButton("Other Menu");
   		  //dbconnect db=new dbconnect();

 	JPanel panel = new JPanel(new GridBagLayout());
	GridBagConstraints testing = new GridBagConstraints();
	;
	  			testing.gridx = 0;
				testing.gridy = 0;
		panel.add(judul,testing);
			  	testing.gridx = 0;
				testing.gridy = 1;
		panel.add(judul2,testing);
  				testing.gridx = 0;
				testing.gridy = 2;
		panel.add(amount1,testing);
		  		//testing.gridx = 0;
				//testing.gridy = 3;
		//panel.add(amount2,testing);
		  		//testing.gridx = 0;
				//testing.gridy = 4;
		//panel.add(amount3,testing);
		  		

				testing.gridx = 6;
				testing.gridy = 0;
		panel.add(judultext,testing);
		  		testing.gridx = 6;
				testing.gridy = 1;
		panel.add(judultext2,testing);
		  		testing.gridx = 6;
				testing.gridy = 2;
		panel.add(amount5,testing);
				//testing.gridx = 6;
				//testing.gridy = 3;
		//panel.add(amount6,testing);
				testing.gridx = 6;
				testing.gridy = 4;
		panel.add(comments,testing);

class buttonclose implements ActionListener {
		public void actionPerformed(ActionEvent event)
		{

				//if (amount1.isSelected()) {
				//judultext.setText("ON");
			judultext.setText("ON");
			//}else if (amount5.isSelected()) {
			//	judultext.setText("OFF");
			//}

        //System.exit(0);
			//System.out.println("ON");
			  //
			
			}
		}
		class buttonclose2 implements ActionListener {
		public void actionPerformed(ActionEvent event)
		{
        //System.exit(0);
		//System.out.println("OFF");
			 judultext.setText("OFF");
			
			}
		}


	class buttonclose3 implements ActionListener {
		public void actionPerformed(ActionEvent event)
		{
        //System.exit(0);
		//System.out.println("OFF");
			 judultext2.setText("OPEN");
			
			}
		}

				class buttonclose4 implements ActionListener {
		public void actionPerformed(ActionEvent event)
		{
        //System.exit(0);
		//System.out.println("OFF");
			 judultext2.setText("CLOSE");
			
			}
		}


		      	ActionListener listener = new buttonclose();
			amount1.addActionListener(listener);
				ActionListener listener2 = new buttonclose2();
			amount5.addActionListener(listener2);
							//ActionListener listener3 = new buttonclose3();
			//amount5.addActionListener(listener3);
							//ActionListener listener4 = new buttonclose4();
			//amount5.addActionListener(listener4);
frame2.add(panel);
		frame2.setSize(FRAME_WIDTH, FRAME_HEIGHT);
    	frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	frame2.setVisible(true);

	  
		}
}