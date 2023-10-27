package ScrumMaster;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.border.LineBorder;
import javax.swing.JScrollBar;

public class SprintDuration extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SprintDuration frame = new SprintDuration();
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
	public SprintDuration() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1366, 700);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setForeground(new Color(255, 255, 255));
		contentPane.setBorder(new LineBorder(null));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setForeground(new Color(0, 0, 0));
		panel.setBorder(new LineBorder(new Color(128, 128, 128), 3));
		panel.setBackground(new Color(0, 0, 0));
		panel.setBounds(0, 0, 1283, 78);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel txtrAgilerealmsHerosOf = new JLabel();
		txtrAgilerealmsHerosOf.setFont(new Font("Quill Sword", Font.BOLD, 30));
		txtrAgilerealmsHerosOf.setText("AgileRealms");
		txtrAgilerealmsHerosOf.setForeground(Color.WHITE);
		txtrAgilerealmsHerosOf.setBackground(Color.BLACK);
		txtrAgilerealmsHerosOf.setBounds(6, 6, 191, 39);
		panel.add(txtrAgilerealmsHerosOf);

		
		JLabel txtrHerosOfThe = new JLabel();
		txtrHerosOfThe.setBounds(49, 41, 207, 26);
		txtrHerosOfThe.setText("heros of the Backlog");
		txtrHerosOfThe.setForeground(Color.WHITE);
		txtrHerosOfThe.setFont(new Font("Quill Sword", Font.BOLD, 20));
		txtrHerosOfThe.setBackground(Color.BLACK);
		panel.add(txtrHerosOfThe);
		
		
		JPanel panel_SM = new JPanel();
		panel_SM.setBorder(new LineBorder(new Color(128, 128, 128), 3));
		panel_SM.setBackground(new Color(0, 0, 0));
		panel_SM.setBounds(0, 78, 1283, 70);
		contentPane.add(panel_SM);
		panel_SM.setLayout(null);
		
		JLabel lbl_Scrum_Master = new JLabel("SCRUM Master");
		lbl_Scrum_Master.setForeground(new Color(255, 255, 255));
		lbl_Scrum_Master.setFont(new Font("Tahoma", Font.PLAIN, 33));
		lbl_Scrum_Master.setBounds(10, 11, 217, 48);
		panel_SM.add(lbl_Scrum_Master);
		
