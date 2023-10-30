package Player;
import Player.Login;
import java.awt.Button;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.border.CompoundBorder;
import java.awt.event.*;

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
		
		textField = new JTextField();
		textField.setBounds(104, 323, 315, 34);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblFirstName = new JLabel("First Name");
		lblFirstName.setForeground(Color.WHITE);
		lblFirstName.setFont(new Font("Verdana", Font.BOLD, 15));
		lblFirstName.setBackground(Color.WHITE);
		lblFirstName.setBounds(104, 106, 103, 20);
		panel.add(lblFirstName);
		
		JLabel lblLastName = new JLabel("Last Name");
		lblLastName.setForeground(Color.WHITE);
		lblLastName.setFont(new Font("Verdana", Font.BOLD, 15));
		lblLastName.setBackground(Color.WHITE);
		lblLastName.setBounds(104, 200, 103, 20);
		panel.add(lblLastName);
		
		JLabel lblNewLabel = new JLabel("Username");
		lblNewLabel.setBounds(104, 292, 103, 20);
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBackground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Verdana", Font.BOLD, 15));
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Password");
		lblNewLabel_1.setBounds(104, 384, 103, 20);
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Verdana", Font.BOLD, 15));
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Create Account");
		lblNewLabel_2.setBounds(93, 27, 347, 50);
		lblNewLabel_2.setBackground(new Color(0, 0, 0));
		lblNewLabel_2.setFont(new Font("Verdana", Font.BOLD, 40));
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		panel.add(lblNewLabel_2);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(104, 415, 315, 34);
		panel.add(passwordField);
		
		Button button = new Button("Register");
		button.setBounds(178, 503, 188, 43);
		button.setFont(new Font("Verdana", Font.BOLD, 15));
		button.setForeground(new Color(255, 255, 255));
		button.addActionListener(new ActionListener() {
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
		panel.setLayout(null);
		button.setBackground(new Color(192, 192, 192));
		panel.add(button);
		
		JLabel lblNewLabel_3 = new JLabel("Already Registered?");
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setFont(new Font("Verdana", Font.BOLD, 15));
		lblNewLabel_3.setBounds(162, 574, 172, 26);
		
		Button hyperlinkLabel = new Button("Login");
		hyperlinkLabel.setForeground(new Color(0, 128, 255));
		hyperlinkLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Login login = new Login();
				login.setVisible(true);
			}
		});
		panel.add(lblNewLabel_3);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(104, 231, 315, 34);
		panel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(104, 137, 315, 34);
		panel.add(textField_2);
		
		JLabel lblNewLabel_3_1 = new JLabel("Login");
		lblNewLabel_3_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		lblNewLabel_3_1.setForeground(new Color(0, 128, 255));
		lblNewLabel_3_1.setFont(new Font("Verdana", Font.BOLD, 15));
		lblNewLabel_3_1.setBounds(344, 577, 53, 20);
		panel.add(lblNewLabel_3_1);
	}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	
}
}
