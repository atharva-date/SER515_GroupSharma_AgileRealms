package Player;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.*;
import java.io.File;
import javax.swing.ImageIcon;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.SwingConstants;
import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import javax.swing.JLayeredPane;
import java.awt.CardLayout;
import javax.swing.JTextField;
import javax.swing.JTextArea;

public class Home extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton customizationsButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home frame = new Home();
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
	public Home() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1366, 800);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
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
		
		customizationsButton = new JButton("Customizations");
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
		
		JPanel Body = new JPanel();
		Body.setForeground(Color.BLACK);
		Body.setBorder(new LineBorder(new Color(128, 128, 128), 3));
		Body.setBackground(Color.BLACK);
		Body.setBounds(0, 77, 1352, 506);
		contentPane.add(Body);
		Body.setLayout(null);
		
		JButton startGame = new JButton("START GAME");
		startGame.setBounds(591, 443, 164, 42);
		startGame.setForeground(Color.WHITE);
		startGame.setFont(new Font("ArnoldBoeD", Font.PLAIN, 20));
		startGame.setBackground(new Color(80, 80, 80));
		startGame.setBorder(null);
		Body.add(startGame);
		
		JTextArea homeDesc2 = new JTextArea();
		homeDesc2.setForeground(new Color(255, 255, 255));
		homeDesc2.setWrapStyleWord(true);
		homeDesc2.setLineWrap(true);
		homeDesc2.setEditable(false);
		homeDesc2.setBackground(new Color(0, 0, 0, 80));
		homeDesc2.setFont(new Font("ArnoldBoeD", Font.PLAIN, 20));
		homeDesc2.setText("Welcome to AgileRealms: heroes of the Backlog, an immersive text-based RPG that transports you into a world where project management becomes a grand adventure. You have the power to shape your destiny by choosing one of the four pivotal roles: Scrum Master, Product Owner, Team Member, or Auditor.");
		homeDesc2.setBounds(292, 318, 769, 115);
		Body.add(homeDesc2);
		
		JLabel homeDesc1 = new JLabel("Where the forces of innovation and teamwork intertwines, a heroic journey beckon.");
		homeDesc1.setForeground(new Color(255, 255, 255));
		homeDesc1.setHorizontalAlignment(SwingConstants.CENTER);
		homeDesc1.setFont(new Font("ArnoldBoeD", Font.PLAIN, 20));
		homeDesc1.setBounds(292, 123, 769, 34);
		homeDesc1.setBackground(new Color(0, 0, 0, 80));
		Body.add(homeDesc1);
		
		JLabel homeHeading = new JLabel("AgileRealms: Heroes of the Backlog");
		homeHeading.setHorizontalAlignment(SwingConstants.CENTER);
		homeHeading.setForeground(Color.WHITE);
		homeHeading.setBackground(new Color(0, 0, 0, 80));
		homeHeading.setFont(new Font("ArnoldBoeD", Font.PLAIN, 30));
		homeHeading.setBounds(292, 10, 769, 73);
		Body.add(homeHeading);
		
		JLabel body_bg = new JLabel("");
		body_bg.setHorizontalAlignment(SwingConstants.CENTER);
		body_bg.setIcon(new ImageIcon(Home.class.getResource("/images/bg.png")));
		body_bg.setBounds(0, 0, 1352, 506);
		Body.add(body_bg);
		
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
