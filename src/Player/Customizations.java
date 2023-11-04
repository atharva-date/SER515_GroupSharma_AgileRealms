package Player;
import java.awt.EventQueue;
import java.io.InputStream;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JToolBar;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.SpringLayout;
import java.awt.BorderLayout;
import javax.swing.JToggleButton;
import java.awt.Panel;
import java.io.File;
import java.awt.Color;
import javax.swing.border.LineBorder;

import ProductOwner.UserStories;
import ScrumMaster.SprintDuration;

import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import javax.swing.UIManager;
import javax.swing.JMenuBar;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import javax.swing.JTextArea;
import java.awt.ScrollPane;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JLayeredPane;
import java.awt.CardLayout;
import java.awt.Button;

public class Customizations extends JFrame {
	

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPanel SM_panel;
	private JPanel PO_panel;
	private JPanel TM_panel;
	private JPanel Auditor_panel;
	private JButton sm_button;
	int button_num = 1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Customizations frame = new Customizations();
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
	public Customizations() {
		
        JLabel label = new JLabel("Hello, World!");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1366, 800);
		contentPane = new JPanel();
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
		guideButton.setBorder(null);
		guideButton.setBackground(Color.BLACK);
		guideButton.setBounds(635, 0, 140, 77);
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
		
		JPanel Body = new JPanel();
		Body.setForeground(new Color(0, 0, 0));
		Body.setBackground(new Color(0, 0, 0));
		Body.setBorder(new LineBorder(new Color(128, 128, 128), 3));
		Body.setBounds(0, 77, 1352, 506);
		contentPane.add(Body);
		Body.setLayout(null);
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBorder(new LineBorder(new Color(128, 128, 128), 1, true));
		layeredPane.setBounds(290, 22, 776, 334);
		Body.add(layeredPane);
		layeredPane.setLayout(new CardLayout(0, 0));
		
		SM_panel = new JPanel();
		SM_panel.setBackground(new Color(0, 0, 0));
		layeredPane.add(SM_panel, "name_254978624573000");
		SM_panel.setLayout(null);
		
		JLabel role_sm = new JLabel("SCRUM Master");
		role_sm.setVerticalAlignment(SwingConstants.TOP);
		role_sm.setHorizontalAlignment(SwingConstants.LEFT);
		role_sm.setForeground(new Color(0, 206, 209));
		role_sm.setFont(new Font("ArnoldBoeD", Font.PLAIN, 40));
		role_sm.setBounds(10, 0, 273, 43);
		SM_panel.add(role_sm);
		
		JTextArea sm_desc = new JTextArea();
		sm_desc.setWrapStyleWord(true);
		sm_desc.setText("As the Scrum Master in AgileRealms, you are the guardian of Agile principles, a beacon of guidance for your team. Your primary mission is to ensure the Agile process runs Smoothly, allowing you team to work at its best. You facilitate daily stand-up meetings, sprint planning, and retrospectives, fostering effective communication and collaboration. With your leadership, impediments are swiftly removed, and the path to project success is cleared. AgileRealms depends on your expertise and wisdom to lead the way.");
		sm_desc.setLineWrap(true);
		sm_desc.setForeground(Color.WHITE);
		sm_desc.setFont(new Font("ArnoldBoeD", Font.PLAIN, 20));
		sm_desc.setEditable(false);
		sm_desc.setBackground(Color.BLACK);
		sm_desc.setBounds(10, 53, 617, 221);
		SM_panel.add(sm_desc);
		
		JLabel sm_trait = new JLabel("Traits: Leadership, Problem Solver, Empathy and communication");
		sm_trait.setForeground(new Color(80, 80, 80));
		sm_trait.setFont(new Font("ArnoldBoeD", Font.PLAIN, 20));
		sm_trait.setBounds(10, 264, 626, 61);
		SM_panel.add(sm_trait);
		
		JLabel sm_img = new JLabel("");
		sm_img.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/images/scrumMaster.png")).getImage().getScaledInstance(145, 315, Image.SCALE_SMOOTH)));
		sm_img.setHorizontalAlignment(SwingConstants.CENTER);
		sm_img.setForeground(Color.WHITE);
		sm_img.setBounds(628, 10, 145, 315);
		SM_panel.add(sm_img);
		
		PO_panel = new JPanel();
		PO_panel.setBackground(new Color(0, 0, 0));
		layeredPane.add(PO_panel, "name_254989202407000");
		PO_panel.setLayout(null);
		
		JLabel role_po = new JLabel("Product Owner");
		role_po.setVerticalAlignment(SwingConstants.TOP);
		role_po.setHorizontalAlignment(SwingConstants.LEFT);
		role_po.setForeground(new Color(255, 0, 0));
		role_po.setFont(new Font("ArnoldBoeD", Font.PLAIN, 40));
		role_po.setBounds(10, 0, 273, 43);
		PO_panel.add(role_po);
		
