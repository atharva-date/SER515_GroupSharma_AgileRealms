package Player;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import java.io.IOException;
import java.io.InputStream;
import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class UpdateLogin extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
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
		setBounds(100, 100, 1366, 800);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(0, 0, 0));
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		Image img = new ImageIcon(this.getClass().getResource("/images/Profile.png")).getImage();
		//header
		Panel NavBar = new Panel();
		NavBar.setLayout(null);
		NavBar.setBackground(Color.BLACK);
		NavBar.setBounds(0, 0, 1352, 77);
		contentPane.add(NavBar);
		
		JLabel gameSubHeading = new JLabel("Heroes of the Backlog");
		gameSubHeading.setVerticalAlignment(SwingConstants.TOP);
		gameSubHeading.setHorizontalAlignment(SwingConstants.CENTER);
		gameSubHeading.setForeground(Color.WHITE);
		gameSubHeading.setFont(new Font("ArnoldBoeD", Font.PLAIN, 20));
		gameSubHeading.setBounds(10, 52, 298, 25);
		NavBar.add(gameSubHeading);
		
		JButton guideButton = new JButton("Guide");
		guideButton.setForeground(Color.WHITE);
		guideButton.setFont(new Font("ArnoldBoeD", Font.PLAIN, 30));
		guideButton.setBackground(Color.BLACK);
		guideButton.setBounds(635, 0, 140, 77);
		guideButton.setBorder(null);
		guideButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Guide screen = new Guide();
				screen.setVisible(true);
				dispose();
			}
		});
		NavBar.add(guideButton);
		
		JButton customizationsButton = new JButton("Customizations");
		customizationsButton.setForeground(Color.WHITE);
		customizationsButton.setFont(new Font("ArnoldBoeD", Font.PLAIN, 30));
		customizationsButton.setBackground(Color.BLACK);
		customizationsButton.setBounds(803, 0, 252, 77);
		customizationsButton.setBorder(null);
		customizationsButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Customizations screen = new Customizations();
				screen.setVisible(true);
				dispose();
			}
		});
		NavBar.add(customizationsButton);
		
		JButton playnowButton = new JButton("Play Now");
		playnowButton.setForeground(Color.WHITE);
		playnowButton.setFont(new Font("ArnoldBoeD", Font.PLAIN, 30));
		playnowButton.setBackground(Color.BLACK);
		playnowButton.setBounds(1090, 0, 164, 77);
		playnowButton.setBorder(null);
		NavBar.add(playnowButton);
		
		JButton homeButton = new JButton("AgileRealms");
		homeButton.setForeground(Color.WHITE);
		homeButton.setFont(new Font("ArnoldBoeD", Font.PLAIN, 45));
		homeButton.setBackground(Color.BLACK);
		homeButton.setBounds(10, 0, 298, 56);
		homeButton.setBorder(null);
		homeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Home screen = new Home();
				screen.setVisible(true);
				dispose();
			}
		});
		NavBar.add(homeButton);
		
		JButton profileButton = new JButton("");
		profileButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UpdateLogin screen = new UpdateLogin();
				screen.setVisible(true);
				dispose();
			}
		});
		profileButton.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/images/user.png")).getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH)));
		profileButton.setForeground(Color.WHITE);
		profileButton.setFont(new Font("ArnoldBoeD", Font.PLAIN, 30));
		profileButton.setBorder(null);
		profileButton.setBackground(Color.BLACK);
		profileButton.setBounds(1275, 0, 77, 77);
		NavBar.add(profileButton);
		
		//body
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(301, 99, 870, 450);
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
		Username.setBounds(292, 234, 115, 25);
		panel.add(Username);
		Username.setBackground(new Color(192, 192, 192));
		Username.setForeground(new Color(254, 255, 255));
		Username.setFont(new Font("ArnoldBoeD", Font.BOLD, 24));
		
		JLabel Password = new JLabel("Email ID");
		Password.setBounds(292, 286, 99, 25);
		panel.add(Password);
		Password.setForeground(new Color(254, 255, 255));
		Password.setBackground(new Color(192, 192, 192));
		Password.setFont(new Font("ArnoldBoeD", Font.BOLD, 24));
		
		JButton ChangeUsername = new JButton("Change Username");
		ChangeUsername.setBounds(330, 360, 220, 38);
		panel.add(ChangeUsername);
		ChangeUsername.setForeground(new Color(255, 255, 255));
		ChangeUsername.setBackground(new Color(128, 128, 128));
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
		ChangePassword.setForeground(new Color(255, 255, 255));
		ChangePassword.setFont(QuillSwordB);
		ChangePassword.setBackground(new Color(128, 128, 128));
		
		JLabel User_name = new JLabel("Admin");
		User_name.setFont(new Font("Quill Sword", Font.PLAIN, 20));
		User_name.setForeground(new Color(254, 255, 255));
		User_name.setBackground(new Color(0, 0, 0));
		User_name.setBounds(460, 237, 99, 26);
		panel.add(User_name);
		
		JLabel lblNewLabel = new JLabel("admin_ar@gmail.com");
		lblNewLabel.setForeground(new Color(254, 255, 255));
		lblNewLabel.setBackground(new Color(0, 0, 0));
		lblNewLabel.setFont(new Font("Quill Sword", Font.PLAIN, 20));
		lblNewLabel.setBounds(460, 285, 209, 26);
		panel.add(lblNewLabel);
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
		CurrentUsername.setBounds(228, 179, 215, 41);
		Chngusrnm.add(CurrentUsername);
		CurrentUsername.setFont(new Font("ArnoldBoeD", Font.PLAIN, 24));
		CurrentUsername.setForeground(new Color(254, 255, 255));
		
		JLabel NewUsername = new JLabel("New Username");
		NewUsername.setBounds(228, 230, 200, 26);
		Chngusrnm.add(NewUsername);
		NewUsername.setForeground(new Color(254, 255, 255));
		NewUsername.setFont(new Font("ArnoldBoeD", Font.PLAIN, 24));
		
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
		ChangeUsrnm.setBounds(295, 80, 337, 40);
		Chngusrnm.add(ChangeUsrnm);
		ChangeUsrnm.setFont(new Font("ArnoldBoeD", Font.PLAIN, 30));
		ChangeUsrnm.setForeground(new Color(254, 255, 255));
		
		JButton saveButton = new JButton("Save Changes");
		saveButton.setBackground(new Color(128, 128, 128));
		saveButton.setHorizontalAlignment(SwingConstants.LEFT);
		saveButton.setBounds(228, 300, 187, 34);
		Chngusrnm.add(saveButton);
		saveButton.setForeground(new Color(255, 255, 255));
		saveButton.setFont(new Font("Quill Sword", Font.BOLD, 24));
		
		JButton cancelButton = new JButton("Cancel");
		cancelButton.setBackground(new Color(128, 128, 128));
		cancelButton.setHorizontalAlignment(SwingConstants.LEFT);
		cancelButton.setBounds(565, 300, 105, 34);
		Chngusrnm.add(cancelButton);
		cancelButton.setForeground(new Color(255, 255, 255));
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
		ChangePassword.setHorizontalAlignment(SwingConstants.CENTER);
		ChangePassword.setBounds(278, 80, 302, 40);
		Chngpswrd.add(ChangePassword);
		ChangePassword.setFont(new Font("ArnoldBoeD", Font.BOLD, 32));
		ChangePassword.setForeground(new Color(254, 255, 255));
		
		JLabel OldPassword = new JLabel("Old Password");
		OldPassword.setBounds(192, 180, 213, 24);
		Chngpswrd.add(OldPassword);
		OldPassword.setFont(new Font("ArnoldBoeD", Font.BOLD, 24));
		OldPassword.setForeground(new Color(254, 255, 255));
		
		JLabel NewPassword = new JLabel("New Password");
		NewPassword.setBounds(192, 230, 213, 24);
		Chngpswrd.add(NewPassword);
		NewPassword.setForeground(new Color(254, 255, 255));
		NewPassword.setFont(new Font("ArnoldBoeD", Font.BOLD, 24));
		
		JLabel CfrmPassword = new JLabel("Confirm Password");
		CfrmPassword.setBounds(192, 280, 213, 24);
		Chngpswrd.add(CfrmPassword);
		CfrmPassword.setForeground(new Color(254, 255, 255));
		CfrmPassword.setFont(new Font("ArnoldBoeD", Font.BOLD, 24));
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setBackground(new Color(128, 128, 128));
		btnSubmit.setHorizontalAlignment(SwingConstants.LEFT);
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSubmit.setBounds(192, 350, 116, 34);
		Chngpswrd.add(btnSubmit);
		btnSubmit.setForeground(new Color(255, 255, 255));
		btnSubmit.setFont(new Font("Quill Sword", Font.BOLD, 24));
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setBackground(new Color(128, 128, 128));
		btnCancel.setHorizontalAlignment(SwingConstants.LEFT);
		btnCancel.setBounds(561, 350, 109, 34);
		Chngpswrd.add(btnCancel);
		btnCancel.setForeground(new Color(255, 255, 255));
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
		

		//footer
		JPanel Footer = new JPanel();
		Footer.setLayout(null);
		Footer.setBorder(new LineBorder(new Color(128, 128, 128), 3));
		Footer.setBackground(Color.BLACK);
		Footer.setBounds(0, 579, 1352, 184);
		contentPane.add(Footer);
		
		JLabel About = new JLabel("About");
		About.setForeground(Color.WHITE);
		About.setFont(new Font("Arial", Font.PLAIN, 13));
		About.setBounds(297, 101, 33, 13);
		Footer.add(About);
		
		JLabel termsOfUse = new JLabel("Terms of Use");
		termsOfUse.setForeground(Color.WHITE);
		termsOfUse.setFont(new Font("Arial", Font.PLAIN, 13));
		termsOfUse.setBounds(442, 101, 84, 13);
		Footer.add(termsOfUse);
		
		JLabel rulesOfPlay = new JLabel("Rules of Play");
		rulesOfPlay.setForeground(Color.WHITE);
		rulesOfPlay.setFont(new Font("Arial", Font.PLAIN, 13));
		rulesOfPlay.setBounds(638, 101, 77, 13);
		Footer.add(rulesOfPlay);
		
		JLabel privacyPolicy = new JLabel("Privacy Policy");
		privacyPolicy.setForeground(Color.WHITE);
		privacyPolicy.setFont(new Font("Arial", Font.PLAIN, 13));
		privacyPolicy.setBounds(824, 101, 84, 13);
		Footer.add(privacyPolicy);
		
		JLabel credits = new JLabel("Credits");
		credits.setForeground(Color.WHITE);
		credits.setFont(new Font("Arial", Font.PLAIN, 13));
		credits.setBounds(998, 101, 41, 13);
		Footer.add(credits);
		
		JLabel lblgroupS = new JLabel("©2023 Group Sharma LLC. All rights reserved.");
		lblgroupS.setForeground(Color.WHITE);
		lblgroupS.setFont(new Font("Arial", Font.PLAIN, 13));
		lblgroupS.setBounds(543, 136, 269, 13);
		Footer.add(lblgroupS);
		
		JButton sendTop = new JButton("");
		sendTop.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/images/smallWhiteArrowUp.png")).getImage().getScaledInstance(26, 29, Image.SCALE_SMOOTH)));
		sendTop.setForeground(Color.BLACK);
		sendTop.setFont(new Font("Arial", Font.PLAIN, 13));
		sendTop.setBackground(Color.BLACK);
		sendTop.setBounds(663, 35, 26, 29);
		Footer.add(sendTop);
	}
}