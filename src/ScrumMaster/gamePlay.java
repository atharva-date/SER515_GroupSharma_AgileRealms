package ScrumMaster;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.*;
import java.awt.*;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import Player.Customizations;
import Player.Guide;
import Player.Home;
import Player.UpdateLogin;
import javax.swing.JLayeredPane;
import java.awt.CardLayout;
import javax.swing.JProgressBar;

public class gamePlay extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private Timer timer;
	private int progressValue = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					gamePlay frame = new gamePlay();
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
	public gamePlay() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1366, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		Image contact = new ImageIcon(this.getClass().getResource("/images/contact.png")).getImage();
		Image log = new ImageIcon(this.getClass().getResource("/images/book.png")).getImage();
		
		JPanel gameBar = new JPanel();
		gameBar.setBorder(new LineBorder(new Color(128, 128, 128)));
		gameBar.setBackground(new Color(0, 0, 0));
		gameBar.setBounds(0, 0, 1352, 83);
		contentPane.add(gameBar);
		gameBar.setLayout(null);
		
		JLabel Contacticon = new JLabel("");
		Contacticon.setHorizontalAlignment(SwingConstants.CENTER);
		Contacticon.setBounds(10, 10, 76, 66);
		gameBar.add(Contacticon);
		Contacticon.setIcon(new ImageIcon(contact));
		
		JLabel Logicon = new JLabel("");
		Logicon.setHorizontalAlignment(SwingConstants.CENTER);
