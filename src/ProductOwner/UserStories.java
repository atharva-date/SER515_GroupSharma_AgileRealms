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

public class UserStories extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

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
		
		JPanel panel = new JPanel();
		panel.setBounds(440, 0, 592, 418);
		panel_2.add(panel);
		panel.setBorder(new LineBorder(Color.LIGHT_GRAY, 2, true));
		panel.setBackground(Color.BLACK);
		panel.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setViewportBorder(new LineBorder(Color.RED, 2, true));
		scrollPane.setBounds(148, 69, 295, 185);
		panel.add(scrollPane);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(Color.BLACK);
		panel_4.setForeground(Color.WHITE);
		panel_4.setBorder(new LineBorder(Color.LIGHT_GRAY, 2, true));
		panel_4.setBounds(303, 0, 138, 418);
		panel_2.add(panel_4);
		
		JPanel panel_4_1 = new JPanel();
		panel_4_1.setForeground(Color.WHITE);
		panel_4_1.setBorder(new LineBorder(Color.LIGHT_GRAY, 2, true));
		panel_4_1.setBackground(Color.BLACK);
		panel_4_1.setBounds(1030, 0, 138, 418);
		panel_2.add(panel_4_1);
		
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
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setBounds(39, 1, 42, 51);
		panel_1.add(btnNewButton_1);
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setBackground(Color.WHITE);
		
		JButton btnNewButton_1_1 = new JButton("");
		btnNewButton_1_1.setForeground(Color.WHITE);
		btnNewButton_1_1.setBackground(Color.WHITE);
		btnNewButton_1_1.setBounds(81, 1, 42, 51);
		panel_1.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_2 = new JButton("");
		btnNewButton_1_2.setForeground(Color.WHITE);
		btnNewButton_1_2.setBackground(Color.WHITE);
		btnNewButton_1_2.setBounds(1269, 1, 42, 51);
		panel_1.add(btnNewButton_1_2);
		
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
		txtrPlayNow.setText("play Now");
		txtrPlayNow.setForeground(Color.WHITE);
		txtrPlayNow.setFont(new Font("Quill Sword", Font.BOLD, 30));
		txtrPlayNow.setEditable(false);
		txtrPlayNow.setBackground(Color.BLACK);
		txtrPlayNow.setBounds(1188, 11, 95, 32);
		contentPane.add(txtrPlayNow);
		
		JTextArea txtrCustomizations = new JTextArea();
		txtrCustomizations.setText("Customizations");
		txtrCustomizations.setForeground(Color.WHITE);
		txtrCustomizations.setFont(new Font("Quill Sword", Font.BOLD, 30));
		txtrCustomizations.setEditable(false);
		txtrCustomizations.setBackground(Color.BLACK);
		txtrCustomizations.setBounds(988, 11, 159, 32);
		contentPane.add(txtrCustomizations);
		
		JTextArea txtrGuide = new JTextArea();
		txtrGuide.setText("Guide");
		txtrGuide.setForeground(Color.WHITE);
		txtrGuide.setFont(new Font("Quill Sword", Font.BOLD, 30));
		txtrGuide.setEditable(false);
		txtrGuide.setBackground(Color.BLACK);
		txtrGuide.setBounds(874, 11, 58, 32);
		contentPane.add(txtrGuide);
	}
}