		JTextArea po_desc = new JTextArea();
		po_desc.setWrapStyleWord(true);
		po_desc.setText("As the Product Owner, you are the visionary behind the project. Your role is to define and prioritize the product backlog, ensuring that the team is always working on the most valuable features. You bridge the gap between stakeholders and the development team, making strategic decisions to maximize the product’s value. Your ability to make tough decisions and prioritize effectively is crucial in shaping the project's success.");
		po_desc.setLineWrap(true);
		po_desc.setForeground(Color.WHITE);
		po_desc.setFont(new Font("ArnoldBoeD", Font.PLAIN, 20));
		po_desc.setEditable(false);
		po_desc.setBackground(Color.BLACK);
		po_desc.setBounds(10, 53, 521, 221);
		PO_panel.add(po_desc);
		
		JLabel po_trait = new JLabel("Traits: Visionary Decision-Maker Stakeholder Management Strategic Thinking");
		po_trait.setForeground(Color.ORANGE);
		po_trait.setFont(new Font("ArnoldBoeD", Font.PLAIN, 20));
		po_trait.setBounds(10, 264, 694, 61);
		PO_panel.add(po_trait);
		
		JLabel po_img = new JLabel("");
		po_img.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/images/productOwner.png")).getImage().getScaledInstance(238, 214, Image.SCALE_SMOOTH)));
		po_img.setHorizontalAlignment(SwingConstants.CENTER);
		po_img.setForeground(Color.WHITE);
		po_img.setBounds(535, 10, 238, 274);
		PO_panel.add(po_img);
		
		TM_panel = new JPanel();
		TM_panel.setBackground(new Color(0, 0, 0));
		layeredPane.add(TM_panel, "name_254991586145100");
		TM_panel.setLayout(null);
		
		JLabel role_tm = new JLabel("Team Member");
		role_tm.setVerticalAlignment(SwingConstants.TOP);
		role_tm.setHorizontalAlignment(SwingConstants.LEFT);
		role_tm.setForeground(new Color(128, 255, 255));
		role_tm.setFont(new Font("ArnoldBoeD", Font.PLAIN, 40));
		role_tm.setBounds(10, 0, 273, 43);
		TM_panel.add(role_tm);
		
		JTextArea tm_desc = new JTextArea();
		tm_desc.setWrapStyleWord(true);
		tm_desc.setText("You are a vital member of the development team, contributing your skills and expertise to the project. Your role is to collaborate closely with your teammates, bringing your technical proficiency and creativity to the table. You actively participate in all SCRUM events, ensuring that the tasks are completed on time and the quality of the work is exceptional. Your dedication and teamwork are essential for the project’s success.");
		tm_desc.setLineWrap(true);
		tm_desc.setForeground(Color.WHITE);
		tm_desc.setFont(new Font("ArnoldBoeD", Font.PLAIN, 20));
		tm_desc.setEditable(false);
		tm_desc.setBackground(Color.BLACK);
		tm_desc.setBounds(10, 53, 536, 221);
		TM_panel.add(tm_desc);
		
		JLabel tm_trait = new JLabel("Traits: Collaborative, Technical Proficiency, Adaptability and Detail-Oriented");
		tm_trait.setForeground(new Color(0, 64, 0));
		tm_trait.setFont(new Font("ArnoldBoeD", Font.PLAIN, 20));
		tm_trait.setBounds(10, 264, 666, 61);
		TM_panel.add(tm_trait);
		
		JLabel tm_img = new JLabel("");
		tm_img.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/images/teamMember.png")).getImage().getScaledInstance(200, 235, Image.SCALE_SMOOTH)));
		tm_img.setHorizontalAlignment(SwingConstants.CENTER);
		tm_img.setForeground(Color.WHITE);
		tm_img.setBounds(548, 10, 216, 270);
		TM_panel.add(tm_img);
		
		Auditor_panel = new JPanel();
		Auditor_panel.setBackground(new Color(0, 0, 0));
		layeredPane.add(Auditor_panel, "name_254993752198600");
		Auditor_panel.setLayout(null);
		
		JLabel role_aud = new JLabel("Auditor");
		role_aud.setVerticalAlignment(SwingConstants.TOP);
		role_aud.setHorizontalAlignment(SwingConstants.LEFT);
		role_aud.setForeground(new Color(128, 64, 64));
		role_aud.setFont(new Font("ArnoldBoeD", Font.PLAIN, 40));
		role_aud.setBounds(10, 0, 273, 43);
		Auditor_panel.add(role_aud);
		
		JTextArea aud_desc = new JTextArea();
		aud_desc.setWrapStyleWord(true);
		aud_desc.setText("As an Auditor, you play a vital role in ensuring that the SCRUM process is followed meticulously. You analyze the team's performance, processes, and outcomes, providing valuable insights to enhance efficiency and productivity. Your attention to detail and analytical skills make you adept at identifying areas for improvement and suggesting optimizations. You are an essential part of the team, helping them fine-tune their processes for optimal results.");
		aud_desc.setLineWrap(true);
		aud_desc.setForeground(Color.WHITE);
		aud_desc.setFont(new Font("ArnoldBoeD", Font.PLAIN, 20));
		aud_desc.setEditable(false);
		aud_desc.setBackground(Color.BLACK);
		aud_desc.setBounds(10, 53, 575, 221);
		Auditor_panel.add(aud_desc);
		
