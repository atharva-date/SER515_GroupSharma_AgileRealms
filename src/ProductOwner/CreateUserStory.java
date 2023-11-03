package ProductOwner;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Panel;
import java.awt.ScrollPane;
import javax.swing.border.LineBorder;

import Player.Customizations;
import Player.Home;

import java.awt.TextField;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JProgressBar;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLayeredPane;
import java.awt.CardLayout;
import javax.swing.SwingConstants;
public class CreateUserStory extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField txtStoryAdded;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CreateUserStory frame = new CreateUserStory();
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
	public CreateUserStory() {
		setBackground(Color.BLACK);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1366, 700);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel body = new JPanel();
		body.setBounds(-33, 75, 1476, 458);
		body.setBackground(Color.BLACK);
		body.setBorder(new LineBorder(Color.LIGHT_GRAY, 1, true));
		contentPane.add(body);
		body.setLayout(null);
		
		JPanel mainContents = new JPanel();
		mainContents.setBackground(Color.BLACK);
		mainContents.setBorder(new LineBorder(new Color(192, 192, 192), 2, true));
		mainContents.setBounds(-43, 38, 1513, 420);
		body.add(mainContents);
		mainContents.setLayout(null);
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(402, 17, 586, 382);
		layeredPane.setBackground(Color.BLACK);
		layeredPane.setBorder(new LineBorder(Color.LIGHT_GRAY, 3, true));
		mainContents.add(layeredPane);
		layeredPane.setLayout(new CardLayout(0, 0));
		
		JPanel userStoryTemplate = new JPanel();
		userStoryTemplate.setBackground(Color.BLACK);
		layeredPane.add(userStoryTemplate, "name_56719457652006");
		userStoryTemplate.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(66, 6, 204, 26);
		textField.setForeground(Color.WHITE);
		textField.setColumns(10);
		textField.setBackground(Color.BLACK);
		userStoryTemplate.add(textField);
		
		JTextArea txtrStoryId = new JTextArea();
		txtrStoryId.setBounds(6, 11, 51, 16);
		txtrStoryId.setText("Story ID");
		txtrStoryId.setForeground(Color.WHITE);
		txtrStoryId.setEditable(false);
		txtrStoryId.setBackground(Color.BLACK);
		userStoryTemplate.add(txtrStoryId);
		
		JTextArea txtrUserStory = new JTextArea();
		txtrUserStory.setBounds(6, 39, 72, 16);
		txtrUserStory.setText("User Story");
		txtrUserStory.setForeground(Color.WHITE);
		txtrUserStory.setEditable(false);
		txtrUserStory.setBackground(Color.BLACK);
		userStoryTemplate.add(txtrUserStory);
		
		JTextArea txtrAsAI = new JTextArea();
		txtrAsAI.setBounds(6, 67, 422, 126);
		txtrAsAI.setText("As a: <role>\nI want: <some goal>\n\n\nSo that: <some reason>");
		txtrAsAI.setForeground(Color.WHITE);
		txtrAsAI.setBackground(Color.LIGHT_GRAY);
		userStoryTemplate.add(txtrAsAI);
		
		JTextArea txtrAcceptanceCriteria = new JTextArea();
		txtrAcceptanceCriteria.setBounds(6, 204, 136, 16);
		txtrAcceptanceCriteria.setText("Acceptance Criteria");
		txtrAcceptanceCriteria.setForeground(Color.WHITE);
		txtrAcceptanceCriteria.setEditable(false);
		txtrAcceptanceCriteria.setBackground(Color.BLACK);
		userStoryTemplate.add(txtrAcceptanceCriteria);
		
		JTextArea txtrAsAI_2 = new JTextArea();
		txtrAsAI_2.setBounds(6, 232, 422, 126);
		txtrAsAI_2.setText("And I know I am done when:");
		txtrAsAI_2.setForeground(Color.WHITE);
		txtrAsAI_2.setBackground(Color.LIGHT_GRAY);
		userStoryTemplate.add(txtrAsAI_2);
		
		JTextArea txtrStoryTitle = new JTextArea();
		txtrStoryTitle.setBounds(282, 11, 65, 16);
		txtrStoryTitle.setText("Story Title");
		txtrStoryTitle.setForeground(Color.WHITE);
		txtrStoryTitle.setEditable(false);
		txtrStoryTitle.setBackground(Color.BLACK);
		userStoryTemplate.add(txtrStoryTitle);
		
		textField_1 = new JTextField();
		textField_1.setBounds(359, 6, 204, 26);
		textField_1.setForeground(Color.WHITE);
		textField_1.setColumns(10);
		textField_1.setBackground(Color.BLACK);
		userStoryTemplate.add(textField_1);
		
		JTextArea txtrImportance = new JTextArea();
		txtrImportance.setBounds(474, 39, 89, 16);
		txtrImportance.setText("Importance:");
		txtrImportance.setForeground(Color.WHITE);
		txtrImportance.setEditable(false);
		txtrImportance.setBackground(Color.BLACK);
		userStoryTemplate.add(txtrImportance);
		
		JTextArea txtrAsAI_1 = new JTextArea();
		txtrAsAI_1.setBounds(471, 67, 92, 67);
		txtrAsAI_1.setForeground(Color.WHITE);
		txtrAsAI_1.setBackground(Color.LIGHT_GRAY);
		userStoryTemplate.add(txtrAsAI_1);
		
		JTextArea txtrEstimate = new JTextArea();
		txtrEstimate.setBounds(474, 155, 89, 16);
		txtrEstimate.setText("Estimate:");
		txtrEstimate.setForeground(Color.WHITE);
		txtrEstimate.setEditable(false);
		txtrEstimate.setBackground(Color.BLACK);
		userStoryTemplate.add(txtrEstimate);
		
		JTextArea txtrAsAI_1_1 = new JTextArea();
		txtrAsAI_1_1.setBounds(471, 183, 92, 67);
		txtrAsAI_1_1.setForeground(Color.WHITE);
		txtrAsAI_1_1.setBackground(Color.LIGHT_GRAY);
		userStoryTemplate.add(txtrAsAI_1_1);
		
		JTextArea txtrAssigned = new JTextArea();
		txtrAssigned.setBounds(447, 262, 92, 16);
		txtrAssigned.setText("Assigned To:");
		txtrAssigned.setForeground(Color.WHITE);
		txtrAssigned.setEditable(false);
		txtrAssigned.setBackground(Color.BLACK);
		userStoryTemplate.add(txtrAssigned);
		
		textField_2 = new JTextField();
		textField_2.setBounds(441, 290, 122, 26);
		textField_2.setForeground(Color.WHITE);
		textField_2.setColumns(10);
		textField_2.setBackground(Color.BLACK);
		userStoryTemplate.add(textField_2);
		
		JPanel storyAdded = new JPanel();
		storyAdded.setBackground(Color.BLACK);
		layeredPane.add(storyAdded, "name_56914860268955");
		storyAdded.setLayout(null);
		
		txtStoryAdded = new JTextField();
		txtStoryAdded.setEditable(false);
		txtStoryAdded.setHorizontalAlignment(SwingConstants.CENTER);
		txtStoryAdded.setFont(new Font("Quill Sword", Font.BOLD, 54));
		txtStoryAdded.setForeground(Color.WHITE);
		txtStoryAdded.setBackground(Color.BLACK);
		txtStoryAdded.setText("Story Added");
		txtStoryAdded.setBounds(116, 105, 351, 149);
		storyAdded.add(txtStoryAdded);
		txtStoryAdded.setColumns(10);
		
		JButton btnNewButton = new JButton("Add The Story");
		btnNewButton.setBounds(847, 399, 140, 19);
		mainContents.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				layeredPane.removeAll();
				layeredPane.repaint();
				layeredPane.revalidate();
				layeredPane.add(storyAdded);
			}
		});
		btnNewButton.setBackground(Color.LIGHT_GRAY);
		
		
		JButton btnNewUserStory = new JButton("New User Story");
		btnNewUserStory.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UserStories frame = new UserStories();
				frame.setVisible(true);
				
				dispose();
			}
		});
		btnNewUserStory.setBackground(Color.LIGHT_GRAY);
		btnNewUserStory.setBounds(689, 399, 140, 19);
		mainContents.add(btnNewUserStory);
		
		JPanel footer = new JPanel();
		footer.setBounds(-60, 500, 1470, 193);
		footer.setBorder(new LineBorder(new Color(128, 128, 128), 3));
		footer.setBackground(new Color(0, 0, 0));
		contentPane.add(footer);
		footer.setLayout(null);
		
		JLabel About = new JLabel("About");
		About.setFont(new Font("Arial", Font.PLAIN, 13));
		About.setForeground(new Color(255, 255, 255));
		About.setBounds(297, 115, 47, 13);
		footer.add(About);
		
		JLabel termsOfUse = new JLabel("Terms of Use");
		termsOfUse.setFont(new Font("Arial", Font.PLAIN, 13));
		termsOfUse.setForeground(new Color(255, 255, 255));
		termsOfUse.setBounds(442, 115, 84, 13);
		footer.add(termsOfUse);
		
		JLabel rulesOfPlay = new JLabel("Rules of Play");
		rulesOfPlay.setForeground(Color.WHITE);
		rulesOfPlay.setFont(new Font("Arial", Font.PLAIN, 13));
		rulesOfPlay.setBounds(638, 115, 104, 13);
		footer.add(rulesOfPlay);
		
		JLabel privacyPolicy = new JLabel("Privacy Policy");
		privacyPolicy.setForeground(Color.WHITE);
		privacyPolicy.setFont(new Font("Arial", Font.PLAIN, 13));
		privacyPolicy.setBounds(824, 115, 84, 13);
		footer.add(privacyPolicy);
		
		JLabel credits = new JLabel("Credits");
		credits.setForeground(Color.WHITE);
		credits.setFont(new Font("Arial", Font.PLAIN, 13));
		credits.setBounds(998, 115, 41, 13);
		footer.add(credits);
		
		JLabel lblgroupS = new JLabel("©2023 Group Sharma LLC. All rights reserved.");
		lblgroupS.setForeground(Color.WHITE);
		lblgroupS.setFont(new Font("Arial", Font.PLAIN, 13));
		lblgroupS.setBounds(543, 150, 294, 13);
		footer.add(lblgroupS);
		
		JButton btnNewButton_1_3 = new JButton("");
		btnNewButton_1_3.setForeground(Color.WHITE);
		btnNewButton_1_3.setBackground(Color.WHITE);
		btnNewButton_1_3.setBounds(657, 48, 42, 51);
		footer.add(btnNewButton_1_3);
		
		Panel NavBar = new Panel();
		NavBar.setBackground(Color.BLACK);
		NavBar.setBounds(0, 0, 1352, 77);
		contentPane.add(NavBar);
		NavBar.setLayout(null);
		
		JLabel gameSubHeading = new JLabel("Heroes of the Backlog");
		gameSubHeading.setBounds(10, 52, 298, 25);
		gameSubHeading.setVerticalAlignment(SwingConstants.TOP);
		gameSubHeading.setHorizontalAlignment(SwingConstants.CENTER);
		gameSubHeading.setForeground(Color.WHITE);
		gameSubHeading.setFont(new Font("ArnoldBoeD", Font.PLAIN, 20));
		NavBar.add(gameSubHeading);
		
		JButton guideButton = new JButton("Guide");
		guideButton.setBounds(635, 0, 140, 77);
		guideButton.setForeground(Color.WHITE);
		guideButton.setFont(new Font("ArnoldBoeD", Font.PLAIN, 30));
		guideButton.setBorder(null);
		guideButton.setBackground(Color.BLACK);
		NavBar.add(guideButton);
		
		JButton customizationsButton = new JButton("Customizations");
		customizationsButton.setBounds(803, 0, 252, 77);
		customizationsButton.setForeground(Color.WHITE);
		customizationsButton.setFont(new Font("ArnoldBoeD", Font.PLAIN, 30));
		customizationsButton.setBorder(null);
		customizationsButton.setBackground(Color.BLACK);
		customizationsButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Customizations screen = new Customizations();
				screen.setVisible(true);
				dispose();
			}
		});
		NavBar.add(customizationsButton);
		
		JButton playnowButton = new JButton("Play Now");
		playnowButton.setBounds(1090, 0, 164, 77);
		playnowButton.setForeground(Color.WHITE);
		playnowButton.setFont(new Font("ArnoldBoeD", Font.PLAIN, 30));
		playnowButton.setBorder(null);
		playnowButton.setBackground(Color.BLACK);
		NavBar.add(playnowButton);
		
		JButton homeButton = new JButton("AgileRealms");
		homeButton.setBounds(10, 0, 298, 56);
		homeButton.setForeground(Color.WHITE);
		homeButton.setFont(new Font("ArnoldBoeD", Font.PLAIN, 45));
		homeButton.setBorder(null);
		homeButton.setBackground(Color.BLACK);
		homeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Home screen = new Home();
				screen.setVisible(true);
				dispose();
			}
		});
		NavBar.add(homeButton);
		
		JButton profileButton = new JButton("");
		profileButton.setBounds(1275, 0, 77, 77);
		profileButton.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/images/user.png")).getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH)));
		profileButton.setForeground(Color.WHITE);
		profileButton.setFont(new Font("ArnoldBoeD", Font.PLAIN, 30));
		profileButton.setBorder(null);
		profileButton.setBackground(Color.BLACK);
		NavBar.add(profileButton);
	}
}
