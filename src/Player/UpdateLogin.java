package Player;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

import java.io.IOException;
import java.io.InputStream;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.*;
import javax.swing.*;
public class UpdateLogin extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField usernameField;
	private JPasswordField passwordField;
	private JTextField txtOldUsername;
	private JButton ChangePassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UpdateLogin frame = new UpdateLogin();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public UpdateLogin() {
		Font QuillSwordB = null;
		try {
			InputStream is = getClass().getResourceAsStream("/fonts/QuillSword-0Z24.otf");
			QuillSwordB = Font.createFont(Font.TRUETYPE_FONT, is).deriveFont(Font.BOLD, 24);
		} catch (FontFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1366, 1400);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(0, 0, 0));
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		Image img = new ImageIcon(this.getClass().getResource("/images/Profile.png")).getImage();
		
		JPanel Footer = new JPanel();
		Footer.setBorder(new LineBorder(new Color(128, 128, 128), 3));
		Footer.setBackground(new Color(0, 0, 0));
		Footer.setBounds(-40, 760, 2500, 560);
		contentPane.add(Footer);
		Footer.setLayout(null);
		
		JLabel About = new JLabel("About");
		About.setFont(new Font("Arial", Font.PLAIN, 13));
		About.setForeground(new Color(255, 255, 255));
		About.setBounds(390, 100, 34, 13);
		Footer.add(About);
		
		JLabel termsOfUse = new JLabel("Terms of Use");
		termsOfUse.setFont(new Font("Arial", Font.PLAIN, 13));
		termsOfUse.setForeground(new Color(255, 255, 255));
		termsOfUse.setBounds(535, 100, 84, 13);
		Footer.add(termsOfUse);
		
		JLabel rulesOfPlay = new JLabel("Rules of Play");
		rulesOfPlay.setForeground(Color.WHITE);
		rulesOfPlay.setFont(new Font("Arial", Font.PLAIN, 13));
		rulesOfPlay.setBounds(731, 100, 78, 13);
		Footer.add(rulesOfPlay);
		
		JLabel privacyPolicy = new JLabel("Privacy Policy");
		privacyPolicy.setForeground(Color.WHITE);
		privacyPolicy.setFont(new Font("Arial", Font.PLAIN, 13));
		privacyPolicy.setBounds(917, 100, 84, 13);
		Footer.add(privacyPolicy);
		
		JLabel credits = new JLabel("Credits");
		credits.setForeground(Color.WHITE);
		credits.setFont(new Font("Arial", Font.PLAIN, 13));
		credits.setBounds(1091, 100, 41, 13);
		Footer.add(credits);
		
		JLabel lblgroupS = new JLabel("©2023 Group Sharma LLC. All rights reserved.");
		lblgroupS.setForeground(Color.WHITE);
		lblgroupS.setFont(new Font("Arial", Font.PLAIN, 13));
		lblgroupS.setBounds(634, 136, 270, 13);
		Footer.add(lblgroupS);
		
		JPanel panel = new JPanel();
		panel.setBorder(null);
		panel.setBackground(new Color(0, 0, 0));
		panel.setBounds(300, 90, 870, 450);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel Usericon = new JLabel("Usericon");
		Usericon.setBounds(374, 50, 130, 143);
		panel.add(Usericon);
		Usericon.setIcon(new ImageIcon(img));
		
		JLabel Username = new JLabel("Username");
		Username.setBounds(330, 238, 85, 25);
		panel.add(Username);
		Username.setBackground(new Color(192, 192, 192));
		Username.setForeground(new Color(254, 255, 255));
		Username.setFont(QuillSwordB);
		
		usernameField = new JTextField();
		usernameField.setBounds(460, 233, 200, 26);
		panel.add(usernameField);
		usernameField.setForeground(new Color(254, 255, 255));
		usernameField.setFont(new Font("Verdana", Font.PLAIN, 14));
		usernameField.setBackground(new Color(254, 255, 255));
		usernameField.setColumns(10);
		
		JLabel Password = new JLabel("Password");
		Password.setBounds(330, 286, 85, 25);
		panel.add(Password);
		Password.setForeground(new Color(254, 255, 255));
		Password.setBackground(new Color(192, 192, 192));
		Password.setFont(QuillSwordB);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(460, 281, 200, 26);
		panel.add(passwordField);
		passwordField.setBackground(new Color(254, 255, 255));
		passwordField.setFont(new Font("Verdana", Font.PLAIN, 14));
		
		JButton ChangeUsername = new JButton("Change Username");
		ChangeUsername.setBounds(330, 360, 220, 38);
		panel.add(ChangeUsername);
		ChangeUsername.setForeground(new Color(105, 105, 105));
		ChangeUsername.setBackground(new Color(105, 105, 105));
		ChangeUsername.setFont(QuillSwordB);
		
		ChangePassword = new JButton("Change Password");
		ChangePassword.setBounds(330, 410, 220, 38);
		panel.add(ChangePassword);
		ChangePassword.setForeground(new Color(105, 105, 105));
		ChangePassword.setFont(QuillSwordB);
		ChangePassword.setBackground(new Color(105, 105, 105));
	}
}
