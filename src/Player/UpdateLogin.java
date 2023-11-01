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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class UpdateLogin extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField usernameField;
	private JPasswordField passwordField;
	private JButton ChangePassword;
	private JTextField cusrnm;
	private JTextField nusrnm;
	private JPasswordField opassword;
	private JPasswordField npassword;
	private JPasswordField cfmpassword;
	private JPanel Chngusrnm;
	private JPanel Chngpswrd;

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
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(300, 90, 870, 450);
		contentPane.add(layeredPane);
		layeredPane.setLayout(new CardLayout(0, 0));
		
		JPanel panel = new JPanel();
		layeredPane.add(panel, "name_63381204762209");
		panel.setBorder(null);
		panel.setBackground(new Color(0, 0, 0));
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
		Username.setFont(new Font("Quill Sword", Font.BOLD, 24));
		
		usernameField = new JTextField();
		usernameField.setBounds(460, 233, 200, 26);
		panel.add(usernameField);
		usernameField.setForeground(new Color(0, 0, 0));
		usernameField.setFont(new Font("Quill Sword", Font.PLAIN, 20));
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
		passwordField.setFont(new Font("Quill Sword", Font.PLAIN, 20));
		
		JButton ChangeUsername = new JButton("Change Username");
		ChangeUsername.setBounds(330, 360, 220, 38);
		panel.add(ChangeUsername);
		ChangeUsername.setForeground(new Color(105, 105, 105));
		ChangeUsername.setBackground(new Color(105, 105, 105));
		ChangeUsername.setFont(QuillSwordB);
		ChangeUsername.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layeredPane.removeAll();
				layeredPane.add(Chngusrnm);
				layeredPane.repaint();
				layeredPane.revalidate();
			}
		});
		
		ChangePassword = new JButton("Change Password");
		ChangePassword.setBounds(330, 410, 220, 38);
		panel.add(ChangePassword);
		ChangePassword.setForeground(new Color(105, 105, 105));
		ChangePassword.setFont(QuillSwordB);
		ChangePassword.setBackground(new Color(105, 105, 105));
		ChangePassword.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layeredPane.removeAll();
				layeredPane.add(Chngpswrd);
				layeredPane.repaint();
				layeredPane.revalidate();
			}
		});
		
		Chngusrnm = new JPanel();
		Chngusrnm.setBackground(new Color(0, 0, 0));
		layeredPane.add(Chngusrnm, "name_63528839746167");
		Chngusrnm.setLayout(null);
		
		JLabel CurrentUsername = new JLabel("Current Username");
		CurrentUsername.setBounds(245, 180, 160, 24);
		Chngusrnm.add(CurrentUsername);
		CurrentUsername.setFont(new Font("Quill Sword", Font.BOLD, 24));
		CurrentUsername.setForeground(new Color(254, 255, 255));
		
		JLabel NewUsername = new JLabel("New Username");
		NewUsername.setBounds(245, 230, 160, 24);
		Chngusrnm.add(NewUsername);
		NewUsername.setForeground(new Color(254, 255, 255));
		NewUsername.setFont(new Font("Quill Sword", Font.BOLD, 24));
		
		cusrnm = new JTextField();
		cusrnm.setBounds(470, 179, 200, 26);
		Chngusrnm.add(cusrnm);
		cusrnm.setFont(new Font("Quill Sword", Font.PLAIN, 20));
		cusrnm.setForeground(new Color(0, 0, 0));
		cusrnm.setBackground(new Color(192, 192, 192));
		cusrnm.setColumns(10);
		
		nusrnm = new JTextField();
		nusrnm.setBounds(470, 229, 200, 26);
		Chngusrnm.add(nusrnm);
		nusrnm.setFont(new Font("Quill Sword", Font.PLAIN, 20));
		nusrnm.setColumns(10);
		
		JLabel ChangeUsrnm = new JLabel("Change Username");
		ChangeUsrnm.setBounds(245, 80, 186, 40);
		Chngusrnm.add(ChangeUsrnm);
		ChangeUsrnm.setFont(new Font("Quill Sword", Font.BOLD, 32));
		ChangeUsrnm.setForeground(new Color(254, 255, 255));
		
		JButton saveButton = new JButton("Save Changes");
		saveButton.setBounds(245, 300, 132, 34);
		Chngusrnm.add(saveButton);
		saveButton.setForeground(new Color(105, 105, 105));
		saveButton.setFont(new Font("Quill Sword", Font.BOLD, 24));
		
		JButton cancelButton = new JButton("Cancel");
		cancelButton.setBounds(470, 300, 92, 34);
		Chngusrnm.add(cancelButton);
		cancelButton.setForeground(new Color(105, 105, 105));
		cancelButton.setFont(new Font("Quill Sword", Font.BOLD, 24));
		cancelButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layeredPane.removeAll();
				layeredPane.add(panel);
				layeredPane.repaint();
				layeredPane.revalidate();
			}
		});
		
		Chngpswrd = new JPanel();
		Chngpswrd.setBackground(new Color(0, 0, 0));
		layeredPane.add(Chngpswrd, "name_67999821990916");
		Chngpswrd.setLayout(null);
		
		JLabel ChangePassword = new JLabel("Change Password");
		ChangePassword.setBounds(245, 80, 186, 40);
		Chngpswrd.add(ChangePassword);
		ChangePassword.setFont(new Font("Quill Sword", Font.BOLD, 32));
		ChangePassword.setForeground(new Color(254, 255, 255));
		
		JLabel OldPassword = new JLabel("Old Password");
		OldPassword.setBounds(245, 180, 160, 24);
		Chngpswrd.add(OldPassword);
		OldPassword.setFont(new Font("Quill Sword", Font.BOLD, 24));
		OldPassword.setForeground(new Color(254, 255, 255));
		
		JLabel NewPassword = new JLabel("New Password");
		NewPassword.setBounds(245, 230, 160, 24);
		Chngpswrd.add(NewPassword);
		NewPassword.setForeground(new Color(254, 255, 255));
		NewPassword.setFont(new Font("Quill Sword", Font.BOLD, 24));
		
		JLabel CfrmPassword = new JLabel("Confirm Password");
		CfrmPassword.setBounds(245, 280, 160, 24);
		Chngpswrd.add(CfrmPassword);
		CfrmPassword.setForeground(new Color(254, 255, 255));
		CfrmPassword.setFont(new Font("Quill Sword", Font.BOLD, 24));
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setBounds(245, 350, 92, 34);
		Chngpswrd.add(btnSubmit);
		btnSubmit.setForeground(new Color(105, 105, 105));
		btnSubmit.setFont(new Font("Quill Sword", Font.BOLD, 24));
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setBounds(470, 350, 92, 34);
		Chngpswrd.add(btnCancel);
		btnCancel.setForeground(new Color(105, 105, 105));
		btnCancel.setFont(new Font("Quill Sword", Font.BOLD, 24));
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layeredPane.removeAll();
				layeredPane.add(panel);
				layeredPane.repaint();
				layeredPane.revalidate();
			}
		});
		
		opassword = new JPasswordField();
		opassword.setFont(new Font("Quill Sword", Font.PLAIN, 20));
		opassword.setBounds(470, 178, 200, 26);
		Chngpswrd.add(opassword);
		
		npassword = new JPasswordField();
		npassword.setFont(new Font("Quill Sword", Font.PLAIN, 20));
		npassword.setBounds(470, 228, 200, 26);
		Chngpswrd.add(npassword);
		
		cfmpassword = new JPasswordField();
		cfmpassword.setFont(new Font("Quill Sword", Font.PLAIN, 20));
		cfmpassword.setBounds(470, 278, 200, 26);
		Chngpswrd.add(cfmpassword);
	}
}