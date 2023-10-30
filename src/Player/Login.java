package Player;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Button;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JPasswordField;
import java.awt.event.*;

public class Login extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run(){
				try {
					Login frame = new Login();
					frame.setTitle("User Login");
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

//	Create the frame.
 
	public Login() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1366, 1080);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 0));
		panel.setBounds(391, 110, 533, 500);
		panel.setAlignmentX(CENTER_ALIGNMENT);
		panel.setAlignmentY(CENTER_ALIGNMENT);
		contentPane.add(panel);
		
		JLabel lblNewLabel_2 = new JLabel("Login");
		lblNewLabel_2.setBounds(102, 39, 135, 50);
		lblNewLabel_2.setBackground(new Color(0, 0, 0));
		lblNewLabel_2.setFont(new Font("Verdana", Font.BOLD, 40));
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel = new JLabel("Username");
		lblNewLabel.setBounds(104, 142, 103, 20);
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBackground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Verdana", Font.BOLD, 15));
		panel.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(104, 173, 315, 34);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Password");
		lblNewLabel_1.setBounds(104, 237, 103, 20);
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Verdana", Font.BOLD, 15));
		panel.add(lblNewLabel_1);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(104, 268, 315, 34);
		panel.add(passwordField);
		
		Button button = new Button("Sign In");
		button.setActionCommand("Sign In");
		button.setBounds(176, 400, 188, 43);
		button.setFont(new Font("Verdana", Font.BOLD, 15));
		button.setForeground(new Color(255, 255, 255));

		panel.setLayout(null);
		button.setBackground(new Color(192, 192, 192));
		panel.add(button);
		
		JLabel lblNewLabel_3 = new JLabel("New to AgileRealms?");
		lblNewLabel_3.setFont(new Font("Verdana", Font.BOLD, 15));
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setBounds(141, 457, 181, 32);
		panel.add(lblNewLabel_3);
		
		Button button_1 = new Button("Register");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EventQueue.invokeLater(new Runnable() {
					public void run(){
						try {
							NewUser frame = new NewUser();
							frame.setTitle("New User Registration");
							frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		button_1.setFont(new Font("Verdana", Font.BOLD, 15));
		button_1.setBackground(new Color(0, 0, 0));
		button_1.setForeground(new Color(0, 128, 255));
		button_1.setBounds(332, 465, 80, 20);
		panel.add(button_1);
	}
}
