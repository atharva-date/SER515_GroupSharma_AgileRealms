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
		
		/*	
		//Method to create the image slider
		public String[] takeImage() {
			File f = new File(getClass().getResources("").getFile());
			String[] Images = f.list();
			return Images;
		}
		
		
		
		public void show(int index) {
			String[] Images = takeimage();
			String img = Images[index];
			ImageIcon icon = new ImageIcon(getClass().getResource(""+img));
			Image image=icon.getImage().getScaledInstance(roleSelectionPanel.getWidth(), roleSelectionPanel.getHeight(), Image.SCALE_SMOOTH);
			roleSelectionPanel.setIcon(new ImageIcon(image));
		}
		*/
		
        JLabel label = new JLabel("Hello, World!");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1366, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Panel NavBar = new Panel();
		NavBar.setBackground(new Color(0, 0, 0));
		NavBar.setBounds(0, 0, 1352, 77);
		contentPane.add(NavBar);
		NavBar.setLayout(null);
		
		JLabel lblHeroesOfThe = new JLabel("Heroes of the Backlog");
		lblHeroesOfThe.setVerticalAlignment(SwingConstants.TOP);
		lblHeroesOfThe.setBounds(21, 52, 298, 25);
		NavBar.add(lblHeroesOfThe);
		lblHeroesOfThe.setHorizontalAlignment(SwingConstants.CENTER);
		lblHeroesOfThe.setForeground(Color.WHITE);
		lblHeroesOfThe.setFont(new Font("ArnoldBoeD", Font.PLAIN, 20));
		
		JLabel lblNewLabel = new JLabel("AgileRealms");
		lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel.setBounds(10, 0, 298, 77);
		NavBar.add(lblNewLabel);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("ArnoldBoeD", Font.PLAIN, 53));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		
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
		
		JLabel role_sm = new JLabel("Scrum Master");
		role_sm.setVerticalAlignment(SwingConstants.TOP);
		role_sm.setHorizontalAlignment(SwingConstants.LEFT);
		role_sm.setForeground(new Color(0, 206, 209));
		role_sm.setFont(new Font("ArnoldBoeD", Font.PLAIN, 40));
		role_sm.setBounds(10, 0, 273, 43);
		SM_panel.add(role_sm);
		
		JTextArea txtrAsTheScrum = new JTextArea();
		txtrAsTheScrum.setWrapStyleWord(true);
		txtrAsTheScrum.setText("As the Scrum Master in AgileRealms, you are the guardian of Agile principles, a beacon of guidance for your team. Your primary mission is to ensure the Agile process runs Smoothly, allowing you team to work at its best. You facilitate daily stand-up meetings, sprint planning, and retrospectives, fostering effective communication and collaboration. With your leadership, impediments are swiftly removed, and the path to project success is cleared. AgileRealms depends on your expertise and wisdom to lead the way.");
		txtrAsTheScrum.setLineWrap(true);
		txtrAsTheScrum.setForeground(Color.WHITE);
		txtrAsTheScrum.setFont(new Font("ArnoldBoeD", Font.PLAIN, 20));
		txtrAsTheScrum.setEditable(false);
		txtrAsTheScrum.setBackground(Color.BLACK);
		txtrAsTheScrum.setBounds(10, 53, 617, 221);
		SM_panel.add(txtrAsTheScrum);
		
		JLabel lblNewLabel_1 = new JLabel("Traits: Leadership, Problem Solver, Empathy and communication");
		lblNewLabel_1.setForeground(new Color(80, 80, 80));
		lblNewLabel_1.setFont(new Font("ArnoldBoeD", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(10, 264, 626, 61);
		SM_panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/images/scrumMaster.png")).getImage().getScaledInstance(145, 315, Image.SCALE_SMOOTH)));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setBounds(628, 10, 145, 315);
		SM_panel.add(lblNewLabel_2);
		
		PO_panel = new JPanel();
		PO_panel.setBackground(new Color(0, 0, 0));
		layeredPane.add(PO_panel, "name_254989202407000");
		PO_panel.setLayout(null);
		
		JLabel role_sm_1 = new JLabel("Product Owner");
		role_sm_1.setVerticalAlignment(SwingConstants.TOP);
		role_sm_1.setHorizontalAlignment(SwingConstants.LEFT);
		role_sm_1.setForeground(new Color(255, 0, 0));
		role_sm_1.setFont(new Font("ArnoldBoeD", Font.PLAIN, 40));
		role_sm_1.setBounds(10, 0, 273, 43);
		PO_panel.add(role_sm_1);
		
		JTextArea txtrAsTheProduct = new JTextArea();
		txtrAsTheProduct.setWrapStyleWord(true);
		txtrAsTheProduct.setText("As the Product Owner, you are the visionary behind the project. Your role is to define and prioritize the product backlog, ensuring that the team is always working on the most valuable features. You bridge the gap between stakeholders and the development team, making strategic decisions to maximize the product’s value. Your ability to make tough decisions and prioritize effectively is crucial in shaping the project's success.");
		txtrAsTheProduct.setLineWrap(true);
		txtrAsTheProduct.setForeground(Color.WHITE);
		txtrAsTheProduct.setFont(new Font("ArnoldBoeD", Font.PLAIN, 20));
		txtrAsTheProduct.setEditable(false);
		txtrAsTheProduct.setBackground(Color.BLACK);
		txtrAsTheProduct.setBounds(10, 53, 521, 221);
		PO_panel.add(txtrAsTheProduct);
		
		JLabel lblNewLabel_1_1 = new JLabel("Traits: Visionary Decision-Maker Stakeholder Management Strategic Thinking");
		lblNewLabel_1_1.setForeground(Color.ORANGE);
		lblNewLabel_1_1.setFont(new Font("ArnoldBoeD", Font.PLAIN, 20));
		lblNewLabel_1_1.setBounds(10, 264, 694, 61);
		PO_panel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("");
		lblNewLabel_2_1.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/images/productOwner.png")).getImage().getScaledInstance(238, 214, Image.SCALE_SMOOTH)));
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1.setForeground(Color.WHITE);
		lblNewLabel_2_1.setBounds(535, 10, 238, 274);
		PO_panel.add(lblNewLabel_2_1);
		
		TM_panel = new JPanel();
		TM_panel.setBackground(new Color(0, 0, 0));
		layeredPane.add(TM_panel, "name_254991586145100");
		TM_panel.setLayout(null);
		
		JLabel role_sm_1_1 = new JLabel("Team Member");
		role_sm_1_1.setVerticalAlignment(SwingConstants.TOP);
		role_sm_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		role_sm_1_1.setForeground(new Color(128, 255, 255));
		role_sm_1_1.setFont(new Font("ArnoldBoeD", Font.PLAIN, 40));
		role_sm_1_1.setBounds(10, 0, 273, 43);
		TM_panel.add(role_sm_1_1);
		
		JTextArea txtrYouAreA = new JTextArea();
		txtrYouAreA.setWrapStyleWord(true);
		txtrYouAreA.setText("You are a vital member of the development team, contributing your skills and expertise to the project. Your role is to collaborate closely with your teammates, bringing your technical proficiency and creativity to the table. You actively participate in all SCRUM events, ensuring that the tasks are completed on time and the quality of the work is exceptional. Your dedication and teamwork are essential for the project’s success.");
		txtrYouAreA.setLineWrap(true);
		txtrYouAreA.setForeground(Color.WHITE);
		txtrYouAreA.setFont(new Font("ArnoldBoeD", Font.PLAIN, 20));
		txtrYouAreA.setEditable(false);
		txtrYouAreA.setBackground(Color.BLACK);
		txtrYouAreA.setBounds(10, 53, 536, 221);
		TM_panel.add(txtrYouAreA);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Traits: Collaborative, Technical Proficiency, Adaptability and Detail-Oriented");
		lblNewLabel_1_1_1.setForeground(new Color(0, 64, 0));
		lblNewLabel_1_1_1.setFont(new Font("ArnoldBoeD", Font.PLAIN, 20));
		lblNewLabel_1_1_1.setBounds(10, 264, 666, 61);
		TM_panel.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("");
		lblNewLabel_2_1_1.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/images/teamMember.png")).getImage().getScaledInstance(200, 235, Image.SCALE_SMOOTH)));
		lblNewLabel_2_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1_1.setForeground(Color.WHITE);
		lblNewLabel_2_1_1.setBounds(548, 10, 216, 270);
		TM_panel.add(lblNewLabel_2_1_1);
		
		Auditor_panel = new JPanel();
		Auditor_panel.setBackground(new Color(0, 0, 0));
		layeredPane.add(Auditor_panel, "name_254993752198600");
		Auditor_panel.setLayout(null);
		
		JLabel role_sm_1_1_1 = new JLabel("Auditor");
		role_sm_1_1_1.setVerticalAlignment(SwingConstants.TOP);
		role_sm_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		role_sm_1_1_1.setForeground(new Color(128, 64, 64));
		role_sm_1_1_1.setFont(new Font("ArnoldBoeD", Font.PLAIN, 40));
		role_sm_1_1_1.setBounds(10, 0, 273, 43);
		Auditor_panel.add(role_sm_1_1_1);
		
		JTextArea txtrAsAnAuditor = new JTextArea();
		txtrAsAnAuditor.setWrapStyleWord(true);
		txtrAsAnAuditor.setText("As an Auditor, you play a vital role in ensuring that the SCRUM process is followed meticulously. You analyze the team's performance, processes, and outcomes, providing valuable insights to enhance efficiency and productivity. Your attention to detail and analytical skills make you adept at identifying areas for improvement and suggesting optimizations. You are an essential part of the team, helping them fine-tune their processes for optimal results.");
		txtrAsAnAuditor.setLineWrap(true);
		txtrAsAnAuditor.setForeground(Color.WHITE);
		txtrAsAnAuditor.setFont(new Font("ArnoldBoeD", Font.PLAIN, 20));
		txtrAsAnAuditor.setEditable(false);
		txtrAsAnAuditor.setBackground(Color.BLACK);
		txtrAsAnAuditor.setBounds(10, 53, 575, 221);
		Auditor_panel.add(txtrAsAnAuditor);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Traits: Analytical, Attention to Detail, Process-Oriented and Communication");
		lblNewLabel_1_1_1_1.setForeground(new Color(0, 64, 128));
		lblNewLabel_1_1_1_1.setFont(new Font("ArnoldBoeD", Font.PLAIN, 20));
		lblNewLabel_1_1_1_1.setBounds(10, 264, 657, 61);
		Auditor_panel.add(lblNewLabel_1_1_1_1);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("");
		lblNewLabel_2_1_1_1.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/images/auditor.png")).getImage().getScaledInstance(126, 280, Image.SCALE_SMOOTH)));
		lblNewLabel_2_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_2_1_1_1.setBounds(595, -13, 156, 315);
		Auditor_panel.add(lblNewLabel_2_1_1_1);
		
		sm_button = new JButton("SCRUM Master");
		sm_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
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
		startGame.setForeground(Color.WHITE);
		startGame.setFont(new Font("ArnoldBoeD", Font.PLAIN, 20));
		startGame.setBackground(new Color(80, 80, 80));
		startGame.setBounds(591, 443, 164, 42);
		Body.add(startGame);
		
		JButton po_button = new JButton("Product Owner");
		po_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
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
		sendTop.setIcon(new ImageIcon("C:\\Users\\kvvid\\Desktop\\Pro_clone\\SER515_GroupSharma_AgileRealms\\src\\images\\smallWhiteArrowUp.png"));
		sendTop.setBackground(new Color(0, 0, 0));
		sendTop.setFont(new Font("Arial", Font.PLAIN, 13));
		sendTop.setBounds(663, 35, 26, 29);
		Footer.add(sendTop);
		
	}
}
