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
import javax.swing.JScrollBar;
import javax.swing.JTextField;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;
import javax.swing.JCheckBox;

public class ManageMeetings extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtAttendees;
	private JTextField txtName;
	private JTextField txtName_1;
	private JTextField txtName_2;
	private JTextField txtName_3;
	private JTextField txtName_4;
	private JTextField txtAgendaForThe;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ManageMeetings frame = new ManageMeetings();
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
	public ManageMeetings() {
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
		scen1.setBorder(new LineBorder(Color.LIGHT_GRAY, 2, true));
		scen1.setBackground(Color.BLACK);
		layeredPane.add(scen1, "name_604559671835300");
		scen1.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setForeground(Color.WHITE);
		panel.setBackground(Color.BLACK);
		panel.setBorder(new LineBorder(Color.LIGHT_GRAY, 2, true));
		panel.setBounds(383, 6, 605, 415);
		scen1.add(panel);
		panel.setLayout(null);
		
		
		JTextArea txtrAgenda = new JTextArea();
		txtrAgenda.setText("Agenda :");
		txtrAgenda.setForeground(Color.WHITE);
		txtrAgenda.setEditable(false);
		txtrAgenda.setBackground(Color.BLACK);
		txtrAgenda.setBounds(6, 6, 64, 16);
		panel.add(txtrAgenda);
		
		txtAgendaForThe = new JTextField();
		txtAgendaForThe.setText("Agenda for the Meeting");
		txtAgendaForThe.setHorizontalAlignment(SwingConstants.CENTER);
		txtAgendaForThe.setForeground(Color.WHITE);
		txtAgendaForThe.setColumns(10);
		txtAgendaForThe.setBackground(Color.BLACK);
		txtAgendaForThe.setBounds(67, 6, 319, 134);
		panel.add(txtAgendaForThe);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Public Meeting");
		chckbxNewCheckBox.setForeground(Color.WHITE);
		chckbxNewCheckBox.setBounds(398, 6, 128, 23);
		panel.add(chckbxNewCheckBox);
		
		JCheckBox chckbxPrivateMeeting = new JCheckBox("Private Meeting");
		chckbxPrivateMeeting.setForeground(Color.WHITE);
		chckbxPrivateMeeting.setBounds(398, 32, 128, 23);
		panel.add(chckbxPrivateMeeting);
		
		JTextArea txtrAgenda_1 = new JTextArea();
		txtrAgenda_1.setText("Host :");
		txtrAgenda_1.setForeground(Color.WHITE);
		txtrAgenda_1.setEditable(false);
		txtrAgenda_1.setBackground(Color.BLACK);
		txtrAgenda_1.setBounds(6, 152, 64, 16);
		panel.add(txtrAgenda_1);
		
		textField = new JTextField();
		textField.setText("Name 1");
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setForeground(Color.WHITE);
		textField.setColumns(10);
		textField.setBackground(Color.BLACK);
		textField.setBounds(67, 152, 319, 26);
		panel.add(textField);
		
		JTextArea txtrAgenda_1_1 = new JTextArea();
		txtrAgenda_1_1.setText("Venue :");
		txtrAgenda_1_1.setForeground(Color.WHITE);
		txtrAgenda_1_1.setEditable(false);
		txtrAgenda_1_1.setBackground(Color.BLACK);
		txtrAgenda_1_1.setBounds(6, 191, 64, 16);
		panel.add(txtrAgenda_1_1);
		
		JTextArea txtrAgenda_1_2 = new JTextArea();
		txtrAgenda_1_2.setText("Date :");
		txtrAgenda_1_2.setForeground(Color.WHITE);
		txtrAgenda_1_2.setEditable(false);
		txtrAgenda_1_2.setBackground(Color.BLACK);
		txtrAgenda_1_2.setBounds(6, 233, 64, 16);
		panel.add(txtrAgenda_1_2);
		
		textField_1 = new JTextField();
		textField_1.setText("Name 1");
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setForeground(Color.WHITE);
		textField_1.setColumns(10);
		textField_1.setBackground(Color.BLACK);
		textField_1.setBounds(67, 190, 319, 26);
		panel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setText("Name 1");
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setForeground(Color.WHITE);
		textField_2.setColumns(10);
		textField_2.setBackground(Color.BLACK);
		textField_2.setBounds(67, 233, 319, 26);
		panel.add(textField_2);
		
		JTextArea txtrAgenda_1_2_1 = new JTextArea();
		txtrAgenda_1_2_1.setText("Time :");
		txtrAgenda_1_2_1.setForeground(Color.WHITE);
		txtrAgenda_1_2_1.setEditable(false);
		txtrAgenda_1_2_1.setBackground(Color.BLACK);
		txtrAgenda_1_2_1.setBounds(6, 270, 64, 16);
		panel.add(txtrAgenda_1_2_1);
		
		textField_3 = new JTextField();
		textField_3.setText("Name 1");
		textField_3.setHorizontalAlignment(SwingConstants.CENTER);
		textField_3.setForeground(Color.WHITE);
		textField_3.setColumns(10);
		textField_3.setBackground(Color.BLACK);
		textField_3.setBounds(67, 270, 319, 26);
		panel.add(textField_3);
		
		JButton btnNewButton = new JButton("Start Meet");
		btnNewButton.setBounds(482, 380, 117, 29);
		panel.add(btnNewButton);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.BLACK);
		panel_1.setBorder(new LineBorder(Color.LIGHT_GRAY, 2, true));
		panel_1.setBounds(209, 6, 176, 415);
		scen1.add(panel_1);
		panel_1.setLayout(null);
		
		txtAttendees = new JTextField();
		txtAttendees.setBackground(Color.BLACK);
		txtAttendees.setForeground(Color.WHITE);
		txtAttendees.setHorizontalAlignment(SwingConstants.CENTER);
		txtAttendees.setText("Name 1");
		txtAttendees.setBounds(6, 34, 144, 26);
		panel_1.add(txtAttendees);
		txtAttendees.setColumns(10);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(155, 6, 15, 403);
		panel_1.add(scrollBar);
		
		JTextArea txtrCqevqvqev = new JTextArea();
		txtrCqevqvqev.setBackground(Color.BLACK);
		txtrCqevqvqev.setForeground(Color.WHITE);
		txtrCqevqvqev.setEditable(false);
		txtrCqevqvqev.setText("Attendees");
		txtrCqevqvqev.setBounds(44, 6, 64, 16);
		panel_1.add(txtrCqevqvqev);
		
		txtName = new JTextField();
		txtName.setText("Name 2");
		txtName.setHorizontalAlignment(SwingConstants.CENTER);
		txtName.setForeground(Color.WHITE);
		txtName.setColumns(10);
		txtName.setBackground(Color.BLACK);
		txtName.setBounds(6, 61, 144, 26);
		panel_1.add(txtName);
		
		txtName_1 = new JTextField();
		txtName_1.setText("Name 3");
		txtName_1.setHorizontalAlignment(SwingConstants.CENTER);
		txtName_1.setForeground(Color.WHITE);
		txtName_1.setColumns(10);
		txtName_1.setBackground(Color.BLACK);
		txtName_1.setBounds(6, 89, 144, 26);
		panel_1.add(txtName_1);
		
		txtName_2 = new JTextField();
		txtName_2.setText("Name 4");
		txtName_2.setHorizontalAlignment(SwingConstants.CENTER);
		txtName_2.setForeground(Color.WHITE);
		txtName_2.setColumns(10);
		txtName_2.setBackground(Color.BLACK);
		txtName_2.setBounds(6, 117, 144, 26);
		panel_1.add(txtName_2);
		
		txtName_3 = new JTextField();
		txtName_3.setText("Name 5");
		txtName_3.setHorizontalAlignment(SwingConstants.CENTER);
		txtName_3.setForeground(Color.WHITE);
		txtName_3.setColumns(10);
		txtName_3.setBackground(Color.BLACK);
		txtName_3.setBounds(6, 144, 144, 26);
		panel_1.add(txtName_3);
		
		txtName_4 = new JTextField();
		txtName_4.setText("Name 6");
		txtName_4.setHorizontalAlignment(SwingConstants.CENTER);
		txtName_4.setForeground(Color.WHITE);
		txtName_4.setColumns(10);
		txtName_4.setBackground(Color.BLACK);
		txtName_4.setBounds(6, 172, 144, 26);
		panel_1.add(txtName_4);
		
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
	private static void addPopup(Component component, final JPopupMenu popup) {
	}
}
