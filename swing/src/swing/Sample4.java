package swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Sample4 {

	private JFrame frame;
	/**
	 * @wbp.nonvisual location=-10,9
	 */
	private final JPanel panel = new JPanel();
	private JTextField textField;
	private JTextField textField_1;
	double n1;
	double n2;
	double r;
	String ans;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sample4 window = new Sample4();
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
	public Sample4() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 344, 537);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblBodyMassIndex = new JLabel("Body Mass Index");
		lblBodyMassIndex.setForeground(Color.RED);
		lblBodyMassIndex.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblBodyMassIndex.setBounds(90, 30, 173, 14);
		frame.getContentPane().add(lblBodyMassIndex);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.GREEN);
		panel_1.setBounds(0, 0, 328, 80);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.GREEN);
		panel_2.setBounds(10, 91, 308, 241);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblHeightm = new JLabel("Height(m):");
		lblHeightm.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblHeightm.setBounds(20, 38, 78, 14);
		panel_2.add(lblHeightm);
		
		textField = new JTextField();
		textField.setBounds(119, 36, 154, 20);
		panel_2.add(textField);
		textField.setColumns(10);
		
		JLabel lblWeightkg = new JLabel("Weight(kg):");
		lblWeightkg.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblWeightkg.setBounds(20, 86, 78, 14);
		panel_2.add(lblWeightkg);
		
		textField_1 = new JTextField();
		textField_1.setBounds(119, 84, 154, 20);
		panel_2.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblBmi = new JLabel("BMI");
		lblBmi.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblBmi.setBounds(20, 141, 46, 14);
		panel_2.add(lblBmi);
		
		JLabel label = new JLabel("");
		label.setBackground(Color.ORANGE);
		label.setBounds(76, 141, 46, 14);
		panel_2.add(label);
		
		JLabel label_1 = new JLabel("");
		label_1.setBounds(159, 141, 110, 14);
		panel_2.add(label_1);
		
		JButton btnCalculate = new JButton("Calculate");
		btnCalculate.setForeground(SystemColor.activeCaptionText);
		btnCalculate.setBounds(89, 182, 78, 23);
		panel_2.add(btnCalculate);
		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					n1=Double.parseDouble(textField.getText());
					n2=Double.parseDouble(textField_1.getText());
					r=(n1/n2/n2)*10000;
					ans = String.format("%.2f",r);
					label.setText(ans);
					if(r<18.5)
					{
						label_1.setText("Under Weight");
					}
					else if(r>18.5 && r<24.5)
					{
						label_1.setText("Over Weight");
						
					}
					
			}}); 
		
		JButton btnClear = new JButton("Clear");
		btnClear.setBounds(177, 182, 57, 23);
		panel_2.add(btnClear);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setBounds(244, 182, 54, 23);
		panel_2.add(btnExit);
		
		
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.GREEN);
		panel_3.setBounds(10, 343, 308, 145);
		frame.getContentPane().add(panel_3);
	}

}
