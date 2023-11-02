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
import java.awt.TextField;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JProgressBar;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JScrollBar;
import javax.swing.JLayeredPane;
import javax.swing.border.TitledBorder;
import java.awt.CardLayout;

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
		setBounds(100, 100, 1289, 700);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel card = new JPanel();
		card.setBounds(-33, 55, 1366, 478);
		card.setBackground(Color.BLACK);
		card.setBorder(new LineBorder(Color.LIGHT_GRAY, 1, true));
		contentPane.add(card);
		card.setLayout(null);
		
		JPanel progress = new JPanel();
		progress.setBorder(new LineBorder(new Color(192, 192, 192), 1, true));
		progress.setBackground(Color.BLACK);
		progress.setBounds(882, 6, 246, 46);
		card.add(progress);
		progress.setLayout(null);
		
		JProgressBar progressBar = new JProgressBar();
		progressBar.setBounds(0, 6, 246, 34);
		progress.add(progressBar);
		progressBar.setValue(75);
		progressBar.setForeground(Color.BLACK);
		progressBar.setBackground(Color.BLACK);
		
		JPanel mainContents = new JPanel();
		mainContents.setBackground(Color.BLACK);
		mainContents.setBorder(new LineBorder(new Color(192, 192, 192), 2, true));
		mainContents.setBounds(-43, 60, 1391, 418);
		card.add(mainContents);
		mainContents.setLayout(null);
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(440, 0, 602, 418);
		layeredPane.setBackground(Color.BLACK);
		layeredPane.setBorder(new LineBorder(new Color(192, 192, 192), 2, true));
		mainContents.add(layeredPane);
		layeredPane.setLayout(new CardLayout(0, 0));
		
		JPanel story1 = new JPanel();
		story1.setBackground(Color.BLACK);
		layeredPane.add(story1, "name_130843980454285");
		story1.setLayout(null);
		
		JTextArea txtrStoryId = new JTextArea();
		txtrStoryId.setText("Story ID");
		txtrStoryId.setForeground(Color.WHITE);
		txtrStoryId.setEditable(false);
		txtrStoryId.setBackground(Color.BLACK);
		txtrStoryId.setBounds(6, 11, 51, 16);
		story1.add(txtrStoryId);
		
		textField = new JTextField();
		textField.setText("001");
		textField.setForeground(Color.WHITE);
		textField.setColumns(10);
		textField.setBackground(Color.BLACK);
		textField.setBounds(66, 6, 204, 26);
		story1.add(textField);
		
		JTextArea txtrStoryTitle = new JTextArea();
		txtrStoryTitle.setText("Story Title");
		txtrStoryTitle.setForeground(Color.WHITE);
		txtrStoryTitle.setEditable(false);
		txtrStoryTitle.setBackground(Color.BLACK);
		txtrStoryTitle.setBounds(282, 11, 65, 16);
		story1.add(txtrStoryTitle);
		
		txtStory_1 = new JTextField();
		txtStory_1.setText("Story 1");
		txtStory_1.setForeground(Color.WHITE);
		txtStory_1.setColumns(10);
		txtStory_1.setBackground(Color.BLACK);
		txtStory_1.setBounds(359, 6, 204, 26);
		story1.add(txtStory_1);
		
		JTextArea txtrImportance = new JTextArea();
		txtrImportance.setText("Importance:");
		txtrImportance.setForeground(Color.WHITE);
		txtrImportance.setEditable(false);
		txtrImportance.setBackground(Color.BLACK);
		txtrImportance.setBounds(474, 39, 89, 16);
		story1.add(txtrImportance);
		
		JTextArea txtrAsAI_1 = new JTextArea();
		txtrAsAI_1.setForeground(Color.WHITE);
		txtrAsAI_1.setBackground(Color.LIGHT_GRAY);
		txtrAsAI_1.setBounds(471, 67, 92, 67);
		story1.add(txtrAsAI_1);
		
		JTextArea txtrAsAI = new JTextArea();
		txtrAsAI.setText("As a: <role>\nI want: <some goal>\n\n\nSo that: <some reason>");
		txtrAsAI.setForeground(Color.WHITE);
		txtrAsAI.setBackground(Color.LIGHT_GRAY);
		txtrAsAI.setBounds(6, 67, 422, 126);
		story1.add(txtrAsAI);
		
		JTextArea txtrUserStory = new JTextArea();
		txtrUserStory.setText("User Story");
		txtrUserStory.setForeground(Color.WHITE);
		txtrUserStory.setEditable(false);
		txtrUserStory.setBackground(Color.BLACK);
		txtrUserStory.setBounds(6, 39, 72, 16);
		story1.add(txtrUserStory);
		
		JTextArea txtrAsAI_2 = new JTextArea();
		txtrAsAI_2.setText("And I know I am done when:");
		txtrAsAI_2.setForeground(Color.WHITE);
		txtrAsAI_2.setBackground(Color.LIGHT_GRAY);
		txtrAsAI_2.setBounds(6, 232, 422, 126);
		story1.add(txtrAsAI_2);
		
		JTextArea txtrAcceptanceCriteria = new JTextArea();
		txtrAcceptanceCriteria.setText("Acceptance Criteria");
		txtrAcceptanceCriteria.setForeground(Color.WHITE);
		txtrAcceptanceCriteria.setEditable(false);
		txtrAcceptanceCriteria.setBackground(Color.BLACK);
		txtrAcceptanceCriteria.setBounds(6, 204, 136, 16);
		story1.add(txtrAcceptanceCriteria);
		
		JTextArea txtrAsAI_1_1 = new JTextArea();
		txtrAsAI_1_1.setForeground(Color.WHITE);
		txtrAsAI_1_1.setBackground(Color.LIGHT_GRAY);
		txtrAsAI_1_1.setBounds(471, 183, 92, 67);
		story1.add(txtrAsAI_1_1);
		
		JTextArea txtrEstimate = new JTextArea();
		txtrEstimate.setText("Estimate:");
		txtrEstimate.setForeground(Color.WHITE);
		txtrEstimate.setEditable(false);
		txtrEstimate.setBackground(Color.BLACK);
		txtrEstimate.setBounds(474, 155, 89, 16);
		story1.add(txtrEstimate);
		
		JTextArea txtrAssigned = new JTextArea();
		txtrAssigned.setText("Assigned To:");
		txtrAssigned.setForeground(Color.WHITE);
		txtrAssigned.setEditable(false);
		txtrAssigned.setBackground(Color.BLACK);
		txtrAssigned.setBounds(447, 262, 92, 16);
		story1.add(txtrAssigned);
		
		textField_2 = new JTextField();
		textField_2.setForeground(Color.WHITE);
		textField_2.setColumns(10);
		textField_2.setBackground(Color.BLACK);
		textField_2.setBounds(441, 290, 122, 26);
		story1.add(textField_2);
		
		JPanel story2 = new JPanel();
		story2.setBackground(Color.BLACK);
		layeredPane.add(story2, "name_130866315885737");
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
				layeredPane.removeAll();
				layeredPane.repaint();
				layeredPane.revalidate();
				layeredPane.add(story1);
			}
		});
		btnNewButton.setBounds(6, 6, 146, 29);
		userStoryList.add(btnNewButton);
		
		JButton btnStory = new JButton("story #2");
		btnStory.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layeredPane.removeAll();
				layeredPane.repaint();
				layeredPane.revalidate();
				layeredPane.add(story2);
			}
		});
		btnStory.setBounds(6, 32, 146, 29);
		userStoryList.add(btnStory);
		
		JButton btnNewButton_2 = new JButton("Create User Story");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CreateUserStory frame = new CreateUserStory();
				frame.setVisible(true);	
				
			}
		});
		btnNewButton_2.setBackground(Color.BLACK);
		btnNewButton_2.setBounds(97, 6, 139, 23);
		mainContents.add(btnNewButton_2);
		
		JTextArea txtrProductOwner = new JTextArea();
		txtrProductOwner.setText("Product Owner");
		txtrProductOwner.setForeground(Color.RED);
		txtrProductOwner.setFont(new Font("Quill Sword", Font.BOLD, 30));
		txtrProductOwner.setEditable(false);
		txtrProductOwner.setBackground(Color.BLACK);
		txtrProductOwner.setBounds(151, 16, 145, 32);
		card.add(txtrProductOwner);
		
		JTextArea txtrSprint = new JTextArea();
		txtrSprint.setText("Sprint 1");
		txtrSprint.setForeground(Color.WHITE);
		txtrSprint.setFont(new Font("Quill Sword", Font.BOLD, 30));
		txtrSprint.setEditable(false);
		txtrSprint.setBackground(Color.BLACK);
		txtrSprint.setBounds(1159, 16, 87, 32);
		card.add(txtrSprint);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setBounds(50, 1, 42, 51);
		card.add(btnNewButton_1);
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setBackground(Color.WHITE);
		
		JButton btnNewButton_1_1 = new JButton("");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1_1.setForeground(Color.WHITE);
		btnNewButton_1_1.setBackground(Color.WHITE);
		btnNewButton_1_1.setBounds(92, 1, 42, 51);
		card.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_2 = new JButton("");
		btnNewButton_1_2.setForeground(Color.WHITE);
		btnNewButton_1_2.setBackground(Color.WHITE);
		btnNewButton_1_2.setBounds(1269, 1, 42, 51);
		card.add(btnNewButton_1_2);
		
		JTextArea txtrAgilerealmsHerosOf = new JTextArea();
		txtrAgilerealmsHerosOf.setBounds(28, 0, 145, 32);
		txtrAgilerealmsHerosOf.setFont(new Font("Quill Sword", Font.BOLD, 30));
		txtrAgilerealmsHerosOf.setText("AgileRealms");
		txtrAgilerealmsHerosOf.setEditable(false);
		txtrAgilerealmsHerosOf.setForeground(Color.WHITE);
		txtrAgilerealmsHerosOf.setBackground(new Color(0, 0, 0));
		contentPane.add(txtrAgilerealmsHerosOf);
		
		JTextArea txtrHerosOfThe = new JTextArea();
		txtrHerosOfThe.setBounds(28, 33, 145, 26);
		contentPane.add(txtrHerosOfThe);
		txtrHerosOfThe.setText("heros of the Backlog");
		txtrHerosOfThe.setForeground(Color.WHITE);
		txtrHerosOfThe.setFont(new Font("Quill Sword", Font.PLAIN, 20));
		txtrHerosOfThe.setEditable(false);
		txtrHerosOfThe.setBackground(Color.BLACK);
		
		JPanel Footer = new JPanel();
		Footer.setBounds(-60, 500, 1366, 193);
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
		
		JTextArea txtrPlayNow = new JTextArea();
		txtrPlayNow.setBounds(1188, 11, 95, 32);
		txtrPlayNow.setText("play Now");
		txtrPlayNow.setForeground(Color.WHITE);
		txtrPlayNow.setFont(new Font("Quill Sword", Font.BOLD, 30));
		txtrPlayNow.setEditable(false);
		txtrPlayNow.setBackground(Color.BLACK);
		contentPane.add(txtrPlayNow);
		
		JTextArea txtrCustomizations = new JTextArea();
		txtrCustomizations.setBounds(988, 11, 159, 32);
		txtrCustomizations.setText("Customizations");
		txtrCustomizations.setForeground(Color.WHITE);
		txtrCustomizations.setFont(new Font("Quill Sword", Font.BOLD, 30));
		txtrCustomizations.setEditable(false);
		txtrCustomizations.setBackground(Color.BLACK);
		contentPane.add(txtrCustomizations);
		
		JTextArea txtrGuide = new JTextArea();
		txtrGuide.setBounds(874, 11, 58, 32);
		txtrGuide.setText("Guide");
		txtrGuide.setForeground(Color.WHITE);
		txtrGuide.setFont(new Font("Quill Sword", Font.BOLD, 30));
		txtrGuide.setEditable(false);
		txtrGuide.setBackground(Color.BLACK);
		contentPane.add(txtrGuide);
	}
}