package swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JMenu;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;
import java.awt.Font;

public class Website {

	private JFrame frame;
	/**
	 * @wbp.nonvisual location=-10,9
	 */
	private final JPanel panel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Website window = new Website();
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
	public Website() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 0, 255));
		frame.setBounds(100, 100, 1303, 634);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setBounds(0, 0, 1277, 103);
		frame.getContentPane().add(panel_1);
		
		JButton btnNewButton_3 = new JButton(new ImageIcon("C://Users/USER/Downloads/amazon-256 (1).png"));
		btnNewButton_3.setBounds(70, 11, 353, 81);
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_1.setLayout(null);
		panel_1.add(btnNewButton_3);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(441, 11, 273, 40);
		comboBox_1.setForeground(new Color(0, 0, 0));
		comboBox_1.setBackground(new Color(255, 255, 255));
		comboBox_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"All", "Shoes", "Dresses", "Mobile", "Mobile Accessories", "Shirts"}));
		panel_1.add(comboBox_1);
		
		JButton btnSignIn = new JButton("Sign in");
		btnSignIn.setForeground(Color.BLUE);
		btnSignIn.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		btnSignIn.setBounds(749, 11, 89, 23);
		panel_1.add(btnSignIn);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(10, 453, 138, 132);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JButton btnNewButton = new JButton(new ImageIcon("C://Users/USER/Pictures/viji.jpg"));
		btnNewButton.setBounds(39, 17, 89, 104);
		panel_2.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
			}
		});
		
		JButton btnNewButton_1 = new JButton(new ImageIcon("C:\\Users\\USER\\Downloads\\d-A1_Header._CB1561990782_.gif"));
		btnNewButton_1.setBounds(10, 114, 1285, 328);
		frame.getContentPane().add(btnNewButton_1);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(158, 453, 138, 132);
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JButton btnNewButton_2 = new JButton(new ImageIcon("C://Users/USER/Pictures/81t0srhR6jL._AC_SY200_.jpg"));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2.setBounds(39, 28, 89, 93);
		panel_3.add(btnNewButton_2);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(306, 453, 148, 132);
		frame.getContentPane().add(panel_4);
		panel_4.setLayout(null);
		
		JButton btnNewButton_4 = new JButton("");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_4.setBounds(20, 52, 89, 23);
		panel_4.add(btnNewButton_4);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBounds(464, 453, 138, 132);
		frame.getContentPane().add(panel_5);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBounds(612, 562, 138, -120);
		frame.getContentPane().add(panel_6);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBounds(612, 453, 138, 132);
		frame.getContentPane().add(panel_7);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(105, 147, 318, 48);
		frame.getContentPane().add(comboBox);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Shoes for men", "Shoes for women", "Shirts", "Kurtis", "Crockaries", "Mobile phones", "Cosmetics"}));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
	}
}
