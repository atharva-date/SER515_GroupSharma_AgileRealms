package ProductOwner;
import Player.Customizations;
import Player.UpdateLogin;
import Player.Home;
import Player.Main;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;

import java.awt.Color;
import javax.swing.JButton;
import java.awt.Panel;
import javax.swing.border.LineBorder;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollBar;
import javax.swing.JLayeredPane;
import java.awt.CardLayout;
import javax.swing.JMenu;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JMenuItem;
import java.awt.Dimension;

public class UserStories extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField txtStory_1;
	private JTextField textField_2;
	private JTextField txtStory;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserStories frame = new UserStories();
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
	public UserStories() {
		setBackground(Color.BLACK);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1366, 700);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);

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
		
		
		JPopupMenu popupMenu = new JPopupMenu();
		popupMenu.setBackground(Color.LIGHT_GRAY);
		addPopup(NavBar, popupMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Hello Admin!");
		mntmNewMenuItem.setForeground(Color.WHITE);
		mntmNewMenuItem.setBackground(Color.BLACK);
		popupMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem1 = new JMenuItem("View Profile");
		mntmNewMenuItem1.setBackground(Color.BLACK);
		mntmNewMenuItem1.setForeground(Color.WHITE);
		popupMenu.add(mntmNewMenuItem1);
		mntmNewMenuItem1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UpdateLogin updateLoginScreen = new UpdateLogin();
		        updateLoginScreen.setVisible(true);
				dispose();
			}
		});
		
		JMenuItem mntmNewMenuItem2 = new JMenuItem("Log Out");
		mntmNewMenuItem2.setForeground(Color.WHITE);
		mntmNewMenuItem2.setBackground(Color.BLACK);
		popupMenu.add(mntmNewMenuItem2);
		
		
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
		Body.setBounds(-33, 76, 1417, 457);
		Body.setBackground(Color.BLACK);
		Body.setBorder(new LineBorder(new Color(192, 192, 192), 2, true));
		contentPane.add(Body);
		Body.setLayout(null);
		
		JPanel mainContents = new JPanel();
		mainContents.setBounds(-43, 38, 1483, 419);
		mainContents.setBackground(Color.BLACK);
		mainContents.setBorder(new LineBorder(new Color(192, 192, 192), 2, true));
		Body.add(mainContents);
		mainContents.setLayout(null);
		
		JLayeredPane storyListCarousel = new JLayeredPane();
		storyListCarousel.setBounds(440, 0, 602, 418);
		storyListCarousel.setBackground(Color.BLACK);
		storyListCarousel.setBorder(new LineBorder(new Color(192, 192, 192), 2, true));
		mainContents.add(storyListCarousel);
		storyListCarousel.setLayout(new CardLayout(0, 0));
		
		JPanel story1 = new JPanel();
		story1.setBackground(Color.BLACK);
		storyListCarousel.add(story1, "name_130843980454285");
		story1.setLayout(null);
		
		JTextArea txtrStoryId = new JTextArea();
		txtrStoryId.setBounds(6, 11, 51, 16);
		txtrStoryId.setText("Story ID");
		txtrStoryId.setForeground(Color.WHITE);
		txtrStoryId.setEditable(false);
		txtrStoryId.setBackground(Color.BLACK);
		story1.add(txtrStoryId);
		
		textField = new JTextField();
		textField.setBounds(66, 6, 204, 26);
		textField.setText("001");
		textField.setForeground(Color.WHITE);
		textField.setColumns(10);
		textField.setBackground(Color.BLACK);
		story1.add(textField);
		
		JTextArea txtrStoryTitle = new JTextArea();
		txtrStoryTitle.setBounds(282, 11, 65, 16);
		txtrStoryTitle.setText("Story Title");
		txtrStoryTitle.setForeground(Color.WHITE);
		txtrStoryTitle.setEditable(false);
		txtrStoryTitle.setBackground(Color.BLACK);
		story1.add(txtrStoryTitle);
		
		txtStory_1 = new JTextField();
		txtStory_1.setBounds(359, 6, 204, 26);
		txtStory_1.setText("Story 1");
		txtStory_1.setForeground(Color.WHITE);
		txtStory_1.setColumns(10);
		txtStory_1.setBackground(Color.BLACK);
		story1.add(txtStory_1);
		
		JTextArea txtrImportance = new JTextArea();
		txtrImportance.setBounds(474, 39, 89, 16);
		txtrImportance.setText("Importance:");
		txtrImportance.setForeground(Color.WHITE);
		txtrImportance.setEditable(false);
		txtrImportance.setBackground(Color.BLACK);
		story1.add(txtrImportance);
		
		JTextArea txtrAsAI_1 = new JTextArea();
		txtrAsAI_1.setBounds(471, 67, 92, 67);
		txtrAsAI_1.setForeground(Color.WHITE);
		txtrAsAI_1.setBackground(Color.LIGHT_GRAY);
		story1.add(txtrAsAI_1);
		
		JTextArea txtrAsAI = new JTextArea();
		txtrAsAI.setBounds(6, 67, 422, 126);
		txtrAsAI.setText("As a: <role>\nI want: <some goal>\n\n\nSo that: <some reason>");
		txtrAsAI.setForeground(Color.WHITE);
		txtrAsAI.setBackground(Color.LIGHT_GRAY);
		story1.add(txtrAsAI);
		
		JTextArea txtrUserStory = new JTextArea();
		txtrUserStory.setBounds(6, 39, 72, 16);
		txtrUserStory.setText("User Story");
		txtrUserStory.setForeground(Color.WHITE);
		txtrUserStory.setEditable(false);
		txtrUserStory.setBackground(Color.BLACK);
		story1.add(txtrUserStory);
		
		JTextArea txtrAsAI_2 = new JTextArea();
		txtrAsAI_2.setBounds(6, 232, 422, 126);
		txtrAsAI_2.setText("And I know I am done when:");
		txtrAsAI_2.setForeground(Color.WHITE);
		txtrAsAI_2.setBackground(Color.LIGHT_GRAY);
		story1.add(txtrAsAI_2);
		
		JTextArea txtrAcceptanceCriteria = new JTextArea();
		txtrAcceptanceCriteria.setBounds(6, 204, 136, 16);
		txtrAcceptanceCriteria.setText("Acceptance Criteria");
		txtrAcceptanceCriteria.setForeground(Color.WHITE);
		txtrAcceptanceCriteria.setEditable(false);
		txtrAcceptanceCriteria.setBackground(Color.BLACK);
		story1.add(txtrAcceptanceCriteria);
		
		JTextArea txtrAsAI_1_1 = new JTextArea();
		txtrAsAI_1_1.setBounds(471, 183, 92, 67);
		txtrAsAI_1_1.setForeground(Color.WHITE);
		txtrAsAI_1_1.setBackground(Color.LIGHT_GRAY);
		story1.add(txtrAsAI_1_1);
		
		JTextArea txtrEstimate = new JTextArea();
		txtrEstimate.setBounds(474, 155, 89, 16);
		txtrEstimate.setText("Estimate:");
		txtrEstimate.setForeground(Color.WHITE);
		txtrEstimate.setEditable(false);
		txtrEstimate.setBackground(Color.BLACK);
		story1.add(txtrEstimate);
		
		JTextArea txtrAssigned = new JTextArea();
		txtrAssigned.setBounds(447, 262, 92, 16);
		txtrAssigned.setText("Assigned To:");
		txtrAssigned.setForeground(Color.WHITE);
		txtrAssigned.setEditable(false);
		txtrAssigned.setBackground(Color.BLACK);
		story1.add(txtrAssigned);
		
		textField_2 = new JTextField();
		textField_2.setBounds(441, 290, 122, 26);
		textField_2.setForeground(Color.WHITE);
		textField_2.setColumns(10);
		textField_2.setBackground(Color.BLACK);
		story1.add(textField_2);
		
		JPanel story2 = new JPanel();
		story2.setBackground(Color.BLACK);
		storyListCarousel.add(story2, "name_130866315885737");
		story2.setLayout(null);
		
		txtStory = new JTextField();
		txtStory.setText("Story 2");
		txtStory.setForeground(Color.WHITE);
		txtStory.setColumns(10);
		txtStory.setBackground(Color.BLACK);
		txtStory.setBounds(359, 6, 204, 26);
		story2.add(txtStory);
		
		JTextArea txtrImportance_1 = new JTextArea();
		txtrImportance_1.setText("Importance:");
		txtrImportance_1.setForeground(Color.WHITE);
		txtrImportance_1.setEditable(false);
		txtrImportance_1.setBackground(Color.BLACK);
		txtrImportance_1.setBounds(474, 39, 89, 16);
		story2.add(txtrImportance_1);
		
		JTextArea txtrAsAI_1_2 = new JTextArea();
		txtrAsAI_1_2.setForeground(Color.WHITE);
		txtrAsAI_1_2.setBackground(Color.LIGHT_GRAY);
		txtrAsAI_1_2.setBounds(471, 67, 92, 67);
		story2.add(txtrAsAI_1_2);
		
		JTextArea txtrEstimate_1 = new JTextArea();
		txtrEstimate_1.setText("Estimate:");
		txtrEstimate_1.setForeground(Color.WHITE);
		txtrEstimate_1.setEditable(false);
		txtrEstimate_1.setBackground(Color.BLACK);
		txtrEstimate_1.setBounds(474, 155, 89, 16);
		story2.add(txtrEstimate_1);
		
		JTextArea txtrAsAI_1_1_1 = new JTextArea();
		txtrAsAI_1_1_1.setForeground(Color.WHITE);
		txtrAsAI_1_1_1.setBackground(Color.LIGHT_GRAY);
		txtrAsAI_1_1_1.setBounds(471, 183, 92, 67);
		story2.add(txtrAsAI_1_1_1);
		
		JTextArea txtrAssigned_1 = new JTextArea();
		txtrAssigned_1.setText("Assigned To:");
		txtrAssigned_1.setForeground(Color.WHITE);
		txtrAssigned_1.setEditable(false);
		txtrAssigned_1.setBackground(Color.BLACK);
		txtrAssigned_1.setBounds(447, 262, 92, 16);
		story2.add(txtrAssigned_1);
		
		textField_4 = new JTextField();
		textField_4.setForeground(Color.WHITE);
		textField_4.setColumns(10);
		textField_4.setBackground(Color.BLACK);
		textField_4.setBounds(441, 290, 122, 26);
		story2.add(textField_4);
		
		JTextArea txtrAsAI_2_1 = new JTextArea();
		txtrAsAI_2_1.setText("And I know I am done when:");
		txtrAsAI_2_1.setForeground(Color.WHITE);
		txtrAsAI_2_1.setBackground(Color.LIGHT_GRAY);
		txtrAsAI_2_1.setBounds(6, 232, 422, 126);
		story2.add(txtrAsAI_2_1);
		
		JTextArea txtrAcceptanceCriteria_1 = new JTextArea();
		txtrAcceptanceCriteria_1.setText("Acceptance Criteria");
		txtrAcceptanceCriteria_1.setForeground(Color.WHITE);
		txtrAcceptanceCriteria_1.setEditable(false);
		txtrAcceptanceCriteria_1.setBackground(Color.BLACK);
		txtrAcceptanceCriteria_1.setBounds(6, 204, 136, 16);
		story2.add(txtrAcceptanceCriteria_1);
		
		JTextArea txtrAsAI_3 = new JTextArea();
		txtrAsAI_3.setText("As a: <role>\nI want: <some goal>\n\n\nSo that: <some reason>");
		txtrAsAI_3.setForeground(Color.WHITE);
		txtrAsAI_3.setBackground(Color.LIGHT_GRAY);
		txtrAsAI_3.setBounds(6, 67, 422, 126);
		story2.add(txtrAsAI_3);
		
		JTextArea txtrUserStory_1 = new JTextArea();
		txtrUserStory_1.setText("User Story");
		txtrUserStory_1.setForeground(Color.WHITE);
		txtrUserStory_1.setEditable(false);
		txtrUserStory_1.setBackground(Color.BLACK);
		txtrUserStory_1.setBounds(6, 39, 72, 16);
		story2.add(txtrUserStory_1);
		
		JTextArea txtrStoryId_1 = new JTextArea();
		txtrStoryId_1.setText("Story ID");
		txtrStoryId_1.setForeground(Color.WHITE);
		txtrStoryId_1.setEditable(false);
		txtrStoryId_1.setBackground(Color.BLACK);
		txtrStoryId_1.setBounds(6, 11, 51, 16);
		story2.add(txtrStoryId_1);
		
		textField_5 = new JTextField();
		textField_5.setText("002");
		textField_5.setForeground(Color.WHITE);
		textField_5.setColumns(10);
		textField_5.setBackground(Color.BLACK);
		textField_5.setBounds(66, 6, 204, 26);
		story2.add(textField_5);
		
		JTextArea txtrStoryTitle_1 = new JTextArea();
		txtrStoryTitle_1.setText("Story Title");
		txtrStoryTitle_1.setForeground(Color.WHITE);
		txtrStoryTitle_1.setEditable(false);
		txtrStoryTitle_1.setBackground(Color.BLACK);
		txtrStoryTitle_1.setBounds(282, 11, 65, 16);
		story2.add(txtrStoryTitle_1);
		
		JPanel userStoryList = new JPanel();
		userStoryList.setBounds(256, 0, 185, 418);
		userStoryList.setBackground(Color.BLACK);
		userStoryList.setForeground(Color.WHITE);
		userStoryList.setBorder(new LineBorder(Color.LIGHT_GRAY, 2, true));
		mainContents.add(userStoryList);
		userStoryList.setLayout(null);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(164, 6, 15, 406);
		userStoryList.add(scrollBar);
		
		JButton btnNewButton = new JButton("story #1");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				storyListCarousel.removeAll();
				storyListCarousel.repaint();
				storyListCarousel.revalidate();
				storyListCarousel.add(story1);
			}
		});
		btnNewButton.setBounds(6, 6, 146, 29);
		userStoryList.add(btnNewButton);
		
		JButton btnStory = new JButton("story #2");
		btnStory.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				storyListCarousel.removeAll();
				storyListCarousel.repaint();
				storyListCarousel.revalidate();
				storyListCarousel.add(story2);
			}
		});
		btnStory.setBounds(6, 32, 146, 29);
		userStoryList.add(btnStory);
		
		JButton btnNewButton_2 = new JButton("Create User Story");
		btnNewButton_2.setBounds(97, 6, 139, 23);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CreateUserStory screen = new CreateUserStory();
				screen.setVisible(true);
				
				dispose();
			}
		});
		btnNewButton_2.setBackground(Color.BLACK);
		mainContents.add(btnNewButton_2);
		
		JPanel Footer = new JPanel();
		Footer.setBounds(-60, 500, 1464, 193);
		Footer.setBorder(new LineBorder(new Color(128, 128, 128), 3));
		Footer.setBackground(new Color(0, 0, 0));
		contentPane.add(Footer);
		Footer.setLayout(null);
		
		JLabel About = new JLabel("About");
		About.setFont(new Font("Arial", Font.PLAIN, 13));
		About.setForeground(new Color(255, 255, 255));
		About.setBounds(297, 115, 47, 13);
		Footer.add(About);
		
		JLabel termsOfUse = new JLabel("Terms of Use");
		termsOfUse.setFont(new Font("Arial", Font.PLAIN, 13));
		termsOfUse.setForeground(new Color(255, 255, 255));
		termsOfUse.setBounds(442, 115, 84, 13);
		Footer.add(termsOfUse);
		
		JLabel rulesOfPlay = new JLabel("Rules of Play");
		rulesOfPlay.setForeground(Color.WHITE);
		rulesOfPlay.setFont(new Font("Arial", Font.PLAIN, 13));
		rulesOfPlay.setBounds(638, 115, 104, 13);
		Footer.add(rulesOfPlay);
		
		JLabel privacyPolicy = new JLabel("Privacy Policy");
		privacyPolicy.setForeground(Color.WHITE);
		privacyPolicy.setFont(new Font("Arial", Font.PLAIN, 13));
		privacyPolicy.setBounds(824, 115, 84, 13);
		Footer.add(privacyPolicy);
		
		JLabel credits = new JLabel("Credits");
		credits.setForeground(Color.WHITE);
		credits.setFont(new Font("Arial", Font.PLAIN, 13));
		credits.setBounds(998, 115, 41, 13);
		Footer.add(credits);
		
		JLabel lblgroupS = new JLabel("©2023 Group Sharma LLC. All rights reserved.");
		lblgroupS.setForeground(Color.WHITE);
		lblgroupS.setFont(new Font("Arial", Font.PLAIN, 13));
		lblgroupS.setBounds(543, 150, 294, 13);
		Footer.add(lblgroupS);
		
		JButton btnNewButton_1_3 = new JButton("");
		btnNewButton_1_3.setForeground(Color.WHITE);
		btnNewButton_1_3.setBackground(Color.WHITE);
		btnNewButton_1_3.setBounds(658, 52, 42, 51);
		Footer.add(btnNewButton_1_3);
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
	}
}