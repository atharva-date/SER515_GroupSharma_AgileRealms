package Player;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.CompoundBorder;
import java.awt.event.*;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;

import java.awt.CardLayout;
import javax.swing.SwingConstants;

public class NewUser extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane, createAccPanel, loginPanel;
	private JTextField passwordField;
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

		setBounds(100, 100, 1366, 700);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));

		contentPane.setBorder(new CompoundBorder());

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		// Layered Panel for New User Account creation and Login Page
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(380, 30, 550, 580);
		contentPane.add(layeredPane);
		layeredPane.setLayout(new CardLayout(0, 0));
		
		// Login Panel
		
		loginPanel = new JPanel();
		loginPanel.setBackground(new Color(0, 0, 0));
		layeredPane.add(loginPanel, "name_361630997658600");
		loginPanel.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("Login");
		lblNewLabel_4.setBounds(102, 11, 135, 78);
		lblNewLabel_4.setBackground(new Color(0, 0, 0));
		lblNewLabel_4.setForeground(new Color(255, 255, 255));
		lblNewLabel_4.setFont(QuillSwordB);
		loginPanel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Username");
		lblNewLabel_5.setBounds(104, 128, 103, 34);
		lblNewLabel_5.setForeground(new Color(255, 255, 255));
		lblNewLabel_5.setBackground(new Color(255, 255, 255));
		lblNewLabel_5.setFont(QuillSwordB2);
		loginPanel.add(lblNewLabel_5);
		
		textField = new JTextField();
		textField.setBounds(104, 173, 315, 34);
		loginPanel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Password");
		lblNewLabel_6.setBounds(102, 243, 103, 32);
		lblNewLabel_6.setForeground(new Color(255, 255, 255));
		lblNewLabel_6.setFont(QuillSwordB2);
		loginPanel.add(lblNewLabel_6);
		
		passwordField = new JTextField();
		passwordField.setBounds(104, 286, 315, 34);
		loginPanel.add(passwordField);
		
		button = new JButton("Sign In");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				Home screen = new Home();
