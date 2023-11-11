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

public class StoryTasks extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField txtUserStory;
	private JTextField txtTaskDetails;
	private JTextField textField_2;
	private JTextField txtUserStory_1;
	private JTextField txtTaskDetails_1;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StoryTasks frame = new StoryTasks();
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
	public StoryTasks() {
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
		
		JLayeredPane userStories = new JLayeredPane();
		userStories.setBackground(Color.BLACK);
		userStories.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		userStories.setBounds(202, 6, 389, 415);
		scen1.add(userStories);
		userStories.setLayout(new CardLayout(0, 0));
		
		JPanel userStory1 = new JPanel();
		userStory1.setBackground(Color.BLACK);
		userStory1.setBorder(new LineBorder(Color.LIGHT_GRAY, 2, true));
		userStories.add(userStory1, "name_5275133591940");
		userStory1.setLayout(null);
		
		JLabel lblStoryId_1 = new JLabel("Story Id:");
		lblStoryId_1.setForeground(Color.WHITE);
		lblStoryId_1.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblStoryId_1.setBackground(Color.BLACK);
		lblStoryId_1.setBounds(6, 7, 74, 23);
		userStory1.add(lblStoryId_1);
		
		textField_2 = new JTextField();
		textField_2.setText(" #1");
		textField_2.setForeground(Color.WHITE);
		textField_2.setEditable(false);
		textField_2.setColumns(10);
		textField_2.setBackground(Color.BLACK);
		textField_2.setBounds(67, 6, 130, 26);
		userStory1.add(textField_2);
		
		txtUserStory_1 = new JTextField();
		txtUserStory_1.setText(" User Story #1 Details");
		txtUserStory_1.setForeground(Color.WHITE);
		txtUserStory_1.setEditable(false);
		txtUserStory_1.setColumns(10);
		txtUserStory_1.setBackground(Color.BLACK);
		txtUserStory_1.setBounds(45, 106, 279, 205);
		userStory1.add(txtUserStory_1);
		
		JPanel userStory2 = new JPanel();
		userStory2.setBackground(Color.BLACK);
		userStory2.setBorder(new LineBorder(Color.LIGHT_GRAY, 2, true));
		userStories.add(userStory2, "name_5303862251932");
		userStory2.setLayout(null);
		
		JLabel lblStoryId = new JLabel("Story Id:");
		lblStoryId.setForeground(Color.WHITE);
		lblStoryId.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblStoryId.setBackground(Color.BLACK);
		lblStoryId.setBounds(6, 7, 74, 23);
		userStory2.add(lblStoryId);
		
		textField_1 = new JTextField();
		textField_1.setText(" #2");
		textField_1.setEditable(false);
		textField_1.setForeground(Color.WHITE);
		textField_1.setColumns(10);
		textField_1.setBackground(Color.BLACK);
		textField_1.setBounds(67, 6, 130, 26);
		userStory2.add(textField_1);
		
		txtUserStory = new JTextField();
		txtUserStory.setBackground(Color.BLACK);
		txtUserStory.setEditable(false);
		txtUserStory.setForeground(Color.WHITE);
		txtUserStory.setText(" User Story #2 Details");
		txtUserStory.setBounds(45, 106, 279, 205);
		userStory2.add(txtUserStory);
		txtUserStory.setColumns(10);
		
		JLayeredPane storyTasks = new JLayeredPane();
		storyTasks.setBackground(Color.BLACK);
		storyTasks.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		storyTasks.setBounds(603, 6, 498, 415);
		scen1.add(storyTasks);
		storyTasks.setLayout(new CardLayout(0, 0));
		
		JPanel task1 = new JPanel();
		task1.setBackground(Color.BLACK);
		task1.setBorder(new LineBorder(Color.LIGHT_GRAY, 2, true));
		storyTasks.add(task1, "name_5361039453248");
		task1.setLayout(null);
		
		txtTaskDetails_1 = new JTextField();
		txtTaskDetails_1.setText(" Task #1 Details");
		txtTaskDetails_1.setForeground(Color.WHITE);
		txtTaskDetails_1.setEditable(false);
		txtTaskDetails_1.setColumns(10);
		txtTaskDetails_1.setBackground(Color.BLACK);
		txtTaskDetails_1.setBounds(67, 97, 279, 205);
		task1.add(txtTaskDetails_1);
		
		textField_4 = new JTextField();
		textField_4.setText(" #1");
		textField_4.setForeground(Color.WHITE);
		textField_4.setColumns(10);
		textField_4.setBackground(Color.BLACK);
		textField_4.setBounds(67, 6, 130, 26);
		task1.add(textField_4);
		
		JLabel lblNewLabel_1 = new JLabel("Task Id:");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblNewLabel_1.setBackground(Color.BLACK);
		lblNewLabel_1.setBounds(6, 7, 74, 23);
		task1.add(lblNewLabel_1);
		
		JPopupMenu popupMenu_11 = new JPopupMenu();
		popupMenu_11.setForeground(Color.WHITE);
		popupMenu_11.setBackground(Color.LIGHT_GRAY);
		popupMenu_11.setBounds(411, 6, 200, 50);
		task1.add(popupMenu_11);
		
		JMenuItem mntmNew_11 = new JMenuItem("New");
		mntmNew_11.setForeground(Color.WHITE);
		mntmNew_11.setBackground(Color.BLACK);
		popupMenu_11.add(mntmNew_11);
		
		JMenuItem mntmInProgress_11 = new JMenuItem("In Progress");
		mntmInProgress_11.setForeground(Color.WHITE);
		mntmInProgress_11.setBackground(Color.BLACK);
		popupMenu_11.add(mntmInProgress_11);
		
		JMenuItem mntmTesting_11 = new JMenuItem("Testing");
		mntmTesting_11.setForeground(Color.WHITE);
		mntmTesting_11.setBackground(Color.BLACK);
		popupMenu_11.add(mntmTesting_11);
		
		JMenuItem mntmDone_11 = new JMenuItem("Done");
		mntmDone_11.setForeground(Color.WHITE);
		mntmDone_11.setBackground(Color.BLACK);
		popupMenu_11.add(mntmDone_11);
		
		JButton btnStatus_1 = new JButton("Status");
		btnStatus_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				popupMenu_11.show(btnStatus_1, 0, btnStatus_1.getHeight());
			}
		});
		btnStatus_1.setForeground(Color.WHITE);
		btnStatus_1.setFont(new Font("Dialog", Font.PLAIN, 15));
		btnStatus_1.setBorder(new LineBorder(Color.LIGHT_GRAY, 2, true));
		btnStatus_1.setBackground(Color.LIGHT_GRAY);
		btnStatus_1.setBounds(209, 7, 102, 23);
		task1.add(btnStatus_1);
		
		JPanel task2 = new JPanel();
		task2.setBackground(Color.BLACK);
		task2.setBorder(new LineBorder(Color.LIGHT_GRAY, 2, true));
		storyTasks.add(task2, "name_5366599599924");
		task2.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Task Id:");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBackground(Color.BLACK);
		lblNewLabel.setBounds(6, 6, 74, 23);
		task2.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setText(" #2");
		textField.setBackground(Color.BLACK);
		textField.setForeground(Color.WHITE);
		textField.setBounds(67, 5, 130, 26);
		task2.add(textField);
		textField.setColumns(10);
		
		JPopupMenu popupMenu = new JPopupMenu();
		popupMenu.setForeground(Color.WHITE);
		popupMenu.setBackground(Color.LIGHT_GRAY);
		popupMenu.setBounds(411, 6, 200, 50);
		task2.add(popupMenu);
		
		JMenuItem mntmNew = new JMenuItem("New");
		mntmNew.setForeground(Color.WHITE);
		mntmNew.setBackground(Color.BLACK);
		popupMenu.add(mntmNew);
		
		JMenuItem mntmInProgress = new JMenuItem("In Progress");
		mntmInProgress.setForeground(Color.WHITE);
		mntmInProgress.setBackground(Color.BLACK);
		popupMenu.add(mntmInProgress);
		
		JMenuItem mntmTesting = new JMenuItem("Testing");
		mntmTesting.setForeground(Color.WHITE);
		mntmTesting.setBackground(Color.BLACK);
		popupMenu.add(mntmTesting);
		
		JMenuItem mntmDone = new JMenuItem("Done");
		mntmDone.setForeground(Color.WHITE);
		mntmDone.setBackground(Color.BLACK);
		popupMenu.add(mntmDone);
		
		JButton btnStatus = new JButton("Status");
		btnStatus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				popupMenu.show(btnStatus, 0, btnStatus.getHeight());
			}
		});
		btnStatus.setForeground(Color.WHITE);
		btnStatus.setFont(new Font("Dialog", Font.PLAIN, 15));
		btnStatus.setBorder(new LineBorder(Color.LIGHT_GRAY, 2, true));
		btnStatus.setBackground(Color.LIGHT_GRAY);
		btnStatus.setBounds(209, 6, 102, 23);
		task2.add(btnStatus);
		
		txtTaskDetails = new JTextField();
		txtTaskDetails.setText(" Task #2 Details");
		txtTaskDetails.setForeground(Color.WHITE);
		txtTaskDetails.setEditable(false);
		txtTaskDetails.setColumns(10);
		txtTaskDetails.setBackground(Color.BLACK);
		txtTaskDetails.setBounds(67, 96, 279, 205);
		task2.add(txtTaskDetails);
		
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.BLACK);
		panel.setBorder(new LineBorder(Color.LIGHT_GRAY, 2, true));
		panel.setBounds(55, 6, 141, 415);
		scen1.add(panel);
		panel.setLayout(null);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(120, 6, 15, 403);
		panel.add(scrollBar);
		
		JButton btnNewButton = new JButton("User Story #1");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				userStories.removeAll();
				userStories.repaint();
				userStories.revalidate();
				userStories.add(userStory1);
			}
		});
		btnNewButton.setBounds(0, 6, 117, 29);
		panel.add(btnNewButton);
		
		JButton btnUserStory = new JButton("User Story #2");
		btnUserStory.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				userStories.removeAll();
				userStories.repaint();
				userStories.revalidate();
				userStories.add(userStory2);
			}
		});
		btnUserStory.setBounds(0, 34, 117, 29);
		panel.add(btnUserStory);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new LineBorder(Color.LIGHT_GRAY, 2, true));
		panel_1.setBackground(Color.BLACK);
		panel_1.setBounds(1113, 6, 141, 415);
		scen1.add(panel_1);
		
		JScrollBar scrollBar_1 = new JScrollBar();
		scrollBar_1.setBounds(120, 6, 15, 403);
		panel_1.add(scrollBar_1);
		
		JButton btnTask = new JButton("Task 1");
		btnTask.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				storyTasks.removeAll();
				storyTasks.repaint();
				storyTasks.revalidate();
				storyTasks.add(task1);
			}
		});
		btnTask.setBounds(0, 6, 117, 29);
		panel_1.add(btnTask);
		
		JButton btnNewButton_1_1 = new JButton("Task 2");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				storyTasks.removeAll();
				storyTasks.repaint();
				storyTasks.revalidate();
				storyTasks.add(task2);
			}
		});
		btnNewButton_1_1.setBounds(0, 35, 117, 29);
		panel_1.add(btnNewButton_1_1);
		
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
