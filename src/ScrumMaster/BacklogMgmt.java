package ScrumMaster;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.JTextArea;
import javax.swing.JSplitPane;
import javax.swing.JTabbedPane;
import javax.swing.JTree;
import javax.swing.JList;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.JLayeredPane;
import javax.swing.JTextField;

public class BacklogMgmt extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BacklogMgmt frame = new BacklogMgmt();
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
	public BacklogMgmt() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1366, 700);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setForeground(new Color(255, 255, 255));
		contentPane.setBorder(new LineBorder(new Color(128, 128, 128), 3));

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
		txtrHerosOfThe.setBounds(49, 41, 249, 26);
		txtrHerosOfThe.setText("heroes of the Backlog");
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

		
		JLabel lblNewLabel = new JLabel("Product Backlog");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 35));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(536, 171, 254, 43);
		contentPane.add(lblNewLabel);
			
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(231, 225, 907, 171);
		contentPane.add(tabbedPane);

		
		JPanel US_1 = new JPanel();
		tabbedPane.addTab("User Story 1", null, US_1, null);
		US_1.setLayout(null);
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(264, 11, 293, 121);
		US_1.add(layeredPane);

		JLayeredPane layeredPane_1 = new JLayeredPane();
		layeredPane_1.setBounds(20, 11, 195, 121);
		US_1.add(layeredPane_1);

		JLayeredPane layeredPane_2 = new JLayeredPane();
		layeredPane_2.setBounds(599, 11, 293, 121);
		US_1.add(layeredPane_2);
		
		JLabel AsA_label = new JLabel("As a");
		AsA_label.setFont(new Font("Tahoma", Font.PLAIN, 15));
		AsA_label.setBounds(10, 11, 175, 31);
		layeredPane_1.add(AsA_label);
		
		JLabel IWantTo_label = new JLabel("I want to");
		IWantTo_label.setFont(new Font("Tahoma", Font.PLAIN, 15));
		IWantTo_label.setBounds(10, 11, 175, 31);
		layeredPane.add(IWantTo_label);

		JLabel SoThat_label = new JLabel("So that");
		SoThat_label.setFont(new Font("Tahoma", Font.PLAIN, 15));
		SoThat_label.setBounds(10, 11, 175, 31);
		layeredPane_2.add(SoThat_label);
		
		
		textField = new JTextField();
		textField.setBounds(10, 61, 96, 20);
		layeredPane_1.add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(10, 53, 273, 57);
		layeredPane.add(textField_1);				
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(10, 53, 273, 57);
		layeredPane_2.add(textField_2);
		
		JPanel US_2 = new JPanel();
		tabbedPane.addTab("User Story 2", null, US_2, null);
				
		JPanel US_3 = new JPanel();
		tabbedPane.addTab("User Story 3", null, US_3, null);


		JButton btnNewButton = new JButton("Ask Product Owner");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(370, 425, 209, 43);
		contentPane.add(btnNewButton);
		
		JButton btnAs = new JButton("Ask Developer");
		btnAs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAs.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnAs.setBounds(773, 425, 209, 43);
		contentPane.add(btnAs);
		
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
