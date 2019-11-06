package swing;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Sample3 {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	double n1;
	double n2;
	double r1;
	double r2;
	String ans1;
	String ans2;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sample3 window = new Sample3();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Sample3() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Height and Weight Converter v.Beta 0.1 2.2");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setForeground(Color.BLUE);
		JLabel label = new JLabel("");
		label.setBounds(251, 79, 46, 14);
		frame.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("");
		label_1.setBounds(251, 132, 46, 14);
		frame.getContentPane().add(label_1);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setBounds(251, 195, 89, 23);
		frame.getContentPane().add(btnCancel);
		
		JButton btnOk = new JButton("OK");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					n1=Double.parseDouble(textField.getText());
					n2=Double.parseDouble(textField_1.getText());
					r1=(n1/3.2808);
					r2=(n2/2.2046);
					 ans1=String.format("%.2f m", r1);
					 ans2=String.format("%.0f kg", r2);
					 label.setText(ans1);
					 label_1.setText(ans2);
					
			}});
		btnOk.setBounds(104, 195, 110, 23);
		frame.getContentPane().add(btnOk);
		
		JLabel lblHeight = new JLabel("Height:");
		lblHeight.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblHeight.setBounds(31, 78, 46, 14);
		frame.getContentPane().add(lblHeight);
		
		JLabel lblWeight = new JLabel("Weight:");
		lblWeight.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblWeight.setBounds(31, 131, 46, 14);
		frame.getContentPane().add(lblWeight);
		
		textField = new JTextField();
		textField.setBounds(104, 76, 110, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(104, 129, 110, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblUsMeasurement = new JLabel("US Measurement");
		lblUsMeasurement.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblUsMeasurement.setBounds(119, 50, 95, 14);
		frame.getContentPane().add(lblUsMeasurement);
		
		JLabel lblMetric = new JLabel("Metric");
		lblMetric.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblMetric.setBounds(257, 50, 46, 14);
		frame.getContentPane().add(lblMetric);
		
		JLabel lblHelp = new JLabel("Help");
		lblHelp.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblHelp.setBounds(10, 21, 46, 14);
		frame.getContentPane().add(lblHelp);
		
		JLabel lblAbout = new JLabel("About");
		lblAbout.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblAbout.setBounds(49, 21, 46, 14);
		frame.getContentPane().add(lblAbout);
		
		
	}
}
