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

public class CreateUserStory extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

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
		setBounds(100, 100, 1289, 700);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(-33, 55, 1366, 478);
		panel_1.setBackground(Color.BLACK);
		panel_1.setBorder(new LineBorder(Color.LIGHT_GRAY, 1, true));
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(882, 6, 246, 46);
		panel_1.add(panel_3);
		panel_3.setLayout(null);
		
		JProgressBar progressBar = new JProgressBar();
		progressBar.setBounds(6, 0, 246, 46);
		panel_3.add(progressBar);
		progressBar.setValue(75);
		progressBar.setForeground(Color.WHITE);
		progressBar.setBackground(Color.WHITE);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.BLACK);
		panel_2.setBorder(new LineBorder(new Color(192, 192, 192), 2, true));
		panel_2.setBounds(-43, 60, 1391, 418);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		JTextArea txtrStoryId = new JTextArea();
		txtrStoryId.setBounds(457, 27, 51, 16);
		panel_2.add(txtrStoryId);
		txtrStoryId.setBackground(Color.BLACK);
		txtrStoryId.setForeground(Color.WHITE);
		txtrStoryId.setText("Story ID");
		txtrStoryId.setEditable(false);
		
		textField = new JTextField();
		textField.setBounds(517, 22, 204, 26);
		panel_2.add(textField);
		textField.setBackground(Color.BLACK);
		textField.setForeground(Color.WHITE);
		textField.setColumns(10);
		
		JTextArea txtrUserStory = new JTextArea();
		txtrUserStory.setBounds(457, 55, 72, 16);
		panel_2.add(txtrUserStory);
		txtrUserStory.setBackground(Color.BLACK);
		txtrUserStory.setForeground(Color.WHITE);
		txtrUserStory.setText("User Story");
		txtrUserStory.setEditable(false);
		
		textField_1 = new JTextField();
		textField_1.setBounds(810, 22, 204, 26);
		panel_2.add(textField_1);
		textField_1.setBackground(Color.BLACK);
		textField_1.setForeground(Color.WHITE);
		textField_1.setColumns(10);
		
		JTextArea txtrStoryTitle = new JTextArea();
		txtrStoryTitle.setBounds(733, 27, 65, 16);
		panel_2.add(txtrStoryTitle);
		txtrStoryTitle.setBackground(Color.BLACK);
		txtrStoryTitle.setForeground(Color.WHITE);
		txtrStoryTitle.setText("Story Title");
		txtrStoryTitle.setEditable(false);
		
		JTextArea txtrAsAI = new JTextArea();
		txtrAsAI.setBounds(457, 83, 422, 126);
		panel_2.add(txtrAsAI);
		txtrAsAI.setBackground(Color.LIGHT_GRAY);
		txtrAsAI.setForeground(Color.WHITE);
		txtrAsAI.setText("As a: <role>\nI want: <some goal>\n\n\nSo that: <some reason>");
		
		JTextArea txtrAsAI_1 = new JTextArea();
		txtrAsAI_1.setBounds(922, 83, 92, 67);
		panel_2.add(txtrAsAI_1);
		txtrAsAI_1.setBackground(Color.LIGHT_GRAY);
		txtrAsAI_1.setForeground(Color.WHITE);
		
		JTextArea txtrImportance = new JTextArea();
		txtrImportance.setBounds(925, 55, 89, 16);
		panel_2.add(txtrImportance);
		txtrImportance.setBackground(Color.BLACK);
		txtrImportance.setForeground(Color.WHITE);
		txtrImportance.setText("Importance:");
		txtrImportance.setEditable(false);
		
		JTextArea txtrAsAI_2 = new JTextArea();
		txtrAsAI_2.setBounds(457, 248, 422, 126);
		panel_2.add(txtrAsAI_2);
		txtrAsAI_2.setBackground(Color.LIGHT_GRAY);
		txtrAsAI_2.setForeground(Color.WHITE);
		txtrAsAI_2.setText("And I know I am done when:");
		
		JTextArea txtrAcceptanceCriteria = new JTextArea();
		txtrAcceptanceCriteria.setBounds(457, 220, 136, 16);
		panel_2.add(txtrAcceptanceCriteria);
		txtrAcceptanceCriteria.setBackground(Color.BLACK);
		txtrAcceptanceCriteria.setForeground(Color.WHITE);
		txtrAcceptanceCriteria.setText("Acceptance Criteria");
		txtrAcceptanceCriteria.setEditable(false);
		
		JPanel panel = new JPanel();
		panel.setBounds(440, 6, 592, 404);
		panel_2.add(panel);
		panel.setBorder(new LineBorder(Color.LIGHT_GRAY, 2, true));
		panel.setBackground(Color.BLACK);
		panel.setLayout(null);
		
		JTextArea txtrEstimate = new JTextArea();
		txtrEstimate.setBounds(485, 165, 89, 16);
		panel.add(txtrEstimate);
		txtrEstimate.setBackground(Color.BLACK);
		txtrEstimate.setForeground(Color.WHITE);
		txtrEstimate.setText("Estimate:");
		txtrEstimate.setEditable(false);
		
		JTextArea txtrAsAI_1_1 = new JTextArea();
		txtrAsAI_1_1.setForeground(Color.WHITE);
		txtrAsAI_1_1.setBackground(Color.LIGHT_GRAY);
		txtrAsAI_1_1.setBounds(482, 193, 92, 67);
		panel.add(txtrAsAI_1_1);
		
		JTextArea txtrAssigned = new JTextArea();
		txtrAssigned.setText("Assigned To:");
		txtrAssigned.setForeground(Color.WHITE);
		txtrAssigned.setEditable(false);
		txtrAssigned.setBackground(Color.BLACK);
		txtrAssigned.setBounds(458, 272, 92, 16);
		panel.add(txtrAssigned);
		
		textField_2 = new JTextField();
		textField_2.setForeground(Color.WHITE);
		textField_2.setColumns(10);
		textField_2.setBackground(Color.BLACK);
		textField_2.setBounds(452, 300, 122, 26);
		panel.add(textField_2);
		
		JButton btnNewButton = new JButton("Add User Story");
		btnNewButton.setBackground(Color.LIGHT_GRAY);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(457, 340, 117, 42);
		panel.add(btnNewButton);
		
		JTextArea txtrProductOwner = new JTextArea();
		txtrProductOwner.setText("Product Owner");
		txtrProductOwner.setForeground(Color.RED);
		txtrProductOwner.setFont(new Font("Quill Sword", Font.BOLD, 30));
		txtrProductOwner.setEditable(false);
		txtrProductOwner.setBackground(Color.BLACK);
		txtrProductOwner.setBounds(151, 16, 145, 32);
		panel_1.add(txtrProductOwner);
		
		JTextArea txtrSprint = new JTextArea();
		txtrSprint.setText("Sprint 1");
		txtrSprint.setForeground(Color.WHITE);
		txtrSprint.setFont(new Font("Quill Sword", Font.BOLD, 30));
		txtrSprint.setEditable(false);
		txtrSprint.setBackground(Color.BLACK);
		txtrSprint.setBounds(1159, 16, 87, 32);
		panel_1.add(txtrSprint);
		
		JTextArea txtrAgilerealmsHerosOf = new JTextArea();
		txtrAgilerealmsHerosOf.setBounds(6, 6, 145, 32);
		txtrAgilerealmsHerosOf.setFont(new Font("Quill Sword", Font.BOLD, 30));
		txtrAgilerealmsHerosOf.setText("AgileRealms");
		txtrAgilerealmsHerosOf.setEditable(false);
		txtrAgilerealmsHerosOf.setForeground(Color.WHITE);
		txtrAgilerealmsHerosOf.setBackground(new Color(0, 0, 0));
		contentPane.add(txtrAgilerealmsHerosOf);
		
		JTextArea txtrHerosOfThe = new JTextArea();
		txtrHerosOfThe.setBounds(52, 34, 145, 26);
		contentPane.add(txtrHerosOfThe);
		txtrHerosOfThe.setText("heros of the Backlog");
		txtrHerosOfThe.setForeground(Color.WHITE);
		txtrHerosOfThe.setFont(new Font("Quill Sword", Font.BOLD, 20));
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
	}
}
