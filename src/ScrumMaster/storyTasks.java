package ScrumMaster;

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

import Player.Customizations;
import Player.Guide;
import Player.Home;
import Player.UpdateLogin;
import javax.swing.JLayeredPane;
import java.awt.CardLayout;

public class storyTasks extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					storyTasks frame = new storyTasks();
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
	public storyTasks() {
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
		
		JPanel gameBar = new JPanel();
		gameBar.setBackground(new Color(128, 128, 128));
		gameBar.setBounds(0, 75, 1352, 83);
		contentPane.add(gameBar);
		
		//Body
		JPanel gameBody = new JPanel();
		gameBody.setForeground(Color.BLACK);
		gameBody.setBorder(new LineBorder(new Color(128, 128, 128), 3));
		gameBody.setBackground(Color.BLACK);
		gameBody.setBounds(0, 156, 1352, 427);
		contentPane.add(gameBody);
		gameBody.setLayout(null);
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(0, 0, 1352, 427);
		gameBody.add(layeredPane);
		layeredPane.setLayout(new CardLayout(0, 0));
		
		JPanel scen1 = new JPanel();
		layeredPane.add(scen1, "name_604559671835300");
		scen1.setLayout(null);
		
		JLayeredPane userStories = new JLayeredPane();
		userStories.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		userStories.setBounds(202, 6, 389, 415);
		scen1.add(userStories);
		userStories.setLayout(new CardLayout(0, 0));
		
		JPanel userStory1 = new JPanel();
		userStory1.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		userStories.add(userStory1, "name_5275133591940");
		
		JPanel userStory2 = new JPanel();
		userStory2.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		userStories.add(userStory2, "name_5303862251932");
		
		JLayeredPane storyTasks = new JLayeredPane();
		storyTasks.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		storyTasks.setBounds(603, 6, 498, 415);
		scen1.add(storyTasks);
		storyTasks.setLayout(new CardLayout(0, 0));
		
		JPanel task1 = new JPanel();
		task1.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		storyTasks.add(task1, "name_5361039453248");
		
		JPanel task2 = new JPanel();
		task2.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		storyTasks.add(task2, "name_5366599599924");
		
		JPanel scen2 = new JPanel();
		layeredPane.add(scen2, "name_604613468509000");
		
		JPanel scen3 = new JPanel();
		layeredPane.add(scen3, "name_604626520416300");
		
		JPanel scen4 = new JPanel();
		layeredPane.add(scen4, "name_604628558611100");
		
		JPanel scen5 = new JPanel();
		layeredPane.add(scen5, "name_604630392724600");
		
		JPanel scen6 = new JPanel();
		layeredPane.add(scen6, "name_604635380688100");
		
		JPanel scen7 = new JPanel();
		layeredPane.add(scen7, "name_604637635726600");
		
		JPanel scen8 = new JPanel();
		layeredPane.add(scen8, "name_604639813553500");
		
		JPanel scen9 = new JPanel();
		layeredPane.add(scen9, "name_604646810643500");
		
		JPanel scen10 = new JPanel();
		layeredPane.add(scen10, "name_604649099355100");
		
		
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