//		JPanel panel_2 = new JPanel();
//		panel_2.setBorder(new LineBorder(new Color(255, 255, 255)));
//		panel_2.setBackground(new Color(0, 0, 0));
//		panel_2.setBounds(0, 488, 1283, 104);
//		contentPane.add(panel_2);
//		panel_2.setLayout(null);
//		
//		JLabel lblNewLabel_3 = new JLabel("About");
//		lblNewLabel_3.setForeground(new Color(255, 255, 255));
//		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
//		lblNewLabel_3.setBounds(183, 38, 55, 30);
//		panel_2.add(lblNewLabel_3);
//		
//		JLabel lblNewLabel_3_1 = new JLabel("Terms of Use");
//		lblNewLabel_3_1.setForeground(new Color(255, 255, 255));
//		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
//		lblNewLabel_3_1.setBounds(374, 38, 117, 30);
//		panel_2.add(lblNewLabel_3_1);
//		
//		JLabel lblNewLabel_3_1_1 = new JLabel("Rules of Play");
//		lblNewLabel_3_1_1.setForeground(new Color(255, 255, 255));
//		lblNewLabel_3_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
//		lblNewLabel_3_1_1.setBounds(607, 38, 117, 30);
//		panel_2.add(lblNewLabel_3_1_1);
//		
//		JLabel lblNewLabel_3_1_1_1 = new JLabel("Privacy Policy");
//		lblNewLabel_3_1_1_1.setForeground(new Color(255, 255, 255));
//		lblNewLabel_3_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
//		lblNewLabel_3_1_1_1.setBounds(822, 38, 127, 30);
//		panel_2.add(lblNewLabel_3_1_1_1);
//		
//		JLabel lblNewLabel_3_1_1_1_1 = new JLabel("Credits");
//		lblNewLabel_3_1_1_1_1.setForeground(new Color(255, 255, 255));
//		lblNewLabel_3_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
//		lblNewLabel_3_1_1_1_1.setBounds(1061, 38, 72, 30);
//		panel_2.add(lblNewLabel_3_1_1_1_1);
		
		JLabel lbl_Sprint_Duration = new JLabel("Define Sprint Duration");
		lbl_Sprint_Duration.setFont(new Font("Tahoma", Font.PLAIN, 35));
		lbl_Sprint_Duration.setForeground(Color.WHITE);
		lbl_Sprint_Duration.setBounds(500, 161, 369, 62);
		contentPane.add(lbl_Sprint_Duration);
		
		JButton btn_Set_Duration = new JButton("Set Sprint Duration");
		btn_Set_Duration.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btn_Set_Duration.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn_Set_Duration.setBounds(543, 406, 273, 62);
		contentPane.add(btn_Set_Duration);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField.setBounds(595, 234, 151, 55);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JRadioButton rdbtnRadioButton_Months = new JRadioButton("Months");
		rdbtnRadioButton_Months.setForeground(Color.WHITE);
		rdbtnRadioButton_Months.setBackground(Color.BLACK);
		rdbtnRadioButton_Months.setFont(new Font("Tahoma", Font.PLAIN, 26));
		rdbtnRadioButton_Months.setBounds(862, 324, 117, 47);
		contentPane.add(rdbtnRadioButton_Months);
		
		JRadioButton rdbtnRadioButton_Days = new JRadioButton("Days");
		rdbtnRadioButton_Days.setForeground(Color.WHITE);
		rdbtnRadioButton_Days.setFont(new Font("Tahoma", Font.PLAIN, 26));
		rdbtnRadioButton_Days.setBackground(Color.BLACK);
		rdbtnRadioButton_Days.setBounds(384, 324, 99, 47);
		contentPane.add(rdbtnRadioButton_Days);
		
		JRadioButton rdbtnRadioButton_Weeks = new JRadioButton("Weeks");
		rdbtnRadioButton_Weeks.setForeground(Color.WHITE);
		rdbtnRadioButton_Weeks.setFont(new Font("Tahoma", Font.PLAIN, 26));
		rdbtnRadioButton_Weeks.setBackground(Color.BLACK);
		rdbtnRadioButton_Weeks.setBounds(609, 324, 117, 47);
		contentPane.add(rdbtnRadioButton_Weeks);		

		JPanel Footer = new JPanel();
		Footer.setBorder(new LineBorder(new Color(128, 128, 128), 3));
		Footer.setBackground(new Color(0, 0, 0));
		Footer.setBounds(0, 479, 1352, 184);
		contentPane.add(Footer);
		Footer.setLayout(null);
		
		JLabel About = new JLabel("About");
		About.setFont(new Font("Arial", Font.PLAIN, 13));
		About.setForeground(new Color(255, 255, 255));
		About.setBounds(284, 103, 49, 13);
		Footer.add(About);
		
		JLabel termsOfUse = new JLabel("Terms of Use");
		termsOfUse.setFont(new Font("Arial", Font.PLAIN, 13));
		termsOfUse.setForeground(new Color(255, 255, 255));
		termsOfUse.setBounds(429, 103, 84, 13);
		Footer.add(termsOfUse);
		
		JLabel rulesOfPlay = new JLabel("Rules of Play");
		rulesOfPlay.setForeground(Color.WHITE);
		rulesOfPlay.setFont(new Font("Arial", Font.PLAIN, 13));
		rulesOfPlay.setBounds(625, 103, 77, 13);
		Footer.add(rulesOfPlay);
		
		JLabel privacyPolicy = new JLabel("Privacy Policy");
		privacyPolicy.setForeground(Color.WHITE);
		privacyPolicy.setFont(new Font("Arial", Font.PLAIN, 13));
		privacyPolicy.setBounds(811, 103, 84, 13);
		Footer.add(privacyPolicy);
		
		JLabel credits = new JLabel("Credits");
		credits.setForeground(Color.WHITE);
		credits.setFont(new Font("Arial", Font.PLAIN, 13));
		credits.setBounds(985, 103, 49, 13);
		Footer.add(credits);
		
		JLabel lblgroupS = new JLabel("©2023 Group Sharma LLC. All rights reserved.");
		lblgroupS.setForeground(Color.WHITE);
		lblgroupS.setFont(new Font("Arial", Font.PLAIN, 13));
		lblgroupS.setBounds(530, 138, 287, 13);
		Footer.add(lblgroupS);
		
		JButton sendTop = new JButton("");
		sendTop.setForeground(new Color(0, 0, 0));
		sendTop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		sendTop.setIcon(new ImageIcon("IMAGE_PATH"));
		sendTop.setBackground(new Color(0, 0, 0));
		sendTop.setFont(new Font("Arial", Font.PLAIN, 13));
		sendTop.setBounds(650, 37, 26, 29);
		Footer.add(sendTop);
		
	}
}