//				screen.setVisible(true);
//				dispose();
				
				String userName = textField.getText();
				String password = passwordField.getText();
				
				System.out.println("iiii " + userName + " " + password);
				try {
			        // Establish the database connection
					try {
					    Class.forName("com.mysql.jdbc.Driver");
					} catch (ClassNotFoundException e1) {
					    e1.printStackTrace();
					}
					
			        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Agile_Realms", "root", "agilerealms");

			        Statement stm = connection.createStatement();
			    	String sql = "SELECT * FROM users WHERE user_name='"+userName+"' and password='"+password+"'";
			    	ResultSet res = stm.executeQuery(sql);
			    	
			    	if(res.next()) {
			    		Home screen = new Home();
						screen.setVisible(true);
						dispose();
			    	}
			    	else {
			    		JOptionPane.showMessageDialog(button, "Username or Password are incorrect");
			    	}
			    	connection.close();
			    }
				catch (SQLException e1) {
			        e1.printStackTrace();
			    }
			}
		});
		button.setActionCommand("Sign In");
		button.setBounds(190, 404, 141, 34);
		button.setForeground(new Color(255, 255, 255));
		loginPanel.setLayout(null);
		button.setBackground(new Color(192, 192, 192));
		button.setFont(QuillSwordB3);
		loginPanel.add(button);
		
		JLabel lblNewLabel_7 = new JLabel("New to AgileRealms?");
		lblNewLabel_7.setForeground(new Color(255, 255, 255));
		lblNewLabel_7.setBounds(118, 470, 192, 32);
		lblNewLabel_7.setFont(QuillSwordB2);
		loginPanel.add(lblNewLabel_7);
		
		button_1 = new JButton("Register");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				layeredPane.removeAll();
				layeredPane.add(createAccPanel);
				layeredPane.repaint();
				layeredPane.revalidate();
			}
		});
		button_1.setBackground(new Color(0, 0, 0));
		button_1.setForeground(new Color(255, 255, 255));
		button_1.setBounds(309, 470, 95, 25);
		button_1.setFont(QuillSwordB3);
		loginPanel.add(button_1);
		
		
		// Create Account Panel
		
		createAccPanel = new JPanel();
		createAccPanel.setBackground(new Color(0, 0, 0));
		layeredPane.add(createAccPanel, "name_361890388473000");
		createAccPanel.setLayout(null);
				
		JLabel lblNewLabel_2 = new JLabel("Create Account");
		lblNewLabel_2.setBounds(93, 11, 347, 68);
		lblNewLabel_2.setBackground(new Color(0, 0, 0));
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		createAccPanel.add(lblNewLabel_2);
		lblNewLabel_2.setFont(QuillSwordB);
		
		JLabel lblFirstName = new JLabel("First Name");
		lblFirstName.setForeground(Color.WHITE);
		lblFirstName.setFont(new Font("Verdana", Font.BOLD, 15));
		lblFirstName.setBackground(Color.WHITE);
		lblFirstName.setBounds(104, 92, 103, 34);
		lblFirstName.setFont(QuillSwordB2);
		createAccPanel.add(lblFirstName);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(104, 137, 315, 34);
		createAccPanel.add(textField_2);
		
		JLabel lblLastName = new JLabel("Last Name");
		lblLastName.setForeground(Color.WHITE);
		lblLastName.setFont(new Font("Verdana", Font.BOLD, 15));
		lblLastName.setBackground(Color.WHITE);
		lblLastName.setBounds(104, 193, 103, 27);
		lblLastName.setFont(QuillSwordB2);
		createAccPanel.add(lblLastName);
				
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(104, 231, 315, 34);
		createAccPanel.add(textField_1);
		
		JLabel lblNewLabel = new JLabel("Username");
		lblNewLabel.setBounds(104, 285, 103, 27);
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBackground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Verdana", Font.BOLD, 15));
		lblNewLabel.setFont(QuillSwordB2);
		createAccPanel.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(104, 323, 315, 34);
		createAccPanel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Password");
		lblNewLabel_1.setBounds(104, 377, 103, 27);
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Verdana", Font.BOLD, 15));
		lblNewLabel_1.setFont(QuillSwordB2);
		createAccPanel.add(lblNewLabel_1);
		
		passwordField = new JTextField();
		passwordField.setBounds(104, 415, 315, 34);
		createAccPanel.add(passwordField);
		
		button = new JButton("Register");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String firstName = textField_2.getText();
				String lastName = textField_1.getText();
				String userName = textField.getText();
                String password = passwordField.getText();
                
                String msg = "" + firstName;
                msg += " \n";
                try {
                    Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Agile_Realms", "root", "agilerealms");

                    String query = "INSERT INTO users values('" + firstName + "','" + lastName + "','" + userName + "','" +
                        password + "')";

                    Statement sta = connection.createStatement();
                    int x = sta.executeUpdate(query);
                    if (x == 0) {
                        JOptionPane.showMessageDialog(button, "User alredy exists");
                    } else {
                        JOptionPane.showMessageDialog(button, "Welcome, " + msg + " to AgileRealms");
                    }
                    connection.close();
					layeredPane.removeAll();
					layeredPane.add(loginPanel);
					layeredPane.repaint();
					layeredPane.revalidate();
                } catch (Exception exception) {
                    exception.printStackTrace();
                }
            }

			}
		);
		button.setBounds(201, 486, 148, 34);
		createAccPanel.setLayout(null);
		button.setForeground(new Color(255, 255, 255));
		button.setBackground(new Color(192, 192, 192));
		button.setFont(QuillSwordB3);
		createAccPanel.add(button);
		
		JLabel lblNewLabel_3 = new JLabel("Already Registered?");
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setBounds(150, 535, 179, 45);
		lblNewLabel_3.setFont(QuillSwordB2);
		createAccPanel.add(lblNewLabel_3);
		
		button = new JButton("Login");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				layeredPane.removeAll();
				layeredPane.add(loginPanel);
				layeredPane.repaint();
				layeredPane.revalidate();
			}
		});
		button.setBackground(new Color(0, 0, 0));
		button.setForeground(new Color(255, 255, 255));
		button.setBounds(330, 542, 80, 25);
		button.setFont(QuillSwordB3);
		createAccPanel.add(button);
	}


@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	
}
}
