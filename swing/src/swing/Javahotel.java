package swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JSeparator;
import javax.swing.JMenuBar;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTabbedPane;

public class Javahotel {

		private JFrame frame;
		private JTextField textField;
		private JTextField textField_1;
		private JTextField textField_2;
		private JTextField textField_3;
		private JTextField textField_4;
		private JTextField textField_5;
		private JTextField textField_6;
		private JTextField textField_7;
		private JTextField textField_8;
		private JTextField textField_9;
		private JTextField textField_10;
		
		/**
		* Launch the application.
		*/
		public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
		public void run() {
		try {
		Javahotel window = new Javahotel();
		window.frame.setVisible(true);
		} catch (Exception e) {
		e.printStackTrace();
		}
		}
		});
		}
		double USA=70.95;
		double Russia=34;
		   double Japan=65;
		   double UK=45;
		   double France=98;
		   double India=60;
		   double result;
			double num1;
			double num2;
			String op;
			String ans;
		   private JTextField textField_11;
		/**
		* Create the application.
		*/
		public Javahotel() {
			// TODO Auto-generated constructor stub
		
		initialize();
		}
		
		/**
		* Initialize the contents of the frame.
		*/
		private void initialize() {
			frame = new JFrame();
			frame.setBounds(100, 100, 1100, 560);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.getContentPane().setLayout(null);
			
			JLabel lblHotelManagement = new JLabel("Hotel Management Systems");
			lblHotelManagement.setFont(new Font("Tahoma", Font.BOLD, 20));
			lblHotelManagement.setBounds(220, 11, 302, 54);
			frame.getContentPane().add(lblHotelManagement);
			
			JPanel panel = new JPanel();
			panel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
			panel.setBounds(10, 74, 390, 218);
			frame.getContentPane().add(panel);
			panel.setLayout(null);
			
			JLabel lblChickenBurger = new JLabel("Chicken Burger");
			lblChickenBurger.setFont(new Font("Tahoma", Font.BOLD, 12));
			lblChickenBurger.setBounds(10, 11, 108, 14);
			panel.add(lblChickenBurger);
			
			JLabel lblChickenBurgerMeal = new JLabel("Chicken Burger Meal");
			lblChickenBurgerMeal.setFont(new Font("Tahoma", Font.BOLD, 12));
			lblChickenBurgerMeal.setBounds(10, 47, 126, 14);
			panel.add(lblChickenBurgerMeal);
			
			JLabel lblCheeseBurger = new JLabel("Cheese Burger");
			lblCheeseBurger.setFont(new Font("Tahoma", Font.BOLD, 12));
			lblCheeseBurger.setBounds(10, 84, 108, 14);
			panel.add(lblCheeseBurger);
			
			textField = new JTextField();
			textField.setBounds(181, 9, 120, 20);
			panel.add(textField);
			textField.setColumns(10);
			
			textField_1 = new JTextField();
			textField_1.setColumns(10);
			textField_1.setBounds(181, 45, 120, 20);
			panel.add(textField_1);
			
			textField_2 = new JTextField();
			textField_2.setColumns(10);
			textField_2.setBounds(181, 82, 120, 20);
			panel.add(textField_2);
			
			JLabel lblDrink = new JLabel("Drink");
			lblDrink.setFont(new Font("Tahoma", Font.BOLD, 12));
			lblDrink.setBounds(10, 133, 46, 14);
			panel.add(lblDrink);
			
			JLabel lblQty = new JLabel("Qty");
			lblQty.setFont(new Font("Tahoma", Font.BOLD, 13));
			lblQty.setBounds(170, 134, 46, 14);
			panel.add(lblQty);
			
			JComboBox comboBox = new JComboBox();
			comboBox.setModel(new DefaultComboBoxModel(new String[] {"Coffee", "Cold coffee", "Tea", "Lime", "Cola"}));
			comboBox.setBounds(10, 152, 114, 20);
			panel.add(comboBox);
			
			textField_3 = new JTextField();
			textField_3.setBounds(180, 152, 121, 20);
			panel.add(textField_3);
			textField_3.setColumns(10);
			
			JRadioButton rdbtnNewRadioButton = new JRadioButton("Home Delivery");
			rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.BOLD, 11));
			rdbtnNewRadioButton.setBounds(9, 188, 109, 23);
			panel.add(rdbtnNewRadioButton);
			
			JRadioButton rdbtnTax = new JRadioButton("Tax");
			rdbtnTax.setFont(new Font("Tahoma", Font.BOLD, 11));
			rdbtnTax.setBounds(144, 188, 109, 23);
			panel.add(rdbtnTax);
			
			JSeparator separator = new JSeparator();
			separator.setBackground(new Color(65, 105, 225));
			separator.setBounds(10, 113, 291, 9);
			panel.add(separator);
			
			JPanel panel_1 = new JPanel();
			panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
			panel_1.setBounds(403, 74, 304, 218);
			frame.getContentPane().add(panel_1);
			panel_1.setLayout(null);
			
			JLabel lblCurrencyConverter = new JLabel("Currency Converter");
			lblCurrencyConverter.setBounds(75, 11, 185, 20);
			lblCurrencyConverter.setFont(new Font("Tahoma", Font.BOLD, 16));
			panel_1.add(lblCurrencyConverter);
			
			JComboBox comboBox_1 = new JComboBox();
			comboBox_1.setBounds(58, 48, 217, 20);
			comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"USA", "Russia", "Japan", "UK", "France", "India", "South", "china"}));
			panel_1.add(comboBox_1);
			
			textField_4 = new JTextField();
			textField_4.setBounds(58, 96, 217, 20);
			panel_1.add(textField_4);
			textField_4.setColumns(10);
			
			JLabel lblNewLabel = new JLabel("");
			lblNewLabel.setBounds(104, 127, 98, 28);
			panel_1.add(lblNewLabel);
			
			JButton btnOnvert = new JButton("Convert");
			btnOnvert.setBounds(58, 171, 89, 23);
			btnOnvert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			double bp=Double.parseDouble(textField_4.getText());
				if(comboBox_1.getSelectedItem().equals("India"))
				{
				String c=String.format("Rs %.2f",bp*India);
				lblNewLabel.setText(c);
				}
				if(comboBox_1.getSelectedItem().equals("USA"))
				{
				String c=String.format("$ %.2f",bp*USA);
				lblNewLabel.setText(c);
				}
				if(comboBox_1.getSelectedItem().equals("UK"))
				{
				String c=String.format("Pound %.2f",bp*UK);
				lblNewLabel.setText(c);
				}
				if(comboBox_1.getSelectedItem().equals("Japan"))
				{
				String c=String.format("Yen  %.2f",bp*Japan);
				lblNewLabel.setText(c);
				}
				if(comboBox_1.getSelectedItem().equals("France"))
				{
				String c=String.format("Euro  %.2f",bp*France);
				lblNewLabel.setText(c);
				}
			}
			});
			panel_1.add(btnOnvert);
			
			JButton btnClose = new JButton("Close");
			btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			textField_4.setText(null);
			lblNewLabel.setText(null);
			
			
			}
			});
			btnClose.setBounds(186, 171, 89, 23);
			panel_1.add(btnClose);
			
			
			
			JPanel panel_2 = new JPanel();
			panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 2));
			panel_2.setBounds(10, 303, 390, 113);
			frame.getContentPane().add(panel_2);
			panel_2.setLayout(null);
			
			JLabel lblCostOfDrinks = new JLabel("Cost of Drinks");
			lblCostOfDrinks.setFont(new Font("Tahoma", Font.BOLD, 13));
			lblCostOfDrinks.setBounds(10, 11, 91, 14);
			panel_2.add(lblCostOfDrinks);
			
			JLabel lblCostOfMeal = new JLabel("Cost of Meal");
			lblCostOfMeal.setFont(new Font("Tahoma", Font.BOLD, 13));
			lblCostOfMeal.setBounds(10, 47, 91, 14);
			panel_2.add(lblCostOfMeal);
			
			JLabel lblCostOfDelivery = new JLabel("Cost of Delivery");
			lblCostOfDelivery.setFont(new Font("Tahoma", Font.BOLD, 13));
			lblCostOfDelivery.setBounds(10, 84, 103, 14);
			panel_2.add(lblCostOfDelivery);
			
			textField_5 = new JTextField();
			textField_5.setBounds(185, 9, 118, 20);
			panel_2.add(textField_5);
			textField_5.setColumns(10);
			
			textField_6 = new JTextField();
			textField_6.setColumns(10);
			textField_6.setBounds(185, 45, 118, 20);
			panel_2.add(textField_6);
			
			textField_7 = new JTextField();
			textField_7.setColumns(10);
			textField_7.setBounds(185, 82, 118, 20);
			panel_2.add(textField_7);
			
			JPanel panel_3 = new JPanel();
			panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 2));
			panel_3.setBounds(403, 303, 304, 113);
			frame.getContentPane().add(panel_3);
			panel_3.setLayout(null);
			
			JLabel lblTax = new JLabel("Tax");
			lblTax.setFont(new Font("Tahoma", Font.BOLD, 13));
			lblTax.setBounds(10, 11, 46, 14);
			panel_3.add(lblTax);
			
			JLabel lblSubTotal = new JLabel("Sub Total");
			lblSubTotal.setFont(new Font("Tahoma", Font.BOLD, 13));
			lblSubTotal.setBounds(10, 47, 66, 21);
			panel_3.add(lblSubTotal);
			
			JLabel lblTotal = new JLabel("Total");
			lblTotal.setFont(new Font("Tahoma", Font.BOLD, 13));
			lblTotal.setBounds(10, 88, 46, 14);
			panel_3.add(lblTotal);
			
			textField_8 = new JTextField();
			textField_8.setBounds(144, 9, 126, 20);
			panel_3.add(textField_8);
			textField_8.setColumns(10);
			
			textField_9 = new JTextField();
			textField_9.setColumns(10);
			textField_9.setBounds(144, 48, 126, 20);
			panel_3.add(textField_9);
			
			textField_10 = new JTextField();
			textField_10.setColumns(10);
			textField_10.setBounds(144, 86, 126, 20);
			panel_3.add(textField_10);
			
			JPanel panel_4 = new JPanel();
			panel_4.setBorder(new LineBorder(new Color(0, 0, 0), 2));
			panel_4.setBounds(713, 75, 316, 341);
			frame.getContentPane().add(panel_4);
			panel_4.setLayout(null);
			
			JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
			tabbedPane.setBounds(10, 40, 298, 291);
			panel_4.add(tabbedPane);
			
			JPanel panel_7 = new JPanel();
			tabbedPane.addTab("calculator", null, panel_7, null);
			panel_7.setLayout(null);
			
			textField_11 = new JTextField();
			textField_11.setBounds(10, 11, 273, 49);
			panel_7.add(textField_11);
			textField_11.setColumns(10);
			
			JButton btnB = new JButton("B");
			btnB.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					String b=null;
					if(textField_11.getText().length()>0)

					{
					StringBuilder strB=new StringBuilder(textField_11.getText());
					strB.deleteCharAt(textField_11.getText().length()-1);
					b=strB.toString();
					textField_11.setText(b);
					}
				}
			});
			btnB.setBounds(10, 82, 57, 23);
			panel_7.add(btnB);
			
			JButton btnC = new JButton("C");
			btnC.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					num1=Double.parseDouble(textField_11.getText());
					textField_11.setText(null);
					op="%";
				}
			});
			btnC.setBounds(77, 82, 57, 23);
			panel_7.add(btnC);
			
			JButton button = new JButton("...");
			button.setBounds(144, 82, 57, 23);
			panel_7.add(button);
			
			JButton button_1 = new JButton("+");
			button_1.setBounds(211, 82, 63, 23);
			panel_7.add(button_1);
			
			JButton button_2 = new JButton("7");
			button_2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String Number=textField_11.getText()+button_2.getText();
					textField_11.setText(Number);
					
				}
			});
			button_2.setBounds(10, 121, 57, 23);
			panel_7.add(button_2);
			
			JButton button_3 = new JButton("8");
			button_3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String Number=textField.getText()+button_3.getText();
					textField_11.setText(Number);
				}
			});
			button_3.setBounds(77, 121, 57, 23);
			panel_7.add(button_3);
			
			JButton button_4 = new JButton("9");
			button_4.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String Number=textField.getText()+button_4.getText();
					textField_11.setText(Number);
				}
			});
			button_4.setBounds(144, 121, 57, 23);
			panel_7.add(button_4);
			
			JButton button_5 = new JButton("-");
			button_5.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
				}
			});
			button_5.setBounds(211, 121, 63, 23);
			panel_7.add(button_5);
			
			JButton button_6 = new JButton("4");
			button_6.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String Number=textField.getText()+button_6.getText();
					textField_11.setText(Number);
				}
			});
			button_6.setBounds(10, 155, 57, 23);
			panel_7.add(button_6);
			
			JButton button_7 = new JButton("5");
			button_7.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String Number=textField.getText()+button_7.getText();
					textField_11.setText(Number);
				}
			});
			button_7.setBounds(77, 155, 57, 23);
			panel_7.add(button_7);
			
			JButton button_8 = new JButton("6");
			button_8.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String Number=textField.getText()+button_8.getText();
					textField_11.setText(Number);
				}
			});
			button_8.setBounds(144, 155, 57, 23);
			panel_7.add(button_8);
			
			JButton button_9 = new JButton("*");
			button_9.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			button_9.setBounds(211, 155, 63, 23);
			panel_7.add(button_9);
			
			JButton button_10 = new JButton("1");
			button_10.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String Number=textField.getText()+button_10.getText();
					textField_11.setText(Number);
				}
			});
			button_10.setBounds(10, 189, 57, 23);
			panel_7.add(button_10);
			
			JButton button_11 = new JButton("2");
			button_11.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String Number=textField.getText()+button_11.getText();
					textField_11.setText(Number);
				}
			});
			button_11.setBounds(77, 189, 57, 23);
			panel_7.add(button_11);
			
			JButton button_12 = new JButton("3");
			button_12.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String Number=textField.getText()+button_12.getText();
					textField_11.setText(Number);
				}
			});
			button_12.setBounds(144, 189, 57, 23);
			panel_7.add(button_12);
			
			JButton button_13 = new JButton("/");
			button_13.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			button_13.setBounds(211, 189, 63, 23);
			panel_7.add(button_13);
			
			JButton button_14 = new JButton("0");
			button_14.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String Number=textField.getText()+button_14.getText();
					textField_11.setText(Number);
				}
			});
			button_14.setBounds(10, 223, 57, 23);
			panel_7.add(button_14);
			
			JButton button_15 = new JButton(".");
			button_15.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					textField_11.setText(textField_11.getText()+".");
				}
			});
			button_15.setBounds(77, 223, 57, 23);
			panel_7.add(button_15);
			
			JButton button_16 = new JButton("...");
			button_16.setBounds(144, 223, 57, 23);
			panel_7.add(button_16);
			
			JButton button_17 = new JButton("=");
			button_17.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			button_17.setBounds(211, 223, 63, 23);
			panel_7.add(button_17);
			
			JPanel panel_8 = new JPanel();
			tabbedPane.addTab("Receipt", null, panel_8, null);
			panel_8.setLayout(null);
			
			JPanel panel_6 = new JPanel();
			panel_6.setBounds(10, 40, 298, 291);
			panel_4.add(panel_6);
			panel_6.setLayout(null);
			
			JPanel panel_5 = new JPanel();
			panel_5.setBorder(new LineBorder(new Color(0, 0, 0), 2));
			panel_5.setBounds(10, 427, 1019, 54);
			frame.getContentPane().add(panel_5);
			panel_5.setLayout(null);
			
			JButton btnTotl = new JButton("Total");
			btnTotl.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String va1=textField.getText().toString();
					double value1=Double.parseDouble(va1);
					Double b=value1*50;
					//textField_6.setText(String.format("%.0f",b));
					String va2=textField_1.getText().toString();
					double value2=Double.parseDouble(va2);
					Double cbm=value2*75;
					//textField_6.setText(String.format("%.0f",bm));
					String va3=textField_2.getText().toString();
					double value3=Double.parseDouble(va3);
					Double cb=value3*75;
					double t=b+cbm+cb;
					textField_6.setText(String.format("%.0f",t));
					String d=(String)comboBox.getSelectedItem();
					double dr;
					double subtotal;
					double tax;
					double total;
					if(d.equals("coffee"))
					{
					String va4=textField_3.getText().toString();
					double value4=Double.parseDouble(va4);
					dr=value4*13;
					double tot=dr;
					textField_5.setText(String.format("%.0f",dr));

					}
					else
					{
					String va4=textField_3.getText().toString();
					double value4=Double.parseDouble(va4);
					dr=value4*9;
					double tot=dr;
					textField_5.setText(String.format("%.0f",dr));
					}
					double delivery=0;
					if(rdbtnNewRadioButton.isSelected())
					{
					delivery=delivery+25;
					textField_7.setText(String.format("%.0f",delivery));
					}
					else
					{
					delivery=delivery;
					textField_7.setText(String.format("%.0f",delivery));
					}
					subtotal=Double.parseDouble(textField_5.getText())+Double.parseDouble(textField_6.getText())+Double.parseDouble(textField_7.getText());
					textField_9.setText(String.format("%.0f",subtotal));
					tax=Double.parseDouble(textField_9.getText())*0.18;
					textField_8.setText(String.format("%.2f",tax));
					total=Double.parseDouble(textField_9.getText())+Double.parseDouble(textField_8.getText());
					textField_10.setText(String.format("%.2f",total));
					textField_4.setText(textField_10.getText());
					
					
				}
			});
			btnTotl.setBounds(142, 20, 89, 23);
			panel_5.add(btnTotl);
			
			JButton btnReceipt = new JButton("Receipt");
			btnReceipt.setBounds(265, 20, 89, 23);
			panel_5.add(btnReceipt);
			
			JButton btnReset = new JButton("Reset");
			btnReset.setBounds(386, 20, 89, 23);
			panel_5.add(btnReset);
			
			JButton btnExit = new JButton("Exit");
			btnExit.setBounds(506, 20, 89, 23);
			panel_5.add(btnExit);
}
}
