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

		
		JLayeredPane LayeredPane_PB = new JLayeredPane();
		LayeredPane_PB.setBounds(175, 159, 1053, 255);
		contentPane.add(LayeredPane_PB);
		
		JPanel ProductBacklog_panel = new JPanel();
		ProductBacklog_panel.setBounds(0, 0, 1053, 255);
		LayeredPane_PB.add(ProductBacklog_panel);
		ProductBacklog_panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Product Backlog");
		lblNewLabel.setBounds(361, 18, 249, 43);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 35));
		lblNewLabel.setForeground(new Color(0, 0, 0));
		ProductBacklog_panel.add(lblNewLabel);		

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(54, 72, 989, 170);
		ProductBacklog_panel.add(tabbedPane);
		
				
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
		
		JPanel AskPO_panel = new JPanel();
		AskPO_panel.setBounds(0, 0, 1053, 255);
		LayeredPane_PB.add(AskPO_panel);
	
		JLabel lblNewLabelConv_1 = new JLabel("Conversation with the Product Owner");
		lblNewLabelConv_1.setBounds(209, 18, 598, 43);
		lblNewLabelConv_1.setFont(new Font("Tahoma", Font.PLAIN, 35));
		lblNewLabelConv_1.setForeground(new Color(0, 0, 0));
		AskPO_panel.add(lblNewLabelConv_1);		
				
		JButton btnAskPO_12 = new JButton("Ask about the acceptance criteria");
		btnAskPO_12.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnAskPO_12.setBounds(29, 163, 302, 43);
		AskPO_panel.add(btnAskPO_12);
		
		JButton btnAskPO_13 = new JButton("Potential risks in the upcoming sprint");
		btnAskPO_13.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnAskPO_13.setBounds(741, 163, 302, 43);
		AskPO_panel.add(btnAskPO_13);

		JButton btnAskPO_14 = new JButton("Request clarification for the user story");
		btnAskPO_14.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnAskPO_14.setBounds(741, 86, 302, 43);
		AskPO_panel.add(btnAskPO_14);
		
		JButton btnAskPO_11 = new JButton("Tell me about Top priority user story");
		btnAskPO_11.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnAskPO_11.setBounds(29, 86, 302, 43);
		AskPO_panel.add(btnAskPO_11);
		
		
		
		
		JPanel AskDev_panel = new JPanel();
		AskDev_panel.setBounds(0, 0, 1053, 255);
		LayeredPane_PB.add(AskDev_panel);		
		
		JLabel lblNewLabelConv_2 = new JLabel("Conversation with the Developer");
		lblNewLabelConv_2.setForeground(Color.BLACK);
		lblNewLabelConv_2.setFont(new Font("Tahoma", Font.PLAIN, 35));
		AskDev_panel.add(lblNewLabelConv_2);
		
		JButton btnAskDev_11 = new JButton("Tell me about the progress of the user story");
		btnAskDev_11.setFont(new Font("Tahoma", Font.PLAIN, 15));
		AskDev_panel.add(btnAskDev_11);
		
		JButton btnAskDev_12 = new JButton("Discuss any blockers for the user story");
		btnAskDev_12.setFont(new Font("Tahoma", Font.PLAIN, 15));
		AskDev_panel.add(btnAskDev_12);
		
		JButton btnAskDev_13 = new JButton("Potential technical challenges in the user story");
		btnAskDev_13.setFont(new Font("Tahoma", Font.PLAIN, 15));
		AskDev_panel.add(btnAskDev_13);
		
		JButton btnAskDev_14 = new JButton("Request clarification on the user story");
		btnAskDev_14.setFont(new Font("Tahoma", Font.PLAIN, 15));
		AskDev_panel.add(btnAskDev_14);
				

		JButton btnPO = new JButton("Ask Product Owner");
		btnPO.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnPO.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LayeredPane_PB.removeAll();
				LayeredPane_PB.add(AskPO_panel);
				LayeredPane_PB.repaint();
				LayeredPane_PB.revalidate();				
			}
		});
		btnPO.setBounds(590, 425, 209, 43);
		contentPane.add(btnPO);
		
		JButton btnDev = new JButton("Ask Developer");
		btnDev.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LayeredPane_PB.removeAll();
				LayeredPane_PB.add(AskDev_panel);
				LayeredPane_PB.repaint();
				LayeredPane_PB.revalidate();				
			}
		});
		btnDev.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnDev.setBounds(969, 425, 209, 43);
		contentPane.add(btnDev);
		
		JButton btnSeePO = new JButton("See Product Backlog");
		btnSeePO.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LayeredPane_PB.removeAll();
				LayeredPane_PB.add(ProductBacklog_panel);
				LayeredPane_PB.repaint();
				LayeredPane_PB.revalidate();				
			}
		});
		btnSeePO.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnSeePO.setBounds(214, 425, 209, 43);
		contentPane.add(btnSeePO);

		
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
