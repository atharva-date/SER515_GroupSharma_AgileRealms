package ScrumMaster;

import ScrumMaster.StoryTasks;
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
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import Player.Customizations;
import Player.Home;
import Player.UpdateLogin;

import javax.swing.JTextArea;
import javax.swing.JSplitPane;
import javax.swing.JTabbedPane;
import javax.swing.JTree;
import javax.swing.JList;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.JLayeredPane;
import javax.swing.JTextField;
import java.awt.CardLayout;

public class BacklogMgmt extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BacklogMgmt frame = new BacklogMgmt();
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
	public BacklogMgmt() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1366, 700);
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
		
		
		JLayeredPane LayeredPane_PB = new JLayeredPane();
		LayeredPane_PB.setBounds(175, 159, 1053, 255);
		contentPane.add(LayeredPane_PB);
		LayeredPane_PB.setLayout(new CardLayout(0, 0));
		
		JPanel ProductBacklog_panel = new JPanel();
		LayeredPane_PB.add(ProductBacklog_panel, "name_696851389597800");
		ProductBacklog_panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Product Backlog");
		lblNewLabel.setBounds(361, 18, 249, 43);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 35));
		lblNewLabel.setForeground(new Color(0, 0, 0));
		ProductBacklog_panel.add(lblNewLabel);		

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(54, 72, 989, 170);
		ProductBacklog_panel.add(tabbedPane);
		
				
		JPanel US_1 = new JPanel();
		tabbedPane.addTab("User Story 1", null, US_1, null);
		US_1.setLayout(null);

		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(264, 11, 293, 121);
		US_1.add(layeredPane);
		
		JLayeredPane layeredPane_1 = new JLayeredPane();
		layeredPane_1.setBounds(20, 11, 195, 121);
		US_1.add(layeredPane_1);
				
		JLayeredPane layeredPane_2 = new JLayeredPane();
		layeredPane_2.setBounds(599, 11, 293, 121);
		US_1.add(layeredPane_2);
						
		JLabel AsA_label = new JLabel("As a");
		AsA_label.setFont(new Font("Tahoma", Font.PLAIN, 15));
		AsA_label.setBounds(10, 11, 175, 31);
		layeredPane_1.add(AsA_label);
		
		JLabel IWantTo_label = new JLabel("I want to");
		IWantTo_label.setFont(new Font("Tahoma", Font.PLAIN, 15));
		IWantTo_label.setBounds(10, 11, 175, 31);
		layeredPane.add(IWantTo_label);

		JLabel SoThat_label = new JLabel("So that");
		SoThat_label.setFont(new Font("Tahoma", Font.PLAIN, 15));
		SoThat_label.setBounds(10, 11, 175, 31);
		layeredPane_2.add(SoThat_label);


		textField = new JTextField();
		textField.setBounds(10, 61, 96, 20);
		layeredPane_1.add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(10, 53, 273, 57);
		layeredPane.add(textField_1);				
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(10, 53, 273, 57);
		layeredPane_2.add(textField_2);
		
		JPanel US_2 = new JPanel();
		tabbedPane.addTab("User Story 2", null, US_2, null);
																
		JPanel US_3 = new JPanel();
		tabbedPane.addTab("User Story 3", null, US_3, null);
		
		JPanel AskPO_panel = new JPanel();
		LayeredPane_PB.add(AskPO_panel, "name_696851434058700");
		AskPO_panel.setLayout(null);
	
		JLabel lblNewLabelConv_1 = new JLabel("Conversation with the Product Owner");
		lblNewLabelConv_1.setBounds(238, 27, 587, 43);
		lblNewLabelConv_1.setFont(new Font("Tahoma", Font.PLAIN, 35));
		lblNewLabelConv_1.setForeground(new Color(0, 0, 0));
		AskPO_panel.add(lblNewLabelConv_1);		
				
		JButton btnAskPO_12 = new JButton("Ask about the acceptance criteria");
		btnAskPO_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAskPO_12.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnAskPO_12.setBounds(136, 160, 299, 27);
		AskPO_panel.add(btnAskPO_12);
		
		JButton btnAskPO_13 = new JButton("Potential risks in the upcoming sprint");
		btnAskPO_13.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnAskPO_13.setBounds(136, 99, 299, 27);
		AskPO_panel.add(btnAskPO_13);

		JButton btnAskPO_14 = new JButton("Request clarification for the user story");
		btnAskPO_14.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnAskPO_14.setBounds(607, 99, 323, 27);
		AskPO_panel.add(btnAskPO_14);
		
		JButton btnAskPO_11 = new JButton("Tell me about Top priority user story");
		btnAskPO_11.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnAskPO_11.setBounds(607, 160, 323, 27);
		AskPO_panel.add(btnAskPO_11);
		
		
		
		
		JPanel AskDev_panel = new JPanel();
		LayeredPane_PB.add(AskDev_panel, "name_696851474122400");		
		AskDev_panel.setLayout(null);
		
		JLabel lblNewLabelConv_2 = new JLabel("Conversation with the Developer");
		lblNewLabelConv_2.setForeground(Color.BLACK);
		lblNewLabelConv_2.setBounds(246, 29, 511, 43);
		lblNewLabelConv_2.setFont(new Font("Tahoma", Font.PLAIN, 35));
		AskDev_panel.add(lblNewLabelConv_2);
		
		JButton btnAskDev_11 = new JButton("Tell me about the progress of the user story");
		btnAskDev_11.setBounds(109, 171, 358, 27);
		btnAskDev_11.setFont(new Font("Tahoma", Font.PLAIN, 15));
		AskDev_panel.add(btnAskDev_11);
		
		JButton btnAskDev_12 = new JButton("Discuss any blockers for the user story");
		btnAskDev_12.setBounds(109, 107, 358, 27);
		btnAskDev_12.setFont(new Font("Tahoma", Font.PLAIN, 15));
		AskDev_panel.add(btnAskDev_12);
		
		JButton btnAskDev_13 = new JButton("Potential technical challenges in the user story");
		btnAskDev_13.setBounds(568, 107, 366, 27);
		btnAskDev_13.setFont(new Font("Tahoma", Font.PLAIN, 15));
		AskDev_panel.add(btnAskDev_13);
		
		JButton btnAskDev_14 = new JButton("Request clarification on the user story");
		btnAskDev_14.setBounds(568, 171, 366, 27);
		btnAskDev_14.setFont(new Font("Tahoma", Font.PLAIN, 15));
		AskDev_panel.add(btnAskDev_14);
				

		JButton btnPO = new JButton("Ask Product Owner");
		btnPO.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnPO.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LayeredPane_PB.removeAll();
				LayeredPane_PB.add(AskPO_panel);
				LayeredPane_PB.repaint();
				LayeredPane_PB.revalidate();				
			}
		});
		btnPO.setBounds(467, 426, 209, 43);
		contentPane.add(btnPO);
		
		JButton btnDev = new JButton("Ask Developer");
		btnDev.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LayeredPane_PB.removeAll();
				LayeredPane_PB.add(AskDev_panel);
				LayeredPane_PB.repaint();
				LayeredPane_PB.revalidate();				
			}
		});
		btnDev.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnDev.setBounds(969, 425, 209, 43);
		contentPane.add(btnDev);
		
		JButton btnSeePO = new JButton("See Product Backlog");
		btnSeePO.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LayeredPane_PB.removeAll();
				LayeredPane_PB.add(ProductBacklog_panel);
				LayeredPane_PB.repaint();
				LayeredPane_PB.revalidate();				
			}
		});
		btnSeePO.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnSeePO.setBounds(214, 425, 209, 43);
		contentPane.add(btnSeePO);

		
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
		credits.setBounds(998, 101, 61, 13);
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
		
		JButton btnCreateTasksFor = new JButton("Create Tasks for Backlog");
		btnCreateTasksFor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StoryTasks screen = new StoryTasks();
				screen.setVisible(true);
				dispose();
			}
			
		});
		btnCreateTasksFor.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnCreateTasksFor.setBounds(723, 425, 209, 43);
		contentPane.add(btnCreateTasksFor);

						
		
	}
}
