package Player;
//import Player.Login;
import java.awt.Button;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.CompoundBorder;

public class NewUser extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPanel panel;
	private JPasswordField passwordField;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

//	Create the frame.
	
	public NewUser() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1366, 1080);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new CompoundBorder());
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		panel = new JPanel();
		panel.setBackground(new Color(0, 0, 0));
		panel.setBounds(391, 40, 562, 600);
		contentPane.add(panel);
		
		JLabel lblNewLabel_2 = new JLabel("Create Account");
		lblNewLabel_2.setBounds(93, 27, 347, 50);
		lblNewLabel_2.setBackground(new Color(0, 0, 0));
		lblNewLabel_2.setFont(new Font("Verdana", Font.BOLD, 40));
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		panel.add(lblNewLabel_2);
				
		JLabel lblFirstName = new JLabel("First Name");
		lblFirstName.setForeground(Color.WHITE);
		lblFirstName.setFont(new Font("Verdana", Font.BOLD, 15));
		lblFirstName.setBackground(Color.WHITE);
		lblFirstName.setBounds(104, 106, 103, 20);
		panel.add(lblFirstName);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(104, 137, 315, 34);
		panel.add(textField_2);
		
		JLabel lblLastName = new JLabel("Last Name");
		lblLastName.setForeground(Color.WHITE);
		lblLastName.setFont(new Font("Verdana", Font.BOLD, 15));
		lblLastName.setBackground(Color.WHITE);
		lblLastName.setBounds(104, 200, 103, 20);
		panel.add(lblLastName);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(104, 231, 315, 34);
		panel.add(textField_1);
		
		JLabel lblNewLabel = new JLabel("Username");
		lblNewLabel.setBounds(104, 292, 103, 20);
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBackground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Verdana", Font.BOLD, 15));
		panel.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(104, 323, 315, 34);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Password");
		lblNewLabel_1.setBounds(104, 384, 103, 20);
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Verdana", Font.BOLD, 15));
		panel.add(lblNewLabel_1);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(104, 415, 315, 34);
		panel.add(passwordField);
				
		Button button = new Button("Register");
		button.setBounds(178, 503, 188, 43);
		button.setFont(new Font("Verdana", Font.BOLD, 15));
		panel.setLayout(null);
		button.setForeground(new Color(255, 255, 255));
		button.setBackground(new Color(192, 192, 192));
		panel.add(button);
		
		JLabel lblNewLabel_3 = new JLabel("Already Registered?");
		lblNewLabel_3.setFont(new Font("Verdana", Font.BOLD, 15));
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setBounds(161, 579, 173, 21);
		panel.add(lblNewLabel_3);
				
		Button button_1 = new Button("Login");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
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
		});
		button_1.setFont(new Font("Verdana", Font.BOLD, 15));
		button_1.setForeground(new Color(0, 128, 255));
		button_1.setBackground(new Color(0, 0, 0));
		button_1.setBounds(342, 580, 67, 21);
		panel.add(button_1);
	}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	
}
}
