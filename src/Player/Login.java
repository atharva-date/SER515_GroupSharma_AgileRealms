package Player;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Button;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.FontFormatException;

import javax.swing.JPasswordField;
import java.awt.event.*;
import java.io.IOException;
import java.io.InputStream;

public class Login extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;
	private JButton button_1, button;

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
		
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 0));
		panel.setBounds(391, 94, 533, 516);
		panel.setAlignmentX(CENTER_ALIGNMENT);
		panel.setAlignmentY(CENTER_ALIGNMENT);
		contentPane.add(panel);
		
		JLabel lblNewLabel_2 = new JLabel("Login");
		lblNewLabel_2.setBounds(102, 11, 135, 78);
		lblNewLabel_2.setBackground(new Color(0, 0, 0));
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(QuillSwordB);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel = new JLabel("Username");
		lblNewLabel.setBounds(104, 128, 103, 34);
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBackground(new Color(255, 255, 255));
		lblNewLabel.setFont(QuillSwordB2);
		panel.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(104, 173, 315, 34);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Password");
		lblNewLabel_1.setBounds(102, 243, 103, 32);
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(QuillSwordB2);
		panel.add(lblNewLabel_1);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(104, 286, 315, 34);
		panel.add(passwordField);
		
		button = new JButton("Sign In");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button.setActionCommand("Sign In");
		button.setBounds(190, 404, 141, 34);
		button.setForeground(new Color(255, 255, 255));
		panel.setLayout(null);
		button.setBackground(new Color(192, 192, 192));
		button.setFont(QuillSwordB3);
		panel.add(button);
		
		JLabel lblNewLabel_3 = new JLabel("New to AgileRealms?");
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setBounds(118, 463, 192, 32);
		lblNewLabel_3.setFont(QuillSwordB2);
		panel.add(lblNewLabel_3);
		
		button_1 = new JButton("Register");
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
		button_1.setBackground(new Color(0, 0, 0));
		button_1.setForeground(new Color(0, 128, 255));
		button_1.setBounds(309, 465, 103, 25);
		button_1.setFont(QuillSwordB3);
		panel.add(button_1);
	}
}
