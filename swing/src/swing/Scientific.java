package swing;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;

public class Scientific {

	private JFrame frame;
	private JTextField textField;
	double result;
	double num1,a;
	double num2;
	String op;
	String ans;
	JButton  exp, sqrt, sin, cos, tan;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Scientific window = new Scientific();
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
	public Scientific() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(10, 31, 414, 30);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblEdit = new JLabel("Edit");
		lblEdit.setBounds(10, 11, 46, 14);
		frame.getContentPane().add(lblEdit);
		
		JLabel lblView = new JLabel("View");
		lblView.setBounds(41, 11, 46, 14);
		frame.getContentPane().add(lblView);
		
		JLabel lblHelp = new JLabel("Help");
		lblHelp.setBounds(77, 11, 46, 14);
		frame.getContentPane().add(lblHelp);
		
		JLabel lblScientific = new JLabel("Scientific");
		lblScientific.setBounds(20, 72, 46, 14);
		frame.getContentPane().add(lblScientific);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 87, 201, 164);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnSqrt = new JButton("sqrt");
		btnSqrt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				result=Math.sqrt(num1);
				ans=String.format("%.2f",result);
				textField.setText(ans);
			}
		});
		btnSqrt.setBounds(10, 11, 59, 23);
		panel.add(btnSqrt);
		
		JButton btnx = new JButton("1/x");
		btnx.setBounds(79, 11, 51, 23);
		panel.add(btnx);
		
		
		JButton btnSin = new JButton("sin");
		btnSin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				result=Math.sin(num1);
				ans=String.format("%.2f",result);
				textField.setText(ans);
				
			}
		});
		btnSin.setBounds(140, 11, 59, 23);
		panel.add(btnSin);
		
		JButton button = new JButton("%");
		button.setBounds(10, 45, 59, 23);
		panel.add(button);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
				op="%";
			}
		});
		
		JButton btnExp = new JButton("Exp");
		btnExp.setBounds(79, 45, 51, 23);
		panel.add(btnExp);
		
		JButton btnCos = new JButton("cos");
		btnCos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				result=Math.cos(num1);
				ans=String.format("%.2f",result);
				textField.setText(ans);	
			}
		});
		btnCos.setBounds(140, 45, 59, 23);
		panel.add(btnCos);
		
		JButton btnXy = new JButton("x^y");
		btnXy.setBounds(10, 79, 59, 23);
		panel.add(btnXy);
		
		JButton btnLn = new JButton("ln");
		btnLn.setBounds(79, 79, 51, 23);
		panel.add(btnLn);
		
		JButton btnTan = new JButton("tan");
		btnTan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				result=Math.tan(num1);
				ans=String.format("%.2f",result);
				textField.setText(ans);
			}
		});
		btnTan.setBounds(140, 79, 59, 23);
		panel.add(btnTan);
		
		JButton btnX = new JButton("x^2");
		btnX.setBounds(10, 117, 59, 23);
		panel.add(btnX);
		
		JButton btnN = new JButton("n!");
		btnN.setBounds(79, 117, 51, 23);
		panel.add(btnN);
		
		JButton btnSec = new JButton("sec");
		btnSec.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
			}
			
		});
		btnSec.setBounds(140, 117, 59, 23);
		panel.add(btnSec);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(221, 87, 203, 164);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JButton button_1 = new JButton("7");
		button_1.setBounds(10, 11, 46, 23);
		panel_1.add(button_1);
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String Number=textField.getText()+button_1.getText();
				textField.setText(Number);
			}
		});
		
		JButton button_2 = new JButton("8");
		button_2.setBounds(59, 11, 46, 23);
		panel_1.add(button_2);
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String Number=textField.getText()+button_2.getText();
				textField.setText(Number);
			}
		});
		
		JButton button_3 = new JButton("9");
		button_3.setBounds(108, 11, 46, 23);
		panel_1.add(button_3);
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String Number=textField.getText()+button_3.getText();
				textField.setText(Number);
			}
		});
		
		JButton button_4 = new JButton("/");
		button_4.setBounds(157, 11, 46, 23);
		panel_1.add(button_4);
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				num1=Double.parseDouble(textField.getText());
				textField.setText(" ");
				op="/";
			}
		});
		
		JButton button_5 = new JButton("4");
		button_5.setBounds(10, 47, 46, 23);
		panel_1.add(button_5);
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String Number=textField.getText()+button_5.getText();
				textField.setText(Number);
			}
		});
		
		JButton button_6 = new JButton("5");
		button_6.setBounds(59, 47, 46, 23);
		panel_1.add(button_6);
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String Number=textField.getText()+button_6.getText();
				textField.setText(Number);
			}
		});
		
		JButton button_7 = new JButton("6");
		button_7.setBounds(108, 45, 46, 23);
		panel_1.add(button_7);
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String Number=textField.getText()+button_7.getText();
				textField.setText(Number);
			}
		});
		
		JButton button_8 = new JButton("*");
		button_8.setBounds(157, 47, 46, 23);
		panel_1.add(button_8);
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				num1=Double.parseDouble(textField.getText());
				textField.setText(" ");
				op="*";
			}
		});
		
		JButton button_9 = new JButton("1");
		button_9.setBounds(9, 81, 47, 23);
		panel_1.add(button_9);
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String Number=textField.getText()+button_9.getText();
				textField.setText(Number);
			}
		});
		
		JButton button_10 = new JButton("2");
		button_10.setBounds(58, 81, 47, 23);
		panel_1.add(button_10);
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String Number=textField.getText()+button_10.getText();
				textField.setText(Number);
			}
		});
		
		JButton button_11 = new JButton("3");
		button_11.setBounds(108, 81, 46, 23);
		panel_1.add(button_11);
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String Number=textField.getText()+button_11.getText();
				textField.setText(Number);
			}
		});
		
		JButton button_12 = new JButton("-");
		button_12.setBounds(157, 81, 46, 23);
		panel_1.add(button_12);
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				num1=Double.parseDouble(textField.getText());
				textField.setText(" ");
				op="-";
			}
		});
		
		JButton button_13 = new JButton("0");
		button_13.setBounds(10, 115, 46, 23);
		panel_1.add(button_13);
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String Number=textField.getText()+button_13.getText();
				textField.setText(Number);
			}
		});
		
		JButton button_14 = new JButton(".");
		button_14.setBounds(59, 115, 46, 23);
		panel_1.add(button_14);
		
		
		JButton button_15 = new JButton("=");
		button_15.setBounds(108, 115, 46, 23);
		panel_1.add(button_15);
		button_15.addActionListener(new ActionListener() {
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
		
		JButton button_16 = new JButton("+");
		button_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			num1=Double.parseDouble(textField.getText());
				textField.setText(" ");
				op="+";	
			}
		});
		button_16.setBounds(157, 115, 46, 23);
		panel_1.add(button_16);
		
		JLabel lblStandard = new JLabel("Standard");
		lblStandard.setBounds(231, 72, 46, 14);
		frame.getContentPane().add(lblStandard);
	}
}
