package ScrumMaster;

import java.awt.EventQueue;
import java.awt.Image;
import java.awt.Panel;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.border.LineBorder;

import Player.Customizations;
import Player.Home;
import Player.UpdateLogin;

import javax.swing.JScrollBar;

public class SprintDuration extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SprintDuration frame = new SprintDuration();
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
	public SprintDuration() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1366, 800);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setForeground(new Color(255, 255, 255));
		contentPane.setBorder(new LineBorder(new Color(128, 128, 128), 3));

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
		guideButton.setBorder(null);
		guideButton.setBackground(Color.BLACK);
		guideButton.setBounds(635, 0, 140, 77);
		NavBar.add(guideButton);
		
		JButton customizationsButton = new JButton("Customizations");
		customizationsButton.setForeground(Color.WHITE);
		customizationsButton.setFont(new Font("ArnoldBoeD", Font.PLAIN, 30));
		customizationsButton.setBorder(null);
		customizationsButton.setBackground(Color.BLACK);
		customizationsButton.setBounds(803, 0, 252, 77);
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
		playnowButton.setBorder(null);
		playnowButton.setBackground(Color.BLACK);
		playnowButton.setBounds(1090, 0, 164, 77);
		NavBar.add(playnowButton);
		
		JButton homeButton = new JButton("AgileRealms");
		homeButton.setForeground(Color.WHITE);
		homeButton.setFont(new Font("ArnoldBoeD", Font.PLAIN, 45));
		homeButton.setBorder(null);
		homeButton.setBackground(Color.BLACK);
		homeButton.setBounds(10, 0, 298, 56);
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
		
		JPanel panel_SM = new JPanel();
		panel_SM.setBorder(new LineBorder(new Color(128, 128, 128), 3));
		panel_SM.setBackground(new Color(0, 0, 0));
		panel_SM.setBounds(0, 78, 1283, 70);
		contentPane.add(panel_SM);
		panel_SM.setLayout(null);
		
		JLabel lbl_Scrum_Master = new JLabel("SCRUM Master");
		lbl_Scrum_Master.setForeground(new Color(255, 255, 255));
		lbl_Scrum_Master.setFont(new Font("Tahoma", Font.PLAIN, 33));
		lbl_Scrum_Master.setBounds(10, 11, 217, 48);
		panel_SM.add(lbl_Scrum_Master);		
				
		JLabel lbl_Sprint_Duration = new JLabel("Define Sprint Duration");
		lbl_Sprint_Duration.setFont(new Font("Tahoma", Font.PLAIN, 35));
		lbl_Sprint_Duration.setForeground(Color.WHITE);
		lbl_Sprint_Duration.setBounds(500, 161, 369, 62);
		contentPane.add(lbl_Sprint_Duration);
		
		JButton btn_Set_Duration = new JButton("Set Sprint Duration");
		btn_Set_Duration.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btn_Set_Duration.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BacklogMgmt screen = new BacklogMgmt();
				screen.setVisible(true);
				dispose();
			}
		});
		btn_Set_Duration.setBounds(543, 406, 273, 62);
		contentPane.add(btn_Set_Duration);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField.setBounds(595, 234, 151, 55);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JRadioButton rdbtnRadioButton_Months = new JRadioButton("Months");
		rdbtnRadioButton_Months.setForeground(Color.WHITE);
		rdbtnRadioButton_Months.setBackground(Color.BLACK);
		rdbtnRadioButton_Months.setFont(new Font("Tahoma", Font.PLAIN, 26));
		rdbtnRadioButton_Months.setBounds(862, 324, 117, 47);
		contentPane.add(rdbtnRadioButton_Months);
		
		JRadioButton rdbtnRadioButton_Days = new JRadioButton("Days");
		rdbtnRadioButton_Days.setForeground(Color.WHITE);
		rdbtnRadioButton_Days.setFont(new Font("Tahoma", Font.PLAIN, 26));
		rdbtnRadioButton_Days.setBackground(Color.BLACK);
		rdbtnRadioButton_Days.setBounds(384, 324, 99, 47);
		contentPane.add(rdbtnRadioButton_Days);
		
		JRadioButton rdbtnRadioButton_Weeks = new JRadioButton("Weeks");
		rdbtnRadioButton_Weeks.setForeground(Color.WHITE);
		rdbtnRadioButton_Weeks.setFont(new Font("Tahoma", Font.PLAIN, 26));
		rdbtnRadioButton_Weeks.setBackground(Color.BLACK);
		rdbtnRadioButton_Weeks.setBounds(609, 324, 117, 47);
		contentPane.add(rdbtnRadioButton_Weeks);		

		//footer
		JPanel Footer = new JPanel();
		Footer.setLayout(null);
		Footer.setBorder(new LineBorder(new Color(128, 128, 128), 3));
		Footer.setBackground(Color.BLACK);
		Footer.setBounds(0, 505, 1283, 184);
		contentPane.add(Footer);
		
		JLabel About = new JLabel("About");
		About.setForeground(Color.WHITE);
		About.setFont(new Font("Arial", Font.PLAIN, 13));
		About.setBounds(297, 101, 41, 13);
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
		credits.setBounds(998, 101, 50, 13);
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
