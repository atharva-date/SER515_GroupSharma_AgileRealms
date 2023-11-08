package Player;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.JTextArea;

public class Guide extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Guide frame = new Guide();
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
	public Guide() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1366, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
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
		profileButton.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/images/user.png")).getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH)));
		profileButton.setForeground(Color.WHITE);
		profileButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UpdateLogin screen = new UpdateLogin();
				screen.setVisible(true);
				dispose();
			}
		});
		profileButton.setFont(new Font("ArnoldBoeD", Font.PLAIN, 30));
		profileButton.setBorder(null);
		profileButton.setBackground(Color.BLACK);
		profileButton.setBounds(1275, 0, 77, 77);
		NavBar.add(profileButton);
		
		//body
		JPanel Body = new JPanel();
		Body.setForeground(Color.BLACK);
		Body.setBorder(new LineBorder(new Color(128, 128, 128), 3));
		Body.setBackground(Color.BLACK);
		Body.setBounds(0, 77, 1352, 506);
		contentPane.add(Body);
		Body.setLayout(null);
		
		JLabel lblMasteringScrum = new JLabel("Mastering SCRUM:");
		lblMasteringScrum.setHorizontalAlignment(SwingConstants.CENTER);
		lblMasteringScrum.setForeground(Color.WHITE);
		lblMasteringScrum.setFont(new Font("ArnoldBoeD", Font.PLAIN, 25));
		lblMasteringScrum.setBounds(884, 297, 300, 31);
		Body.add(lblMasteringScrum);
		
		JLabel lblUnderstandingTheRoles = new JLabel("Understanding the roles");
		lblUnderstandingTheRoles.setHorizontalAlignment(SwingConstants.CENTER);
		lblUnderstandingTheRoles.setForeground(Color.WHITE);
		lblUnderstandingTheRoles.setFont(new Font("ArnoldBoeD", Font.PLAIN, 25));
		lblUnderstandingTheRoles.setBounds(202, 297, 300, 25);
		Body.add(lblUnderstandingTheRoles);
		
		JLabel guideheading = new JLabel("Game Guide");
		guideheading.setHorizontalAlignment(SwingConstants.CENTER);
		guideheading.setForeground(new Color(255, 255, 255));
		guideheading.setFont(new Font("ArnoldBoeD", Font.PLAIN, 35));
		guideheading.setBounds(577, 10, 196, 43);
		Body.add(guideheading);
		
		JLabel gIcon1 = new JLabel("");
		gIcon1.setIcon(new ImageIcon(Guide.class.getResource("/images/3.jpg")));
		gIcon1.setBackground(new Color(255, 255, 0));
		gIcon1.setBounds(542, 69, 300, 228);
		Body.add(gIcon1);
		
		JLabel gIcon2 = new JLabel("");
		gIcon2.setHorizontalAlignment(SwingConstants.CENTER);
		gIcon2.setIcon(new ImageIcon(Guide.class.getResource("/images/g2.jpg")));
		gIcon2.setBounds(202, 69, 300, 228);
		Body.add(gIcon2);
		
		JLabel gIcon3 = new JLabel("");
		gIcon3.setIcon(new ImageIcon(Guide.class.getResource("/images/g3.jpg")));
		gIcon3.setBounds(884, 69, 300, 228);
		Body.add(gIcon3);
		
		JTextArea gDesc1 = new JTextArea();
		gDesc1.setLineWrap(true);
		gDesc1.setWrapStyleWord(true);
		gDesc1.setText("Learn the basics of the game and understand the fundamental mechanics, roles, and objectives.");
		gDesc1.setForeground(Color.WHITE);
		gDesc1.setFont(new Font("ArnoldBoeD", Font.PLAIN, 16));
		gDesc1.setEditable(false);
		gDesc1.setBackground(Color.BLACK);
		gDesc1.setBounds(542, 322, 300, 109);
		Body.add(gDesc1);
		
		JTextArea gDesc2 = new JTextArea();
		gDesc2.setLineWrap(true);
		gDesc2.setWrapStyleWord(true);
		gDesc2.setText("Familiarize yourself with the four key roles: Scrum Master, Product Owner, Team Member, and Auditor. Each role has unique responsibilities and abilities crucial to the team’s success.");
		gDesc2.setForeground(Color.WHITE);
		gDesc2.setFont(new Font("ArnoldBoeD", Font.PLAIN, 16));
		gDesc2.setEditable(false);
		gDesc2.setBackground(Color.BLACK);		
		gDesc2.setBounds(202, 322, 300, 109);
		Body.add(gDesc2);
		
		JTextArea gDesc3 = new JTextArea();
		gDesc3.setLineWrap(true);
		gDesc3.setWrapStyleWord(true);
		gDesc3.setText("Learn about SCRUM principles such as transparency, inspection, and adaptation. Understand how these principles guide the team's workflow and decision-making processes.");
		gDesc3.setForeground(Color.WHITE);
		gDesc3.setFont(new Font("ArnoldBoeD", Font.PLAIN, 16));
		gDesc3.setEditable(false);
		gDesc3.setBackground(Color.BLACK);	
		gDesc3.setBounds(884, 322, 300, 109);
		Body.add(gDesc3);
		
		JLabel lblIntroduction = new JLabel("Introduction");
		lblIntroduction.setHorizontalAlignment(SwingConstants.CENTER);
		lblIntroduction.setForeground(Color.WHITE);
		lblIntroduction.setFont(new Font("ArnoldBoeD", Font.PLAIN, 25));
		lblIntroduction.setBounds(542, 297, 300, 25);
		Body.add(lblIntroduction);
		
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
