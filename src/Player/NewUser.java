package Player;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.InputStream;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
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
	private JButton button, button_1;

//	Create the frame.
	
	public NewUser() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Font QuillSwordB = null;
		Font QuillSwordB2 = null;
		Font QuillSwordB3 = null;
		try {
			InputStream is = getClass().getResourceAsStream("../fonts/QuillSword-0Z24.otf");
			InputStream is2 = getClass().getResourceAsStream("../fonts/QuillSword-0Z24.otf");
			InputStream is3 = getClass().getResourceAsStream("../fonts/QuillSword-0Z24.otf");
			QuillSwordB = Font.createFont(Font.TRUETYPE_FONT, is).deriveFont(Font.BOLD, 60);
			QuillSwordB2 = Font.createFont(Font.TRUETYPE_FONT, is2).deriveFont(Font.BOLD, 25);
			QuillSwordB3 = Font.createFont(Font.TRUETYPE_FONT, is3).deriveFont(Font.BOLD, 20);
		} catch (FontFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		setBounds(100, 100, 1366, 1080);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));

		contentPane.setBorder(new CompoundBorder());

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		panel = new JPanel();
		panel.setBackground(new Color(0, 0, 0));
		panel.setBounds(391, 42, 562, 620);
		contentPane.add(panel);
		
		JLabel lblNewLabel_2 = new JLabel("Create Account");
		lblNewLabel_2.setBounds(93, 11, 347, 68);
		lblNewLabel_2.setBackground(new Color(0, 0, 0));
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		panel.add(lblNewLabel_2);
		lblNewLabel_2.setFont(QuillSwordB);
				
		JLabel lblFirstName = new JLabel("First Name");
		lblFirstName.setForeground(Color.WHITE);
		lblFirstName.setFont(new Font("Verdana", Font.BOLD, 15));
		lblFirstName.setBackground(Color.WHITE);
		lblFirstName.setBounds(104, 92, 103, 34);
		lblFirstName.setFont(QuillSwordB2);
		panel.add(lblFirstName);
		
		JLabel lblLastName = new JLabel("Last Name");
		lblLastName.setForeground(Color.WHITE);
		lblLastName.setFont(new Font("Verdana", Font.BOLD, 15));
		lblLastName.setBackground(Color.WHITE);
		lblLastName.setBounds(104, 193, 103, 27);
		lblLastName.setFont(QuillSwordB2);
		panel.add(lblLastName);
		
		JLabel lblNewLabel = new JLabel("Username");
		lblNewLabel.setBounds(104, 285, 103, 27);
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBackground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Verdana", Font.BOLD, 15));
		lblNewLabel.setFont(QuillSwordB2);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Password");
		lblNewLabel_1.setBounds(104, 377, 103, 27);
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Verdana", Font.BOLD, 15));
		lblNewLabel_1.setFont(QuillSwordB2);
		panel.add(lblNewLabel_1);
				
		button = new JButton("Register");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button.setBounds(201, 513, 148, 34);
		button.setFont(new Font("Verdana", Font.BOLD, 15));
		panel.setLayout(null);
		button.setForeground(new Color(255, 255, 255));
		button.setBackground(new Color(192, 192, 192));
		button.setFont(QuillSwordB3);
		panel.add(button);
		
		JLabel lblNewLabel_3 = new JLabel("Already Registered?");
		lblNewLabel_3.setFont(new Font("Verdana", Font.BOLD, 15));
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setBounds(144, 572, 173, 27);
		lblNewLabel_3.setFont(QuillSwordB2);
		panel.add(lblNewLabel_3);
				
		button_1 = new JButton("Login");
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
		button_1.setForeground(new Color(0, 128, 255));
		button_1.setBackground(new Color(0, 0, 0));
		button_1.setBounds(327, 572, 77, 22);
		button_1.setFont(QuillSwordB3);
		panel.add(button_1);
		
		textField = new JTextField();
		textField.setBounds(104, 323, 315, 34);
		panel.add(textField);
		textField.setColumns(10);
				
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(104, 231, 315, 34);
		panel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(104, 137, 315, 34);
		panel.add(textField_2);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(104, 415, 315, 34);
		panel.add(passwordField);
	}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	
}
}
