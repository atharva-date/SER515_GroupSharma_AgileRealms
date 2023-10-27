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

public class Customizations extends JFrame {
	

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

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
		setBounds(100, 100, 1366, 700);
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
		Body.setBackground(new Color(0, 0, 0));
		Body.setBorder(new LineBorder(new Color(128, 128, 128), 3));
		Body.setBounds(0, 77, 1352, 404);
		contentPane.add(Body);
		Body.setLayout(null);
		
		JPanel roleSelectionPanel = new JPanel();
		roleSelectionPanel.setBorder(new LineBorder(new Color(128, 128, 128), 3, true));
		roleSelectionPanel.setBackground(new Color(0, 0, 0));
		roleSelectionPanel.setBounds(283, 20, 783, 335);
		Body.add(roleSelectionPanel);
		roleSelectionPanel.setLayout(null);
		
		JLabel role_sm = new JLabel("Scrum Master");
		role_sm.setBounds(10, 0, 273, 43);
		role_sm.setVerticalAlignment(SwingConstants.TOP);
		role_sm.setHorizontalAlignment(SwingConstants.LEFT);
		role_sm.setForeground(Color.WHITE);
		role_sm.setFont(new Font("ArnoldBoeD", Font.PLAIN, 40));
		roleSelectionPanel.add(role_sm);
		
		JTextArea txtrAsTheScrum = new JTextArea();
		txtrAsTheScrum.setWrapStyleWord(true);
		txtrAsTheScrum.setLineWrap(true);
		txtrAsTheScrum.setText("As the Scrum Master in AgileRealms, you are the guardian of Agile principles, a beacon of guidance for your team. Your primary mission is to ensure the Agile process runs Smoothly, allowing you team to work at its best. You facilitate daily stand-up meetings, sprint planning, and retrospectives, fostering effective communication and collaboration. With your leadership, impediments are swiftly removed, and the path to project success is cleared. AgileRealms depends on your expertise and wisdom to lead the way.");
		txtrAsTheScrum.setForeground(Color.WHITE);
		txtrAsTheScrum.setFont(new Font("ArnoldBoeD", Font.PLAIN, 20));
		txtrAsTheScrum.setEditable(false);
		txtrAsTheScrum.setBackground(Color.BLACK);
		txtrAsTheScrum.setBounds(10, 53, 626, 221);
		roleSelectionPanel.add(txtrAsTheScrum);
		
		JLabel lblNewLabel_1 = new JLabel("Traits: Leadership, Problem Solver, Empathy and communication");
		lblNewLabel_1.setFont(new Font("ArnoldBoeD", Font.PLAIN, 20));
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(10, 264, 626, 61);
		roleSelectionPanel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setIcon(new ImageIcon((new ImageIcon("C:\\Users\\kvvid\\Desktop\\Pro_clone\\SER515_GroupSharma_AgileRealms\\src\\images\\scrumMaster.png").getImage()
	            .getScaledInstance(130, 321, java.awt.Image.SCALE_SMOOTH))));
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setBounds(628, 10, 145, 315);
		roleSelectionPanel.add(lblNewLabel_2);
		
		JButton previous = new JButton("");
		previous.setForeground(new Color(255, 255, 255));
		previous.setSelectedIcon(new ImageIcon("C:\\Users\\kvvid\\Desktop\\Pro_clone\\SER515_GroupSharma_AgileRealms\\src\\images\\smallLeft.png"));
		previous.setBackground(new Color(0, 0, 0));
		previous.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		previous.setIcon(new ImageIcon("C:\\Users\\kvvid\\Desktop\\Pro_clone\\SER515_GroupSharma_AgileRealms\\src\\images\\smallLeft.png"));
		previous.setBounds(206, 158, 67, 59);
		Body.add(previous);
		
		JButton next = new JButton("");
		next.setBackground(new Color(0, 0, 0));
		next.setIcon(new ImageIcon("C:\\Users\\kvvid\\Desktop\\Pro_clone\\SER515_GroupSharma_AgileRealms\\src\\images\\smallRight.png"));
		next.setBounds(1076, 158, 67, 59);
		Body.add(next);
		
		JPanel Footer = new JPanel();
		Footer.setBorder(new LineBorder(new Color(128, 128, 128), 3));
		Footer.setBackground(new Color(0, 0, 0));
		Footer.setBounds(0, 479, 1352, 184);
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
