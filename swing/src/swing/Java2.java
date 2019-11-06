package swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.border.TitledBorder;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;

public class Java2 {

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
	private JTextField textField_11;
	private JTable table;
	public static double ticket=100;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Java2 window = new Java2();
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
	public Java2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Tahoma", Font.BOLD, 11));
		frame.setBounds(100, 100, 759, 626);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.setBounds(214, 29, 294, 48);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblTicketBooking = new JLabel("Ticket Booking");
		lblTicketBooking.setFont(new Font("Tahoma", Font.BOLD, 23));
		lblTicketBooking.setBounds(53, 11, 215, 26);
		panel.add(lblTicketBooking);
		
		JLabel lblName = new JLabel("Name");
		lblName.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblName.setBounds(22, 94, 60, 14);
		frame.getContentPane().add(lblName);
		
		textField = new JTextField();
		textField.setBounds(120, 93, 104, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 182, 60, -76);
		frame.getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(32, 128, -53, 36);
		frame.getContentPane().add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(22, 121, -16, 36);
		frame.getContentPane().add(separator_2);
		
		JRadioButton rdbtnStandard = new JRadioButton("Standard");
		rdbtnStandard.setFont(new Font("Tahoma", Font.BOLD, 11));
		rdbtnStandard.setBounds(22, 141, 89, 23);
		frame.getContentPane().add(rdbtnStandard);
		
		JRadioButton rdbtnSingleTicket = new JRadioButton("Single Ticket");
		rdbtnSingleTicket.setFont(new Font("Tahoma", Font.BOLD, 11));
		rdbtnSingleTicket.setBounds(120, 141, 104, 23);
		frame.getContentPane().add(rdbtnSingleTicket);
		
		JRadioButton rdbtnAdult = new JRadioButton("Adult");
		rdbtnAdult.setFont(new Font("Tahoma", Font.BOLD, 11));
		rdbtnAdult.setBounds(239, 141, 67, 23);
		frame.getContentPane().add(rdbtnAdult);
		
		JRadioButton rdbtnFirstClass = new JRadioButton("First Class");
		rdbtnFirstClass.setFont(new Font("Tahoma", Font.BOLD, 11));
		rdbtnFirstClass.setBounds(22, 177, 89, 23);
		frame.getContentPane().add(rdbtnFirstClass);
		
		JRadioButton rdbtnAc = new JRadioButton("AC");
		rdbtnAc.setFont(new Font("Tahoma", Font.BOLD, 11));
		rdbtnAc.setBounds(116, 177, 48, 23);
		frame.getContentPane().add(rdbtnAc);
		
		JRadioButton rdbtnSleeper = new JRadioButton("Sleeper");
		rdbtnSleeper.setFont(new Font("Tahoma", Font.BOLD, 11));
		rdbtnSleeper.setBounds(166, 177, 77, 23);
		frame.getContentPane().add(rdbtnSleeper);
		
		JRadioButton rdbtnChild = new JRadioButton("Child");
		rdbtnChild.setFont(new Font("Tahoma", Font.BOLD, 11));
		rdbtnChild.setBounds(239, 177, 67, 23);
		frame.getContentPane().add(rdbtnChild);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(22, 128, -68, 436);
		frame.getContentPane().add(separator_3);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setBounds(32, 119, 1, 2);
		frame.getContentPane().add(separator_4);
		
		JSeparator separator_5 = new JSeparator();
		separator_5.setBackground(Color.BLACK);
		separator_5.setBounds(22, 132, 294, 2);
		frame.getContentPane().add(separator_5);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Andhra Pradesh", "Arunachal Pradesh", "Assam", "Bihar", "Chhattisgarh", "Goa", "Gujarat", "Haryana", "Himachal Pradesh", "Jammu and Kashmir", "Jharkhand", "Karnataka", "Kerala"}));
		comboBox.setBounds(22, 207, 77, 20);
		frame.getContentPane().add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Andhra Pradesh", "Arunachal Pradesh", "Assam", "Bihar", "Chhattisgarh", "Goa", "Gujarat", "Haryana", "Himachal Pradesh", "Jammu and Kashmir", "Jharkhand", "Karnataka", "Kerala"}));
		comboBox_1.setBounds(120, 207, 77, 20);
		frame.getContentPane().add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		comboBox_2.setBounds(214, 207, 73, 20);
		frame.getContentPane().add(comboBox_2);
		
