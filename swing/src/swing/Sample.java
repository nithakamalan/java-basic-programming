package swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JCheckBox;
import javax.swing.JTabbedPane;

public class Sample {

	private JFrame frame;
	private JTextField txtUserName;
	private JTextField txtPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sample window = new Sample();
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
	public Sample() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Login page");
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame.getContentPane().setForeground(Color.LIGHT_GRAY);                            //frame container
		frame.getContentPane().setFont(new Font("Verdana", Font.PLAIN, 11));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		txtUserName = new JTextField();
		txtUserName.setFont(new Font("Arial", Font.PLAIN, 14));
		txtUserName.setText("User Name");
		txtUserName.setBounds(242, 39, 129, 39);                                             // first field
		frame.getContentPane().add(txtUserName);
		txtUserName.setColumns(10);
		
		txtPassword = new JPasswordField();
		txtPassword.setFont(new Font("Arial", Font.PLAIN, 14));
		txtPassword.setText("Password");
		txtPassword.setBounds(242, 106, 129, 32);
		frame.getContentPane().add(txtPassword);
		txtPassword.setColumns(10);
		
		JLabel lblUserName = new JLabel("User Name");
		lblUserName.setFont(new Font("Arial", Font.PLAIN, 13));
		lblUserName.setBounds(78, 52, 102, 14);
		frame.getContentPane().add(lblUserName);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Arial", Font.PLAIN, 13));
		lblPassword.setBounds(78, 115, 65, 14);
		frame.getContentPane().add(lblPassword);
		
		JCheckBox chckbxRemember = new JCheckBox("Remember");
		chckbxRemember.setBounds(242, 145, 97, 23);
		frame.getContentPane().add(chckbxRemember);
		
		JButton btnSignIn = new JButton("Sign In");
		btnSignIn.setBackground(Color.GRAY);
		btnSignIn.setForeground(Color.RED);
		btnSignIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSignIn.setFont(new Font("Arial", Font.BOLD, 13));
		btnSignIn.setBounds(78, 198, 89, 23);
		frame.getContentPane().add(btnSignIn);
		
		JButton btnSignUp = new JButton("Sign Up");
		btnSignUp.setBackground(Color.GRAY);
		btnSignUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSignUp.setForeground(Color.BLUE);
		btnSignUp.setFont(new Font("Arial", Font.BOLD, 13));
		btnSignUp.setBounds(242, 199, 89, 23);
		frame.getContentPane().add(btnSignUp);
	}
}
