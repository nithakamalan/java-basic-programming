package swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.SystemColor;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculator {

	private JFrame frame;
	private JTextField textField;
	double result;
	double num1;
	double num2;
	String op;
	String ans;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
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
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(SystemColor.activeCaption);
		frame.setBounds(100, 100, 435, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(27, 31, 354, 50);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton button = new JButton("1");
		button.setFont(new Font("Tahoma", Font.BOLD, 11));
		button.setBackground(SystemColor.textInactiveText);
		button.setBounds(27, 92, 66, 23);
		frame.getContentPane().add(button);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String Number=textField.getText()+button.getText();
				textField.setText(Number);
			}
		});
	
		
		
		JButton button_1 = new JButton("2");
		button_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_1.setBackground(SystemColor.windowBorder);
		button_1.setBounds(132, 92, 66, 23);
		frame.getContentPane().add(button_1);
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String Number=textField.getText()+button_1.getText();
				textField.setText(Number);
			}
		});
				
			
	
		
		JButton button_2 = new JButton("3");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		button_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_2.setBackground(SystemColor.textInactiveText);
		button_2.setBounds(227, 92, 66, 23);
		frame.getContentPane().add(button_2);
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String Number=textField.getText()+button_2.getText();
				textField.setText(Number);
			}
		});
		
		JButton button_3 = new JButton("4");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		button_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_3.setBackground(SystemColor.textInactiveText);
		button_3.setBounds(27, 126, 66, 23);
		frame.getContentPane().add(button_3);
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String Number=textField.getText()+button_3.getText();
				textField.setText(Number);
			}
		});
		
		JButton button_4 = new JButton("5");
		button_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_4.setBackground(SystemColor.textInactiveText);
		button_4.setBounds(132, 126, 66, 23);
		frame.getContentPane().add(button_4);
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String Number=textField.getText()+button_4.getText();
				textField.setText(Number);
			}
		});
		
		JButton button_5 = new JButton("6");
		button_5.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_5.setBackground(SystemColor.textInactiveText);
		button_5.setBounds(227, 126, 66, 23);
		frame.getContentPane().add(button_5);
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String Number=textField.getText()+button_5.getText();
				textField.setText(Number);
			}
		});
		
		JButton button_6 = new JButton("7");
		button_6.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_6.setBackground(SystemColor.textInactiveText);
		button_6.setBounds(27, 160, 66, 23);
		frame.getContentPane().add(button_6);
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String Number=textField.getText()+button_6.getText();
				textField.setText(Number);
			}
		});
		
		JButton button_7 = new JButton("8");
		button_7.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_7.setBackground(SystemColor.textInactiveText);
		button_7.setBounds(132, 160, 66, 23);
		frame.getContentPane().add(button_7);
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String Number=textField.getText()+button_7.getText();
				textField.setText(Number);
			}
		});
		
		JButton button_8 = new JButton("9");
		button_8.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_8.setBackground(SystemColor.textInactiveText);
		button_8.setBounds(227, 160, 66, 23);
		frame.getContentPane().add(button_8);
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String Number=textField.getText()+button_8.getText();
				textField.setText(Number);
			}
		});
		
		JButton button_9 = new JButton("0");
		button_9.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_9.setBackground(SystemColor.textInactiveText);
		button_9.setBounds(27, 194, 66, 23);
		frame.getContentPane().add(button_9);
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String Number=textField.getText()+button_9.getText();
				textField.setText(Number);
			}
		});
		
		JButton button_10 = new JButton(".");
		button_10.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_10.setBackground(SystemColor.textInactiveText);
		button_10.setBounds(132, 194, 66, 23);
		frame.getContentPane().add(button_10);
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String Number=textField.getText()+button_10.getText();
				textField.setText(Number);
			}
		});
		
		JButton button_11 = new JButton("=");
		button_11.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_11.setBackground(SystemColor.textInactiveText);
		button_11.setBounds(227, 194, 66, 23);
		frame.getContentPane().add(button_11);
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				num2=Double.parseDouble(textField.getText());
				if(op=="+") {
					result=num1+num2;
					ans=String.format("%.2f",result);
					textField.setText(ans);
				}
				if(op=="-")
				{
					result=num1-num2;
					ans=String.format("%.2f", result);
					textField.setText(ans);
				}
				if(op=="*")
				{
					result=num1*num2;
					ans=String.format("%.2f", result);
					textField.setText(ans);
				}
				if(op=="/")
				{
					result=num1/num2;
					ans=String.format("%.2f", result);
					textField.setText(ans);
				}
				if(op=="%")
				{
					result=num1%num2;
					ans=String.format("%.2f", result);
					textField.setText(ans);
				}
				
			}
		});
		
		JButton button_12 = new JButton("+");
		button_12.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_12.setBackground(SystemColor.textInactiveText);
		button_12.setBounds(321, 92, 60, 23);
		frame.getContentPane().add(button_12);
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				num1=Double.parseDouble(textField.getText());
				textField.setText(" ");
				op="+";
			}
		});
		
		JButton button_13 = new JButton("-");
		button_13.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_13.setBackground(SystemColor.textInactiveText);
		button_13.setBounds(321, 126, 60, 23);
		frame.getContentPane().add(button_13);
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				num1=Double.parseDouble(textField.getText());
				textField.setText(" ");
				op="-";
			}
		});
		
		JButton button_14 = new JButton("*");
		button_14.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_14.setBackground(SystemColor.textInactiveText);
		button_14.setBounds(323, 160, 58, 23);
		frame.getContentPane().add(button_14);
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				num1=Double.parseDouble(textField.getText());
				textField.setText(" ");
				op="*";
			}
		});
		
		JButton button_15 = new JButton("/");
		button_15.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_15.setBackground(SystemColor.textInactiveText);
		button_15.setBounds(321, 194, 60, 23);
		frame.getContentPane().add(button_15);
		button_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				num1=Double.parseDouble(textField.getText());
				textField.setText(" ");
				op="/";
			}
		});
		
		JButton btnB = new JButton("B");
		btnB.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnB.setBackground(SystemColor.textInactiveText);
		btnB.setBounds(173, 228, 66, 23);
		frame.getContentPane().add(btnB);
		btnB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			String b=null;
			if(textField.getText().length()>0)
			{
				StringBuilder strB= new StringBuilder(textField.getText());
				strB.deleteCharAt(textField.getText().length()-1);
				b=strB.toString();
				textField.setText(b);
			}
			
			}
		});
		
		
		JButton button_16 = new JButton("%");
		button_16.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_16.setBackground(SystemColor.textInactiveText);
		button_16.setBounds(295, 228, 60, 23);
		frame.getContentPane().add(button_16);
		button_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
				op="%";
			}
		});
		
		JButton btnC = new JButton("C");
		btnC.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnC.setBackground(SystemColor.textInactiveText);
		btnC.setBounds(56, 228, 66, 23);
		frame.getContentPane().add(btnC);
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				num1=Double.parseDouble(textField.getText());
				textField.setText(null);
				op="%";
			}
		});
		            
		JLabel lblCalculator = new JLabel("CALCULATOR");
		lblCalculator.setFont(new Font("Arial Black", Font.PLAIN, 12));
		lblCalculator.setBounds(27, 11, 109, 14);
		frame.getContentPane().add(lblCalculator);
	}
}