		JLabel aud_trait = new JLabel("Traits: Analytical, Attention to Detail, Process-Oriented and Communication");
		aud_trait.setForeground(new Color(0, 64, 128));
		aud_trait.setFont(new Font("ArnoldBoeD", Font.PLAIN, 20));
		aud_trait.setBounds(10, 264, 657, 61);
		Auditor_panel.add(aud_trait);
		
		JLabel aud_img = new JLabel("");
		aud_img.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/images/auditor.png")).getImage().getScaledInstance(126, 280, Image.SCALE_SMOOTH)));
		aud_img.setHorizontalAlignment(SwingConstants.CENTER);
		aud_img.setForeground(Color.WHITE);
		aud_img.setBounds(595, -13, 156, 315);
		Auditor_panel.add(aud_img);
		
		sm_button = new JButton("SCRUM Master");
		sm_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button_num=1;
				layeredPane.removeAll();
				layeredPane.add(SM_panel);
				layeredPane.repaint();
				layeredPane.revalidate();
			}
		});
		sm_button.setFont(new Font("ArnoldBoeD", Font.PLAIN, 15));
		sm_button.setBackground(new Color(0, 0, 0));
		sm_button.setForeground(Color.CYAN);
		sm_button.setBounds(290, 375, 141, 42);
		Body.add(sm_button);
		
		JButton startGame = new JButton("START GAME");
		startGame.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if ( button_num == 2) {
					UserStories screen = new UserStories();
					screen.setVisible(true);
					dispose();							
				}
				else {
					SprintDuration screen = new SprintDuration();
					screen.setVisible(true);
					dispose();
				}
			}
		});
		startGame.setForeground(Color.WHITE);
		startGame.setFont(new Font("ArnoldBoeD", Font.PLAIN, 20));
		startGame.setBackground(new Color(80, 80, 80));
		startGame.setBounds(591, 443, 164, 42);
		Body.add(startGame);
		
		JButton po_button = new JButton("Product Owner");
		po_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button_num=2;
				layeredPane.removeAll();
				layeredPane.add(PO_panel);
				layeredPane.repaint();
				layeredPane.revalidate();
			}
		});
		po_button.setForeground(Color.RED);
		po_button.setFont(new Font("ArnoldBoeD", Font.PLAIN, 15));
		po_button.setBackground(new Color(0, 0, 0));
		po_button.setBounds(508, 375, 141, 42);
		Body.add(po_button);
		
		JButton tm_button = new JButton("Team Member");
		tm_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button_num=3;
				layeredPane.removeAll();
				layeredPane.add(TM_panel);
				layeredPane.repaint();
				layeredPane.revalidate();
			}
		});
		tm_button.setForeground(new Color(128, 255, 255));
		tm_button.setFont(new Font("ArnoldBoeD", Font.PLAIN, 15));
		tm_button.setBackground(new Color(0, 0, 0));
		tm_button.setBounds(722, 375, 141, 42);
		Body.add(tm_button);
		
		JButton auditor_button = new JButton("Auditor");
		auditor_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button_num=4;
				layeredPane.removeAll();
				layeredPane.add(Auditor_panel);
				layeredPane.repaint();
				layeredPane.revalidate();
			}
		});
		auditor_button.setForeground(new Color(128, 64, 64));
		auditor_button.setFont(new Font("ArnoldBoeD", Font.PLAIN, 15));
		auditor_button.setBackground(new Color(0, 0, 0));
		auditor_button.setBounds(925, 375, 141, 42);
		Body.add(auditor_button);
		
		JPanel Footer = new JPanel();
		Footer.setBorder(new LineBorder(new Color(128, 128, 128), 3));
		Footer.setBackground(new Color(0, 0, 0));
		Footer.setBounds(0, 579, 1352, 184);
		contentPane.add(Footer);
		Footer.setLayout(null);
		
		JLabel About = new JLabel("About");
		About.setFont(new Font("Arial", Font.PLAIN, 13));
		About.setForeground(new Color(255, 255, 255));
		About.setBounds(297, 101, 33, 13);
		Footer.add(About);
		
		JLabel termsOfUse = new JLabel("Terms of Use");
		termsOfUse.setFont(new Font("Arial", Font.PLAIN, 13));
		termsOfUse.setForeground(new Color(255, 255, 255));
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
		sendTop.setForeground(new Color(0, 0, 0));
		sendTop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		sendTop.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/images/smallWhiteArrowUp.png")).getImage().getScaledInstance(26, 29, Image.SCALE_SMOOTH)));
		sendTop.setBackground(new Color(0, 0, 0));
		sendTop.setFont(new Font("Arial", Font.PLAIN, 13));
		sendTop.setBounds(663, 35, 26, 29);
		Footer.add(sendTop);
		
	}
}
