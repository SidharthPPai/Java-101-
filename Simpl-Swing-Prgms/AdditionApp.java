import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AdditionApp {

	public static void main(String[] args){

		//Part-1
		JFrame frame = new JFrame("Addition of two numbers"); // Title of the frame
		frame.setBounds(0,0,400,400); // setting pixels of jframe on the scree
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		//Part-2
		frame.setLayout(new GridLayout(4,2));
		JLabel lbl1 = new JLabel("Enter #1 :");
		JTextField txt1 = new JTextField();
		JLabel lbl2 = new JLabel("Enter #2 :");
		JTextField txt2 = new JTextField();
		JButton addbtn = new JButton("Add");
		JLabel resLabel = new JLabel("Result :");

		// Anonymous Inner Class method 
		addbtn.addActionListener(e-> {
	
			try {

				double n1 = Double.parseDouble(txt1.getText());
				double n2 = Double.parseDouble(txt2.getText());

				double sum = n1 + n2;
				
				resLabel.setText("Sum : " + sum);

			} catch	(NumberFormatException ex){

				resLabel.setText("error : Enter valid Numbert");			

			}

		});

		// Adding all The Components to the declared JFrame 'frame'
		frame.add(lbl1);
		frame.add(txt1);
		frame.add(lbl2);
		frame.add(txt2);
		frame.add(addbtn);
		frame.add(resLabel);

		frame.setVisible(true);
	}

}
