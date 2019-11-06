package swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JMenuBar;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.BoxLayout;
import javax.swing.border.BevelBorder;
import java.awt.Color;
import javax.swing.border.LineBorder;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;

public class Java {

	private JFrame frame;
	private JTextField textField;
	double result;
	double num1;
	double num2;
	String op;
	String ans;
	private JTextField textField_1;
	double USA=70.95;
	double India=30;
	double UK=91.32;
	double Japan=90.21;
	double France=78.78;
	
			
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Java window = new Java();
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
	public Java() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 770, 466);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(10, 32, 500, 50);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JMenuItem mntmNewMnuItem = new JMenuItem("New mnu item");
		mntmNewMnuItem.setBounds(111, 160, 50, -71);
		frame.getContentPane().add(mntmNewMnuItem);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 752, 21);
		frame.getContentPane().add(menuBar);
		
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		JMenuItem mntmStandard = new JMenuItem("Standard");
		mntmStandard.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			frame.setBounds(100, 100, 305, 466);

	
			}
		});
		mnFile.add(mntmStandard);
		
		JMenuItem mntmScientific = new JMenuItem("Scientific");
		  mntmScientific.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			frame.setBounds(100, 100, 525, 466);
	
				
			}
		});
		mnFile.add(mntmScientific);
		
		JMenuItem mntmUnitConversion = new JMenuItem("Unit Conversion");
		mntmUnitConversion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			frame.setBounds(100, 100, 770, 466);
			}
			});
			mnFile.add(mntmUnitConversion);
		
		JMenuItem mntmExit = new JMenuItem("Exit");
		mntmExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(JOptionPane.showConfirmDialog(frame,"Confirm","Exit",JOptionPane.YES_OPTION)==JOptionPane.YES_NO_OPTION)
				{
				System.exit(0);
				}
			}
		});
		mnFile.add(mntmExit);
		
		JButton button_4 = new JButton("<-");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String b=null;
				if(textField.getText().length()>0)

				{
				StringBuilder strB=new StringBuilder(textField.getText());
				strB.deleteCharAt(textField.getText().length()-1);
				b=strB.toString();
				textField.setText(b);
				}
			}
		});
		button_4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		button_4.setBounds(10, 96, 56, 58);
		frame.getContentPane().add(button_4);
		
		JButton button_9 = new JButton("CE");
		button_9.setFont(new Font("Tahoma", Font.PLAIN, 13));
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				num1=Double.parseDouble(textField.getText());
				textField.setText(null);
				op="%";
			}
		});
		button_9.setBounds(66, 96, 56, 58);
		frame.getContentPane().add(button_9);
		
		JButton button_10 = new JButton("C");
		button_10.setFont(new Font("Tahoma", Font.PLAIN, 13));
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				num1=Double.parseDouble(textField.getText());
				textField.setText(null);
				op="%";
			}
		});
		button_10.setBounds(121, 96, 56, 58);
		frame.getContentPane().add(button_10);
		
		JButton button_3 = new JButton("+/-");
		button_3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				num1 = Double.parseDouble(textField.getText());
				ans=String.format("%.2f",num1);
				textField.setText("-"+ans);
			}
		});
		button_3.setBounds(177, 96, 56, 58);
		frame.getContentPane().add(button_3);
		
		JButton button_8 = new JButton("Sqrt");
		button_8.setFont(new Font("Tahoma", Font.PLAIN, 13));
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				num1 = Math.sqrt(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText() + num1);
			}
		});
		button_8.setBounds(232, 96, 56, 58);
		frame.getContentPane().add(button_8);
		
		JButton button_11 = new JButton("Log");
		button_11.setFont(new Font("Tahoma", Font.PLAIN, 13));
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				num1 = Math.log(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText() + num1);
			}
		});
		button_11.setBounds(288, 96, 56, 58);
		frame.getContentPane().add(button_11);
		
		JButton button_12 = new JButton("Sin");
		button_12.setFont(new Font("Tahoma", Font.PLAIN, 13));
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				 num1=Double.parseDouble(textField.getText());
	                num1=Math.sin(num1);
	                textField.setText(String.valueOf(num1));
				
				
							}
		});
		button_12.setBounds(344, 96, 56, 58);
		frame.getContentPane().add(button_12);
		
		JButton button_13 = new JButton("Sinh");
		button_13.setFont(new Font("Tahoma", Font.PLAIN, 13));
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				 num1=Double.parseDouble(textField.getText());
	                num1=Math.sinh(num1);
	                textField.setText(String.valueOf(num1));
			}
		});
		button_13.setBounds(399, 96, 56, 58);
		frame.getContentPane().add(button_13);
		
		JButton button = new JButton("Mod");
		button.setFont(new Font("Tahoma", Font.PLAIN, 13));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
				op="%";
			}
		});
		button.setBounds(454, 96, 56, 58);
		frame.getContentPane().add(button);
		
		JButton button_1 = new JButton("7");
		button_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String Number=textField.getText()+button_1.getText();
				textField.setText(Number);
			}
		});
		button_1.setBounds(10, 160, 56, 58);
		frame.getContentPane().add(button_1);
		
		JButton button_2 = new JButton("8");
		button_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String Number=textField.getText()+button_2.getText();
				textField.setText(Number);
			}
		});
		button_2.setBounds(66, 160, 56, 58);
		frame.getContentPane().add(button_2);
		
		JButton button_5 = new JButton("9");
		button_5.setFont(new Font("Tahoma", Font.PLAIN, 13));
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String Number=textField.getText()+button_5.getText();
				textField.setText(Number);
			}
		});
		button_5.setBounds(121, 160, 56, 58);
		frame.getContentPane().add(button_5);
		
		JButton button_6 = new JButton("/");
		button_6.setFont(new Font("Tahoma", Font.PLAIN, 13));
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				num1=Double.parseDouble(textField.getText());
				textField.setText(" ");
				op="/";
				
			}
		});
		button_6.setBounds(177, 160, 56, 58);
		frame.getContentPane().add(button_6);
		
		JButton button_7 = new JButton("%");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
				op="%";
			}
		});
		button_7.setBounds(232, 160, 56, 58);
		frame.getContentPane().add(button_7);
		
		JButton button_14 = new JButton("Pie");
		button_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				num1=Double.parseDouble(textField.getText());
				textField.setText(String.valueOf(num1*3.14));
			}
		});
		button_14.setBounds(288, 160, 56, 58);
		frame.getContentPane().add(button_14);
		
		JButton button_15 = new JButton("Cos");
		button_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				num1=Double.parseDouble(textField.getText());
				num1=Math.cos(num1);
				textField.setText(String.valueOf(num1));
			}
		});
		button_15.setBounds(344, 160, 56, 58);
		frame.getContentPane().add(button_15);
		
		JButton button_16 = new JButton("Cosh");
		button_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				num1=Double.parseDouble(textField.getText());
				result=Math.cosh(num1);
				textField.setText(String.valueOf(num1));
				
			}
		});
		button_16.setBounds(399, 160, 56, 58);
		frame.getContentPane().add(button_16);
		
		JButton button_17 = new JButton("lnx");
		button_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				num1=Double.parseDouble(textField.getText());
				num1=Math.log(num1);
				textField.setText(String.valueOf(num1));
			}
		});
		button_17.setBounds(454, 160, 56, 58);
		frame.getContentPane().add(button_17);
		
		JButton button_18 = new JButton("4");
		button_18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String Number=textField.getText()+button_18.getText();
				textField.setText(Number);
			}
		});
		button_18.setBounds(10, 221, 56, 58);
		frame.getContentPane().add(button_18);
		
		JButton button_19 = new JButton("5");
		button_19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String Number=textField.getText()+button_19.getText();
				textField.setText(Number);
			}
		});
		button_19.setBounds(66, 221, 56, 58);
		frame.getContentPane().add(button_19);
		
		JButton button_20 = new JButton("6");
		button_20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String Number=textField.getText()+button_20.getText();
				textField.setText(Number);
			}
		});
		button_20.setBounds(121, 221, 56, 58);
		frame.getContentPane().add(button_20);
		
		JButton button_21 = new JButton("*");
		button_21.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				num1=Double.parseDouble(textField.getText());
				textField.setText(" ");
				op="*";
			}
		});
		button_21.setBounds(177, 221, 56, 58);
		frame.getContentPane().add(button_21);
		
		JButton button_22 = new JButton("1/x");
		button_22.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				num1=Double.parseDouble(textField.getText());
	               num1=1/num1;
	               textField.setText(String.valueOf(num1));
			}
		});
		button_22.setBounds(232, 221, 56, 58);
		frame.getContentPane().add(button_22);
		
		JButton button_23 = new JButton("x^y");
		button_23.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
				op="x^y";
			}
			
		});
		button_23.setBounds(288, 221, 56, 58);
		frame.getContentPane().add(button_23);
		
		JButton button_24 = new JButton("Tan");
		button_24.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				num1=Double.parseDouble(textField.getText());
				num1=Math.tan(num1);
				textField.setText(String.valueOf(num1));
			}
		});
		button_24.setBounds(344, 221, 56, 58);
		frame.getContentPane().add(button_24);
		
		JButton button_25 = new JButton("Tanh");
		button_25.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				num1=Double.parseDouble(textField.getText());
				num1=Math.tanh(num1);
				textField.setText(String.valueOf(num1));
				
			}
		});
		button_25.setBounds(399, 221, 56, 58);
		frame.getContentPane().add(button_25);
		
		JButton button_26 = new JButton("C");
		button_26.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				num1=Double.parseDouble(textField.getText());
				textField.setText(null);
				op="%";
			}
		});
		button_26.setBounds(454, 221, 56, 58);
		frame.getContentPane().add(button_26);
		
		JButton button_27 = new JButton("1");
		button_27.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String Number=textField.getText()+button_27.getText();
				textField.setText(Number);
			}
		});
		button_27.setBounds(10, 281, 56, 58);
		frame.getContentPane().add(button_27);
		
		JButton button_28 = new JButton("2");
		button_28.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String Number=textField.getText()+button_28.getText();
				textField.setText(Number);
			}
		});
		button_28.setBounds(66, 281, 56, 58);
		frame.getContentPane().add(button_28);
		
		JButton button_29 = new JButton("3");
		button_29.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String Number=textField.getText()+button_29.getText();
				textField.setText(Number);
			}
		});
		button_29.setBounds(121, 281, 56, 58);
		frame.getContentPane().add(button_29);
		
		JButton button_30 = new JButton("-");
		button_30.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				num1=Double.parseDouble(textField.getText());
				textField.setText(" ");
				op="-";
			}
		});
		button_30.setBounds(177, 281, 56, 58);
		frame.getContentPane().add(button_30);
		
		JButton button_32 = new JButton("x^2");
		button_32.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				num1 = Math.pow(Double.parseDouble(textField.getText()), 2);
				textField.setText("");
				textField.setText(textField.getText() + num1);
			}
		});
		button_32.setBounds(288, 281, 56, 58);
		frame.getContentPane().add(button_32);
		
		JButton button_33 = new JButton("Cbr");
		button_33.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
				op="Cbr";
			}
		});
		button_33.setBounds(344, 281, 56, 58);
		frame.getContentPane().add(button_33);
		
		JButton button_34 = new JButton("Rund");
		button_34.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				num1=Double.parseDouble(textField.getText());
                num1=Math.round(num1);
                textField.setText(String.valueOf(num1));
			}
		});
		button_34.setBounds(399, 281, 56, 58);
		frame.getContentPane().add(button_34);
		
		JButton button_35 = new JButton("2*pie");
		button_35.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(String.valueOf(2*3.14));

			}
		});
		button_35.setBounds(454, 281, 56, 58);
		frame.getContentPane().add(button_35);
		
		JButton button_36 = new JButton("0");
		button_36.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String Number=textField.getText()+button_36.getText();
				textField.setText(Number);
				
			}
		});
		button_36.setBounds(10, 342, 110, 58);
		frame.getContentPane().add(button_36);
		
		JButton button_38 = new JButton(".");
		button_38.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(textField.getText()+".");
			}
		});
		button_38.setBounds(121, 342, 56, 58);
		frame.getContentPane().add(button_38);
		
		JButton button_39 = new JButton("+");
		button_39.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				num1=Double.parseDouble(textField.getText());
				textField.setText(" ");
				op="+";
			}
		});
		button_39.setBounds(177, 342, 56, 58);
		frame.getContentPane().add(button_39);
		
		JButton button_40 = new JButton("=");
		button_40.addActionListener(new ActionListener() {
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
				if(op=="Cbr")
				{
				result=(num1/num2)*100;
				ans=String.format("%.2f",result);
				textField.setText(ans);
				}
				if(op=="x^y")
				{
				num2=Math.pow(num1,num2);
				textField.setText(String.valueOf(num2));
			}
			}
		});
		button_40.setBounds(232, 281, 56, 119);
		frame.getContentPane().add(button_40);
		
		JButton button_41 = new JButton("x^3");
		button_41.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				num1 = Math.pow(Double.parseDouble(textField.getText()), 3);
				textField.setText("");
				textField.setText(textField.getText() + num1);
			}
		});
		button_41.setBounds(288, 342, 56, 58);
		frame.getContentPane().add(button_41);
		
		JButton button_42 = new JButton("Bin");
		button_42.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int a=Integer.parseInt(textField.getText());
				textField.setText(Integer.toBinaryString(a));
			}
		});
		button_42.setBounds(344, 342, 56, 58);
		frame.getContentPane().add(button_42);
		
		JButton button_43 = new JButton("Octal");
		button_43.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int a=Integer.parseInt(textField.getText());
				textField.setText(Integer.toOctalString(a));
			}
		});
		button_43.setBounds(454, 342, 56, 58);
		frame.getContentPane().add(button_43);
		
		JButton button_44 = new JButton("Hex");
		button_44.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int a=Integer.parseInt(textField.getText());
				textField.setText(Integer.toHexString(a));
			}
		});
		button_44.setBounds(399, 342, 56, 58);
		frame.getContentPane().add(button_44);
		
		JLabel label = new JLabel("");
		label.setBounds(520, 32, 46, 14);
		frame.getContentPane().add(label);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 5));
		panel.setBounds(520, 32, 222, 368);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblCurrencyConverter = new JLabel("Currency Converter");
		lblCurrencyConverter.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		lblCurrencyConverter.setBounds(29, 44, 183, 31);
		panel.add(lblCurrencyConverter);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"USA", "UK", "Japan", "France", "India",}));
		comboBox.setBounds(39, 86, 135, 39);
		panel.add(comboBox);
		
		textField_1 = new JTextField();
		textField_1.setBounds(39, 159, 135, 31);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel label_1 = new JLabel("");
		label_1.setBounds(56, 219, 111, 31);
		panel.add(label_1);
		
		JButton btnConvert = new JButton("Convert");
		btnConvert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double bp=Double.parseDouble(textField_1.getText());
				if(comboBox.getSelectedItem().equals("India"))
				{
				String c=String.format("Rs %.2f", bp*India);
				label_1.setText(c);
				}
				if(comboBox.getSelectedItem().equals("USA"))
				{
					String c=String.format("$ %.2f", bp*USA);
					label_1.setText(c);	
				}
				if(comboBox.getSelectedItem().equals("UK"))
				{
					String c=String.format("Pound %.2f", bp*UK);
					label_1.setText(c);	
				}
				if(comboBox.getSelectedItem().equals("Japan"))
				{
					String c=String.format("Yen %.2f", bp*Japan);
					label_1.setText(c);	
				}
				if(comboBox.getSelectedItem().equals("France"))
				{
					String c=String.format("Euro %.2f", bp*France);
					label_1.setText(c);	
				}
			}
		});
		btnConvert.setBounds(10, 304, 89, 31);
		panel.add(btnConvert);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField_1.setText(null);
				label_1.setText(null);
				
			}
		});
		btnClear.setBounds(109, 304, 89, 31);
		panel.add(btnClear);
	}
}