//		Logicon.setForeground(new Color(254, 255, 255));
		Logicon.setBounds(79, 10, 61, 66);
		gameBar.add(Logicon);
		Logicon.setIcon(new ImageIcon(log));
		
		//ProgressBar
		JProgressBar progressBar = new JProgressBar();
		progressBar.setBounds(783, 18, 367, 47);
		gameBar.add(progressBar);
		progressBar.setValue(0);
		progressBar.setBackground(Color.GRAY);
		progressBar.setForeground(new Color(254, 255, 255));
		progressBar.setFont(new Font("Quill Sword", Font.PLAIN, 8));
		progressBar.setStringPainted(true);
		
		JLabel Sprint = new JLabel("Sprint 1");
		Sprint.setHorizontalAlignment(SwingConstants.CENTER);
		Sprint.setBounds(1160, 10, 182, 66);
		Sprint.setFont(new Font("Tahoma", Font.PLAIN, 26));
		Sprint.setForeground(new Color(254, 255, 255));
		gameBar.add(Sprint);
		
		JLabel Role = new JLabel("SCRUM Master");
		Role.setBounds(150, 18, 408, 55);
		Role.setFont(new Font("Tahoma", Font.PLAIN, 25));
		Role.setForeground(new Color(0, 252, 255));
		gameBar.add(Role);
		timer = new Timer(1000, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	if (progressValue <= 100) {
    	            progressBar.setValue(progressValue);
    	            progressBar.setString("Sprint Progress: " + progressValue + "%");
    	            progressValue++;
    	        } else {
    	            timer.stop();
    	        }
            }
        });
		timer.start();
		
		//Body
		JPanel gameBody = new JPanel();
		gameBody.setForeground(Color.BLACK);
		gameBody.setBorder(new LineBorder(new Color(128, 128, 128), 3));
		gameBody.setBackground(Color.BLACK);
		gameBody.setBounds(0, 82, 1352, 501);
		contentPane.add(gameBody);
		gameBody.setLayout(null);
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(0, 0, 1352, 501);
		gameBody.add(layeredPane);
		layeredPane.setLayout(new CardLayout(0, 0));
		
		
		//Scenario 1
		
		JPanel scen1 = new JPanel();
		layeredPane.add(scen1, "name_604559671835300");
		scen1.setLayout(null);
		
		JPanel res1 = new JPanel();
		res1.setBorder(new LineBorder(new Color(192, 192, 192), 2));
		res1.setLayout(null);
		res1.setForeground(Color.BLACK);
		res1.setBackground(Color.BLACK);
		res1.setBounds(0, 0, 1352, 501);
		gameBody.add(res1);
		
		JLabel lblResult1 = new JLabel("Result:");
		lblResult1.setHorizontalAlignment(SwingConstants.CENTER);
		lblResult1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblResult1.setForeground(new Color(192, 192, 192));
		lblResult1.setBounds(494, 10, 365, 75);
		res1.add(lblResult1);
		
		JButton btnNextScen2 = new JButton("Next Scenario");
		btnNextScen2.setBounds(1000, 415, 231, 55);
		btnNextScen2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		res1.add(btnNextScen2);

		JLabel lblRemark_Scen1 = new JLabel("");
		lblRemark_Scen1.setHorizontalAlignment(SwingConstants.CENTER);
		lblRemark_Scen1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblRemark_Scen1.setForeground(new Color(192, 192, 192));
		lblRemark_Scen1.setBounds(72, 0, 1200, 326);
		res1.add(lblRemark_Scen1);
		
		JLabel lblAnswer_Scen1 = new JLabel("");
		lblAnswer_Scen1.setHorizontalAlignment(SwingConstants.CENTER);
		lblAnswer_Scen1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblAnswer_Scen1.setForeground(new Color(192, 192, 192));
		lblAnswer_Scen1.setBounds(45, 120, 1200, 326);
		res1.add(lblAnswer_Scen1);
		
		JLabel lblPoints_Scen1 = new JLabel("");
		lblPoints_Scen1.setHorizontalAlignment(SwingConstants.CENTER);
		lblPoints_Scen1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblPoints_Scen1.setForeground(new Color(192, 192, 192));
		lblPoints_Scen1.setBounds(78, 200, 1200, 326);
		res1.add(lblPoints_Scen1);
		
		JPanel situation = new JPanel();
		situation.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		situation.setBackground(new Color(128, 128, 128));
		situation.setBounds(0, 0, 1352, 173);
		scen1.add(situation);
		situation.setLayout(null);
		
		JLabel SM_DailyScrumScenario = new JLabel(""); 
		try {
			  Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/agile_realms", "root", "agilerealms"); 
			  Statement stm = connection.createStatement(); 
			  String sql = "SELECT s_title FROM scenarios WHERE s_id=1"; 
			  ResultSet res = stm.executeQuery(sql);
			  
			  while(res.next()) {
				  SM_DailyScrumScenario.setText("<html>" + res.getString("s_title") + "</html>"); 
				  SM_DailyScrumScenario.setFont(new Font("Tahoma", Font.PLAIN, 25)); 
				  SM_DailyScrumScenario.setForeground(new Color(255, 255, 255)); 
				  SM_DailyScrumScenario.setBounds(66, 11, 1179, 151);
				  situation.add(SM_DailyScrumScenario);
			  }
		}
		catch (Exception e) 
		{
			e.printStackTrace(); 
		} 
		
		JPanel option1 = new JPanel();
		option1.setBorder(new LineBorder(new Color(128, 128, 128), 2));
		option1.setBackground(new Color(0, 0, 0));
		option1.setBounds(0, 173, 677, 164);
		scen1.add(option1);
		option1.setLayout(null);
		
		JButton btnBest_scen1 = new JButton("");
		try {
			  Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/agile_realms", "root", "agilerealms"); 
			  Statement stm = connection.createStatement();
			  String sql = "SELECT best_option FROM scenarios WHERE s_id=1"; 
			  ResultSet res = stm.executeQuery(sql);
			  
			  while(res.next()) {
				  btnBest_scen1.setText("<html>" + res.getString("best_option") + "</html>");
				  btnBest_scen1.setVerticalAlignment(SwingConstants.CENTER);
				  btnBest_scen1.setHorizontalAlignment(SwingConstants.CENTER);
				  btnBest_scen1.setFont(new Font("Tahoma", Font.PLAIN, 20));
			  } 
		} 
		catch (Exception e)
		{
			e.printStackTrace(); 
		}
		
		btnBest_scen1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Agile_Realms", "root", "agilerealms");
					
					Statement st = conn.createStatement();
					String sql = "SELECT remark from points WHERE p_id = 4";
					ResultSet rs = st.executeQuery(sql);
					
					
					Statement st1 = conn.createStatement();
					String sql1 = "SELECT best_result FROM results WHERE r_id = 1";
					ResultSet rs1 = st1.executeQuery(sql1);
					
					
					Statement st2 = conn.createStatement();
					String sql2 = "SELECT marks FROM points WHERE p_id = 4";
					ResultSet rs2 = st2.executeQuery(sql2);
					
					
					if(rs.next() && rs1.next() && rs2.next()) {
						
						layeredPane.removeAll();
						lblRemark_Scen1.setText(rs.getString("remark"));
						lblAnswer_Scen1.setText("<html>" + rs1.getString("best_result") + "</html>");
						lblPoints_Scen1.setText(rs2.getString("marks"));
						layeredPane.repaint();
						layeredPane.revalidate();
					}
					else {
						System.out.println("Failure!! ");
					}
 				}
				catch (Exception ex) {
					System.out.println("ERROR: " + ex.getMessage());
				}	
			}
		});
		
		btnBest_scen1.setBounds(10, 10, 657, 144);
		option1.add(btnBest_scen1);
		
		JPanel option2 = new JPanel();
		option2.setBorder(new LineBorder(new Color(128, 128, 128), 2));
		option2.setBackground(new Color(0, 0, 0));
		option2.setBounds(676, 173, 676, 164);
		scen1.add(option2);
		option2.setLayout(null);
		
		JButton btnGood_scen1 = new JButton("");
		try {
			  Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/agile_realms", "root", "agilerealms"); 
			  Statement stm = connection.createStatement(); 
			  String sql = "SELECT good_option FROM scenarios WHERE s_id=1"; 
			  ResultSet res = stm.executeQuery(sql); 
			  while(res.next()) {
				  btnGood_scen1.setText("<html>" + res.getString("good_option") + "</html>");
				  btnGood_scen1.setVerticalAlignment(SwingConstants.CENTER);
				  btnGood_scen1.setHorizontalAlignment(SwingConstants.CENTER);
				  btnGood_scen1.setFont(new Font("Tahoma", Font.PLAIN, 20));
			  } 
			} 
			catch (Exception e)
			{
				e.printStackTrace(); 
			}
		btnGood_scen1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Agile_Realms", "root", "agilerealms");
					
					Statement st = conn.createStatement();
					String sql = "SELECT remark from points WHERE p_id = 3";
					ResultSet rs = st.executeQuery(sql);
					
					
					Statement st1 = conn.createStatement();
					String sql1 = "SELECT good_result FROM results WHERE r_id = 1";
					ResultSet rs1 = st1.executeQuery(sql1);
					
					
					Statement st2 = conn.createStatement();
					String sql2 = "SELECT marks FROM points WHERE p_id = 3";
					ResultSet rs2 = st2.executeQuery(sql2);
					
					if(rs.next() && rs1.next() && rs2.next()) {
						
						layeredPane.removeAll();
						lblRemark_Scen1.setText(rs.getString("remark"));
						lblAnswer_Scen1.setText("<html>" + rs1.getString("good_result") + "</html>");
						lblPoints_Scen1.setText(rs2.getString("marks"));
						layeredPane.repaint();
						layeredPane.revalidate();
					}
					else {
						System.out.println("Failure!! ");
					}
 				}
				catch (Exception ex) {
					System.out.println("ERROR: " + ex.getMessage());
				}
			}
		});
		
		btnGood_scen1.setBounds(10, 10, 656, 144);
		option2.add(btnGood_scen1);
		
		JPanel option3 = new JPanel();
		option3.setBorder(new LineBorder(new Color(128, 128, 128), 2));
		option3.setBackground(new Color(0, 0, 0));
		option3.setBounds(676, 338, 676, 163);
		scen1.add(option3);
		option3.setLayout(null);
		
		JButton btnWorst_scen1 = new JButton("");
		try {
			  Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/agile_realms", "root", "agilerealms"); 
			  Statement stm = connection.createStatement();
			  String sql = "SELECT worst_option FROM scenarios WHERE s_id=1"; 
			  ResultSet res = stm.executeQuery(sql);
			  while(res.next()) {
				  btnWorst_scen1.setText("<html>" + res.getString("worst_option") + "</html>");
				  btnWorst_scen1.setVerticalAlignment(SwingConstants.CENTER);
				  btnWorst_scen1.setHorizontalAlignment(SwingConstants.CENTER);
				  btnWorst_scen1.setFont(new Font("Tahoma", Font.PLAIN, 20));
			  } 
			} 
			catch (Exception e) 
			{ 
				e.printStackTrace(); 
			}
		
		btnWorst_scen1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Agile_Realms", "root", "agilerealms");
					
					Statement st = conn.createStatement();
					String sql = "SELECT remark from points WHERE p_id = 1";
					ResultSet rs = st.executeQuery(sql);
					
					Statement st1 = conn.createStatement();
					String sql1 = "SELECT worst_result FROM results WHERE r_id = 1";
					ResultSet rs1 = st1.executeQuery(sql1);
					
					Statement st2 = conn.createStatement();
					String sql2 = "SELECT marks FROM points WHERE p_id = 1";
					ResultSet rs2 = st2.executeQuery(sql2);
					
					if(rs.next() && rs1.next() && rs2.next()) {
						
						layeredPane.removeAll();
						lblRemark_Scen1.setText(rs.getString("remark"));
						lblAnswer_Scen1.setText("<html>" + rs1.getString("worst_result") + "</html>");
						lblPoints_Scen1.setText(rs2.getString("marks"));
						layeredPane.repaint();
						layeredPane.revalidate();
					}
					else {
						System.out.println("Failure!! ");
					}
 				}
				catch (Exception ex) {
					System.out.println("ERROR: " + ex.getMessage());
				}
			}
		});
		
		btnWorst_scen1.setBounds(10, 10, 656, 143);
		option3.add(btnWorst_scen1);
						
		JPanel option4 = new JPanel();
		option4.setBorder(new LineBorder(new Color(128, 128, 128), 2));
		option4.setBackground(new Color(0, 0, 0));
		option4.setBounds(0, 337, 677, 164);
		scen1.add(option4);
		option4.setLayout(null);
		
		JButton btnBad_scen1 = new JButton("");
		try {
			  Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/agile_realms", "root", "agilerealms"); 
			  Statement stm = connection.createStatement(); 
			  String sql = "SELECT bad_option FROM scenarios WHERE s_id=1"; 
			  ResultSet res = stm.executeQuery(sql); 
			  while(res.next()) {
				  btnBad_scen1.setText("<html>" + res.getString("bad_option") + "</html>");
				  btnBad_scen1.setVerticalAlignment(SwingConstants.CENTER);
				  btnBad_scen1.setHorizontalAlignment(SwingConstants.CENTER);
				  btnBad_scen1.setFont(new Font("Tahoma", Font.PLAIN, 20));
			  } 
			} 
			catch (Exception e) 
			{ 
				e.printStackTrace(); 
			}
		
		btnBad_scen1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Agile_Realms", "root", "agilerealms");
					Statement st = conn.createStatement();
					String sql = "SELECT remark from points WHERE p_id = 2";
					ResultSet rs = st.executeQuery(sql);
					
					Statement st1 = conn.createStatement();
					String sql1 = "SELECT bad_result FROM results WHERE r_id = 1";
					ResultSet rs1 = st1.executeQuery(sql1);
					
					Statement st2 = conn.createStatement();
					String sql2 = "SELECT marks FROM points WHERE p_id = 2";
					ResultSet rs2 = st2.executeQuery(sql2);
					
					
					if(rs.next() && rs1.next() && rs2.next()) {
						
						layeredPane.removeAll();
						lblRemark_Scen1.setText(rs.getString("remark"));
						lblAnswer_Scen1.setText("<html>" + rs1.getString("bad_result") + "</html>");
						lblPoints_Scen1.setText(rs2.getString("marks"));
						layeredPane.repaint();
						layeredPane.revalidate();
					}
					else {
						System.out.println("Failure!! ");
					}
 				}
				catch (Exception ex) {
					System.out.println("ERROR: " + ex.getMessage());
				}
			}
		});
		btnBad_scen1.setBounds(10, 10, 657, 144);
		option4.add(btnBad_scen1);
		
		
		//Scenario 2
		
		JPanel scen2 = new JPanel();
		layeredPane.add(scen2, "name_604613468509000");
		scen2.setLayout(null);

		btnNextScen2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				res1.removeAll();
				layeredPane.repaint();
				layeredPane.revalidate();
				layeredPane.add(scen2);
			}
		});
		
		//Result 2
		JPanel res2 = new JPanel();
		res2.setLayout(null);
		res2.setForeground(Color.BLACK);
		res2.setBorder(new LineBorder(new Color(192, 192, 192), 2));
		res2.setBackground(Color.BLACK);
		res2.setBounds(0, 0, 1352, 501);
		gameBody.add(res2);
		
		JLabel lblResult2 = new JLabel("Result:");
		lblResult2.setHorizontalAlignment(SwingConstants.CENTER);
		lblResult2.setForeground(Color.LIGHT_GRAY);
		lblResult2.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblResult2.setBounds(494, 10, 365, 75);
		res2.add(lblResult2);
		
		JLabel lblRemark_Scen2 = new JLabel("");
		lblRemark_Scen2.setHorizontalAlignment(SwingConstants.CENTER);
		lblRemark_Scen2.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblRemark_Scen2.setForeground(new Color(192, 192, 192));
		lblRemark_Scen2.setBounds(72, 0, 1200, 326);
		res2.add(lblRemark_Scen2);

		JLabel lblPoints_Scen2 = new JLabel("");
		lblPoints_Scen2.setHorizontalAlignment(SwingConstants.CENTER);
		lblPoints_Scen2.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblPoints_Scen2.setForeground(new Color(192, 192, 192));
		lblPoints_Scen2.setBounds(78, 200, 1200, 326);
		res2.add(lblPoints_Scen2);
		
		JButton btnNextScen3 = new JButton("Next Scenario");
		btnNextScen3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNextScen3.setBounds(1000, 415, 231, 55);
		res2.add(btnNextScen3);
		
		JLabel lblAnswer_Scen2 = new JLabel("");
		lblAnswer_Scen2.setHorizontalAlignment(SwingConstants.CENTER);
		lblAnswer_Scen2.setForeground(Color.LIGHT_GRAY);
		lblAnswer_Scen2.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblAnswer_Scen2.setBounds(78, 90, 1200, 326);
		res2.add(lblAnswer_Scen2);
		
		JPanel situation_1 = new JPanel();
		situation_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		situation_1.setBackground(Color.GRAY);
		situation_1.setBounds(0, 0, 1352, 173);
		scen2.add(situation_1);
		situation_1.setLayout(null);
		
		JLabel SM_ProjectProgress = new JLabel("");
		try {
			  Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/agile_realms", "root", "agilerealms"); 
			  Statement stm = connection.createStatement(); 
			  String sql = "SELECT s_title FROM scenarios WHERE s_id=2"; 
			  ResultSet res = stm.executeQuery(sql);
			  
			  while(res.next()) {
				  SM_ProjectProgress.setText("<html>" + res.getString("s_title") + "</html>"); 
			  }
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		
		SM_ProjectProgress.setFont(new Font("Tahoma", Font.PLAIN, 25));
		SM_ProjectProgress.setForeground(new Color(255, 255, 255));
		SM_ProjectProgress.setBounds(16, 10, 1326, 156);
		situation_1.add(SM_ProjectProgress);
		
		JPanel option1_1 = new JPanel();
		option1_1.setBorder(new LineBorder(new Color(128, 128, 128), 2));
		option1_1.setBackground(Color.BLACK);
		option1_1.setBounds(0, 173, 677, 164);
		scen2.add(option1_1);
		option1_1.setLayout(null);
		
		JButton btnBest_scen2 = new JButton("");
		try {
			  Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/agile_realms", "root", "agilerealms"); 
			  Statement stm = connection.createStatement(); 
			  String sql = "SELECT best_option FROM scenarios WHERE s_id=2"; 
			  ResultSet res = stm.executeQuery(sql);
			  
			  while(res.next()) {
				  btnBest_scen2.setText("<html>" + res.getString("best_option") + "</html>");
				  btnBest_scen2.setVerticalAlignment(SwingConstants.CENTER);
				  btnBest_scen2.setHorizontalAlignment(SwingConstants.CENTER);
				  btnBest_scen2.setFont(new Font("Tahoma", Font.PLAIN, 20));
			  }
		} 
		catch (Exception e) 
		{ 
			e.printStackTrace(); 
		}
		
		
		btnBest_scen2.setBounds(10, 10, 657, 144);
		option1_1.add(btnBest_scen2);
		btnBest_scen2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Agile_Realms", "root", "agilerealms");
					Statement st = conn.createStatement();
					String sql = "SELECT remark from points WHERE p_id = 4";
					ResultSet rs = st.executeQuery(sql);
					
					Statement st1 = conn.createStatement();
					String sql1 = "SELECT best_result FROM results WHERE r_id = 2";
					ResultSet rs1 = st1.executeQuery(sql1);
					
					Statement st2 = conn.createStatement();
					String sql2 = "SELECT marks FROM points WHERE p_id = 4";
					ResultSet rs2 = st2.executeQuery(sql2);
					
					if(rs.next() && rs1.next() && rs2.next()) {
						layeredPane.removeAll();
						lblRemark_Scen2.setText(rs.getString("remark"));
						lblAnswer_Scen2.setText("<html>" + rs1.getString("best_result") + "</html>");
						lblPoints_Scen2.setText(rs2.getString("marks"));
						layeredPane.repaint();
						layeredPane.revalidate();
					}
					else {
						System.out.println("Failure!! ");
					}
 				}
				catch (Exception ex) {
					System.out.println("ERROR: " + ex.getMessage());
				}
			}
		});
		
		JPanel option2_1 = new JPanel();
		option2_1.setBorder(new LineBorder(new Color(128, 128, 128), 2));
		option2_1.setBackground(Color.BLACK);
		option2_1.setBounds(676, 173, 676, 164);
		scen2.add(option2_1);
		option2_1.setLayout(null);
		
		JButton btnWorst_scen2 = new JButton("");
		try {
			  Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/agile_realms", "root", "agilerealms"); 
			  Statement stm = connection.createStatement(); 
			  String sql = "SELECT worst_option FROM scenarios WHERE s_id=2"; 
			  ResultSet res = stm.executeQuery(sql);
			  
			  while(res.next()) {
				  btnWorst_scen2.setText("<html>" + res.getString("worst_option") + "</html>");
				  btnWorst_scen2.setVerticalAlignment(SwingConstants.CENTER);
				  btnWorst_scen2.setHorizontalAlignment(SwingConstants.CENTER);
				  btnWorst_scen2.setFont(new Font("Tahoma", Font.PLAIN, 20));
			  } 
		}
		catch (Exception e) 
		{ 
			e.printStackTrace(); 
		}
		
		btnWorst_scen2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Agile_Realms", "root", "agilerealms");
					
					Statement st = conn.createStatement();
					String sql = "SELECT remark from points WHERE p_id = 1";
					ResultSet rs = st.executeQuery(sql);
					
					Statement st1 = conn.createStatement();
					String sql1 = "SELECT worst_result FROM results WHERE r_id = 2";
					ResultSet rs1 = st1.executeQuery(sql1);
					
					Statement st2 = conn.createStatement();
					String sql2 = "SELECT marks FROM points WHERE p_id = 1";
					ResultSet rs2 = st2.executeQuery(sql2);
					
					if(rs.next() && rs1.next() && rs2.next()) {
						layeredPane.removeAll();
						lblRemark_Scen2.setText(rs.getString("remark"));
						lblAnswer_Scen2.setText("<html>" + rs1.getString("worst_result") + "</html>");
						lblPoints_Scen2.setText(rs2.getString("marks"));
						layeredPane.repaint();
						layeredPane.revalidate();
					}
					else {
						System.out.println("Failure!! ");
					}
 				}
				catch (Exception ex) {
					System.out.println("ERROR: " + ex.getMessage());
				}
			}
		});
		btnWorst_scen2.setBounds(10, 10, 656, 143);
		option2_1.add(btnWorst_scen2);
		
		JPanel option3_1 = new JPanel();
		option3_1.setBorder(new LineBorder(new Color(128, 128, 128), 2));
		option3_1.setBackground(Color.BLACK);
		option3_1.setBounds(0, 337, 677, 164);
		scen2.add(option3_1);
		option3_1.setLayout(null);
		
		JButton btnBad_scen2 = new JButton("");
		try {
			  Connection connection =
			  DriverManager.getConnection("jdbc:mysql://localhost:3306/agile_realms", "root", "agilerealms"); 
			  Statement stm = connection.createStatement(); 
			  String sql = "SELECT bad_option FROM scenarios WHERE s_id=2"; 
			  ResultSet res = stm.executeQuery(sql); 
			  while(res.next()) {
				  btnBad_scen2.setText("<html>" + res.getString("bad_option") + "</html>");
				  btnBad_scen2.setVerticalAlignment(SwingConstants.CENTER);
				  btnBad_scen2.setHorizontalAlignment(SwingConstants.CENTER);
				  btnBad_scen2.setFont(new Font("Tahoma", Font.PLAIN, 20));
			  } 
		} 
		catch (Exception e) 
		{ 
			e.printStackTrace(); 
		}
		
		btnBad_scen2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Agile_Realms", "root", "agilerealms");
					
					Statement st = conn.createStatement();
					String sql = "SELECT remark from points WHERE p_id = 2";
					ResultSet rs = st.executeQuery(sql);
					
					Statement st1 = conn.createStatement();
					String sql1 = "SELECT bad_result FROM results WHERE r_id = 2";
					ResultSet rs1 = st1.executeQuery(sql1);
					
					Statement st2 = conn.createStatement();
					String sql2 = "SELECT marks FROM points WHERE p_id = 2";
					ResultSet rs2 = st2.executeQuery(sql2);
					
					if(rs.next() && rs1.next() && rs2.next()) {
						layeredPane.removeAll();
						lblRemark_Scen2.setText(rs.getString("remark"));
						lblAnswer_Scen2.setText("<html>" + rs1.getString("bad_result") + "</html>");
						lblPoints_Scen2.setText(rs2.getString("marks"));
						layeredPane.repaint();
						layeredPane.revalidate();
					}
					else {
						System.out.println("Failure!! ");
					}
 				}
				catch (Exception ex) {
					System.out.println("ERROR: " + ex.getMessage());
				}
			}
		});
		btnBad_scen2.setBounds(10, 10, 657, 144);
		option3_1.add(btnBad_scen2);
		
		JPanel option4_1 = new JPanel();
		option4_1.setBorder(new LineBorder(new Color(128, 128, 128), 2));
		option4_1.setBackground(Color.BLACK);
		option4_1.setBounds(676, 338, 676, 163);
		scen2.add(option4_1);
		option4_1.setLayout(null);
		
		JButton btnGood_scen2 = new JButton("");
		try {
			  Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/agile_realms", "root", "agilerealms"); 
			  Statement stm = connection.createStatement();
			  String sql = "SELECT good_option FROM scenarios WHERE s_id=2"; 
			  ResultSet res = stm.executeQuery(sql); 
			  while(res.next()) {
				  btnGood_scen2.setText("<html>" + res.getString("good_option") + "</html>");
				  btnGood_scen2.setVerticalAlignment(SwingConstants.CENTER);
				  btnGood_scen2.setHorizontalAlignment(SwingConstants.CENTER);
				  btnGood_scen2.setFont(new Font("Tahoma", Font.PLAIN, 20));
			  } 
		} 
		catch (Exception e)
		{ 
			e.printStackTrace(); 
		}
		
		btnGood_scen2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Agile_Realms", "root", "agilerealms");
					Statement st = conn.createStatement();
					String sql = "SELECT remark from points WHERE p_id = 3";
					ResultSet rs = st.executeQuery(sql);
					
					Statement st1 = conn.createStatement();
					String sql1 = "SELECT good_result FROM results WHERE r_id = 2";
					ResultSet rs1 = st1.executeQuery(sql1);
					
					Statement st2 = conn.createStatement();
					String sql2 = "SELECT marks FROM points WHERE p_id = 3";
					ResultSet rs2 = st2.executeQuery(sql2);
					
					if(rs.next() && rs1.next() && rs2.next()) {
						layeredPane.removeAll();
						lblRemark_Scen2.setText(rs.getString("remark"));
						lblAnswer_Scen2.setText("<html>" + rs1.getString("good_result") + "</html>");
						lblPoints_Scen2.setText(rs2.getString("marks"));
						layeredPane.repaint();
						layeredPane.revalidate();
					}
					else {
						System.out.println("Failure!! ");
					}
 				}
				catch (Exception ex) {
					System.out.println("ERROR: " + ex.getMessage());
				}
			}
		});
		btnGood_scen2.setBounds(10, 10, 656, 144);
		option4_1.add(btnGood_scen2);
		
		//Scenario 3
		
		JPanel scen3 = new JPanel();
		layeredPane.add(scen3, "name_604626520416300");
		scen3.setLayout(null);
		
		btnNextScen3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				res2.removeAll();
				layeredPane.repaint();
				layeredPane.revalidate();
				layeredPane.add(scen3);
			}
		});
		
		JPanel res3 = new JPanel();
		res3.setBorder(new LineBorder(new Color(192, 192, 192), 2));
		res3.setLayout(null);
		res3.setForeground(Color.BLACK);
		res3.setBackground(Color.BLACK);
		res3.setBounds(0, 0, 1352, 501);
		gameBody.add(res3);
		
		JLabel lblRemark_Scen3 = new JLabel("");
		lblRemark_Scen3.setHorizontalAlignment(SwingConstants.CENTER);
		lblRemark_Scen3.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblRemark_Scen3.setForeground(new Color(192, 192, 192));
		lblRemark_Scen3.setBounds(72, 0, 1200, 326);
		res3.add(lblRemark_Scen3);

		JLabel lblPoints_Scen3 = new JLabel("");
		lblPoints_Scen3.setHorizontalAlignment(SwingConstants.CENTER);
		lblPoints_Scen3.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblPoints_Scen3.setForeground(new Color(192, 192, 192));
		lblPoints_Scen3.setBounds(78, 200, 1200, 326);
		res3.add(lblPoints_Scen3);
		
		JLabel lblResult3 = new JLabel("Result:");
		lblResult3.setHorizontalAlignment(SwingConstants.CENTER);
		lblResult3.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblResult3.setForeground(new Color(192, 192, 192));
		lblResult3.setBounds(494, 10, 365, 75);
		res3.add(lblResult3);
		
		JButton btnNextScen4 = new JButton("Next Scenario");
		btnNextScen4.setBounds(1000, 415, 231, 55);
		btnNextScen4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		res3.add(btnNextScen4);
		
		JLabel lblAnswer_Scen3 = new JLabel("");
		lblAnswer_Scen3.setHorizontalAlignment(SwingConstants.CENTER);
		lblAnswer_Scen3.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblAnswer_Scen3.setForeground(new Color(192, 192, 192));
		lblAnswer_Scen3.setBounds(78, 90, 1200, 326);
		res3.add(lblAnswer_Scen3);

		JPanel situation_2 = new JPanel();
		situation_2.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		situation_2.setBackground(Color.GRAY);
		situation_2.setBounds(0, 0, 1352, 173);
		scen3.add(situation_2);
		situation_2.setLayout(null);
		
		JLabel SM_UnforeseenTechnicalHurdle = new JLabel("");
		try {
			  Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/agile_realms", "root", "agilerealms"); 
			  Statement stm = connection.createStatement(); 
			  String sql = "SELECT s_title FROM scenarios WHERE s_id=3"; 
			  ResultSet res = stm.executeQuery(sql);
			  
			  while(res.next()) {
				  SM_UnforeseenTechnicalHurdle.setText("<html>" + res.getString("s_title") + "</html>"); 
			  }
			}
		catch (Exception e) 
		{ 
			e.printStackTrace();
		}
		SM_UnforeseenTechnicalHurdle.setFont(new Font("Tahoma", Font.PLAIN, 25));
		SM_UnforeseenTechnicalHurdle.setForeground(new Color(255, 255, 255));
		SM_UnforeseenTechnicalHurdle.setBounds(66, 11, 1179, 151);
		situation_2.add(SM_UnforeseenTechnicalHurdle);
		
		JPanel option1_2 = new JPanel();
		option1_2.setBorder(new LineBorder(new Color(128, 128, 128), 2));
		option1_2.setBackground(Color.BLACK);
		option1_2.setBounds(0, 173, 677, 164);
		scen3.add(option1_2);
		option1_2.setLayout(null);
		
		JButton btnGood_scen3 = new JButton("");
		try {
			  Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/agile_realms", "root", "agilerealms"); 
			  Statement stm = connection.createStatement(); 
			  String sql = "SELECT good_option FROM scenarios WHERE s_id=3"; 
			  ResultSet res = stm.executeQuery(sql);
			  
			  while(res.next()) {
				  btnGood_scen3.setText("<html>" + res.getString("good_option") + "</html>");
				  btnGood_scen3.setVerticalAlignment(SwingConstants.CENTER);
				  btnGood_scen3.setHorizontalAlignment(SwingConstants.CENTER);
				  btnGood_scen3.setFont(new Font("Tahoma", Font.PLAIN, 20));
			  }
			}
		catch (Exception e)
		{ 
			e.printStackTrace(); 
		}
		
		btnGood_scen3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Agile_Realms", "root", "agilerealms");
					Statement st = conn.createStatement();
					String sql = "SELECT remark from points WHERE p_id = 3";
					ResultSet rs = st.executeQuery(sql);
					
					Statement st1 = conn.createStatement();
					String sql1 = "SELECT good_result FROM results WHERE r_id = 3";
					ResultSet rs1 = st1.executeQuery(sql1);
					
					Statement st2 = conn.createStatement();
					String sql2 = "SELECT marks FROM points WHERE p_id = 3";
					ResultSet rs2 = st2.executeQuery(sql2);
					
					if(rs.next() && rs1.next() && rs2.next()) {
						layeredPane.removeAll();
						lblRemark_Scen3.setText(rs.getString("remark"));
						lblAnswer_Scen3.setText("<html>" + rs1.getString("good_result") + "</html>");
						lblPoints_Scen3.setText(rs2.getString("marks"));
						layeredPane.repaint();
						layeredPane.revalidate();
					}
					else {
						System.out.println("Failure!! ");
					}
 				}
				catch (Exception ex) {
					System.out.println("ERROR: " + ex.getMessage());
				}
			}
		});
		btnGood_scen3.setBounds(10, 10, 656, 144);
		option1_2.add(btnGood_scen3);
		
		JPanel option2_2 = new JPanel();
		option2_2.setBorder(new LineBorder(new Color(128, 128, 128), 2));
		option2_2.setBackground(Color.BLACK);
		option2_2.setBounds(676, 173, 676, 164);
		scen3.add(option2_2);
		option2_2.setLayout(null);
		
		JButton btnBest_scen3 = new JButton("");
		try {
			  Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/agile_realms", "root", "agilerealms"); 
			  Statement stm = connection.createStatement(); 
			  String sql = "SELECT best_option FROM scenarios WHERE s_id=3"; 
			  ResultSet res = stm.executeQuery(sql);
			  
			  while(res.next()) {
				  btnBest_scen3.setText("<html>" + res.getString("best_option") + "</html>");
				  btnBest_scen3.setVerticalAlignment(SwingConstants.CENTER);
				  btnBest_scen3.setHorizontalAlignment(SwingConstants.CENTER);
				  btnBest_scen3.setFont(new Font("Tahoma", Font.PLAIN, 20));
			  } 
			} 
		catch (Exception e) 
		{ 
			e.printStackTrace(); 
		}
		
		btnBest_scen3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Agile_Realms", "root", "agilerealms");
					Statement st = conn.createStatement();
					String sql = "SELECT remark from points WHERE p_id = 4";
					ResultSet rs = st.executeQuery(sql);
					
					Statement st1 = conn.createStatement();
					String sql1 = "SELECT best_result FROM results WHERE r_id = 3";
					ResultSet rs1 = st1.executeQuery(sql1);
					
					Statement st2 = conn.createStatement();
					String sql2 = "SELECT marks FROM points WHERE p_id = 4";
					ResultSet rs2 = st2.executeQuery(sql2);
					
					if(rs.next() && rs1.next() && rs2.next()) {
						layeredPane.removeAll();
						lblRemark_Scen3.setText(rs.getString("remark"));
						lblAnswer_Scen3.setText("<html>" + rs1.getString("best_result") + "</html>");
						lblPoints_Scen3.setText(rs2.getString("marks"));
						layeredPane.repaint();
						layeredPane.revalidate();
					}
					else {
						System.out.println("Failure!! ");
					}
 				}
				catch (Exception ex) {
					System.out.println("ERROR: " + ex.getMessage());
				}
			}
		});
		btnBest_scen3.setBounds(10, 10, 657, 144);
		option2_2.add(btnBest_scen3);
		
		JPanel option3_2 = new JPanel();
		option3_2.setBorder(new LineBorder(new Color(128, 128, 128), 2));
		option3_2.setBackground(Color.BLACK);
		option3_2.setBounds(0, 337, 677, 164);
		scen3.add(option3_2);
		option3_2.setLayout(null);
		
		JButton btnWorst_scen3 = new JButton("");
		try {
			  Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/agile_realms", "root", "agilerealms"); 
			  Statement stm = connection.createStatement(); 
			  String sql = "SELECT worst_option FROM scenarios WHERE s_id=3"; 
			  ResultSet res = stm.executeQuery(sql);
			  
			  while(res.next()) {
				  btnWorst_scen3.setText("<html>" + res.getString("worst_option") + "</html");
				  btnWorst_scen3.setVerticalAlignment(SwingConstants.CENTER);
				  btnWorst_scen3.setHorizontalAlignment(SwingConstants.CENTER);
				  btnWorst_scen3.setFont(new Font("Tahoma", Font.PLAIN, 20));
			  }
			} 
		catch (Exception e) 
		{ 
			e.printStackTrace(); 
		}
		
		btnWorst_scen3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Agile_Realms", "root", "agilerealms");
					Statement st = conn.createStatement();
					String sql = "SELECT remark from points WHERE p_id = 1";
					ResultSet rs = st.executeQuery(sql);
					
					Statement st1 = conn.createStatement();
					String sql1 = "SELECT worst_result FROM results WHERE r_id = 3";
					ResultSet rs1 = st1.executeQuery(sql1);
					
					Statement st2 = conn.createStatement();
					String sql2 = "SELECT marks FROM points WHERE p_id = 2";
					ResultSet rs2 = st2.executeQuery(sql2);
					
					if(rs.next() && rs1.next() && rs2.next()) {
						layeredPane.removeAll();
						lblRemark_Scen3.setText(rs.getString("remark"));
						lblAnswer_Scen3.setText("<html>" + rs1.getString("worst_result") + "</html>");
						lblPoints_Scen3.setText(rs2.getString("marks"));
						layeredPane.repaint();
						layeredPane.revalidate();
					}
					else {
						System.out.println("Failure!! ");
					}
 				}
				catch (Exception ex) {
					System.out.println("ERROR: " + ex.getMessage());
				}
			}
		});
		btnWorst_scen3.setBounds(10, 10, 656, 143);
		option3_2.add(btnWorst_scen3);
		
		JPanel option4_2 = new JPanel();
		option4_2.setBorder(new LineBorder(new Color(128, 128, 128), 2));
		option4_2.setBackground(Color.BLACK);
		option4_2.setBounds(676, 338, 676, 163);
		scen3.add(option4_2);
		option4_2.setLayout(null);
		
		JButton btnBad_scen3 = new JButton("");
		try {
			  Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/agile_realms", "root", "agilerealms"); 
			  Statement stm = connection.createStatement(); 
			  String sql = "SELECT bad_option FROM scenarios WHERE s_id=3"; 
			  ResultSet res = stm.executeQuery(sql);
			  
			  while(res.next()) {
				  btnBad_scen3.setText("<html>" + res.getString("bad_option") + "</html>");
				  btnBad_scen3.setVerticalAlignment(SwingConstants.CENTER);
				  btnBad_scen3.setHorizontalAlignment(SwingConstants.CENTER);
				  btnBad_scen3.setFont(new Font("Tahoma", Font.PLAIN, 20));
			  } 
			} 
		catch (Exception e) 
		{ 
			e.printStackTrace(); 
		}
		
		btnBad_scen3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Agile_Realms", "root", "agilerealms");
					Statement st = conn.createStatement();
					String sql = "SELECT remark from points WHERE p_id = 2";
					ResultSet rs = st.executeQuery(sql);
					
					Statement st1 = conn.createStatement();
					String sql1 = "SELECT bad_result FROM results WHERE r_id = 3";
					ResultSet rs1 = st1.executeQuery(sql1);
					
					Statement st2 = conn.createStatement();
					String sql2 = "SELECT marks FROM points WHERE p_id = 1";
					ResultSet rs2 = st2.executeQuery(sql2);
					
					if(rs.next() && rs1.next() && rs2.next()) {
						layeredPane.removeAll();
						lblRemark_Scen3.setText(rs.getString("remark"));
						lblAnswer_Scen3.setText("<html>" + rs1.getString("bad_result") + "</html>");
						lblPoints_Scen3.setText(rs2.getString("marks"));
						layeredPane.repaint();
						layeredPane.revalidate();
					}
					else {
						System.out.println("Failure!! ");
					}
 				}
				catch (Exception ex) {
					System.out.println("ERROR: " + ex.getMessage());
				}
			}
		});
		btnBad_scen3.setBounds(10, 10, 657, 144);
		option4_2.add(btnBad_scen3);
		
		//Scenario 4 starts
		JPanel scen4 = new JPanel();
		layeredPane.add(scen4, "name_604628558611100");
		scen4.setLayout(null);
		
		btnNextScen4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				res3.removeAll();
				layeredPane.repaint();
				layeredPane.revalidate();
				layeredPane.add(scen4);
			}
		});
		
		//Result 4
		JPanel res4 = new JPanel();
		res4.setBorder(new LineBorder(new Color(192, 192, 192), 2));
		res4.setForeground(Color.BLACK);
		res4.setBackground(Color.BLACK);
		res4.setBounds(0, 0, 1352, 501);
		gameBody.add(res4);
		res4.setLayout(null);
		
		JLabel lblResult4 = new JLabel("Result:");
		lblResult4.setHorizontalAlignment(SwingConstants.CENTER);
		lblResult4.setForeground(Color.LIGHT_GRAY);
		lblResult4.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblResult4.setBounds(494, 10, 365, 75);
		res4.add(lblResult4);
		
		JButton btnNextScen5 = new JButton("Next Scenario");
		btnNextScen5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNextScen5.setBounds(1000, 415, 231, 55);
		res4.add(btnNextScen5);
		
		JLabel lblAnswer_Scen4 = new JLabel("");
		lblAnswer_Scen4.setHorizontalAlignment(SwingConstants.CENTER);
		lblAnswer_Scen4.setForeground(Color.LIGHT_GRAY);
		lblAnswer_Scen4.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblAnswer_Scen4.setBounds(78, 90, 1200, 326);
		res4.add(lblAnswer_Scen4);
		
		
		JPanel situation_3 = new JPanel();
		situation_3.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		situation_3.setBackground(Color.GRAY);
		situation_3.setBounds(0, 0, 1352, 173);
		scen4.add(situation_3);
		situation_3.setLayout(null);
		
		JLabel SM_GatherStakeHolderFeedback = new JLabel("<html>As the Scrum Master for a dynamic software development team, you understand the importance of actively seeking and incorporating stakeholder feedback. Your team has recently delivered a sprint increment, and it's time to gather insights from stakeholders, including clients, end-users, and business representatives. You schedule a feedback session to discuss the latest features and enhancements with the stakeholders. The goal is to collect valuable input that can guide the team's future work and ensure alignment with stakeholders' expectations.</html>");
		SM_GatherStakeHolderFeedback.setFont(new Font("Tahoma", Font.PLAIN, 23));
		SM_GatherStakeHolderFeedback.setForeground(new Color(255, 255, 255));
		SM_GatherStakeHolderFeedback.setBounds(66, 11, 1179, 151);
		situation_3.add(SM_GatherStakeHolderFeedback);
		
		JPanel option1_3 = new JPanel();
		option1_3.setBorder(new LineBorder(new Color(128, 128, 128), 2));
		option1_3.setBackground(Color.BLACK);
		option1_3.setBounds(0, 173, 677, 164);
		scen4.add(option1_3);
		option1_3.setLayout(null);
		
		JButton btnWorst_scen4 = new JButton("<html>Feeling pressed for time, you conduct a brief feedback session with minimal preparation. You touch on a few features without delving into comprehensive discussions. Stakeholders provide feedback, but the session lacks depth, potentially leaving some important insights undiscovered.</html>");
		btnWorst_scen4.setVerticalAlignment(SwingConstants.TOP);
		btnWorst_scen4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layeredPane.removeAll();
				lblAnswer_Scen4.setText("<html><center>Misstep!!</center>"
						+ "<br>While feedback is collected, stakeholders may feel that their opinions were not thoroughly explored. This could lead to missed opportunities for improvement and potentially create a sense of unmet expectations."
						+ "<br><br><center>Points: +2</center></html>");
				layeredPane.repaint();
				layeredPane.revalidate();
			}
		});
		btnWorst_scen4.setBounds(10, 10, 656, 143);
		btnWorst_scen4.setHorizontalAlignment(SwingConstants.LEFT);
		btnWorst_scen4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		option1_3.add(btnWorst_scen4);
		
		JPanel option2_3 = new JPanel();
		option2_3.setBorder(new LineBorder(new Color(128, 128, 128), 2));
		option2_3.setBackground(Color.BLACK);
		option2_3.setBounds(676, 173, 676, 164);
		scen4.add(option2_3);
		option2_3.setLayout(null);
		
		JButton btnBest_scen4 = new JButton("<html>You plan a well-structured feedback session, providing stakeholders with a clear agenda and context for each feature. You actively facilitate discussions, encouraging participants to share both positive aspects and areas for improvement. You take detailed notes and ensure that everyone's opinions are heard and valued.</html>");
		btnBest_scen4.setVerticalAlignment(SwingConstants.TOP);
		btnBest_scen4.setHorizontalAlignment(SwingConstants.LEFT);
		btnBest_scen4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnBest_scen4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layeredPane.removeAll();
				lblAnswer_Scen4.setText("<html><center>Well done!!</center>"
						+ "<br>Stakeholders appreciate the organized and inclusive feedback session, strengthening collaboration. The team gains valuable insights for refinement, and stakeholders feel heard and respected."
						+ "<br><br><center>Points: +4</center></html>");
				layeredPane.repaint();
				layeredPane.revalidate();
			}
		});
		btnBest_scen4.setBounds(10, 10, 657, 144);
		option2_3.add(btnBest_scen4);
		
		JPanel option3_3 = new JPanel();
		option3_3.setBorder(new LineBorder(new Color(128, 128, 128), 2));
		option3_3.setBackground(Color.BLACK);
		option3_3.setBounds(0, 337, 677, 164);
		scen4.add(option3_3);
		option3_3.setLayout(null);
		
		JButton btnBad_scen4 = new JButton("<html>Recognizing a busy schedule, you delegate the responsibility of gathering feedback to a team member without providing clear guidelines. This option might result in uneven feedback collection, missing some critical perspectives and causing stakeholders to feel their input wasn't adequately valued.</html>");
		btnBad_scen4.setVerticalAlignment(SwingConstants.TOP);
		btnBad_scen4.setHorizontalAlignment(SwingConstants.LEFT);
		btnBad_scen4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layeredPane.removeAll();
				lblAnswer_Scen4.setText("<html><center>Critical oversight!!</center>"
						+ "<br>Delegating the feedback collection without clear guidance may result in uneven feedback. Stakeholders may notice the lack of consistency and feel that their input wasn't given the attention it deserved, potentially affecting trust and collaboration."
						+ "<br><br><center>Points: +1</center></html>");
				layeredPane.repaint();
				layeredPane.revalidate();
			}
		});
		btnBad_scen4.setBounds(10, 10, 657, 144);
		btnBad_scen4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		option3_3.add(btnBad_scen4);
		
		JPanel option4_3 = new JPanel();
		option4_3.setBorder(new LineBorder(new Color(128, 128, 128), 2));
		option4_3.setBackground(Color.BLACK);
		option4_3.setBounds(676, 338, 676, 163);
		scen4.add(option4_3);
		option4_3.setLayout(null);
		
		JButton btnGood_scen4 = new JButton("<html>You initiate open-ended discussions, allowing stakeholders to express their thoughts freely. While you have a general agenda, you prioritize flexibility to explore unexpected feedback. You capture key points and concerns raised during the session, promoting an open and collaborative atmosphere.</html>");
		btnGood_scen4.setVerticalAlignment(SwingConstants.TOP);
		btnGood_scen4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layeredPane.removeAll();
				lblAnswer_Scen4.setText("<html><center>Good effort!!</center>"
						+ "<br>The open-ended discussions foster a sense of collaboration, and stakeholders appreciate the flexibility. Some valuable insights may arise unexpectedly, contributing to a more comprehensive understanding of stakeholder needs."
						+ "<br><br><center>Points: +3</center></html>");
				layeredPane.repaint();
				layeredPane.revalidate();
			}
		});
		btnGood_scen4.setBounds(10, 10, 656, 144);
		btnGood_scen4.setHorizontalAlignment(SwingConstants.LEFT);
		btnGood_scen4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		option4_3.add(btnGood_scen4);
		
		JPanel scen5 = new JPanel();
		layeredPane.add(scen5, "name_604630392724600");
		scen5.setLayout(null);
		
		JPanel situation_4 = new JPanel();
		situation_4.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		situation_4.setBackground(Color.GRAY);
		situation_4.setBounds(0, 0, 1352, 173);
		scen5.add(situation_4);
		
		JPanel option1_4 = new JPanel();
		option1_4.setBorder(new LineBorder(new Color(128, 128, 128), 2));
		option1_4.setBackground(Color.BLACK);
		option1_4.setBounds(0, 173, 677, 164);
		scen5.add(option1_4);
		
		JPanel option2_4 = new JPanel();
		option2_4.setBorder(new LineBorder(new Color(128, 128, 128), 2));
		option2_4.setBackground(Color.BLACK);
		option2_4.setBounds(676, 173, 676, 164);
		scen5.add(option2_4);
		
		JPanel option3_4 = new JPanel();
		option3_4.setBorder(new LineBorder(new Color(128, 128, 128), 2));
		option3_4.setBackground(Color.BLACK);
		option3_4.setBounds(0, 337, 677, 164);
		scen5.add(option3_4);
		
		JPanel option4_4 = new JPanel();
		option4_4.setBorder(new LineBorder(new Color(128, 128, 128), 2));
		option4_4.setBackground(Color.BLACK);
		option4_4.setBounds(676, 338, 676, 163);
		scen5.add(option4_4);
		
		JPanel scen6 = new JPanel();
		layeredPane.add(scen6, "name_604635380688100");
		scen6.setLayout(null);
		
		JPanel situation_5 = new JPanel();
		situation_5.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		situation_5.setBackground(Color.GRAY);
		situation_5.setBounds(0, 0, 1352, 173);
		scen6.add(situation_5);
		
		JPanel option1_5 = new JPanel();
		option1_5.setBorder(new LineBorder(new Color(128, 128, 128), 2));
		option1_5.setBackground(Color.BLACK);
		option1_5.setBounds(0, 173, 677, 164);
		scen6.add(option1_5);
		
		JPanel option2_5 = new JPanel();
		option2_5.setBorder(new LineBorder(new Color(128, 128, 128), 2));
		option2_5.setBackground(Color.BLACK);
		option2_5.setBounds(676, 173, 676, 164);
		scen6.add(option2_5);
		
		JPanel option3_5 = new JPanel();
		option3_5.setBorder(new LineBorder(new Color(128, 128, 128), 2));
		option3_5.setBackground(Color.BLACK);
		option3_5.setBounds(0, 337, 677, 164);
		scen6.add(option3_5);
		
		JPanel option4_5 = new JPanel();
		option4_5.setBorder(new LineBorder(new Color(128, 128, 128), 2));
		option4_5.setBackground(Color.BLACK);
		option4_5.setBounds(676, 338, 676, 163);
		scen6.add(option4_5);
		
		JPanel scen7 = new JPanel();
		layeredPane.add(scen7, "name_604637635726600");
		scen7.setLayout(null);
		
		JPanel situation_6 = new JPanel();
		situation_6.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		situation_6.setBackground(Color.GRAY);
		situation_6.setBounds(0, 0, 1352, 173);
		scen7.add(situation_6);
		
		JPanel option1_6 = new JPanel();
		option1_6.setBorder(new LineBorder(new Color(128, 128, 128), 2));
		option1_6.setBackground(Color.BLACK);
		option1_6.setBounds(0, 173, 677, 164);
		scen7.add(option1_6);
		
		JPanel option2_6 = new JPanel();
		option2_6.setBorder(new LineBorder(new Color(128, 128, 128), 2));
		option2_6.setBackground(Color.BLACK);
		option2_6.setBounds(676, 173, 676, 164);
		scen7.add(option2_6);
		
		JPanel option3_6 = new JPanel();
		option3_6.setBorder(new LineBorder(new Color(128, 128, 128), 2));
		option3_6.setBackground(Color.BLACK);
		option3_6.setBounds(0, 337, 677, 164);
		scen7.add(option3_6);
		
		JPanel option4_6 = new JPanel();
		option4_6.setBorder(new LineBorder(new Color(128, 128, 128), 2));
		option4_6.setBackground(Color.BLACK);
		option4_6.setBounds(676, 338, 676, 163);
		scen7.add(option4_6);
		
		JPanel scen8 = new JPanel();
		layeredPane.add(scen8, "name_604639813553500");
		scen8.setLayout(null);
		
		JPanel situation_7 = new JPanel();
		situation_7.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		situation_7.setBackground(Color.GRAY);
		situation_7.setBounds(0, 0, 1352, 173);
		scen8.add(situation_7);
		
		JPanel option1_7 = new JPanel();
		option1_7.setBorder(new LineBorder(new Color(128, 128, 128), 2));
		option1_7.setBackground(Color.BLACK);
		option1_7.setBounds(0, 173, 677, 164);
		scen8.add(option1_7);
		
		JPanel option2_7 = new JPanel();
		option2_7.setBorder(new LineBorder(new Color(128, 128, 128), 2));
		option2_7.setBackground(Color.BLACK);
		option2_7.setBounds(676, 173, 676, 164);
		scen8.add(option2_7);
		
		JPanel option3_7 = new JPanel();
		option3_7.setBorder(new LineBorder(new Color(128, 128, 128), 2));
		option3_7.setBackground(Color.BLACK);
		option3_7.setBounds(0, 337, 677, 164);
		scen8.add(option3_7);
		
		JPanel option4_7 = new JPanel();
		option4_7.setBorder(new LineBorder(new Color(128, 128, 128), 2));
		option4_7.setBackground(Color.BLACK);
		option4_7.setBounds(676, 338, 676, 163);
		scen8.add(option4_7);
		
		JPanel scen9 = new JPanel();
		layeredPane.add(scen9, "name_604646810643500");
		scen9.setLayout(null);
		
		JPanel situation_8 = new JPanel();
		situation_8.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		situation_8.setBackground(Color.GRAY);
		situation_8.setBounds(0, 0, 1352, 173);
		scen9.add(situation_8);
		
		JPanel option1_8 = new JPanel();
		option1_8.setBorder(new LineBorder(new Color(128, 128, 128), 2));
		option1_8.setBackground(Color.BLACK);
		option1_8.setBounds(0, 173, 677, 164);
		scen9.add(option1_8);
		
		JPanel option2_8 = new JPanel();
		option2_8.setBorder(new LineBorder(new Color(128, 128, 128), 2));
		option2_8.setBackground(Color.BLACK);
		option2_8.setBounds(676, 173, 676, 164);
		scen9.add(option2_8);
		
		JPanel option3_8 = new JPanel();
		option3_8.setBorder(new LineBorder(new Color(128, 128, 128), 2));
		option3_8.setBackground(Color.BLACK);
		option3_8.setBounds(0, 337, 677, 164);
		scen9.add(option3_8);
		
		JPanel option4_8 = new JPanel();
		option4_8.setBorder(new LineBorder(new Color(128, 128, 128), 2));
		option4_8.setBackground(Color.BLACK);
		option4_8.setBounds(676, 338, 676, 163);
		scen9.add(option4_8);
		
		JPanel scen10 = new JPanel();
		layeredPane.add(scen10, "name_604649099355100");
		scen10.setLayout(null);
		
		JPanel situation_9 = new JPanel();
		situation_9.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		situation_9.setBackground(Color.GRAY);
		situation_9.setBounds(0, 0, 1352, 173);
		scen10.add(situation_9);
		
		JPanel option1_9 = new JPanel();
		option1_9.setBorder(new LineBorder(new Color(128, 128, 128), 2));
		option1_9.setBackground(Color.BLACK);
		option1_9.setBounds(0, 173, 677, 164);
		scen10.add(option1_9);
		
		JPanel option2_9 = new JPanel();
		option2_9.setBorder(new LineBorder(new Color(128, 128, 128), 2));
		option2_9.setBackground(Color.BLACK);
		option2_9.setBounds(676, 173, 676, 164);
		scen10.add(option2_9);
		
		JPanel option3_9 = new JPanel();
		option3_9.setBorder(new LineBorder(new Color(128, 128, 128), 2));
		option3_9.setBackground(Color.BLACK);
		option3_9.setBounds(0, 337, 677, 164);
		scen10.add(option3_9);
		
		JPanel option4_9 = new JPanel();
		option4_9.setBorder(new LineBorder(new Color(128, 128, 128), 2));
		option4_9.setBackground(Color.BLACK);
		option4_9.setBounds(676, 338, 676, 163);
		scen10.add(option4_9);
		
		
		//footer
		JPanel Footer = new JPanel();
		Footer.setLayout(null);
		Footer.setBorder(new LineBorder(new Color(128, 128, 128), 3));
		Footer.setBackground(Color.BLACK);
		Footer.setBounds(0, 579, 1352, 184);
		contentPane.add(Footer);
		
		JLabel About = new JLabel("About");
		About.setHorizontalAlignment(SwingConstants.CENTER);
		About.setForeground(Color.WHITE);
		About.setFont(new Font("Arial", Font.PLAIN, 13));
		About.setBounds(297, 101, 77, 13);
		Footer.add(About);
		
		JLabel termsOfUse = new JLabel("Terms of Use");
		termsOfUse.setHorizontalAlignment(SwingConstants.CENTER);
		termsOfUse.setForeground(Color.WHITE);
		termsOfUse.setFont(new Font("Arial", Font.PLAIN, 13));
		termsOfUse.setBounds(425, 101, 129, 13);
		Footer.add(termsOfUse);
		
		JLabel rulesOfPlay = new JLabel("Rules of Play");
		rulesOfPlay.setHorizontalAlignment(SwingConstants.CENTER);
		rulesOfPlay.setForeground(Color.WHITE);
		rulesOfPlay.setFont(new Font("Arial", Font.PLAIN, 13));
		rulesOfPlay.setBounds(593, 101, 163, 13);
		Footer.add(rulesOfPlay);
		
		JLabel privacyPolicy = new JLabel("Privacy Policy");
		privacyPolicy.setHorizontalAlignment(SwingConstants.CENTER);
		privacyPolicy.setForeground(Color.WHITE);
		privacyPolicy.setFont(new Font("Arial", Font.PLAIN, 13));
		privacyPolicy.setBounds(800, 101, 129, 13);
		Footer.add(privacyPolicy);
		
		JLabel credits = new JLabel("Credits");
		credits.setHorizontalAlignment(SwingConstants.CENTER);
		credits.setForeground(Color.WHITE);
		credits.setFont(new Font("Arial", Font.PLAIN, 13));
		credits.setBounds(990, 101, 77, 13);
		Footer.add(credits);
		
		JLabel lblgroupS = new JLabel("©2023 Group Sharma LLC. All rights reserved.");
		lblgroupS.setHorizontalAlignment(SwingConstants.CENTER);
		lblgroupS.setForeground(Color.WHITE);
		lblgroupS.setFont(new Font("Arial", Font.PLAIN, 13));
		lblgroupS.setBounds(513, 136, 323, 13);
		Footer.add(lblgroupS);
		
		JButton sendTop = new JButton("");
		sendTop.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/images/smallWhiteArrowUp.png")).getImage().getScaledInstance(26, 29, Image.SCALE_SMOOTH)));
		sendTop.setForeground(Color.BLACK);
		sendTop.setFont(new Font("Arial", Font.PLAIN, 13));
		sendTop.setBackground(Color.BLACK);
		sendTop.setBounds(663, 35, 26, 29);
		Footer.add(sendTop);
	}

	private void updateProgressBar() {
		// TODO Auto-generated method stub
		
	}
}