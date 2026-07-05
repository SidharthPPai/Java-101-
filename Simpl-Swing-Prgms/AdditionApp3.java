import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

// swing Addition using OOP explicit class 

class myEventHandler implements ActionListener {

	private JTextField txt1;
	private JTextField txt2;
	private JLabel resLabel;

	public myEventHandler(JTextField a,JTextField b,JLabel c){
	
		txt1 = a;			
		txt2 = b;
		resLabel = c;
	}

	 public void actionPerformed(ActionEvent e){
	
		double n1 = Double.parseDouble(txt1.getText());
		double n2 = Double.parseDouble(txt2.getText());
		double sum = n1 + n2;
		resLabel.setText("Sum : "  + sum);	
	
	}
}



public class AdditionApp3 {

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
		addbtn.addActionListener(new ActionListener() {
	
		public void actionPerformed(ActionEvent e){
			try {

				double n1 = Double.parseDouble(txt1.getText());
				double n2 = Double.parseDouble(txt2.getText());

				double sum = n1 + n2;
				
				resLabel.setText("Sum : " + sum);

			} catch	(NumberFormatException ex){

				resLabel.setText("error : Enter valid Numbert");			

			}
			}

		});
		
	
		//addbtn.addActionListener(new myEventHandler(txt1,txt2,resLabel));
                

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