		JSeparator separator_6 = new JSeparator();
		separator_6.setBounds(22, 258, -74, 14);
		frame.getContentPane().add(separator_6);
		
		JSeparator separator_7 = new JSeparator();
		separator_7.setBackground(Color.BLACK);
		separator_7.setBounds(22, 246, 294, 2);
		frame.getContentPane().add(separator_7);
		
		JLabel lblTax = new JLabel("Tax");
		lblTax.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblTax.setBounds(22, 276, 46, 14);
		frame.getContentPane().add(lblTax);
		
		JLabel label = new JLabel("");
		label.setBounds(79, 366, 46, 14);
		frame.getContentPane().add(label);
		
		JLabel lblSubTotal = new JLabel("Sub Total");
		lblSubTotal.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblSubTotal.setBounds(22, 301, 60, 14);
		frame.getContentPane().add(lblSubTotal);
		
		JLabel lblTotal = new JLabel("Total");
		lblTotal.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblTotal.setBounds(22, 326, 60, 14);
		frame.getContentPane().add(lblTotal);
		
		textField_1 = new JTextField();
		textField_1.setBounds(111, 273, 86, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(111, 298, 86, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(111, 323, 86, 20);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JSeparator separator_8 = new JSeparator();
		separator_8.setBackground(Color.BLACK);
		separator_8.setBounds(22, 353, 294, 2);
		frame.getContentPane().add(separator_8);
		
		JButton btnTotal = new JButton("Total");
		btnTotal.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double tax;

				double sub_total ;

				String va = comboBox_2.getSelectedItem().toString();
				double value=Double.parseDouble(va);
				             //1
				if (rdbtnSingleTicket.isSelected() && rdbtnSleeper.isSelected() && rdbtnAc.isSelected())
				               {
				tax=400;
				textField_1.setText(String.format("%.0f", tax));

				                   sub_total = 3400*value;    
				                   textField_2.setText(String.format("%.0f", sub_total));
				                   textField_3.setText(String.format("%.0f", sub_total+tax));
				               }
				 
				               else if (!rdbtnSingleTicket.isSelected() && rdbtnSleeper.isSelected() && rdbtnAc.isSelected())  
				               {
				                tax=400;
				                textField_1.setText(String.format("%.0f", tax));
				        sub_total = 4000*value;
				        textField_2.setText(String.format("%.0f", sub_total));
				                   textField_3.setText(String.format("%.0f", sub_total+tax));
				               }
				               //2

				               else if (rdbtnSingleTicket.isSelected() && rdbtnSleeper.isSelected() && !rdbtnAc.isSelected())  
				               {
				                tax=200;
				                textField_1.setText(String.format("%.0f", tax));
				        sub_total = 3000*value;
				        textField_2.setText(String.format("%.0f", sub_total));
				                textField_3.setText(String.format("%.0f", sub_total+tax));
				               }
				               else if (!rdbtnSingleTicket.isSelected() && rdbtnSleeper.isSelected() && rdbtnAc.isSelected())  
				               {
				                tax=200;
				                textField_1.setText(String.format("%.0f", tax));
				        sub_total = 3400*value;
				        textField_2.setText(String.format("%.0f", sub_total));
				                textField_3.setText(String.format("%.0f", sub_total+tax));
				               }
				                  //3
				               else if (rdbtnSingleTicket.isSelected() && !rdbtnSleeper.isSelected() && rdbtnAc.isSelected())  
				               {
				                tax=400;
				                textField_1.setText(String.format("%.0f", tax));
				        sub_total = 3200*value;
				        textField_2.setText(String.format("%.0f", sub_total));
				                textField_3.setText(String.format("%.0f", sub_total+tax));
				               }
				               else if (!rdbtnSingleTicket.isSelected() && !rdbtnSleeper.isSelected() && rdbtnAc.isSelected())  
				               {
				               tax=400;
				               textField_1.setText(String.format("%.0f", tax));
				        sub_total = 3800*value;
				        textField_2.setText(String.format("%.0f", sub_total));
				                textField_3.setText(String.format("%.0f", sub_total+tax));
				               }
				                    //4
				               else if (rdbtnSingleTicket.isSelected() && !rdbtnSleeper.isSelected() && !rdbtnAc.isSelected())  
				               {
				               tax=200;
				               textField_1.setText(String.format("%.0f", tax));
				        sub_total = 2800*value;
				        textField_2.setText(String.format("%.0f", sub_total));
				                 textField_3.setText(String.format("%.0f", sub_total+tax));
				               }
				               else if  (!rdbtnSingleTicket.isSelected() && !rdbtnSleeper.isSelected() && !rdbtnAc.isSelected()) {
				               tax=200;
				               textField_1.setText(String.format("%.0f", tax));
				               sub_total = 3200*value;
				               textField_2.setText(String.format("%.0f", sub_total));
				                    textField_3.setText(String.format("%.0f", sub_total+tax));
				               }
				               else {
				            	rdbtnStandard.getText();
				            	rdbtnAdult.getText();
				            	rdbtnFirstClass.getText();
				            	rdbtnChild.getText();
				               }
				String name=textField.getText();
				           textField_11.setText(name);
				        String from = comboBox.getSelectedItem().toString();
				textField_4.setText(from);
				String to = comboBox_1.getSelectedItem().toString();

				textField_5.setText(to);
				Calendar timer=Calendar.getInstance();
                timer.getTime();
                SimpleDateFormat tTime=new SimpleDateFormat("HH:mm:ss");
                textField_7.setText(tTime.format(timer.getTime()));
                SimpleDateFormat tdate= new SimpleDateFormat("dd-MMM-yyyy");
                textField_6.setText(tdate.format(timer.getTime()));
                String price=textField_3.getText();
                textField_9.setText(price);
                textField_10.setText("Any");
                ticket++;
                textField_8.setText(String.format("%.0f",ticket ));
             
                
			}
		});
		btnTotal.setBounds(22, 379, 77, 23);
		frame.getContentPane().add(btnTotal);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
				rdbtnStandard.setSelected(false);
				rdbtnAdult.setSelected(false);
				rdbtnFirstClass.setSelected(false);
				rdbtnChild.setSelected(false);
				
				textField_1.setText(null);
				textField_2.setText(null);
				textField_3.setText(null);
				textField_11.setText(null);
				textField_4.setText(null);
				textField_5.setText(null);
				textField_9.setText(null);
				textField_10.setText(null);
				textField_6.setText(null);
				textField_7.setText(null);
				textField_8.setText(null);


			}
		});
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnReset.setBounds(111, 379, 77, 23);
		frame.getContentPane().add(btnReset);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(JOptionPane.showConfirmDialog(frame,"Do you want to Exit?","Exit",JOptionPane.YES_OPTION)==JOptionPane.YES_NO_OPTION)
				{
				System.exit(0);
				}
			}
		});
		btnExit.setBounds(198, 379, 89, 23);
		frame.getContentPane().add(btnExit);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0), 2), "Ticket Detail", TitledBorder.CENTER, TitledBorder.TOP, null, null));
		panel_1.setBounds(338, 88, 395, 352);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblFrom = new JLabel("From");
		lblFrom.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblFrom.setBounds(23, 104, 46, 14);
		panel_1.add(lblFrom);
		
		JLabel lblTo = new JLabel("To");
		lblTo.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblTo.setBounds(23, 148, 46, 14);
		panel_1.add(lblTo);
		
		JLabel lblDate = new JLabel("Date");
		lblDate.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblDate.setBounds(23, 194, 46, 14);
		panel_1.add(lblDate);
		
		JLabel lblTime = new JLabel("Time");
		lblTime.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblTime.setBounds(23, 236, 46, 14);
		panel_1.add(lblTime);
		
		textField_4 = new JTextField();
		textField_4.setBounds(79, 102, 86, 20);
		panel_1.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(79, 146, 86, 20);
		panel_1.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(79, 192, 86, 20);
		panel_1.add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setBounds(79, 230, 86, 20);
		panel_1.add(textField_7);
		textField_7.setColumns(10);
		
		JLabel lblTicketNo = new JLabel("Ticket No");
		lblTicketNo.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblTicketNo.setBounds(268, 105, 65, 14);
		panel_1.add(lblTicketNo);
		
		textField_8 = new JTextField();
		textField_8.setBounds(255, 128, 86, 20);
		panel_1.add(textField_8);
		textField_8.setColumns(10);
		
		JLabel lblPrice = new JLabel("Price");
		lblPrice.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPrice.setBounds(278, 159, 46, 14);
		panel_1.add(lblPrice);
		
		textField_9 = new JTextField();
		textField_9.setBounds(255, 184, 86, 20);
		panel_1.add(textField_9);
		textField_9.setColumns(10);
		
		JLabel lblRoute = new JLabel("Route");
		lblRoute.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblRoute.setBounds(278, 215, 46, 14);
		panel_1.add(lblRoute);
		
		textField_10 = new JTextField();
		textField_10.setBounds(255, 234, 86, 20);
		panel_1.add(textField_10);
		textField_10.setColumns(10);
		
		textField_11 = new JTextField();
		textField_11.setBounds(95, 28, 125, 27);
		panel_1.add(textField_11);
		textField_11.setColumns(10);
		
		JLabel lblName_1 = new JLabel("Name");
		lblName_1.setBounds(23, 30, 67, 18);
		panel_1.add(lblName_1);
		lblName_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JButton btnConfirm = new JButton("Confirm");
		btnConfirm.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnConfirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String a;
				if(rdbtnAc.isSelected() && rdbtnSleeper.isSelected())
				{
				a="AC/Sleeper";
				}
				else if(rdbtnAc.isSelected() && !rdbtnSleeper.isSelected())
				{
				a="AC/Seater";
				}
				else if(!rdbtnAc.isSelected() && rdbtnSleeper.isSelected())
				{
				a="Non AC/Sleeper";
				}
				else
				{
				a="Non AC/Seater";
				}
				DefaultTableModel model=(DefaultTableModel)table.getModel();
				model.addRow(new String[]
				{
				
						textField.getText(),
						textField_8.getText(),
						textField_4.getText(),
						textField_5.getText(),
						(String) comboBox_2.getSelectedItem(),
						textField_7.getText(),
						textField_6.getText(),
						a,
						textField_9.getText(),
						
						
						
				});

			}			
		});
		btnConfirm.setBounds(157, 294, 89, 23);
		panel_1.add(btnConfirm);
		
		JSeparator separator_9 = new JSeparator();
		separator_9.setBounds(297, 128, 0, 312);
		frame.getContentPane().add(separator_9);
		
		JSeparator separator_10 = new JSeparator();
		separator_10.setBounds(297, 128, 1, 312);
		frame.getContentPane().add(separator_10);
		
		JSeparator separator_11 = new JSeparator();
		separator_11.setBackground(Color.BLACK);
		separator_11.setBounds(327, 128, 1, 312);
		frame.getContentPane().add(separator_11);
		
		JSeparator separator_12 = new JSeparator();
		separator_12.setBackground(Color.BLACK);
		separator_12.setBounds(327, 132, 1, 308);
		frame.getContentPane().add(separator_12);
		
		JSeparator separator_13 = new JSeparator();
		separator_13.setBackground(Color.BLACK);
		separator_13.setBounds(333, 132, 1, 308);
		frame.getContentPane().add(separator_13);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.BLUE);
		panel_2.setBounds(22, 466, 711, 96);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Name", "Booking No", "From", "To", "No of Seats", "Time", "Date", "AC/ Non-AC", "Price"},
				
			},
			new String[] {
					"Name", "Booking No", "From", "To", "No of Seats", "Time", "Date", "AC/ Non-AC", "Price"
			}
		));
		table.setBounds(10, 11, 691, 67);
		panel_2.add(table);
	}
}
