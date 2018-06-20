/*
 * 
 * Project Title : Prison Management System
 * 
 * Author :  Devashish Rawat
 * 
 * Technology Used :  Java SWING.
 * 
 */




/*   
 * 
 * Below we are importing packages for our class
 * 
 */

import java.awt.BorderLayout;
import java.awt.EventQueue;
import net.proteanit.sql.DbUtils;

import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.event.MenuListener;


import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;

import java.awt.TextArea;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.io.File;
import java.sql.*;
import java.awt.event.ActionEvent;
import javax.swing.event.MenuEvent;




import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;

public class MetaCoreHandler extends JFrame {

	public JPanel contentPane;
	public JPanel main_Panel_without_menuBar;
	
	JPanel Home_Core_Panel;
	JPanel VAD_Core_Panel;
	JPanel VMD_Core_Panel;
	JPanel VSD_Core_Panel;
	JPanel VWD_Core_Panel;
	
	JPanel SAD_Core_Panel;
	
	JPanel SMD_Core_Panel;
	
	JPanel SSD_Core_Panel;
	
	JPanel SWD_Core_Panel;
	
	JPanel AAD_Core_Panel;
	
	JPanel APD_Core_Panel;
	
	JPanel ASD_Core_Panel;
	
	JPanel AWD_Core_Panel;
	
	JPanel MAD_Core_Panel;
	
	JPanel MPD_Core_Panel;
	
	JPanel MSD_Core_Panel;
	
	JPanel MWD_Core_Panel;
	
	
	int result;
	
	/*
	 * Below are the varialbles of MenuItem of
	 * Administrators Detail
	 */
	public JMenuItem vad;
	public JMenuItem sad;
	public JMenuItem aad;
	public JMenuItem mad;
	public JMenuItem dad;
	
	
	/*
	 * Below are the varialbles of MenuItem of
	 * Prisoners Detail
	 */
	
	public JMenuItem vmd;
	public JMenuItem smd;
	public JMenuItem amd;
	public JMenuItem md;

	
	/*
	 * Below are the varialbles of MenuItem of
	 * Staffs Detail
	 */
	
	public JMenuItem vsd;
	public JMenuItem ssd;
	public JMenuItem asd;
	public JMenuItem msd;
	public JMenuItem dsd;

	
	
	/*
	 * Below are the varialbles of MenuItem of
	 * Staffs Detail
	 */
	
	public JMenuItem vwd;
	public JMenuItem swd;
	public JMenuItem anw;
	public JMenuItem mwd;
	public JMenuItem dwd;

	
	/*
	 * Below are the varialbles of Menu  of
	 * our application
	 */
	public JMenu mnHome;
	public JMenu cu ;
	
	public  JLabel lblHomeLabel;
	
	public  JLabel lblHomeLabel_1;
	
	
public   String adminid;
	public   String password;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
				
					
					MetaCoreHandler frame = new MetaCoreHandler();
					frame.setVisible(true);
				} 
			catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public  MetaCoreHandler() {
		setTitle("Tihar Prison Management System");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1189, 577);
		setResizable(false);

		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(new Color(230, 230, 250));
		setJMenuBar(menuBar);
		
		 mnHome = new JMenu("Home");
		mnHome.addMenuListener(new MenuListener() {
			public void menuCanceled(MenuEvent e) {
			}
			public void menuDeselected(MenuEvent e) {
			}
			public void menuSelected(MenuEvent e) 
			{
				
			
				/*
				 * On click event of menu item follow two way process
				 * 
				 * first we need to - set the visiblity of main Panel inside Frame
				 * Off.
				 * So that we can so the desire Pannel inside Frame.
				 * 
				 * Second we need to - "disabled" the clicked 'Menu' / 'MenuItems'.
				 * 
				 * 
				 * Third  we need to - Enabled the all 'Menu or MenuItems' other than
				 * the clicked one.
				 * 
				 * Let's check the below code
				 */
				
			/*	first we need to - set the visiblity of main Panel inside Frame
				  Off.
				  */
				contentPane.setVisible(false);
				
				
			/*	Second we need to - "disabled" the clicked 'Menu' / 'MenuItems'.
			 * 
			 */
				
				
				mnHome.setEnabled(false);
				
				/*Third  we need to - Enabled the all 'Menu or MenuItems' other than
				 * the clicked one.
				 */
				
				
				/*
				 * Below are the varialbles of MenuItem of
				 * Administrators Detail
				 */
				 vad.setEnabled(true);
				 sad.setEnabled(true);
			 aad.setEnabled(true);
				 mad.setEnabled(true);
				// dad.setEnabled(true);
				
				
				/*
				 * Below are the varialbles of MenuItem of
				 * Prisoners Detail
				 */
				
				 vmd.setEnabled(true);
				smd.setEnabled(true);
				amd.setEnabled(true);
			 md.setEnabled(true);

				
				/*
				 * Below are the varialbles of MenuItem of
				 * Staffs Detail
				 */
				
				vsd.setEnabled(true);
				 ssd.setEnabled(true);
				  asd.setEnabled(true);
				 msd.setEnabled(true);
			//	dsd.setEnabled(true);

				
				
				/*
				 * Below are the varialbles of MenuItem of
				 * Staffs Detail
				 */
				
				 vwd.setEnabled(true);
				 swd.setEnabled(true);
				 anw.setEnabled(true);
			 mwd.setEnabled(true);
				 // dwd.setEnabled(true);

				
				/*
				 * Below are the varialbles of Menu  of
				 * our application
				 */
				  //mnHome.setEnabled(true);
				
				cu.setEnabled(true);
				
				/* ++++++++++++++++++++++++++++++++++++++++++++++
				 * 
				 * 
				 *  Code Starts : Now we are good to go to show the content
				 * related to the clicked link
				 * 
				 * 
				 ++++++++++++++++++++++++++++++++++++++++++++++++*/
		
				// This is our core Panel over which we will
				// perform all our design work
				
				Home_Core_Panel = new JPanel();
				Home_Core_Panel.setBounds(0, 0, 1183, 525);
				
				
				Home_Core_Panel.setBorder(new EmptyBorder(5, 5, 5, 5));
				setContentPane(Home_Core_Panel);
				
				
				// Now we will set "Absolute Layout"  so that 
				// we can place our elements on frame  as per 
				// the desire  X-Coordinates and Y- Coordinates
		
				
				
				Home_Core_Panel.setLayout(null);
				
				/* ++++++++++++++++++++++++++++++++++++++++++++++
				 * 
				 * 
				 *  Code Starts : Now we are good to go to show the content
				 * related to the clicked link
				 * 
				 * 
				 ++++++++++++++++++++++++++++++++++++++++++++++++*/
				

				
				JLabel lblNewLabel = new JLabel("");
				
				Image img = new ImageIcon(this.getClass().getResource("/tihar-jail1.jpg")).getImage();
				lblNewLabel.setIcon(new ImageIcon(img));
				lblNewLabel.setBounds(0, 0, 375, 525);
				Home_Core_Panel.add(lblNewLabel);
				
				JLabel lblNewLabel_1 = new JLabel("Welcome To Tihar JAIL");
				lblNewLabel_1.setForeground(new Color(112, 128, 144));
				lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 35));
				lblNewLabel_1.setBounds(570, 11, 375, 60);
				Home_Core_Panel.add(lblNewLabel_1);
				
				JLabel lblNewLabel_2 = new JLabel("Prison Management System");
				lblNewLabel_2.setForeground(new Color(112, 128, 144));
				lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 35));
				lblNewLabel_2.setBounds(549, 46, 497, 76);
				Home_Core_Panel.add(lblNewLabel_2);
				
				JPanel panel = new JPanel();
				panel.setBackground(new Color(255, 255, 240));
				panel.setForeground(new Color(255, 255, 255));
				panel.setBounds(403, 118, 757, 379);
				Home_Core_Panel.add(panel);
				panel.setLayout(null);
				
				JLabel lblNewLabel_3 = new JLabel("About Us");
				lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 19));
				lblNewLabel_3.setBounds(26, 23, 188, 41);
				panel.add(lblNewLabel_3);
				
				JLabel lblNewLabel_4 = new JLabel("complex in the world comprising of nine central prisons and one District Prison at Rohini");
				lblNewLabel_4.setFont(new Font("Times New Roman", Font.PLAIN, 18));
				lblNewLabel_4.setBounds(53, 104, 668, 41);
				panel.add(lblNewLabel_4);
				
				JLabel lblNewLabel_5 = new JLabel("Delhi Prisons has two Prison Complexes, one at Tihar being one of the largest prison ");
				lblNewLabel_5.setFont(new Font("Times New Roman", Font.PLAIN, 18));
				lblNewLabel_5.setBounds(53, 74, 668, 41);
				panel.add(lblNewLabel_5);
				
				JLabel lblNewLabel_6 = new JLabel("Prison Complex. The total population in ten prisons is around 14000 prisoners against");
				lblNewLabel_6.setFont(new Font("Times New Roman", Font.PLAIN, 18));
				lblNewLabel_6.setBounds(53, 135, 638, 41);
				panel.add(lblNewLabel_6);
				
				JLabel lblNewLabel_7 = new JLabel("the sanctioned capacity of 6250 prisoners. There was steady increase in the prisoner\u2019s");
				lblNewLabel_7.setFont(new Font("Times New Roman", Font.PLAIN, 18));
				lblNewLabel_7.setBounds(53, 163, 638, 51);
				panel.add(lblNewLabel_7);
				
				JLabel lblNewLabel_8 = new JLabel(" population over the last years which is effectively catered by our Software system.");
				lblNewLabel_8.setFont(new Font("Times New Roman", Font.PLAIN, 18));
				lblNewLabel_8.setBounds(53, 200, 638, 41);
				panel.add(lblNewLabel_8);
				
				JLabel lblNewLabel_10 = new JLabel("Thanks,");
				lblNewLabel_10.setFont(new Font("Times New Roman", Font.BOLD, 18));
				lblNewLabel_10.setBounds(26, 267, 78, 25);
				panel.add(lblNewLabel_10);
				
				JLabel lblNewLabel_9 = new JLabel("Director - Tihar Jail");
				lblNewLabel_9.setFont(new Font("Times New Roman", Font.PLAIN, 19));
				lblNewLabel_9.setBounds(26, 289, 178, 35);
				panel.add(lblNewLabel_9);
				
				
				
				/* ++++++++++++++++++++++++++++++++++++++++++++++
				 * 
				 * 
				 *  Code Ends : Now we are good to go to show the content
				 * related to the clicked link
				 * 
				 * 
				 ++++++++++++++++++++++++++++++++++++++++++++++++*/
				
				
				
			}
		});
		mnHome.setForeground(Color.GRAY);
		mnHome.setFont(new Font("Segoe UI", Font.BOLD, 15));
		menuBar.add(mnHome);
		
		/*
		 * On  First Landing we will Disable Home Button
		 */
		
		mnHome.setEnabled(false);
		
		
		JMenu pad = new JMenu("Administrators  Detail");
		pad.setForeground(Color.GRAY);
		pad.setFont(new Font("Segoe UI", Font.BOLD, 15));
		menuBar.add(pad);
		
		 vad = new JMenuItem("View Administrators Detail");
		 vad.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent arg0) 
		 	{
		 		
		 		
		 	
		 		
				/*
				 * On click event of menu item follow two way process
				 * 
				 * first we need to - set the visiblity of main Panel inside Frame
				 * Off.
				 * So that we can so the desire Pannel inside Frame.
				 * 
				 * Second we need to - "disabled" the clicked 'Menu' / 'MenuItems'.
				 * 
				 * 
				 * Third  we need to - Enabled the all 'Menu or MenuItems' other than
				 * the clicked one.
				 * 
				 * Let's check the below code
				 */
				
			/*	first we need to - set the visiblity of main Panel inside Frame
				  Off.
				  */
				
		 		/*
		 		 * 
		 		 * Important Note - when whever we move to new link by clicking on it
		 		 * we always use contentPane.setVisible(false)  to clear data
		 		 * 
		 		 * this command will all data except MenuItems.
		 		 * 
		 		 */
		 		
		 		contentPane.setVisible(false);
		 		
				
			/*	Second we need to - "disabled" the clicked 'Menu' / 'MenuItems'.
			 * 
			 */
				
				
				mnHome.setEnabled(false);
				
				/*Third  we need to - Enabled the all 'Menu or MenuItems' other than
				 * the clicked one.
				 */
				
				
				/*
				 * Below are the varialbles of MenuItem of
				 * Administrators Detail
				 */
			//	 vad.setEnabled(true);
				 sad.setEnabled(true);
			 aad.setEnabled(true);
				 mad.setEnabled(true);
			//	 dad.setEnabled(true);
				
				
				/*
				 * Below are the varialbles of MenuItem of
				 * Prisoners Detail
				 */
				
				 vmd.setEnabled(true);
				smd.setEnabled(true);
				amd.setEnabled(true);
			 md.setEnabled(true);

				
				/*
				 * Below are the varialbles of MenuItem of
				 * Staffs Detail
				 */
				
				vsd.setEnabled(true);
				 ssd.setEnabled(true);
				  asd.setEnabled(true);
				 msd.setEnabled(true);
				//dsd.setEnabled(true);

				
				
				/*
				 * Below are the varialbles of MenuItem of
				 * Staffs Detail
				 */
				
				 vwd.setEnabled(true);
				 swd.setEnabled(true);
				 anw.setEnabled(true);
			 mwd.setEnabled(true);
				  //dwd.setEnabled(true);

				
				/*
				 * Below are the varialbles of Menu  of
				 * our application
				 */
				  mnHome.setEnabled(true);
				
				cu.setEnabled(true);
				
			/*
			 * 
			 * Now we will disabled clicked link
			 * 	
			 */
				vad.setEnabled(false);

				/* ++++++++++++++++++++++++++++++++++++++++++++++
				 * 
				 * 
				 *  Code Starts : Now we are good to go to show the content
				 * related to the clicked link
				 * 
				 * 
				 ++++++++++++++++++++++++++++++++++++++++++++++++*/
		
				// This is our core Panel over which we will
				// perform all our design work
				
				VAD_Core_Panel = new JPanel();
				VAD_Core_Panel.setBounds(0, 0, 1183, 525);
				
				
				VAD_Core_Panel.setBorder(new EmptyBorder(5, 5, 5, 5));
				setContentPane(VAD_Core_Panel);
				
				
				// Now we will set "Absolute Layout"  so that 
				// we can place our elements on frame  as per 
				// the desire  X-Coordinates and Y- Coordinates
		
				
				
				VAD_Core_Panel.setLayout(null);
				
				/* ++++++++++++++++++++++++++++++++++++++++++++++
				 * 
				 * 
				 *  Code Starts : Now we are good to go to show the content
				 * related to the clicked link
				 * 
				 * 
				 ++++++++++++++++++++++++++++++++++++++++++++++++*/
				
				/************Table code*********************/
				
				
				/*************************************************/
				
				JPanel panel = new JPanel();
				panel.setBounds(0, 0, 1183, 525);
				VAD_Core_Panel.add(panel);
				panel.setLayout(null);
				
				JLabel lblNewLabel = new JLabel("Prison Administrators Detail");
				lblNewLabel.setForeground(Color.GRAY);
				lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 35));
				lblNewLabel.setBounds(327, 21, 433, 77);
				panel.add(lblNewLabel);
				
				JScrollPane scrollPane = new JScrollPane();
				scrollPane.setBounds(126, 97, 904, 400);
				panel.add(scrollPane);
				
				JTable table = new JTable();
				scrollPane.setViewportView(table);
				
				

				
				/*
				 * Code Starts : Create Database connection
				 */
				
				/*
				 * 
				 *  Important Note : 
				 *  
				 *  For Test Path Url Would be -
				 *  
				 *  	
				 *  
				 *  
				 *    For Executable Jar  Url Would be -
				 *  
				 *  	 String url = "jdbc:sqlite::resource:Prison_Management_System.db";
				 */
				
				String url = "jdbc:sqlite::resource:Prison_Management_System.db";
				 String sql = "select * from  Admin_Details";
				 
			        Connection conn = null;
			        try {
			            conn = DriverManager.getConnection(url);
			     
			        		   		        
			                PreparedStatement pstmt = conn.prepareStatement(sql);
			         
			          //  pstmt.executeUpdate();

		ResultSet rs = pstmt.executeQuery();

		  table.setModel(DbUtils.resultSetToTableModel(rs));

		/*

		For Modelling ResultSet into table we will 
		use rs2XML jar file, it's a class file
		which help in modelling result set into Table.

		*/

			        } 
			catch (SQLException sqliteex) {
			            System.out.println(sqliteex.getMessage());
			        }
			
			/*
			 * Code Ends : Create Database connection
			 */

			
				
		 	}
		 });
		pad.add(vad);
		
	
		
		 sad = new JMenuItem("Search  Administrator Detail");
		 sad.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent arg0)
		 	{
		 		
		 		
		 		
				/*
				 * On click event of menu item follow two way process
				 * 
				 * first we need to - set the visiblity of main Panel inside Frame
				 * Off.
				 * So that we can so the desire Pannel inside Frame.
				 * 
				 * Second we need to - "disabled" the clicked 'Menu' / 'MenuItems'.
				 * 
				 * 
				 * Third  we need to - Enabled the all 'Menu or MenuItems' other than
				 * the clicked one.
				 * 
				 * Let's check the below code
				 */
				
			/*	first we need to - set the visiblity of main Panel inside Frame
				  Off.
				  */
				
		 		/*
		 		 * 
		 		 * Important Note - when whever we move to new link by clicking on it
		 		 * we always use contentPane.setVisible(false)  to clear data
		 		 * 
		 		 * this command will all data except MenuItems.
		 		 * 
		 		 */
		 		
		 		contentPane.setVisible(false);
		 		
				
			/*	Second we need to - "disabled" the clicked 'Menu' / 'MenuItems'.
			 * 
			 */
				
				
				sad.setEnabled(false);
				
				/*Third  we need to - Enabled the all 'Menu or MenuItems' other than
				 * the clicked one.
				 */
				
				
				/*
				 * Below are the varialbles of MenuItem of
				 * Administrators Detail
				 */
			vad.setEnabled(true);
				// sad.setEnabled(true);
			 aad.setEnabled(true);
				 mad.setEnabled(true);
			//	 dad.setEnabled(true);
				
				
				/*
				 * Below are the varialbles of MenuItem of
				 * Prisoners Detail
				 */
				
				 vmd.setEnabled(true);
				smd.setEnabled(true);
				amd.setEnabled(true);
			 md.setEnabled(true);

				
				/*
				 * Below are the varialbles of MenuItem of
				 * Staffs Detail
				 */
				
				vsd.setEnabled(true);
				 ssd.setEnabled(true);
				  asd.setEnabled(true);
				 msd.setEnabled(true);
		//		dsd.setEnabled(true);

				
				
				/*
				 * Below are the varialbles of MenuItem of
				 * Staffs Detail
				 */
				
				 vwd.setEnabled(true);
				 swd.setEnabled(true);
				 anw.setEnabled(true);
			 mwd.setEnabled(true);
			//	  dwd.setEnabled(true);

				
				/*
				 * Below are the varialbles of Menu  of
				 * our application
				 */
				  mnHome.setEnabled(true);
				
				cu.setEnabled(true);
				
		
				/* ++++++++++++++++++++++++++++++++++++++++++++++
				 * 
				 * 
				 *  Code Starts : Now we are good to go to show the content
				 * related to the clicked link
				 * 
				 * 
				 ++++++++++++++++++++++++++++++++++++++++++++++++*/
		
				// This is our core Panel over which we will
				// perform all our design work
				
				SAD_Core_Panel = new JPanel();
				SAD_Core_Panel.setBounds(0, 0, 1183, 525);
				
				
				SAD_Core_Panel.setBorder(new EmptyBorder(5, 5, 5, 5));
				setContentPane(SAD_Core_Panel);
				
				
				// Now we will set "Absolute Layout"  so that 
				// we can place our elements on frame  as per 
				// the desire  X-Coordinates and Y- Coordinates
		
				
				
				SAD_Core_Panel.setLayout(null);
				
				
				/*************************************************/
				
				JPanel panel = new JPanel();
				panel.setBounds(0, 0, 1183, 525);
				SAD_Core_Panel.add(panel);
				panel.setLayout(null);
				
				JLabel lblNewLabel = new JLabel("Search Administrator Detail");
				lblNewLabel.setForeground(Color.GRAY);
				lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 35));
				lblNewLabel.setBounds(327, 21, 433, 77);
				panel.add(lblNewLabel);
				
				JScrollPane scrollPane = new JScrollPane();
				scrollPane.setBounds(73, 231, 1036, 217);
				panel.add(scrollPane);
				
				JTable table = new JTable();
				scrollPane.setViewportView(table);
				
				JLabel lblNewLabel_1 = new JLabel("Enter Administrator ID :");
				lblNewLabel_1.setForeground(Color.GRAY);
				lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 22));
				lblNewLabel_1.setBounds(228, 145, 256, 47);
				panel.add(lblNewLabel_1);
				
		
				
				JTextField textField = new JTextField();
				textField.setBounds(482, 154, 168, 37);
				panel.add(textField);
				textField.setColumns(10);
				
				JButton btnNewButton = new JButton("Search");
				btnNewButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0)
					{
						
						/*
						 * 
						 * Get text  from input field
						 * 
						 */
						String str = textField.getText().toString().toUpperCase();
						
						/*
						 * Code Starts : Create Database connection
						 */
						
						/*
						 * 
						 *  Important Note : 
						 *  
						 *  For Test Path Url Would be -
						 *  
						 *  	
						 *  
						 *  
						 *    For Executable Jar  Url Would be -
						 *  
						 *  	 String url = "jdbc:sqlite::resource:Prison_Management_System.db";
						 */
						
						String url = "jdbc:sqlite::resource:Prison_Management_System.db";
						 String sql = "select  *  from  Admin_Details where  Admin_ID="+"'"+str+"'";
						 
					        Connection conn = null;
					        try {
					            conn = DriverManager.getConnection(url);
					     
					        		   		        
					                PreparedStatement pstmt = conn.prepareStatement(sql);
					         
					          //  pstmt.executeUpdate();

				ResultSet rs = pstmt.executeQuery();

				  table.setModel(DbUtils.resultSetToTableModel(rs));

				/*

				For Modelling ResultSet into table we will 
				use rs2XML jar file, it's a class file
				which help in modelling result set into Table.

				*/

					        } 
					catch (SQLException sqliteex) {
					            System.out.println(sqliteex.getMessage());
					        }
					
					/*
					 * Code Ends : Create Database connection
					 */

					
						
					}
				});
				btnNewButton.setForeground(Color.GRAY);
				btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 20));
				btnNewButton.setBounds(688, 153, 102, 33);
				panel.add(btnNewButton);
				
		 		
		 		
		 		
		 	}
		 });
		pad.add(sad);
		
		
		 aad = new JMenuItem("Add Administrator Detail");
		 aad.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e)
		 	{
		 		
		 		
					/*
					 * On click event of menu item follow two way process
					 * 
					 * first we need to - set the visiblity of main Panel inside Frame
					 * Off.
					 * So that we can so the desire Pannel inside Frame.
					 * 
					 * Second we need to - "disabled" the clicked 'Menu' / 'MenuItems'.
					 * 
					 * 
					 * Third  we need to - Enabled the all 'Menu or MenuItems' other than
					 * the clicked one.
					 * 
					 * Let's check the below code
					 */
					
				/*	first we need to - set the visiblity of main Panel inside Frame
					  Off.
					  */
					
			 		/*
			 		 * 
			 		 * Important Note - when whever we move to new link by clicking on it
			 		 * we always use contentPane.setVisible(false)  to clear data
			 		 * 
			 		 * this command will all data except MenuItems.
			 		 * 
			 		 */
			 		
			 		contentPane.setVisible(false);
			 		
					
				/*	Second we need to - "disabled" the clicked 'Menu' / 'MenuItems'.
				 * 
				 */
					
					
					aad.setEnabled(false);
					
					/*Third  we need to - Enabled the all 'Menu or MenuItems' other than
					 * the clicked one.
					 */
					
					
					/*
					 * Below are the varialbles of MenuItem of
					 * Administrators Detail
					 */
				vad.setEnabled(true);
					sad.setEnabled(true);
			//	 aad.setEnabled(true);
					 mad.setEnabled(true);
				//	 dad.setEnabled(true);
					
					
					/*
					 * Below are the varialbles of MenuItem of
					 * Prisoners Detail
					 */
					
					 vmd.setEnabled(true);
					smd.setEnabled(true);
					amd.setEnabled(true);
				 md.setEnabled(true);

					
					/*
					 * Below are the varialbles of MenuItem of
					 * Staffs Detail
					 */
					
					vsd.setEnabled(true);
					 ssd.setEnabled(true);
					  asd.setEnabled(true);
					 msd.setEnabled(true);
			//	dsd.setEnabled(true);

					
					
					/*
					 * Below are the varialbles of MenuItem of
					 * Staffs Detail
					 */
					
					 vwd.setEnabled(true);
					 swd.setEnabled(true);
					 anw.setEnabled(true);
				 mwd.setEnabled(true);
				//	  dwd.setEnabled(true);

					
					/*
					 * Below are the varialbles of Menu  of
					 * our application
					 */
					  mnHome.setEnabled(true);
					
					cu.setEnabled(true);
					
			
					/* ++++++++++++++++++++++++++++++++++++++++++++++
					 * 
					 * 
					 *  Code Starts : Now we are good to go to show the content
					 * related to the clicked link
					 * 
					 * 
					 ++++++++++++++++++++++++++++++++++++++++++++++++*/
			
					// This is our core Panel over which we will
					// perform all our design work
					
					AAD_Core_Panel = new JPanel();
					AAD_Core_Panel.setBounds(0, 0, 1183, 525);
					
					
					AAD_Core_Panel.setBorder(new EmptyBorder(5, 5, 5, 5));
					setContentPane(AAD_Core_Panel);
					
					
					// Now we will set "Absolute Layout"  so that 
					// we can place our elements on frame  as per 
					// the desire  X-Coordinates and Y- Coordinates
			
					
					
					AAD_Core_Panel.setLayout(null);
					
					
					/*************************************************/
					
					JLabel lblNewLabel = new JLabel("Add New Administrator");
					lblNewLabel.setForeground(Color.GRAY);
					lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 35));
					lblNewLabel.setBounds(391, 36, 378, 75);
					AAD_Core_Panel.add(lblNewLabel);
					
					JLabel lblNewLabel_1 = new JLabel("Admin ID :");
					lblNewLabel_1.setForeground(Color.GRAY);
					lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
					lblNewLabel_1.setBounds(186, 170, 98, 25);
					AAD_Core_Panel.add(lblNewLabel_1);
					
					JLabel lblNewLabel_2 = new JLabel("Date Of Joining :");
					lblNewLabel_2.setForeground(Color.GRAY);
					lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 20));
					lblNewLabel_2.setBounds(152, 304, 151, 33);
					AAD_Core_Panel.add(lblNewLabel_2);
					
					JLabel lblNewLabel_3 = new JLabel("Administrator Name :");
					lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 20));
					lblNewLabel_3.setForeground(Color.GRAY);
					lblNewLabel_3.setBounds(598, 163, 195, 39);
					AAD_Core_Panel.add(lblNewLabel_3);
					
					JLabel lblNewLabel_4 = new JLabel("Tenure :");
					lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 20));
					lblNewLabel_4.setForeground(Color.GRAY);
					lblNewLabel_4.setBounds(695, 299, 114, 43);
					AAD_Core_Panel.add(lblNewLabel_4);
					
					JTextField 	textField_1 = new JTextField();
					textField_1.setBounds(326, 166, 174, 36);
					AAD_Core_Panel.add(textField_1);
					textField_1.setColumns(10);
					
					JTextField txtEx = new JTextField();
					txtEx.setForeground(Color.LIGHT_GRAY);
					txtEx.setHorizontalAlignment(SwingConstants.LEFT);
					txtEx.setText("example :- 25 jan 2017");
					txtEx.setBounds(326, 305, 174, 36);
					AAD_Core_Panel.add(txtEx);
					txtEx.setColumns(10);
					
					JTextField textField_3 = new JTextField();
					textField_3.setBounds(792, 166, 181, 36);
					AAD_Core_Panel.add(textField_3);
					textField_3.setColumns(10);
					
					JTextField textField_4 = new JTextField();
					textField_4.setBounds(792, 305, 181, 36);
					AAD_Core_Panel.add(textField_4);
					textField_4.setColumns(10);
					
				
					
					JButton btnNewButton = new JButton("Add");
					btnNewButton.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) 
						{
							
							
							/*
							 * 
							 * Get text  from input field
							 * 
							 */
							String adminid = textField_1.getText().toString().toUpperCase();
							
							String adminname = textField_3.getText().toString();
							
							String doj = txtEx.getText().toString().toUpperCase();
							
							int  tenure = Integer.parseInt(textField_4.getText().toString());
							
							/*
							 * Code Starts : Create Database connection
							 */
							
							/*
							 * 
							 *  Important Note : 
							 *  
							 *  For Test Path Url Would be -
							 *  
							 *  	
							 *  
							 *  
							 *    For Executable Jar  Url Would be -
							 *  
							 *  	 String url = "jdbc:sqlite::resource:Prison_Management_System.db";
							 */
							
							String url = "jdbc:sqlite::resource:Prison_Management_System.db";
							// String sql = "insert into Admin_Details values ('"+ adminid+"'"+","+"'"+adminname+"'"+","+"'"+doj+"'"+","+"'"+tenure+"'"+")";
							 
						        Connection conn = null;
						        try
						        {
						            conn = DriverManager.getConnection(url);
						            
						            /*
						             * Starts : Check entry existed already or not
						             */
						            
		       String fetch_sql = "select  *  from Admin_Details where Admin_ID="+"'"+adminid+"'";
						            
		       PreparedStatement check_statement = conn.prepareStatement(fetch_sql);
		       
		       ResultSet rows_count = check_statement .executeQuery();
		       
		       int counter = 0;
		       while(rows_count.next())
		       {
		         counter++;
		       }
						             				         				            				        
						            if (counter > 0)
						            {
						            	
						            
						            JOptionPane.showMessageDialog(null, "Administrator  Already Exist !!!", "Prison Management System", 1);
							           				       		
					            }
					          
						            else
						            {
					   		        
						            /*
						             * Ends : Check entry existed already or not
						             */
						     
						        		   		        
						            String sql = "INSERT INTO Admin_Details (Admin_ID, Administrator_Name, Date_Of_Joining, Tenure) VALUES (?, ?, ?, ?)";
						            
						            PreparedStatement statement = conn.prepareStatement(sql);
						            statement.setString(1, adminid);
						            statement.setString(2, adminname);
						            statement.setString(3, doj);
						            statement.setInt(4, tenure);
						             
						            int rowsInserted = statement.executeUpdate();
						            if (rowsInserted > 0)
						            {
						            //    System.out.println("A new user was inserted successfully!");
						               
						                JOptionPane.showMessageDialog(null, "Administrator Added Successfully !!!", "Prison Management System", 1);
						           
							       						       		
						            }
						            else
						            {
						                JOptionPane.showMessageDialog(null, "Please try again, Technical Error !!!", "Prison Management System", 1);
								           
						            }
							       		
				//	ResultSet rs = pstmt.executeQuery();

					//  table.setModel(DbUtils.resultSetToTableModel(rs));

					/*

					For Modelling ResultSet into table we will 
					use rs2XML jar file, it's a class file
					which help in modelling result set into Table.

					*/

						        } 
						        }
						catch (SQLException sqliteex) {
						            System.out.println(sqliteex.getMessage());
						        }
						
						/*
						 * Code Ends : Create Database connection
						 */
							
							
						}
					});
					btnNewButton.setForeground(Color.GRAY);
					btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 20));
					btnNewButton.setBounds(516, 392, 152, 45);
					AAD_Core_Panel.add(btnNewButton);
					
			/*
			 * We will get 'result' variable value on "Add"
			 * Button Click
			 * 
			 */
	
					
					/*************************************************/
					
		 		
		 	}
		 });
		pad.add(aad);
		
		 mad = new JMenuItem("Modify  Administrator  Detail");
		 mad.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e)
     {
		 		
		 		
					/*
					 * On click event of menu item follow two way process
					 * 
					 * first we need to - set the visiblity of main Panel inside Frame
					 * Off.
					 * So that we can so the desire Pannel inside Frame.
					 * 
					 * Second we need to - "disabled" the clicked 'Menu' / 'MenuItems'.
					 * 
					 * 
					 * Third  we need to - Enabled the all 'Menu or MenuItems' other than
					 * the clicked one.
					 * 
					 * Let's check the below code
					 */
					
				/*	first we need to - set the visiblity of main Panel inside Frame
					  Off.
					  */
					
			 		/*
			 		 * 
			 		 * Important Note - when whever we move to new link by clicking on it
			 		 * we always use contentPane.setVisible(false)  to clear data
			 		 * 
			 		 * this command will all data except MenuItems.
			 		 * 
			 		 */
			 		
			 		contentPane.setVisible(false);
			 		
					
				/*	Second we need to - "disabled" the clicked 'Menu' / 'MenuItems'.
				 * 
				 */
					
					
					mad.setEnabled(false);
					
					/*Third  we need to - Enabled the all 'Menu or MenuItems' other than
					 * the clicked one.
					 */
					
					
					/*
					 * Below are the varialbles of MenuItem of
					 * Administrators Detail
					 */
				vad.setEnabled(true);
					sad.setEnabled(true);
			aad.setEnabled(true);
					// mad.setEnabled(true);
				//	 dad.setEnabled(true);
					
					
					/*
					 * Below are the varialbles of MenuItem of
					 * Prisoners Detail
					 */
					
					 vmd.setEnabled(true);
					smd.setEnabled(true);
					amd.setEnabled(true);
				 md.setEnabled(true);

					
					/*
					 * Below are the varialbles of MenuItem of
					 * Staffs Detail
					 */
					
					vsd.setEnabled(true);
					 ssd.setEnabled(true);
					  asd.setEnabled(true);
					 msd.setEnabled(true);
			//	dsd.setEnabled(true);

					
					
					/*
					 * Below are the varialbles of MenuItem of
					 * Staffs Detail
					 */
					
					 vwd.setEnabled(true);
					 swd.setEnabled(true);
					 anw.setEnabled(true);
				 mwd.setEnabled(true);
				//	  dwd.setEnabled(true);

					
					/*
					 * Below are the varialbles of Menu  of
					 * our application
					 */
					  mnHome.setEnabled(true);
					
					cu.setEnabled(true);
					
			
					/* ++++++++++++++++++++++++++++++++++++++++++++++
					 * 
					 * 
					 *  Code Starts : Now we are good to go to show the content
					 * related to the clicked link
					 * 
					 * 
					 ++++++++++++++++++++++++++++++++++++++++++++++++*/
			
					// This is our core Panel over which we will
					// perform all our design work
					
					MAD_Core_Panel = new JPanel();
					MAD_Core_Panel.setBounds(0, 0, 1183, 525);
					
					
					MAD_Core_Panel.setBorder(new EmptyBorder(5, 5, 5, 5));
					setContentPane(MAD_Core_Panel);
					
					
					// Now we will set "Absolute Layout"  so that 
					// we can place our elements on frame  as per 
					// the desire  X-Coordinates and Y- Coordinates
			
					
					
					MAD_Core_Panel.setLayout(null);
					
					
					/*************************************************/
					
					
					/********************************************************/
					
					JLabel lblNewLabel = new JLabel("Update Administrator  Detail");
					lblNewLabel.setForeground(Color.GRAY);
					lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 35));
					lblNewLabel.setBounds(392, 28, 455, 54);
					MAD_Core_Panel.add(lblNewLabel);
					
					JLabel lblNewLabel_1 = new JLabel("Choose Field :");
					lblNewLabel_1.setForeground(Color.GRAY);
					lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
					lblNewLabel_1.setBounds(323, 133, 120, 25);
					MAD_Core_Panel.add(lblNewLabel_1);
					
					
					
					JLabel lblNewLabel_7 = new JLabel("Enter Admin ID :");
					lblNewLabel_7.setForeground(Color.GRAY);
					lblNewLabel_7.setFont(new Font("Times New Roman", Font.BOLD, 20));
					lblNewLabel_7.setBounds(710, 123, 195, 25);
					MAD_Core_Panel.add(lblNewLabel_7);
					
					
					 DefaultListModel<String> dlm = new DefaultListModel<>();  
			         dlm.addElement("Admin ID");  
			         dlm.addElement("Administrator Name");  
			         dlm.addElement("Date Of Joining");  
			         dlm.addElement("Tenure");  
			         
			        
					
			JList<String>  list = new JList<>(dlm);
					list.setBounds(462, 178, 212, 140);
					MAD_Core_Panel.add(list);
					
					JTextField	textField_1 = new JTextField();   // For "Enter Admin ID"
					textField_1.setBounds(710, 169, 182, 34);
					MAD_Core_Panel.add(textField_1);
					textField_1.setColumns(10);
					
					JLabel lblEnterNewValue = new JLabel("Enter New Value :");
					lblEnterNewValue.setForeground(Color.GRAY);
					lblEnterNewValue.setFont(new Font("Times New Roman", Font.BOLD, 20));
					lblEnterNewValue.setBounds(710, 243, 195, 25);
					MAD_Core_Panel.add(lblEnterNewValue);
					
					JTextField textField_2 = new JTextField();  // For "Enter New Value"
					textField_2.setColumns(10);
					textField_2.setBounds(710, 294, 182, 34);
					MAD_Core_Panel.add(textField_2);
					
					JButton btnNewButton = new JButton("Update");
					btnNewButton.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e)
						{
							
						
						      
						       
				                 if (list.getSelectedIndex() != -1)   // to check whether item selected or not
				                 {    
				                	 
				                  if( list.getSelectedValue()== "Admin ID" )
				                  {
				                	  
				                	  
				                	  /*
										 * Code Starts : Create Database connection
										 */
										
										/*
										 * 
										 *  Important Note : 
										 *  
										 *  For Test Path Url Would be -
										 *  
										 *  	
										 *  
										 *  
										 *    For Executable Jar  Url Would be -
										 *  
										 *  	 String url = "jdbc:sqlite::resource:Prison_Management_System.db";
										 */
										
										String url = "jdbc:sqlite::resource:Prison_Management_System.db";
										// String sql = "insert into Admin_Details values ('"+ adminid+"'"+","+"'"+adminname+"'"+","+"'"+doj+"'"+","+"'"+tenure+"'"+")";
										 
									        Connection conn = null;
									        try
									        {
									            conn = DriverManager.getConnection(url);
									     
									            /*
									             * Starts : Check whether updated entry existed or not
									             */
									            
					       String fetch_sql = "select  *  from Admin_Details where Admin_ID="+"'"+textField_1.getText().toString().toUpperCase()+"'";
									            
					       PreparedStatement check_statement = conn.prepareStatement(fetch_sql);
					       
					       ResultSet rows_count = check_statement .executeQuery();
					       
					       int counter = 0;
					       while(rows_count.next())
					       {
					         counter++;
					       }
									             				         				            				        
									            if (counter < 1)
									            {
									            	
									            
									            JOptionPane.showMessageDialog(null, "Administrator  Doesn't  Exist !!!", "Prison Management System", 1);
										           				       		
								            }
								          
									            else
									            {
								   		        
									            /*
									             * Ends : Check entry existed already or not
									             */	   	
														           
									            String sql3 = "update Admin_Details  set Admin_ID="+"'"+ textField_2.getText().toString().toUpperCase() +"'"+"  where Admin_ID= "+"'"+textField_1.getText().toString().toUpperCase()+"'";
								            	
									           Statement statement3 = conn.createStatement();
								            	
								            try
								            {
									            statement3.execute(sql3);
									            
									           
									         
									               
									                JOptionPane.showMessageDialog(null, "Details Updated Successfully !!!", "Prison Management System", 1);
									           
								            }
								            
								            catch(Exception e2)
								            {
									        
									                JOptionPane.showMessageDialog(null, "Please try again, Technical Error !!!", "Prison Management System", 1);
											           
								            }
										       		
						
									            }
									        }
									        
									catch (SQLException sqliteex) {
									            System.out.println(sqliteex.getMessage());
									        }
									
									/*
									 * Code Ends : Create Database connection
									 */
										
				                	  
				                	  
				                	  
				                	  
				                  }
				                  
				                  else   if( list.getSelectedValue() == "Administrator Name" )
				                  {

				                	  /*
										 * Code Starts : Create Database connection
										 */
										
										/*
										 * 
										 *  Important Note : 
										 *  
										 *  For Test Path Url Would be -
										 *  
										 *  	
										 *  
										 *  
										 *    For Executable Jar  Url Would be -
										 *  
										 *  	 String url = "jdbc:sqlite::resource:Prison_Management_System.db";
										 */
										
										String url = "jdbc:sqlite::resource:Prison_Management_System.db";
										// String sql = "insert into Admin_Details values ('"+ adminid+"'"+","+"'"+adminname+"'"+","+"'"+doj+"'"+","+"'"+tenure+"'"+")";
										 
									        Connection conn = null;
									        try
									        {
									            conn = DriverManager.getConnection(url);
									     
									            /*
									             * Starts : Check whether updated entry existed or not
									             */
									            
					       String fetch_sql = "select  *  from Admin_Details where Admin_ID="+"'"+textField_1.getText().toString().toUpperCase()+"'";
									            
					       PreparedStatement check_statement = conn.prepareStatement(fetch_sql);
					       
					       ResultSet rows_count = check_statement .executeQuery();
					       
					       int counter = 0;
					       while(rows_count.next())
					       {
					         counter++;
					       }
									             				         				            				        
									            if (counter < 1)
									            {
									            	
									            
									            JOptionPane.showMessageDialog(null, "Administrator  Doesn't  Exist !!!", "Prison Management System", 1);
										           				       		
								            }
								          
									            else
									            {
								   		        
									            /*
									             * Ends : Check entry existed already or not
									             */	   	
														           
									            String sql3 = "update Admin_Details  set Administrator_Name="+"'"+ textField_2.getText().toString().toUpperCase() +"'"+"  where Admin_ID= "+"'"+textField_1.getText().toString().toUpperCase()+"'";
								            	
									           Statement statement3 = conn.createStatement();
								            	
								            try
								            {
									            statement3.execute(sql3);
									            
									           
									         
									               
									                JOptionPane.showMessageDialog(null, "Details Updated Successfully !!!", "Prison Management System", 1);
									           
								            }
								            
								            catch(Exception e2)
								            {
									        
									                JOptionPane.showMessageDialog(null, "Please try again, Technical Error !!!", "Prison Management System", 1);
											           
								            }
										       		
						
									            }
									        }
									        
									catch (SQLException sqliteex) {
									            System.out.println(sqliteex.getMessage());
									        }
									
									/*
									 * Code Ends : Create Database connection
									 */
										
				                	  
				                	  
				                  }
				                  
				                  else   if( list.getSelectedValue() == "Date Of Joining" )
				                  {
				                	  

				                	  /*
										 * Code Starts : Create Database connection
										 */
										
										/*
										 * 
										 *  Important Note : 
										 *  
										 *  For Test Path Url Would be -
										 *  
										 *  	
										 *  
										 *  
										 *    For Executable Jar  Url Would be -
										 *  
										 *  	 String url = "jdbc:sqlite::resource:Prison_Management_System.db";
										 */
										
										String url = "jdbc:sqlite::resource:Prison_Management_System.db";
										// String sql = "insert into Admin_Details values ('"+ adminid+"'"+","+"'"+adminname+"'"+","+"'"+doj+"'"+","+"'"+tenure+"'"+")";
										 
									        Connection conn = null;
									        try
									        {
									            conn = DriverManager.getConnection(url);
									     
									            /*
									             * Starts : Check whether updated entry existed or not
									             */
									            
					       String fetch_sql = "select  *  from Admin_Details where Admin_ID="+"'"+textField_1.getText().toString().toUpperCase()+"'";
									            
					       PreparedStatement check_statement = conn.prepareStatement(fetch_sql);
					       
					       ResultSet rows_count = check_statement .executeQuery();
					       
					       int counter = 0;
					       while(rows_count.next())
					       {
					         counter++;
					       }
									             				         				            				        
									            if (counter < 1)
									            {
									            	
									            
									            JOptionPane.showMessageDialog(null, "Administrator  Doesn't  Exist !!!", "Prison Management System", 1);
										           				       		
								            }
								          
									            else
									            {
								   		        
									            /*
									             * Ends : Check entry existed already or not
									             */	   	
														           
									            String sql3 = "update Admin_Details  set Date_Of_Joining="+"'"+ textField_2.getText().toString().toUpperCase() +"'"+"  where Admin_ID= "+"'"+textField_1.getText().toString().toUpperCase()+"'";
								            	
									           Statement statement3 = conn.createStatement();
								            	
								            try
								            {
									            statement3.execute(sql3);
									            
									           
									         
									               
									                JOptionPane.showMessageDialog(null, "Details Updated Successfully !!!", "Prison Management System", 1);
									           
								            }
								            
								            catch(Exception e2)
								            {
									        
									                JOptionPane.showMessageDialog(null, "Please try again, Technical Error !!!", "Prison Management System", 1);
											           
								            }
										       		
						
									            }
									        }
									        
									catch (SQLException sqliteex) {
									            System.out.println(sqliteex.getMessage());
									        }
									
									/*
									 * Code Ends : Create Database connection
									 */
										
				                	  
				                	  
				                	  
				                  }
				                  
				                  else   if( list.getSelectedValue() == "Tenure" )
				                  {
				                	  

				                	  /*
										 * Code Starts : Create Database connection
										 */
										
										/*
										 * 
										 *  Important Note : 
										 *  
										 *  For Test Path Url Would be -
										 *  
										 *  	
										 *  
										 *  
										 *    For Executable Jar  Url Would be -
										 *  
										 *  	 String url = "jdbc:sqlite::resource:Prison_Management_System.db";
										 */
										
										String url = "jdbc:sqlite::resource:Prison_Management_System.db";
										// String sql = "insert into Admin_Details values ('"+ adminid+"'"+","+"'"+adminname+"'"+","+"'"+doj+"'"+","+"'"+tenure+"'"+")";
										 
									        Connection conn = null;
									        try
									        {
									            conn = DriverManager.getConnection(url);
									     
									            /*
									             * Starts : Check whether updated entry existed or not
									             */
									            
					       String fetch_sql = "select  *  from Admin_Details where Admin_ID="+"'"+textField_1.getText().toString().toUpperCase()+"'";
									            
					       PreparedStatement check_statement = conn.prepareStatement(fetch_sql);
					       
					       ResultSet rows_count = check_statement .executeQuery();
					       
					       int counter = 0;
					       while(rows_count.next())
					       {
					         counter++;
					       }
									             				         				            				        
									            if (counter < 1)
									            {
									            	
									            
									            JOptionPane.showMessageDialog(null, "Administrator  Doesn't  Exist !!!", "Prison Management System", 1);
										           				       		
								            }
								          
									            else
									            {
								   		        
									            /*
									             * Ends : Check entry existed already or not
									             */	   	
														           
									            String sql3 = "update Admin_Details  set Tenure="+"'"+ textField_2.getText().toString().toUpperCase() +"'"+"  where Admin_ID= "+"'"+textField_1.getText().toString().toUpperCase()+"'";
								            	
									           Statement statement3 = conn.createStatement();
								            	
								            try
								            {
									            statement3.execute(sql3);
									            
									           
									         
									               
									                JOptionPane.showMessageDialog(null, "Details Updated Successfully !!!", "Prison Management System", 1);
									           
								            }
								            
								            catch(Exception e2)
								            {
									        
									                JOptionPane.showMessageDialog(null, "Please try again, Technical Error !!!", "Prison Management System", 1);
											           
								            }
										       		
						
									            }
									        }
									        
									catch (SQLException sqliteex) {
									            System.out.println(sqliteex.getMessage());
									        }
									
									/*
									 * Code Ends : Create Database connection
									 */
										
				                	  
				                	  
				                	  
				                	  
				                  }
				                    
				                    
				                 }  //  Main 'If' ends // to check whther field need to modify selected or not
							
							
						}
					});
					btnNewButton.setForeground(Color.GRAY);
					btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 20));
					btnNewButton.setBounds(497, 387, 152, 33);
					MAD_Core_Panel.add(btnNewButton);
					
					/*************************************************/
					
					
					
					
		 	}
		 });
		pad.add(mad);
		
		// dad = new JMenuItem("Delete Administrator Detail");
	//	pad.add(dad);
	
		
		JMenu upd = new JMenu("Prisoners  Detail");
		upd.setForeground(Color.GRAY);
		upd.setFont(new Font("Segoe UI", Font.BOLD, 15));
		menuBar.add(upd);
		
	
		
		
		 vmd = new JMenuItem("View All Prisoners Detail");
		 vmd.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent arg0) 
		 	{
		 		
	
		 		
				/*
				 * On click event of menu item follow two way process
				 * 
				 * first we need to - set the visiblity of main Panel inside Frame
				 * Off.
				 * So that we can so the desire Pannel inside Frame.
				 * 
				 * Second we need to - "disabled" the clicked 'Menu' / 'MenuItems'.
				 * 
				 * 
				 * Third  we need to - Enabled the all 'Menu or MenuItems' other than
				 * the clicked one.
				 * 
				 * Let's check the below code
				 */
				
			/*	first we need to - set the visiblity of main Panel inside Frame
				  Off.
				  */
				
		 		/*
		 		 * 
		 		 * Important Note - when whever we move to new link by clicking on it
		 		 * we always use contentPane.setVisible(false)  to clear data
		 		 * 
		 		 * this command will all data except MenuItems.
		 		 * 
		 		 */
		 		
		 		contentPane.setVisible(false);
		 		
				
			/*	Second we need to - "disabled" the clicked 'Menu' / 'MenuItems'.
			 * 
			 */
				
				
				vmd.setEnabled(false);
				
				/*Third  we need to - Enabled the all 'Menu or MenuItems' other than
				 * the clicked one.
				 */
				
				
				/*
				 * Below are the varialbles of MenuItem of
				 * Administrators Detail
				 */
				
			vad.setEnabled(true);
				 sad.setEnabled(true);
			 aad.setEnabled(true);
				 mad.setEnabled(true);
			//	 dad.setEnabled(true);
				
				
				/*
				 * Below are the varialbles of MenuItem of
				 * Prisoners Detail
				 */
				
				 //vmd.setEnabled(true);
				smd.setEnabled(true);
				amd.setEnabled(true);
			 md.setEnabled(true);

				
				/*
				 * Below are the varialbles of MenuItem of
				 * Staffs Detail
				 */
				
				vsd.setEnabled(true);
				 ssd.setEnabled(true);
				  asd.setEnabled(true);
				 msd.setEnabled(true);
			//	dsd.setEnabled(true);

				
				
				/*
				 * Below are the varialbles of MenuItem of
				 * Staffs Detail
				 */
				
				 vwd.setEnabled(true);
				 swd.setEnabled(true);
				 anw.setEnabled(true);
			 mwd.setEnabled(true);
			//	  dwd.setEnabled(true);

				
				/*
				 * Below are the varialbles of Menu  of
				 * our application
				 */
				  mnHome.setEnabled(true);
				
				cu.setEnabled(true);
		

				/* ++++++++++++++++++++++++++++++++++++++++++++++
				 * 
				 * 
				 *  Code Starts : Now we are good to go to show the content
				 * related to the clicked link
				 * 
				 * 
				 ++++++++++++++++++++++++++++++++++++++++++++++++*/
		
				// This is our core Panel over which we will
				// perform all our design work
				
				VMD_Core_Panel = new JPanel();
				VMD_Core_Panel.setBounds(0, 0, 1183, 525);
				
				
				VMD_Core_Panel.setBorder(new EmptyBorder(5, 5, 5, 5));
				setContentPane(VMD_Core_Panel);
				
				
				// Now we will set "Absolute Layout"  so that 
				// we can place our elements on frame  as per 
				// the desire  X-Coordinates and Y- Coordinates
		
				
				
				VMD_Core_Panel.setLayout(null);
				
				/* ++++++++++++++++++++++++++++++++++++++++++++++
				 * 
				 * 
				 *  Code Starts : Now we are good to go to show the content
				 * related to the clicked link
				 * 
				 * 
				 ++++++++++++++++++++++++++++++++++++++++++++++++*/
				
				/************Table code*********************/
				
				
				/*************************************************/
				
				JPanel panel = new JPanel();
				panel.setBounds(0, 0, 1183, 525);
				VMD_Core_Panel.add(panel);
				panel.setLayout(null);
				
				JLabel lblNewLabel = new JLabel("View Prisoners Detail");
				lblNewLabel.setForeground(Color.GRAY);
				lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 35));
				lblNewLabel.setBounds(327, 21, 433, 77);
				panel.add(lblNewLabel);
				
				JScrollPane scrollPane = new JScrollPane();
				scrollPane.setBounds(10, 97, 1163, 400);
				panel.add(scrollPane);
				
				JTable table = new JTable();
				scrollPane.setViewportView(table);
				
				

				
				/*
				 * Code Starts : Create Database connection
				 */
				
				/*
				 * 
				 *  Important Note : 
				 *  
				 *  For Test Path Url Would be -
				 *  
				 *  	 
				 *  
				 *  
				 *    For Executable Jar  Url Would be -
				 *  
				 *  	 String url = "jdbc:sqlite::resource:Prison_Management_System.db";
				 */
				
				String url = "jdbc:sqlite::resource:Prison_Management_System.db";
				 String sql = "select * from  Prisoners_Detail";
				 
			        Connection conn = null;
			        try {
			            conn = DriverManager.getConnection(url);
			     
			        		   		        
			                PreparedStatement pstmt = conn.prepareStatement(sql);
			         
			          //  pstmt.executeUpdate();

		ResultSet rs = pstmt.executeQuery();

		  table.setModel(DbUtils.resultSetToTableModel(rs));

		/*

		For Modelling ResultSet into table we will 
		use rs2XML jar file, it's a class file
		which help in modelling result set into Table.

		*/

			        } 
			catch (SQLException sqliteex) {
			            System.out.println(sqliteex.getMessage());
			        }
			
			/*
			 * Code Ends : Create Database connection
			 */

			
		 		
		 		
		 		
		 	}
		 });
		upd.add(vmd);
		
		 smd = new JMenuItem("Search  Prisoner Detail");
		 smd.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) 
		 	{
		 		
				/*
				 * On click event of menu item follow two way process
				 * 
				 * first we need to - set the visiblity of main Panel inside Frame
				 * Off.
				 * So that we can so the desire Pannel inside Frame.
				 * 
				 * Second we need to - "disabled" the clicked 'Menu' / 'MenuItems'.
				 * 
				 * 
				 * Third  we need to - Enabled the all 'Menu or MenuItems' other than
				 * the clicked one.
				 * 
				 * Let's check the below code
				 */
				
			/*	first we need to - set the visiblity of main Panel inside Frame
				  Off.
				  */
				
		 		/*
		 		 * 
		 		 * Important Note - when whever we move to new link by clicking on it
		 		 * we always use contentPane.setVisible(false)  to clear data
		 		 * 
		 		 * this command will all data except MenuItems.
		 		 * 
		 		 */
		 		
		 		contentPane.setVisible(false);
		 		
				
			/*	Second we need to - "disabled" the clicked 'Menu' / 'MenuItems'.
			 * 
			 */
				
				
				smd.setEnabled(false);
				
				/*Third  we need to - Enabled the all 'Menu or MenuItems' other than
				 * the clicked one.
				 */
				
				
				/*
				 * Below are the varialbles of MenuItem of
				 * Administrators Detail
				 */
			vad.setEnabled(true);
				 sad.setEnabled(true);
			 aad.setEnabled(true);
				 mad.setEnabled(true);
		//		 dad.setEnabled(true);
				
				
				/*
				 * Below are the varialbles of MenuItem of
				 * Prisoners Detail
				 */
				
				 vmd.setEnabled(true);
				//smd.setEnabled(true);
				amd.setEnabled(true);
			 md.setEnabled(true);

				
				/*
				 * Below are the varialbles of MenuItem of
				 * Staffs Detail
				 */
				
				vsd.setEnabled(true);
				 ssd.setEnabled(true);
				  asd.setEnabled(true);
				 msd.setEnabled(true);
			//	dsd.setEnabled(true);

				
				
				/*
				 * Below are the varialbles of MenuItem of
				 * Staffs Detail
				 */
				
				 vwd.setEnabled(true);
				 swd.setEnabled(true);
				 anw.setEnabled(true);
			 mwd.setEnabled(true);
			//	  dwd.setEnabled(true);

				
				/*
				 * Below are the varialbles of Menu  of
				 * our application
				 */
				  mnHome.setEnabled(true);
				
				cu.setEnabled(true);
				
		
				/* ++++++++++++++++++++++++++++++++++++++++++++++
				 * 
				 * 
				 *  Code Starts : Now we are good to go to show the content
				 * related to the clicked link
				 * 
				 * 
				 ++++++++++++++++++++++++++++++++++++++++++++++++*/
		
				// This is our core Panel over which we will
				// perform all our design work
				
				SMD_Core_Panel = new JPanel();
				SMD_Core_Panel.setBounds(0, 0, 1183, 525);
				
				
				SMD_Core_Panel.setBorder(new EmptyBorder(5, 5, 5, 5));
				setContentPane(SMD_Core_Panel);
				
				
				// Now we will set "Absolute Layout"  so that 
				// we can place our elements on frame  as per 
				// the desire  X-Coordinates and Y- Coordinates
		
				
				
				SMD_Core_Panel.setLayout(null);
				
				
		 		
	/*************************************************/
				
				JPanel panel = new JPanel();
				panel.setBounds(0, 0, 1183, 525);
				SMD_Core_Panel.add(panel);
				panel.setLayout(null);
				
				JLabel lblNewLabel = new JLabel("Search Prisoner Detail");
				lblNewLabel.setForeground(Color.GRAY);
				lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 35));
				lblNewLabel.setBounds(327, 21, 433, 77);
				panel.add(lblNewLabel);
				
				JScrollPane scrollPane = new JScrollPane();
				scrollPane.setBounds(10, 231, 1163, 217);
				panel.add(scrollPane);
				
				JTable table = new JTable();
				scrollPane.setViewportView(table);
				
				JLabel lblNewLabel_1 = new JLabel("Enter Administrator ID :");
				lblNewLabel_1.setForeground(Color.GRAY);
				lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 22));
				lblNewLabel_1.setBounds(228, 145, 256, 47);
				panel.add(lblNewLabel_1);
				
		
				
				JTextField textField = new JTextField();
				textField.setBounds(482, 154, 168, 37);
				panel.add(textField);
				textField.setColumns(10);
				
				JButton btnNewButton = new JButton("Search");
				btnNewButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0)
					{
						
						/*
						 * 
						 * Get text  from input field
						 * 
						 */
						String str = textField.getText().toString().toUpperCase();
						
						/*
						 * Code Starts : Create Database connection
						 */
						
						/*
						 * 
						 *  Important Note : 
						 *  
						 *  For Test Path Url Would be -
						 *  
						 *  	
						 *  
						 *  
						 *    For Executable Jar  Url Would be -
						 *  
						 *  	 String url = "jdbc:sqlite::resource:Prison_Management_System.db";
						 */
						
						String url = "jdbc:sqlite::resource:Prison_Management_System.db";
						 String sql = "select  *  from  Prisoners_Detail where  Prisoner_ID="+"'"+str+"'";
						 
					        Connection conn = null;
					        try {
					            conn = DriverManager.getConnection(url);
					     
					        		   		        
					                PreparedStatement pstmt = conn.prepareStatement(sql);
					         
					          //  pstmt.executeUpdate();

				ResultSet rs = pstmt.executeQuery();

				  table.setModel(DbUtils.resultSetToTableModel(rs));

				/*

				For Modelling ResultSet into table we will 
				use rs2XML jar file, it's a class file
				which help in modelling result set into Table.

				*/

					        } 
					catch (SQLException sqliteex) {
					            System.out.println(sqliteex.getMessage());
					        }
					
					/*
					 * Code Ends : Create Database connection
					 */

					
						
					}
				});
				btnNewButton.setForeground(Color.GRAY);
				btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 20));
				btnNewButton.setBounds(688, 153, 102, 33);
				panel.add(btnNewButton);
				
		 		
		 		
		 		
		 	}
		 });
		upd.add(smd);
		
		
		 amd = new JMenuItem("Add Prisoner Detail");
		 amd.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent arg0) 
		 	{
		 		

				/*
				 * On click event of menu item follow two way process
				 * 
				 * first we need to - set the visiblity of main Panel inside Frame
				 * Off.
				 * So that we can so the desire Pannel inside Frame.
				 * 
				 * Second we need to - "disabled" the clicked 'Menu' / 'MenuItems'.
				 * 
				 * 
				 * Third  we need to - Enabled the all 'Menu or MenuItems' other than
				 * the clicked one.
				 * 
				 * Let's check the below code
				 */
				
			/*	first we need to - set the visiblity of main Panel inside Frame
				  Off.
				  */
				
		 		/*
		 		 * 
		 		 * Important Note - when whever we move to new link by clicking on it
		 		 * we always use contentPane.setVisible(false)  to clear data
		 		 * 
		 		 * this command will all data except MenuItems.
		 		 * 
		 		 */
		 		
		 		contentPane.setVisible(false);
		 		
				
			/*	Second we need to - "disabled" the clicked 'Menu' / 'MenuItems'.
			 * 
			 */
				
				
				amd.setEnabled(false);
				
				/*Third  we need to - Enabled the all 'Menu or MenuItems' other than
				 * the clicked one.
				 */
				
				
				/*
				 * Below are the varialbles of MenuItem of
				 * Administrators Detail
				 */
			vad.setEnabled(true);
				sad.setEnabled(true);
		aad.setEnabled(true);
				 mad.setEnabled(true);
			//	 dad.setEnabled(true);
				
				
				/*
				 * Below are the varialbles of MenuItem of
				 * Prisoners Detail
				 */
				
				 vmd.setEnabled(true);
			smd.setEnabled(true);
				//amd.setEnabled(true);
			 md.setEnabled(true);

				
				/*
				 * Below are the varialbles of MenuItem of
				 * Staffs Detail
				 */
				
				vsd.setEnabled(true);
				 ssd.setEnabled(true);
				  asd.setEnabled(true);
				 msd.setEnabled(true);
		//	dsd.setEnabled(true);

				
				
				/*
				 * Below are the varialbles of MenuItem of
				 * Staffs Detail
				 */
				
				 vwd.setEnabled(true);
				 swd.setEnabled(true);
				 anw.setEnabled(true);
			 mwd.setEnabled(true);
			//	  dwd.setEnabled(true);

				
				/*
				 * Below are the varialbles of Menu  of
				 * our application
				 */
				  mnHome.setEnabled(true);
				
				cu.setEnabled(true);
				
		
				/* ++++++++++++++++++++++++++++++++++++++++++++++
				 * 
				 * 
				 *  Code Starts : Now we are good to go to show the content
				 * related to the clicked link
				 * 
				 * 
				 ++++++++++++++++++++++++++++++++++++++++++++++++*/
		
				// This is our core Panel over which we will
				// perform all our design work
				
				APD_Core_Panel = new JPanel();
				APD_Core_Panel.setBounds(0, 0, 1183, 525);
				
				
				APD_Core_Panel.setBorder(new EmptyBorder(5, 5, 5, 5));
				setContentPane(APD_Core_Panel);
				
				
				// Now we will set "Absolute Layout"  so that 
				// we can place our elements on frame  as per 
				// the desire  X-Coordinates and Y- Coordinates
		
				
				
				APD_Core_Panel.setLayout(null);
				
				
				/*************************************************/
				
				/********************************************************/
				
				JLabel lblNewLabel = new JLabel("Add Prisoner Detail");
				lblNewLabel.setForeground(Color.GRAY);
				lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 35));
				lblNewLabel.setBounds(426, 28, 309, 54);
				APD_Core_Panel.add(lblNewLabel);
				
				JLabel lblNewLabel_1 = new JLabel("Prisoner ID :");
				lblNewLabel_1.setForeground(Color.GRAY);
				lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
				lblNewLabel_1.setBounds(164, 116, 120, 25);
				APD_Core_Panel.add(lblNewLabel_1);
				
				JLabel lblNewLabel_2 = new JLabel("Age :");
				lblNewLabel_2.setForeground(Color.GRAY);
				lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 20));
				lblNewLabel_2.setBounds(214, 276, 86, 33);
				APD_Core_Panel.add(lblNewLabel_2);
				
				JLabel lblNewLabel_3 = new JLabel("Prisoner  Name :");
				lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 20));
				lblNewLabel_3.setForeground(Color.GRAY);
				lblNewLabel_3.setBounds(590, 109, 195, 39);
				APD_Core_Panel.add(lblNewLabel_3);
				
				JLabel lblNewLabel_4 = new JLabel("Type Of Crime :");
				lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 20));
				lblNewLabel_4.setForeground(Color.GRAY);
				lblNewLabel_4.setBounds(596, 271, 173, 43);
				APD_Core_Panel.add(lblNewLabel_4);
				
				JTextField textField_1 = new JTextField();
				textField_1.setBounds(326, 113, 174, 36);
				APD_Core_Panel.add(textField_1);
				textField_1.setColumns(10);
				
				JTextField txtEx = new JTextField();
				txtEx.setForeground(Color.LIGHT_GRAY);
				txtEx.setHorizontalAlignment(SwingConstants.LEFT);
				txtEx.setBounds(326, 277, 174, 36);
				APD_Core_Panel.add(txtEx);
				txtEx.setColumns(10);
				
				JTextField textField_3 = new JTextField();
				textField_3.setBounds(795, 113, 181, 36);
				APD_Core_Panel.add(textField_3);
				textField_3.setColumns(10);
				
				JTextField textField_4 = new JTextField();
				textField_4.setBounds(795, 276, 181, 36);
				APD_Core_Panel.add(textField_4);
				textField_4.setColumns(10);
				
				JLabel lblNewLabel_6 = new JLabel("Ward Alloted :");
				lblNewLabel_6.setFont(new Font("Times New Roman", Font.BOLD, 20));
				lblNewLabel_6.setForeground(Color.GRAY);
				lblNewLabel_6.setBounds(132, 367, 152, 26);
				APD_Core_Panel.add(lblNewLabel_6);
				
				JTextField textField_2 = new JTextField();
				textField_2.setBounds(326, 362, 167, 37);
				APD_Core_Panel.add(textField_2);
				textField_2.setColumns(10);
				
				JLabel lblNewLabel_7 = new JLabel("Date Of Prisonment :");
				lblNewLabel_7.setForeground(Color.GRAY);
				lblNewLabel_7.setFont(new Font("Times New Roman", Font.BOLD, 20));
				lblNewLabel_7.setBounds(89, 193, 195, 25);
				APD_Core_Panel.add(lblNewLabel_7);
				
				JTextField textField_5 = new JTextField();
				textField_5.setBounds(326, 189, 174, 33);
				APD_Core_Panel.add(textField_5);
				textField_5.setColumns(10);
				
				JLabel lblNewLabel_8 = new JLabel("Date Of Birth  :");
				lblNewLabel_8.setForeground(Color.GRAY);
				lblNewLabel_8.setFont(new Font("Times New Roman", Font.BOLD, 20));
				lblNewLabel_8.setBounds(596, 189, 173, 33);
				APD_Core_Panel.add(lblNewLabel_8);
				
				JTextField textField_6 = new JTextField();
				textField_6.setBounds(795, 189, 181, 33);
				APD_Core_Panel.add(textField_6);
				textField_6.setColumns(10);
				
				JLabel lblNewLabel_9 = new JLabel("Remark :");
				lblNewLabel_9.setFont(new Font("Times New Roman", Font.BOLD, 20));
				lblNewLabel_9.setForeground(Color.GRAY);
				lblNewLabel_9.setBounds(655, 362, 92, 33);
				APD_Core_Panel.add(lblNewLabel_9);
				
				JTextField textField_7 = new JTextField();
				textField_7.setBounds(795, 355, 167, 33);
				APD_Core_Panel.add(textField_7);
				textField_7.setColumns(10);
				
				JButton btnNewButton = new JButton("Add");
				btnNewButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) 
					{
						
						
						/*
						 * 
						 * Get text  from input field
						 * 
						 */
						String  pid = textField_1.getText().toString().toUpperCase();
						
						String pname = textField_3.getText().toString();
						
						String dop = textField_5.getText().toString().toUpperCase();
						
						String  dob = textField_6.getText().toString();
						
	                  int  age = Integer.parseInt(txtEx.getText().toString());
						
						String  toc = textField_4.getText().toString();
						
						String wa= textField_2.getText().toString().toUpperCase();
						
						String rem = textField_7.getText().toString();
						
						/*
						 * Code Starts : Create Database connection
						 */
						
						/*
						 * 
						 *  Important Note : 
						 *  
						 *  For Test Path Url Would be -
						 *  
						 *  	
						 *  
						 *  
						 *    For Executable Jar  Url Would be -
						 *  
						 *  	 String url = "jdbc:sqlite::resource:Prison_Management_System.db";
						 */
						
						String url = "jdbc:sqlite::resource:Prison_Management_System.db";
						// String sql = "insert into Admin_Details values ('"+ adminid+"'"+","+"'"+adminname+"'"+","+"'"+doj+"'"+","+"'"+tenure+"'"+")";
						 
					        Connection conn = null;
					        try
					        {
					            conn = DriverManager.getConnection(url);
					     
					        		   	
					            /*
					             * Starts : Check entry existed already or not
					             */
					            
	       String fetch_sql = "select  *  from Prisoners_Detail where Prisoner_ID="+"'"+pid+"'";
					            
	       PreparedStatement check_statement = conn.prepareStatement(fetch_sql);
	       
	       ResultSet rows_count = check_statement .executeQuery();
	       
	       int counter = 0;
	       while(rows_count.next())
	       {
	         counter++;
	       }
					             				         				            				        
					            if (counter > 0)
					            {
					            	
					            
					            JOptionPane.showMessageDialog(null, "Prisoner  Already Exist !!!", "Prison Management System", 1);
						           				       		
				            }
				          
					            else
					            {
				   		        
					            /*
					             * Ends : Check entry existed already or not
					             */
					     
					            
					            
					            String sql = "INSERT INTO Prisoners_Detail (Prisoner_ID, Prisoner_Name, Date_Of_Prisonment, Date_Of_Birth,Age,Type_Of_Crime,Ward_Alloted,Remark) VALUES (?, ?, ?, ?,?, ?, ?, ?)";
					            
					            PreparedStatement statement = conn.prepareStatement(sql);
					            statement.setString(1, pid);
					            statement.setString(2, pname);
					            statement.setString(3, dop);
					            statement.setString(4, dob);
					            
					            statement.setInt(5, age);
					            statement.setString(6, toc);
					            statement.setString(7, wa);
					            statement.setString(8, rem);
					             
					            int rowsInserted = statement.executeUpdate();
					            if (rowsInserted > 0)
					            {
					            //    System.out.println("A new user was inserted successfully!");
					            
					            	
					            	/*
					            	 * Code Starts : Update Ward Table  if query get successfule
					            	 */
					            	
					            	//String url = "jdbc:sqlite::resource:Prison_Management_System.db";
									
								       Connection conn2 = null;
					            try
					            {
					            	 conn2 = DriverManager.getConnection(url);
								     
					            	
					            	String sql1 = "select Per_Cell_Prisoners from Wards_Detail where Ward_Code="+"'"+wa+"'";
					            	
					            	 PreparedStatement statement2 = conn2.prepareStatement(sql1);
						            
				            	ResultSet rs2 = statement2.executeQuery();
				            	
				            	
				            	int current_prisoners_perCell = rs2.getInt("Per_Cell_Prisoners");
				            	
				            	int new_value_prisoners_perCell = current_prisoners_perCell +  1;
				            	
				            	
				            	// Get total number of cells in a Ward
				            	
				            	String sql4 = "select Number_Of_Cells from Wards_Detail where Ward_Code="+"'"+wa+"'";
				            	
				            	 PreparedStatement statement4 = conn2.prepareStatement(sql4);
					            
			            	ResultSet rs4 = statement4.executeQuery();
			            	
			            	
			            	int current_value_number_Cell = rs4.getInt("Number_Of_Cells");
				            	
				            	/*
				            	 * 
				            	 * Now we will update new value in Ward Table and Total number of prisoners also
				            	 */
				            	
				            	String sql3 = "update Wards_Detail  set Per_Cell_Prisoners="+"'"+new_value_prisoners_perCell +"'"+"  where Ward_Code= "+"'"+wa+"'";
				            	
				            	String sql6 = "update Wards_Detail  set Total_Prisoners="+"'"+new_value_prisoners_perCell*current_value_number_Cell +"'"+"  where Ward_Code= "+"'"+wa+"'";
				            	
				            	 PreparedStatement statement3 = conn2.prepareStatement(sql3);
				            	 
				            	 PreparedStatement statement6 = conn2.prepareStatement(sql6);
				            	 
				            	 statement3.executeUpdate();
				            	 
				            	 statement6.executeUpdate();
				            	
				            //	System.out.println("Per Cell : "+current_prisoners_perCell);
				            	
					            }
					            catch(Exception ee)
					            {
					            	System.out.println(ee);	
					            }
					            	/*
					            	 * Code Ends : Update Ward Table  if query get successfule
					            	 */
					               
					                JOptionPane.showMessageDialog(null, "Prisoner Added Successfully !!!", "Prison Management System", 1);
					           
						       						       		
					            }
					            else
					            {
					                JOptionPane.showMessageDialog(null, "Please try again, Technical Error !!!", "Prison Management System", 1);
							           
					            }
						       		
			//	ResultSet rs = pstmt.executeQuery();

				//  table.setModel(DbUtils.resultSetToTableModel(rs));

				/*

				For Modelling ResultSet into table we will 
				use rs2XML jar file, it's a class file
				which help in modelling result set into Table.

				*/
					            }
					        } 
					catch (SQLException sqliteex) {
					            System.out.println(sqliteex.getMessage());
					        }
					
					/*
					 * Code Ends : Create Database connection
					 */
						
						
						
						
					}
				});
				btnNewButton.setForeground(Color.GRAY);
				btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 20));
				btnNewButton.setBounds(518, 435, 152, 33);
				APD_Core_Panel.add(btnNewButton);
				
			
				
				/*************************************************/
				
			
		 		
		 	}
		 });
		upd.add(amd);
		
		md = new JMenuItem("Modify Prisoner Detail");
		md.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				
				
		 		
					/*
					 * On click event of menu item follow two way process
					 * 
					 * first we need to - set the visiblity of main Panel inside Frame
					 * Off.
					 * So that we can so the desire Pannel inside Frame.
					 * 
					 * Second we need to - "disabled" the clicked 'Menu' / 'MenuItems'.
					 * 
					 * 
					 * Third  we need to - Enabled the all 'Menu or MenuItems' other than
					 * the clicked one.
					 * 
					 * Let's check the below code
					 */
					
				/*	first we need to - set the visiblity of main Panel inside Frame
					  Off.
					  */
					
			 		/*
			 		 * 
			 		 * Important Note - when whever we move to new link by clicking on it
			 		 * we always use contentPane.setVisible(false)  to clear data
			 		 * 
			 		 * this command will all data except MenuItems.
			 		 * 
			 		 */
			 		
			 		contentPane.setVisible(false);
			 		
					
				/*	Second we need to - "disabled" the clicked 'Menu' / 'MenuItems'.
				 * 
				 */
					
					
					md.setEnabled(false);
					
					/*Third  we need to - Enabled the all 'Menu or MenuItems' other than
					 * the clicked one.
					 */
					
					
					/*
					 * Below are the varialbles of MenuItem of
					 * Administrators Detail
					 */
				vad.setEnabled(true);
					sad.setEnabled(true);
			aad.setEnabled(true);
					 mad.setEnabled(true);
				//	 dad.setEnabled(true);
					
					
					/*
					 * Below are the varialbles of MenuItem of
					 * Prisoners Detail
					 */
					
					 vmd.setEnabled(true);
					smd.setEnabled(true);
					amd.setEnabled(true);
			//	 md.setEnabled(true);

					
					/*
					 * Below are the varialbles of MenuItem of
					 * Staffs Detail
					 */
					
					vsd.setEnabled(true);
					 ssd.setEnabled(true);
					  asd.setEnabled(true);
					 msd.setEnabled(true);
			//	dsd.setEnabled(true);

					
					
					/*
					 * Below are the varialbles of MenuItem of
					 * Staffs Detail
					 */
					
					 vwd.setEnabled(true);
					 swd.setEnabled(true);
					 anw.setEnabled(true);
				 mwd.setEnabled(true);
				//	  dwd.setEnabled(true);

					
					/*
					 * Below are the varialbles of Menu  of
					 * our application
					 */
					  mnHome.setEnabled(true);
					
					cu.setEnabled(true);
					
			
					/* ++++++++++++++++++++++++++++++++++++++++++++++
					 * 
					 * 
					 *  Code Starts : Now we are good to go to show the content
					 * related to the clicked link
					 * 
					 * 
					 ++++++++++++++++++++++++++++++++++++++++++++++++*/
			
					// This is our core Panel over which we will
					// perform all our design work
					
					MPD_Core_Panel = new JPanel();
					MPD_Core_Panel.setBounds(0, 0, 1183, 525);
					
					
					MPD_Core_Panel.setBorder(new EmptyBorder(5, 5, 5, 5));
					setContentPane(MPD_Core_Panel);
					
					
					// Now we will set "Absolute Layout"  so that 
					// we can place our elements on frame  as per 
					// the desire  X-Coordinates and Y- Coordinates
			
					
					
					MPD_Core_Panel.setLayout(null);
					
					
					/*************************************************/
					
					
					/********************************************************/
					
					JLabel lblNewLabel = new JLabel("Update Prisoner  Detail");
					lblNewLabel.setForeground(Color.GRAY);
					lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 35));
					lblNewLabel.setBounds(392, 28, 455, 54);
					MPD_Core_Panel.add(lblNewLabel);
					
					JLabel lblNewLabel_1 = new JLabel("Choose Field :");
					lblNewLabel_1.setForeground(Color.GRAY);
					lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
					lblNewLabel_1.setBounds(323, 133, 120, 25);
					MPD_Core_Panel.add(lblNewLabel_1);
					
					
					
					JLabel lblNewLabel_7 = new JLabel("Enter Prisoner ID :");
					lblNewLabel_7.setForeground(Color.GRAY);
					lblNewLabel_7.setFont(new Font("Times New Roman", Font.BOLD, 20));
					lblNewLabel_7.setBounds(710, 123, 195, 25);
					MPD_Core_Panel.add(lblNewLabel_7);
					
					
					 DefaultListModel<String> dlm = new DefaultListModel<>();  
			         dlm.addElement("Prisoner ID");  
			         dlm.addElement("Prisoner Name");  
			         dlm.addElement("Date Of Prisonment");  
			         dlm.addElement("Date Of Birth");  
			         
			         dlm.addElement("Age");  
			         dlm.addElement("Type Of Crime");  
			         dlm.addElement("Ward Alloted");  
			         dlm.addElement("Remark"); 
					
			JList<String>  list = new JList<>(dlm);
					list.setBounds(462, 178, 212, 160);
					MPD_Core_Panel.add(list);
					
					JTextField	textField_1 = new JTextField();   // For "Enter Admin ID"
					textField_1.setBounds(710, 169, 182, 34);
					MPD_Core_Panel.add(textField_1);
					textField_1.setColumns(10);
					
					JLabel lblEnterNewValue = new JLabel("Enter New Value :");
					lblEnterNewValue.setForeground(Color.GRAY);
					lblEnterNewValue.setFont(new Font("Times New Roman", Font.BOLD, 20));
					lblEnterNewValue.setBounds(710, 243, 195, 25);
					MPD_Core_Panel.add(lblEnterNewValue);
					
					JTextField textField_2 = new JTextField();  // For "Enter New Value"
					textField_2.setColumns(10);
					textField_2.setBounds(710, 294, 182, 34);
					MPD_Core_Panel.add(textField_2);
					
					JButton btnNewButton = new JButton("Update");
					btnNewButton.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e)
						{
							
						
						      
						       
				                 if (list.getSelectedIndex() != -1)   // to check whether item selected or not
				                 {    
				                	 
				                	 
				                	    if( list.getSelectedValue()== "Prisoner ID" )
						                  {
						                	  
						                	  
						                	  /*
												 * Code Starts : Create Database connection
												 */
												
												/*
												 * 
												 *  Important Note : 
												 *  
												 *  For Test Path Url Would be -
												 *  
												 *  	
												 *  
												 *  
												 *    For Executable Jar  Url Would be -
												 *  
												 *  	 String url = "jdbc:sqlite::resource:Prison_Management_System.db";
												 */
												
												String url = "jdbc:sqlite::resource:Prison_Management_System.db";
												// String sql = "insert into Admin_Details values ('"+ adminid+"'"+","+"'"+adminname+"'"+","+"'"+doj+"'"+","+"'"+tenure+"'"+")";
												 
											        Connection conn = null;
											        try
											        {
											            conn = DriverManager.getConnection(url);
											     
											            /*
											             * Starts : Check whether updated entry existed or not
											             */
											            
							       String fetch_sql = "select  *  from Prisoners_Detail where Prisoner_ID="+"'"+textField_1.getText().toString().toUpperCase()+"'";
											            
							       PreparedStatement check_statement = conn.prepareStatement(fetch_sql);
							       
							       ResultSet rows_count = check_statement .executeQuery();
							       
							       int counter = 0;
							       while(rows_count.next())
							       {
							         counter++;
							       }
											             				         				            				        
											            if (counter < 1)
											            {
											            	
											            
											            JOptionPane.showMessageDialog(null, "Prisoner  Doesn't  Exist !!!", "Prison Management System", 1);
												           				       		
										            }
										          
											            else
											            {
										   		        
											            /*
											             * Ends : Check entry existed already or not
											             */	   	
																           
											            String sql3 = "update Prisoners_Detail  set Prisoner_ID="+"'"+ textField_2.getText().toString().toUpperCase() +"'"+"  where Prisoner_ID= "+"'"+textField_1.getText().toString().toUpperCase()+"'";
										            	
											           Statement statement3 = conn.createStatement();
										            	
										            try
										            {
											            statement3.execute(sql3);
											            
											           
											         
											               
											                JOptionPane.showMessageDialog(null, "Details Updated Successfully !!!", "Prison Management System", 1);
											           
										            }
										            
										            catch(Exception e2)
										            {
											        
											                JOptionPane.showMessageDialog(null, "Please try again, Technical Error !!!", "Prison Management System", 1);
													           
										            }
												       		
								
											            }
											        }
											        
											catch (SQLException sqliteex) {
											            System.out.println(sqliteex.getMessage());
											        }
											
											/*
											 * Code Ends : Create Database connection
											 */
												
						                	  
						                	  
						                	  
						                	  
						                  }
				                	 
				                	
				                   	 
				                	    else   if( list.getSelectedValue()== "Prisoner Name" )
						                  {
						                	  
						                	  
						                	  /*
												 * Code Starts : Create Database connection
												 */
												
												/*
												 * 
												 *  Important Note : 
												 *  
												 *  For Test Path Url Would be -
												 *  
												 *  	
												 *  
												 *  
												 *    For Executable Jar  Url Would be -
												 *  
												 *  	 String url = "jdbc:sqlite::resource:Prison_Management_System.db";
												 */
												
												String url = "jdbc:sqlite::resource:Prison_Management_System.db";
												// String sql = "insert into Admin_Details values ('"+ adminid+"'"+","+"'"+adminname+"'"+","+"'"+doj+"'"+","+"'"+tenure+"'"+")";
												 
											        Connection conn = null;
											        try
											        {
											            conn = DriverManager.getConnection(url);
											     
											            /*
											             * Starts : Check whether updated entry existed or not
											             */
											            
							       String fetch_sql = "select  *  from Prisoners_Detail where Prisoner_ID="+"'"+textField_1.getText().toString().toUpperCase()+"'";
											            
							       PreparedStatement check_statement = conn.prepareStatement(fetch_sql);
							       
							       ResultSet rows_count = check_statement .executeQuery();
							       
							       int counter = 0;
							       while(rows_count.next())
							       {
							         counter++;
							       }
											             				         				            				        
											            if (counter < 1)
											            {
											            	
											            
											            JOptionPane.showMessageDialog(null, "Prisoner  Doesn't  Exist !!!", "Prison Management System", 1);
												           				       		
										            }
										          
											            else
											            {
										   		        
											            /*
											             * Ends : Check entry existed already or not
											             */	   	
																           
											            String sql3 = "update Prisoners_Detail  set Prisoner_Name="+"'"+ textField_2.getText().toString().toUpperCase() +"'"+"  where Prisoner_ID= "+"'"+textField_1.getText().toString().toUpperCase()+"'";
										            	
											           Statement statement3 = conn.createStatement();
										            	
										            try
										            {
											            statement3.execute(sql3);
											            
											           
											         
											               
											                JOptionPane.showMessageDialog(null, "Details Updated Successfully !!!", "Prison Management System", 1);
											           
										            }
										            
										            catch(Exception e2)
										            {
											        
											                JOptionPane.showMessageDialog(null, "Please try again, Technical Error !!!", "Prison Management System", 1);
													           
										            }
												       		
								
											            }
											        }
											        
											catch (SQLException sqliteex) {
											            System.out.println(sqliteex.getMessage());
											        }
											
											/*
											 * Code Ends : Create Database connection
											 */
												
						                	  
						                	  
						                	  
						                	  
						                  }
				                	    

				                	    else   if( list.getSelectedValue()== "Date Of Prisonment" )
						                  {
						                	  
						                	  
						                	  /*
												 * Code Starts : Create Database connection
												 */
												
												/*
												 * 
												 *  Important Note : 
												 *  
												 *  For Test Path Url Would be -
												 *  
												 *  	
												 *  
												 *  
												 *    For Executable Jar  Url Would be -
												 *  
												 *  	 String url = "jdbc:sqlite::resource:Prison_Management_System.db";
												 */
												
												String url = "jdbc:sqlite::resource:Prison_Management_System.db";
												// String sql = "insert into Admin_Details values ('"+ adminid+"'"+","+"'"+adminname+"'"+","+"'"+doj+"'"+","+"'"+tenure+"'"+")";
												 
											        Connection conn = null;
											        try
											        {
											            conn = DriverManager.getConnection(url);
											     
											            /*
											             * Starts : Check whether updated entry existed or not
											             */
											            
							       String fetch_sql = "select  *  from Prisoners_Detail where Prisoner_ID="+"'"+textField_1.getText().toString().toUpperCase()+"'";
											            
							       PreparedStatement check_statement = conn.prepareStatement(fetch_sql);
							       
							       ResultSet rows_count = check_statement .executeQuery();
							       
							       int counter = 0;
							       while(rows_count.next())
							       {
							         counter++;
							       }
											             				         				            				        
											            if (counter < 1)
											            {
											            	
											            
											            JOptionPane.showMessageDialog(null, "Prisoner  Doesn't  Exist !!!", "Prison Management System", 1);
												           				       		
										            }
										          
											            else
											            {
										   		        
											            /*
											             * Ends : Check entry existed already or not
											             */	   	
																           
											            String sql3 = "update Prisoners_Detail  set Date_Of_Prisonment="+"'"+ textField_2.getText().toString().toUpperCase() +"'"+"  where Prisoner_ID= "+"'"+textField_1.getText().toString().toUpperCase()+"'";
										            	
											           Statement statement3 = conn.createStatement();
										            	
										            try
										            {
											            statement3.execute(sql3);
											            
											           
											         
											               
											                JOptionPane.showMessageDialog(null, "Details Updated Successfully !!!", "Prison Management System", 1);
											           
										            }
										            
										            catch(Exception e2)
										            {
											        
											                JOptionPane.showMessageDialog(null, "Please try again, Technical Error !!!", "Prison Management System", 1);
													           
										            }
												       		
								
											            }
											        }
											        
											catch (SQLException sqliteex) {
											            System.out.println(sqliteex.getMessage());
											        }
											
											/*
											 * Code Ends : Create Database connection
											 */
												
						                	  
						                	  
						                	  
						                	  
						                  }
				                  
				                    

				                	    else   if( list.getSelectedValue()== "Date Of Birth" )
						                  {
						                	  
						                	  
						                	  /*
												 * Code Starts : Create Database connection
												 */
												
												/*
												 * 
												 *  Important Note : 
												 *  
												 *  For Test Path Url Would be -
												 *  
												 *  	
												 *  
												 *  
												 *    For Executable Jar  Url Would be -
												 *  
												 *  	 String url = "jdbc:sqlite::resource:Prison_Management_System.db";
												 */
												
												String url = "jdbc:sqlite::resource:Prison_Management_System.db";
												// String sql = "insert into Admin_Details values ('"+ adminid+"'"+","+"'"+adminname+"'"+","+"'"+doj+"'"+","+"'"+tenure+"'"+")";
												 
											        Connection conn = null;
											        try
											        {
											            conn = DriverManager.getConnection(url);
											     
											            /*
											             * Starts : Check whether updated entry existed or not
											             */
											            
							       String fetch_sql = "select  *  from Prisoners_Detail where Prisoner_ID="+"'"+textField_1.getText().toString().toUpperCase()+"'";
											            
							       PreparedStatement check_statement = conn.prepareStatement(fetch_sql);
							       
							       ResultSet rows_count = check_statement .executeQuery();
							       
							       int counter = 0;
							       while(rows_count.next())
							       {
							         counter++;
							       }
											             				         				            				        
											            if (counter < 1)
											            {
											            	
											            
											            JOptionPane.showMessageDialog(null, "Prisoner  Doesn't  Exist !!!", "Prison Management System", 1);
												           				       		
										            }
										          
											            else
											            {
										   		        
											            /*
											             * Ends : Check entry existed already or not
											             */	   	
																           
											            String sql3 = "update Prisoners_Detail  set Date_Of_Birth="+"'"+ textField_2.getText().toString().toUpperCase() +"'"+"  where Prisoner_ID= "+"'"+textField_1.getText().toString().toUpperCase()+"'";
										            	
											           Statement statement3 = conn.createStatement();
										            	
										            try
										            {
											            statement3.execute(sql3);
											            
											           
											         
											               
											                JOptionPane.showMessageDialog(null, "Details Updated Successfully !!!", "Prison Management System", 1);
											           
										            }
										            
										            catch(Exception e2)
										            {
											        
											                JOptionPane.showMessageDialog(null, "Please try again, Technical Error !!!", "Prison Management System", 1);
													           
										            }
												       		
								
											            }
											        }
											        
											catch (SQLException sqliteex) {
											            System.out.println(sqliteex.getMessage());
											        }
											
											/*
											 * Code Ends : Create Database connection
											 */
												
						                	  
						                	  
						                	  
						                	  
						                  }
				                  

				                	    else   if( list.getSelectedValue()== "Age" )
						                  {
						                	  
						                	  
						                	  /*
												 * Code Starts : Create Database connection
												 */
												
												/*
												 * 
												 *  Important Note : 
												 *  
												 *  For Test Path Url Would be -
												 *  
												 *  	
												 *  
												 *  
												 *    For Executable Jar  Url Would be -
												 *  
												 *  	 String url = "jdbc:sqlite::resource:Prison_Management_System.db";
												 */
												
												String url = "jdbc:sqlite::resource:Prison_Management_System.db";
												// String sql = "insert into Admin_Details values ('"+ adminid+"'"+","+"'"+adminname+"'"+","+"'"+doj+"'"+","+"'"+tenure+"'"+")";
												 
											        Connection conn = null;
											        try
											        {
											            conn = DriverManager.getConnection(url);
											     
											            /*
											             * Starts : Check whether updated entry existed or not
											             */
											            
							       String fetch_sql = "select  *  from Prisoners_Detail where Prisoner_ID="+"'"+textField_1.getText().toString().toUpperCase()+"'";
											            
							       PreparedStatement check_statement = conn.prepareStatement(fetch_sql);
							       
							       ResultSet rows_count = check_statement .executeQuery();
							       
							       int counter = 0;
							       while(rows_count.next())
							       {
							         counter++;
							       }
											             				         				            				        
											            if (counter < 1)
											            {
											            	
											            
											            JOptionPane.showMessageDialog(null, "Prisoner  Doesn't  Exist !!!", "Prison Management System", 1);
												           				       		
										            }
										          
											            else
											            {
										   		        
											            /*
											             * Ends : Check entry existed already or not
											             */	   	
																           
											            String sql3 = "update Prisoners_Detail  set Age="+"'"+ textField_2.getText().toString().toUpperCase() +"'"+"  where Prisoner_ID= "+"'"+textField_1.getText().toString().toUpperCase()+"'";
										            	
											           Statement statement3 = conn.createStatement();
										            	
										            try
										            {
											            statement3.execute(sql3);
											            
											           
											         
											               
											                JOptionPane.showMessageDialog(null, "Details Updated Successfully !!!", "Prison Management System", 1);
											           
										            }
										            
										            catch(Exception e2)
										            {
											        
											                JOptionPane.showMessageDialog(null, "Please try again, Technical Error !!!", "Prison Management System", 1);
													           
										            }
												       		
								
											            }
											        }
											        
											catch (SQLException sqliteex) {
											            System.out.println(sqliteex.getMessage());
											        }
											
											/*
											 * Code Ends : Create Database connection
											 */
												
						                	  
						                	  
						                	  
						                	  
						                  }
				                  

				                	    else   if( list.getSelectedValue()== "Type Of Crime" )
						                  {
						                	  
						                	  
						                	  /*
												 * Code Starts : Create Database connection
												 */
												
												/*
												 * 
												 *  Important Note : 
												 *  
												 *  For Test Path Url Would be -
												 *  
												 *  	
												 *  
												 *  
												 *    For Executable Jar  Url Would be -
												 *  
												 *  	 String url = "jdbc:sqlite::resource:Prison_Management_System.db";
												 */
												
												String url = "jdbc:sqlite::resource:Prison_Management_System.db";
												// String sql = "insert into Admin_Details values ('"+ adminid+"'"+","+"'"+adminname+"'"+","+"'"+doj+"'"+","+"'"+tenure+"'"+")";
												 
											        Connection conn = null;
											        try
											        {
											            conn = DriverManager.getConnection(url);
											     
											            /*
											             * Starts : Check whether updated entry existed or not
											             */
											            
							       String fetch_sql = "select  *  from Prisoners_Detail where Prisoner_ID="+"'"+textField_1.getText().toString().toUpperCase()+"'";
											            
							       PreparedStatement check_statement = conn.prepareStatement(fetch_sql);
							       
							       ResultSet rows_count = check_statement .executeQuery();
							       
							       int counter = 0;
							       while(rows_count.next())
							       {
							         counter++;
							       }
											             				         				            				        
											            if (counter < 1)
											            {
											            	
											            
											            JOptionPane.showMessageDialog(null, "Prisoner  Doesn't  Exist !!!", "Prison Management System", 1);
												           				       		
										            }
										          
											            else
											            {
										   		        
											            /*
											             * Ends : Check entry existed already or not
											             */	   	
																           
											            String sql3 = "update Prisoners_Detail  set Type_Of_Crime="+"'"+ textField_2.getText().toString().toUpperCase() +"'"+"  where Prisoner_ID= "+"'"+textField_1.getText().toString().toUpperCase()+"'";
										            	
											           Statement statement3 = conn.createStatement();
										            	
										            try
										            {
											            statement3.execute(sql3);
											            
											           
											         
											               
											                JOptionPane.showMessageDialog(null, "Details Updated Successfully !!!", "Prison Management System", 1);
											           
										            }
										            
										            catch(Exception e2)
										            {
											        
											                JOptionPane.showMessageDialog(null, "Please try again, Technical Error !!!", "Prison Management System", 1);
													           
										            }
												       		
								
											            }
											        }
											        
											catch (SQLException sqliteex) {
											            System.out.println(sqliteex.getMessage());
											        }
											
											/*
											 * Code Ends : Create Database connection
											 */
												
						                	  
						                	  
						                	  
						                	  
						                  }
				                  

				                	    else   if( list.getSelectedValue()== "Ward Alloted" )
						                  {
						                	  
						                	  
						                	  /*
												 * Code Starts : Create Database connection
												 */
												
												/*
												 * 
												 *  Important Note : 
												 *  
												 *  For Test Path Url Would be -
												 *  
												 *  	
												 *  
												 *  
												 *    For Executable Jar  Url Would be -
												 *  
												 *  	 String url = "jdbc:sqlite::resource:Prison_Management_System.db";
												 */
												
												String url = "jdbc:sqlite::resource:Prison_Management_System.db";
												// String sql = "insert into Admin_Details values ('"+ adminid+"'"+","+"'"+adminname+"'"+","+"'"+doj+"'"+","+"'"+tenure+"'"+")";
												 
											        Connection conn = null;
											        try
											        {
											            conn = DriverManager.getConnection(url);
											     
											            /*
											             * Starts : Check whether updated entry existed or not
											             */
											            
							       String fetch_sql = "select  *  from Prisoners_Detail where Prisoner_ID="+"'"+textField_1.getText().toString().toUpperCase()+"'";
											            
							       PreparedStatement check_statement = conn.prepareStatement(fetch_sql);
							       
							       ResultSet rows_count = check_statement .executeQuery();
							       
							       int counter = 0;
							       while(rows_count.next())
							       {
							         counter++;
							       }
											             				         				            				        
											            if (counter < 1)
											            {
											            	
											            
											            JOptionPane.showMessageDialog(null, "Prisoner  Doesn't  Exist !!!", "Prison Management System", 1);
												           				       		
										            }
										          
											            else
											            {
										   		        
											            /*
											             * Ends : Check entry existed already or not
											             */	   	
																           
											            String sql3 = "update Prisoners_Detail  set Ward_Alloted="+"'"+ textField_2.getText().toString().toUpperCase() +"'"+"  where Prisoner_ID= "+"'"+textField_1.getText().toString().toUpperCase()+"'";
										            	
											           Statement statement3 = conn.createStatement();
										            	
										            try
										            {
											            statement3.execute(sql3);
											            
											           
											         
											               
											                JOptionPane.showMessageDialog(null, "Details Updated Successfully !!!", "Prison Management System", 1);
											           
										            }
										            
										            catch(Exception e2)
										            {
											        
											                JOptionPane.showMessageDialog(null, "Please try again, Technical Error !!!", "Prison Management System", 1);
													           
										            }
												       		
								
											            }
											        }
											        
											catch (SQLException sqliteex) {
											            System.out.println(sqliteex.getMessage());
											        }
											
											/*
											 * Code Ends : Create Database connection
											 */
												
						                	  
						                	  
						                	  
						                	  
						                  }
				                  

				                	    else   if( list.getSelectedValue()== "Remark" )
						                  {
						                	  
						                	  
						                	  /*
												 * Code Starts : Create Database connection
												 */
												
												/*
												 * 
												 *  Important Note : 
												 *  
												 *  For Test Path Url Would be -
												 *  
												 *  	
												 *  
												 *  
												 *    For Executable Jar  Url Would be -
												 *  
												 *  	 String url = "jdbc:sqlite::resource:Prison_Management_System.db";
												 */
												
												String url = "jdbc:sqlite::resource:Prison_Management_System.db";
												// String sql = "insert into Admin_Details values ('"+ adminid+"'"+","+"'"+adminname+"'"+","+"'"+doj+"'"+","+"'"+tenure+"'"+")";
												 
											        Connection conn = null;
											        try
											        {
											            conn = DriverManager.getConnection(url);
											     
											            /*
											             * Starts : Check whether updated entry existed or not
											             */
											            
							       String fetch_sql = "select  *  from Prisoners_Detail where Prisoner_ID="+"'"+textField_1.getText().toString().toUpperCase()+"'";
											            
							       PreparedStatement check_statement = conn.prepareStatement(fetch_sql);
							       
							       ResultSet rows_count = check_statement .executeQuery();
							       
							       int counter = 0;
							       while(rows_count.next())
							       {
							         counter++;
							       }
											             				         				            				        
											            if (counter < 1)
											            {
											            	
											            
											            JOptionPane.showMessageDialog(null, "Prisoner  Doesn't  Exist !!!", "Prison Management System", 1);
												           				       		
										            }
										          
											            else
											            {
										   		        
											            /*
											             * Ends : Check entry existed already or not
											             */	   	
																           
											            String sql3 = "update Prisoners_Detail  set Remark="+"'"+ textField_2.getText().toString().toUpperCase() +"'"+"  where Prisoner_ID= "+"'"+textField_1.getText().toString().toUpperCase()+"'";
										            	
											           Statement statement3 = conn.createStatement();
										            	
										            try
										            {
											            statement3.execute(sql3);
											            
											           
											         
											               
											                JOptionPane.showMessageDialog(null, "Details Updated Successfully !!!", "Prison Management System", 1);
											           
										            }
										            
										            catch(Exception e2)
										            {
											        
											                JOptionPane.showMessageDialog(null, "Please try again, Technical Error !!!", "Prison Management System", 1);
													           
										            }
												       		
								
											            }
											        }
											        
											catch (SQLException sqliteex) {
											            System.out.println(sqliteex.getMessage());
											        }
											
											/*
											 * Code Ends : Create Database connection
											 */
												
						                	  
						                	  
						                	  
						                	  
						                  }
				                  
				                    
				                  
				                    
				                    
				                 }  //  Main 'If' ends // to check whther field need to modify selected or not
							
							
						}
					});
					btnNewButton.setForeground(Color.GRAY);
					btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 20));
					btnNewButton.setBounds(497, 387, 152, 33);
					MPD_Core_Panel.add(btnNewButton);
					
					/*************************************************/
					
					
					
				
				
				
				
			}
		});
		upd.add(md);
		
		//JMenuItem dd = new JMenuItem("Delete Prisoner Detail");
		//upd.add(dd);
		
	

		
		JMenu  sd = new JMenu("Staffs Detail");
		sd.setForeground(Color.GRAY);
		sd.setFont(new Font("Segoe UI", Font.BOLD, 15));
		menuBar.add(sd);
		
		 vsd = new JMenuItem("View All Staffs Detail");
		 vsd.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) 
		 	{
		 		
		 		
				/*
				 * On click event of menu item follow two way process
				 * 
				 * first we need to - set the visiblity of main Panel inside Frame
				 * Off.
				 * So that we can so the desire Pannel inside Frame.
				 * 
				 * Second we need to - "disabled" the clicked 'Menu' / 'MenuItems'.
				 * 
				 * 
				 * Third  we need to - Enabled the all 'Menu or MenuItems' other than
				 * the clicked one.
				 * 
				 * Let's check the below code
				 */
				
			/*	first we need to - set the visiblity of main Panel inside Frame
				  Off.
				  */
				
		 		/*
		 		 * 
		 		 * Important Note - when whever we move to new link by clicking on it
		 		 * we always use contentPane.setVisible(false)  to clear data
		 		 * 
		 		 * this command will all data except MenuItems.
		 		 * 
		 		 */
		 		
		 		contentPane.setVisible(false);
		 		
				
			/*	Second we need to - "disabled" the clicked 'Menu' / 'MenuItems'.
			 * 
			 */
				
				
				vsd.setEnabled(false);
				
				/*Third  we need to - Enabled the all 'Menu or MenuItems' other than
				 * the clicked one.
				 */
				
				
				/*
				 * Below are the varialbles of MenuItem of
				 * Administrators Detail
				 */
				
			vad.setEnabled(true);
				 sad.setEnabled(true);
			 aad.setEnabled(true);
				 mad.setEnabled(true);
				// dad.setEnabled(true);
				
				
				/*
				 * Below are the varialbles of MenuItem of
				 * Prisoners Detail
				 */
				
				 vmd.setEnabled(true);
				smd.setEnabled(true);
				amd.setEnabled(true);
			 md.setEnabled(true);

				
				/*
				 * Below are the varialbles of MenuItem of
				 * Staffs Detail
				 */
				
				//vsd.setEnabled(true);
				 ssd.setEnabled(true);
				  asd.setEnabled(true);
				 msd.setEnabled(true);
		//		dsd.setEnabled(true);

				
				
				/*
				 * Below are the varialbles of MenuItem of
				 * Staffs Detail
				 */
				
				 vwd.setEnabled(true);
				 swd.setEnabled(true);
				 anw.setEnabled(true);
			 mwd.setEnabled(true);
				//  dwd.setEnabled(true);

				
				/*
				 * Below are the varialbles of Menu  of
				 * our application
				 */
				  mnHome.setEnabled(true);
				
				cu.setEnabled(true);
		

				/* ++++++++++++++++++++++++++++++++++++++++++++++
				 * 
				 * 
				 *  Code Starts : Now we are good to go to show the content
				 * related to the clicked link
				 * 
				 * 
				 ++++++++++++++++++++++++++++++++++++++++++++++++*/
		
				// This is our core Panel over which we will
				// perform all our design work
				
				VSD_Core_Panel = new JPanel();
				VSD_Core_Panel.setBounds(0, 0, 1183, 525);
				
				
				VSD_Core_Panel.setBorder(new EmptyBorder(5, 5, 5, 5));
				setContentPane(VSD_Core_Panel);
				
				
				// Now we will set "Absolute Layout"  so that 
				// we can place our elements on frame  as per 
				// the desire  X-Coordinates and Y- Coordinates
		
				
				
				VSD_Core_Panel.setLayout(null);
				
				/* ++++++++++++++++++++++++++++++++++++++++++++++
				 * 
				 * 
				 *  Code Starts : Now we are good to go to show the content
				 * related to the clicked link
				 * 
				 * 
				 ++++++++++++++++++++++++++++++++++++++++++++++++*/
				
				/************Table code*********************/
				
				
				/*************************************************/
				
				JPanel panel = new JPanel();
				panel.setBounds(0, 0, 1183, 525);
				VSD_Core_Panel.add(panel);
				panel.setLayout(null);
				
				JLabel lblNewLabel = new JLabel("View Staffs Detail");
				lblNewLabel.setForeground(Color.GRAY);
				lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 35));
				lblNewLabel.setBounds(327, 21, 433, 77);
				panel.add(lblNewLabel);
				
				JScrollPane scrollPane = new JScrollPane();
				scrollPane.setBounds(10, 97, 1163, 400);
				panel.add(scrollPane);
				
				JTable table = new JTable();
				scrollPane.setViewportView(table);
				
				

				
				/*
				 * Code Starts : Create Database connection
				 */
				
				/*
				 * 
				 *  Important Note : 
				 *  
				 *  For Test Path Url Would be -
				 *  
				 *  	 
				 *  
				 *  
				 *    For Executable Jar  Url Would be -
				 *  
				 *  	 String url = "jdbc:sqlite::resource:Prison_Management_System.db";
				 */
				
				String url = "jdbc:sqlite::resource:Prison_Management_System.db";
				 String sql = "select * from  Staffs_Detail";
				 
			        Connection conn = null;
			        try {
			            conn = DriverManager.getConnection(url);
			     
			        		   		        
			                PreparedStatement pstmt = conn.prepareStatement(sql);
			         
			          //  pstmt.executeUpdate();

		ResultSet rs = pstmt.executeQuery();

		  table.setModel(DbUtils.resultSetToTableModel(rs));

		/*

		For Modelling ResultSet into table we will 
		use rs2XML jar file, it's a class file
		which help in modelling result set into Table.

		*/

			        } 
			catch (SQLException sqliteex) {
			            System.out.println(sqliteex.getMessage());
			        }
			
			/*
			 * Code Ends : Create Database connection
			 */

			
		 		
		 		
		 	}
		 });
		sd.add(vsd);
		
		 ssd = new JMenuItem("Search  Staff Detail");
		 ssd.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) 
		 	{
		 		
		 		/*
				 * On click event of menu item follow two way process
				 * 
				 * first we need to - set the visiblity of main Panel inside Frame
				 * Off.
				 * So that we can so the desire Pannel inside Frame.
				 * 
				 * Second we need to - "disabled" the clicked 'Menu' / 'MenuItems'.
				 * 
				 * 
				 * Third  we need to - Enabled the all 'Menu or MenuItems' other than
				 * the clicked one.
				 * 
				 * Let's check the below code
				 */
				
			/*	first we need to - set the visiblity of main Panel inside Frame
				  Off.
				  */
				
		 		/*
		 		 * 
		 		 * Important Note - when whever we move to new link by clicking on it
		 		 * we always use contentPane.setVisible(false)  to clear data
		 		 * 
		 		 * this command will all data except MenuItems.
		 		 * 
		 		 */
		 		
		 		contentPane.setVisible(false);
		 		
				
			/*	Second we need to - "disabled" the clicked 'Menu' / 'MenuItems'.
			 * 
			 */
				
				
				ssd.setEnabled(false);
				
				/*Third  we need to - Enabled the all 'Menu or MenuItems' other than
				 * the clicked one.
				 */
				
				
				/*
				 * Below are the varialbles of MenuItem of
				 * Administrators Detail
				 */
			vad.setEnabled(true);
				 sad.setEnabled(true);
			 aad.setEnabled(true);
				 mad.setEnabled(true);
			//	 dad.setEnabled(true);
				
				
				/*
				 * Below are the varialbles of MenuItem of
				 * Prisoners Detail
				 */
				
				 vmd.setEnabled(true);
				smd.setEnabled(true);
				amd.setEnabled(true);
			 md.setEnabled(true);

				
				/*
				 * Below are the varialbles of MenuItem of
				 * Staffs Detail
				 */
				
				vsd.setEnabled(true);
				// ssd.setEnabled(true);
				  asd.setEnabled(true);
				 msd.setEnabled(true);
		//		dsd.setEnabled(true);

				
				
				/*
				 * Below are the varialbles of MenuItem of
				 * Staffs Detail
				 */
				
				 vwd.setEnabled(true);
				 swd.setEnabled(true);
				 anw.setEnabled(true);
			 mwd.setEnabled(true);
				//  dwd.setEnabled(true);

				
				/*
				 * Below are the varialbles of Menu  of
				 * our application
				 */
				  mnHome.setEnabled(true);
				
				cu.setEnabled(true);
				
		
				/* ++++++++++++++++++++++++++++++++++++++++++++++
				 * 
				 * 
				 *  Code Starts : Now we are good to go to show the content
				 * related to the clicked link
				 * 
				 * 
				 ++++++++++++++++++++++++++++++++++++++++++++++++*/
		
				// This is our core Panel over which we will
				// perform all our design work
				
				SSD_Core_Panel = new JPanel();
				SSD_Core_Panel.setBounds(0, 0, 1183, 525);
				
				
				SSD_Core_Panel.setBorder(new EmptyBorder(5, 5, 5, 5));
				setContentPane(SSD_Core_Panel);
				
				
				// Now we will set "Absolute Layout"  so that 
				// we can place our elements on frame  as per 
				// the desire  X-Coordinates and Y- Coordinates
		
				
				
				SSD_Core_Panel.setLayout(null);
				
				
		 		
	/*************************************************/
				
				JPanel panel = new JPanel();
				panel.setBounds(0, 0, 1183, 525);
				SSD_Core_Panel.add(panel);
				panel.setLayout(null);
				
				JLabel lblNewLabel = new JLabel("Search Staff Detail");
				lblNewLabel.setForeground(Color.GRAY);
				lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 35));
				lblNewLabel.setBounds(327, 21, 433, 77);
				panel.add(lblNewLabel);
				
				JScrollPane scrollPane = new JScrollPane();
				scrollPane.setBounds(10, 231, 1163, 217);
				panel.add(scrollPane);
				
				JTable table = new JTable();
				scrollPane.setViewportView(table);
				
				JLabel lblNewLabel_1 = new JLabel("Enter Staff  ID :");
				lblNewLabel_1.setForeground(Color.GRAY);
				lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 22));
				lblNewLabel_1.setBounds(228, 145, 256, 47);
				panel.add(lblNewLabel_1);
				
		
				
				JTextField textField = new JTextField();
				textField.setBounds(482, 154, 168, 37);
				panel.add(textField);
				textField.setColumns(10);
				
				JButton btnNewButton = new JButton("Search");
				btnNewButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0)
					{
						
						/*
						 * 
						 * Get text  from input field
						 * 
						 */
						String str = textField.getText().toString().toUpperCase();
						
						/*
						 * Code Starts : Create Database connection
						 */
						
						/*
						 * 
						 *  Important Note : 
						 *  
						 *  For Test Path Url Would be -
						 *  
						 *  	
						 *  
						 *  
						 *    For Executable Jar  Url Would be -
						 *  
						 *  	 String url = "jdbc:sqlite::resource:Prison_Management_System.db";
						 */
						
						String url = "jdbc:sqlite::resource:Prison_Management_System.db";
						 String sql = "select  *  from  Staffs_Detail where  Staff_ID="+"'"+str+"'";
						 
					        Connection conn = null;
					        try {
					            conn = DriverManager.getConnection(url);
					     
					        		   		        
					                PreparedStatement pstmt = conn.prepareStatement(sql);
					         
					          //  pstmt.executeUpdate();

				ResultSet rs = pstmt.executeQuery();

				  table.setModel(DbUtils.resultSetToTableModel(rs));

				/*

				For Modelling ResultSet into table we will 
				use rs2XML jar file, it's a class file
				which help in modelling result set into Table.

				*/

					        } 
					catch (SQLException sqliteex) {
					            System.out.println(sqliteex.getMessage());
					        }
					
					/*
					 * Code Ends : Create Database connection
					 */

					
						
					}
				});
				btnNewButton.setForeground(Color.GRAY);
				btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 20));
				btnNewButton.setBounds(688, 153, 102, 33);
				panel.add(btnNewButton);
				
		 		
		 		
		 		
		 		
		 		
		 	}
		 });
		sd.add(ssd);
		
		
		 asd = new JMenuItem("Add Staff Detail");
		 asd.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent arg0) 
		 	{
		 		

				/*
				 * On click event of menu item follow two way process
				 * 
				 * first we need to - set the visiblity of main Panel inside Frame
				 * Off.
				 * So that we can so the desire Pannel inside Frame.
				 * 
				 * Second we need to - "disabled" the clicked 'Menu' / 'MenuItems'.
				 * 
				 * 
				 * Third  we need to - Enabled the all 'Menu or MenuItems' other than
				 * the clicked one.
				 * 
				 * Let's check the below code
				 */
				
			/*	first we need to - set the visiblity of main Panel inside Frame
				  Off.
				  */
				
		 		/*
		 		 * 
		 		 * Important Note - when whever we move to new link by clicking on it
		 		 * we always use contentPane.setVisible(false)  to clear data
		 		 * 
		 		 * this command will all data except MenuItems.
		 		 * 
		 		 */
		 		
		 		contentPane.setVisible(false);
		 		
				
			/*	Second we need to - "disabled" the clicked 'Menu' / 'MenuItems'.
			 * 
			 */
				
				
				asd.setEnabled(false);
				
				/*Third  we need to - Enabled the all 'Menu or MenuItems' other than
				 * the clicked one.
				 */
				
				
				/*
				 * Below are the varialbles of MenuItem of
				 * Administrators Detail
				 */
			vad.setEnabled(true);
				sad.setEnabled(true);
		aad.setEnabled(true);
				 mad.setEnabled(true);
			//	 dad.setEnabled(true);
				
				
				/*
				 * Below are the varialbles of MenuItem of
				 * Prisoners Detail
				 */
				
				 vmd.setEnabled(true);
			smd.setEnabled(true);
				amd.setEnabled(true);
			 md.setEnabled(true);

				
				/*
				 * Below are the varialbles of MenuItem of
				 * Staffs Detail
				 */
				
				vsd.setEnabled(true);
				 ssd.setEnabled(true);
				//  asd.setEnabled(true);
				 msd.setEnabled(true);
		//	dsd.setEnabled(true);

				
				
				/*
				 * Below are the varialbles of MenuItem of
				 * Wards Detail
				 */
				
				 vwd.setEnabled(true);
				 swd.setEnabled(true);
				 anw.setEnabled(true);
			 mwd.setEnabled(true);
			//	  dwd.setEnabled(true);

				
				/*
				 * Below are the varialbles of Menu  of
				 * our application
				 */
				  mnHome.setEnabled(true);
				
				cu.setEnabled(true);
				
		
				/* ++++++++++++++++++++++++++++++++++++++++++++++
				 * 
				 * 
				 *  Code Starts : Now we are good to go to show the content
				 * related to the clicked link
				 * 
				 * 
				 ++++++++++++++++++++++++++++++++++++++++++++++++*/
		
				// This is our core Panel over which we will
				// perform all our design work
				
				ASD_Core_Panel = new JPanel();
				ASD_Core_Panel.setBounds(0, 0, 1183, 525);
				
				
				ASD_Core_Panel.setBorder(new EmptyBorder(5, 5, 5, 5));
				setContentPane(ASD_Core_Panel);
				
				
				// Now we will set "Absolute Layout"  so that 
				// we can place our elements on frame  as per 
				// the desire  X-Coordinates and Y- Coordinates
		
				
				
				ASD_Core_Panel.setLayout(null);
				
				
				/*************************************************/
				
				/********************************************************/
				
				JLabel lblNewLabel = new JLabel("Add Staff Detail");
				lblNewLabel.setForeground(Color.GRAY);
				lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 35));
				lblNewLabel.setBounds(426, 28, 309, 54);
				ASD_Core_Panel.add(lblNewLabel);
				
				JLabel lblNewLabel_1 = new JLabel("Staff ID :");
				lblNewLabel_1.setForeground(Color.GRAY);
				lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
				lblNewLabel_1.setBounds(164, 116, 120, 25);
				ASD_Core_Panel.add(lblNewLabel_1);
				
				JLabel lblNewLabel_2 = new JLabel("Age :");
				lblNewLabel_2.setForeground(Color.GRAY);
				lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 20));
				lblNewLabel_2.setBounds(214, 276, 86, 33);
				ASD_Core_Panel.add(lblNewLabel_2);
				
				JLabel lblNewLabel_3 = new JLabel("Staff  Name :");
				lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 20));
				lblNewLabel_3.setForeground(Color.GRAY);
				lblNewLabel_3.setBounds(590, 109, 195, 39);
				ASD_Core_Panel.add(lblNewLabel_3);
				
				JLabel lblNewLabel_4 = new JLabel("Date Of Joining :");
				lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 20));
				lblNewLabel_4.setForeground(Color.GRAY);
				lblNewLabel_4.setBounds(596, 271, 173, 43);
				ASD_Core_Panel.add(lblNewLabel_4);
				
				JTextField textField_1 = new JTextField();
				textField_1.setBounds(326, 113, 174, 36);
				ASD_Core_Panel.add(textField_1);
				textField_1.setColumns(10);
				
				JTextField txtEx = new JTextField();
				txtEx.setForeground(Color.LIGHT_GRAY);
				txtEx.setHorizontalAlignment(SwingConstants.LEFT);
				txtEx.setBounds(326, 277, 174, 36);
				ASD_Core_Panel.add(txtEx);
				txtEx.setColumns(10);
				
				JTextField textField_3 = new JTextField();
				textField_3.setBounds(795, 113, 181, 36);
				ASD_Core_Panel.add(textField_3);
				textField_3.setColumns(10);
				
				JTextField textField_4 = new JTextField();
				textField_4.setBounds(795, 276, 181, 36);
				ASD_Core_Panel.add(textField_4);
				textField_4.setColumns(10);
				
				JLabel lblNewLabel_6 = new JLabel("Ward Alloted :");
				lblNewLabel_6.setFont(new Font("Times New Roman", Font.BOLD, 20));
				lblNewLabel_6.setForeground(Color.GRAY);
				lblNewLabel_6.setBounds(132, 367, 152, 26);
				ASD_Core_Panel.add(lblNewLabel_6);
				
				JTextField textField_2 = new JTextField();
				textField_2.setBounds(326, 362, 167, 37);
				ASD_Core_Panel.add(textField_2);
				textField_2.setColumns(10);
				
				JLabel lblNewLabel_7 = new JLabel("Date Of Birth :");
				lblNewLabel_7.setForeground(Color.GRAY);
				lblNewLabel_7.setFont(new Font("Times New Roman", Font.BOLD, 20));
				lblNewLabel_7.setBounds(89, 193, 195, 25);
				ASD_Core_Panel.add(lblNewLabel_7);
				
				JTextField textField_5 = new JTextField();
				textField_5.setBounds(326, 189, 174, 33);
				ASD_Core_Panel.add(textField_5);
				textField_5.setColumns(10);
				
				JLabel lblNewLabel_8 = new JLabel("Shift :");
				lblNewLabel_8.setForeground(Color.GRAY);
				lblNewLabel_8.setFont(new Font("Times New Roman", Font.BOLD, 20));
				lblNewLabel_8.setBounds(596, 189, 173, 33);
				ASD_Core_Panel.add(lblNewLabel_8);
				
				JTextField textField_6 = new JTextField();
				textField_6.setBounds(795, 189, 181, 33);
				ASD_Core_Panel.add(textField_6);
				textField_6.setColumns(10);
				
				/*
				JLabel lblNewLabel_9 = new JLabel("Remark :");
				lblNewLabel_9.setFont(new Font("Times New Roman", Font.BOLD, 20));
				lblNewLabel_9.setForeground(Color.GRAY);
				lblNewLabel_9.setBounds(655, 362, 92, 33);
				ASD_Core_Panel.add(lblNewLabel_9);
				
				
				JTextField textField_7 = new JTextField();
				textField_7.setBounds(795, 355, 167, 33);
				ASD_Core_Panel.add(textField_7);
				textField_7.setColumns(10);
				
				*/
				
				JButton btnNewButton = new JButton("Add");
				btnNewButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) 
					{
						
						
						/*
						 * 
						 * Get text  from input field
						 * 
						 */
						String  sid = textField_1.getText().toString().toUpperCase();
						
						String sname = textField_3.getText().toString();
						
						String doj = textField_4.getText().toString().toUpperCase();
						
						String  dob = textField_5.getText().toString();
						
	                  int  age = Integer.parseInt(txtEx.getText().toString());
						
						String  wa = textField_2.getText().toString();
						
						String shift= textField_6.getText().toString().toUpperCase();
						
					//	String rem = textField_7.getText().toString();
						
						/*
						 * Code Starts : Create Database connection
						 */
						
						/*
						 * 
						 *  Important Note : 
						 *  
						 *  For Test Path Url Would be -
						 *  
						 *  	
						 *  
						 *  
						 *    For Executable Jar  Url Would be -
						 *  
						 *  	 String url = "jdbc:sqlite::resource:Prison_Management_System.db";
						 */
						
						String url = "jdbc:sqlite::resource:Prison_Management_System.db";
						// String sql = "insert into Admin_Details values ('"+ adminid+"'"+","+"'"+adminname+"'"+","+"'"+doj+"'"+","+"'"+tenure+"'"+")";
						 
					        Connection conn = null;
					        try
					        {
					            conn = DriverManager.getConnection(url);
					     
					            
					            /*
					             * Starts : Check entry existed already or not
					             */
					            
	       String fetch_sql = "select  *  from Staffs_Detail where Staff_ID="+"'"+sid+"'";
					            
	       PreparedStatement check_statement = conn.prepareStatement(fetch_sql);
	       
	       ResultSet rows_count = check_statement .executeQuery();
	       
	       int counter = 0;
	       while(rows_count.next())
	       {
	         counter++;
	       }
					             				         				            				        
					            if (counter > 0)
					            {
					            	
					            
					            JOptionPane.showMessageDialog(null, "Staff  Already Exist !!!", "Prison Management System", 1);
						           				       		
				            }
				          
					            else
					            {
				   		        
					            /*
					             * Ends : Check entry existed already or not
					             */
					     
					            
					        		   		        
					            String sql = "INSERT INTO Staffs_Detail (Staff_ID, Staff_Name, Date_Of_Joining, Age,Date_Of_Birth,Ward_Allot,Shift) VALUES (?, ?, ?,?, ?, ?, ?)";
					            
					            PreparedStatement statement = conn.prepareStatement(sql);
					            statement.setString(1, sid);
					            statement.setString(2, sname);
					            statement.setString(3, doj);
					            statement.setString(4, dob);
					            
					            statement.setInt(5, age);
					            statement.setString(6, wa);
					            statement.setString(7, shift);
					        //    statement.setString(8, rem);
					             
					            int rowsInserted = statement.executeUpdate();
					            if (rowsInserted > 0)
					            {
					            //    System.out.println("A new user was inserted successfully!");
					            
					            	
					            	/*
					            	 * Code Starts : Update Ward Table  if query get successfule
					            	 */
					            	
					            	//String url = "jdbc:sqlite::resource:Prison_Management_System.db";
									
								       Connection conn2 = null;
					            try
					            {
					            	 conn2 = DriverManager.getConnection(url);
								     
					            	
					            //	String sql1 = "select Per_Cell_Prisoners from Wards_Detail where Ward_Code="+"'"+wa+"'";
					            	
					            	// PreparedStatement statement2 = conn2.prepareStatement(sql1);
						            
				            //	ResultSet rs2 = statement2.executeQuery();
				            	
				            	
				            //	int current_prisoners_perCell = rs2.getInt("Per_Cell_Prisoners");
				            	
				            //	int new_value_prisoners_perCell = current_prisoners_perCell +  1;
				            	
				            	
				            	// Get total number of cells in a Ward
				            	
				            	//String sql4 = "select Number_Of_Cells from Wards_Detail where Ward_Code="+"'"+wa+"'";
				            	
				            //	 PreparedStatement statement4 = conn2.prepareStatement(sql4);
					            
			            //	ResultSet rs4 = statement4.executeQuery();
			            	
			            	
			            //	int current_value_number_Cell = rs4.getInt("Number_Of_Cells");
				            	
				            	/*
				            	 * 
				            	 * Now we will update new value in Ward Table and Total number of prisoners also
				            	 */
				            	
				            	String sql3 = "update Wards_Detail  set Ward_Officer="+"'"+sname +"'"+"  where Ward_Code= "+"'"+wa+"'";
				            	
				            	//String sql6 = "update Wards_Detail  set Total_Prisoners="+"'"+new_value_prisoners_perCell*current_value_number_Cell +"'"+"  where Ward_Code= "+"'"+wa+"'";
				            	
				            	 PreparedStatement statement3 = conn2.prepareStatement(sql3);
				            	 
				            	// PreparedStatement statement6 = conn2.prepareStatement(sql6);
				            	 
				            	 statement3.executeUpdate();
				            	 
				            //	 statement6.executeUpdate();
				            	
				            //	System.out.println("Per Cell : "+current_prisoners_perCell);
				            	
					            }
					            catch(Exception ee)
					            {
					            	System.out.println(ee);	
					            }
					            	/*
					            	 * Code Ends : Update Ward Table  if query get successfule
					            	 */
					               
					                JOptionPane.showMessageDialog(null, "Staff Added Successfully !!!", "Prison Management System", 1);
					           
						       						       		
					            }
					            else
					            {
					                JOptionPane.showMessageDialog(null, "Please try again, Technical Error !!!", "Prison Management System", 1);
							           
					            }
						       		
			//	ResultSet rs = pstmt.executeQuery();

				//  table.setModel(DbUtils.resultSetToTableModel(rs));

				/*

				For Modelling ResultSet into table we will 
				use rs2XML jar file, it's a class file
				which help in modelling result set into Table.

				*/
					            }
					        } 
					catch (SQLException sqliteex) {
					            System.out.println(sqliteex.getMessage());
					        }
					
					/*
					 * Code Ends : Create Database connection
					 */
						
						
						
						
					}
				});
				btnNewButton.setForeground(Color.GRAY);
				btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 20));
				btnNewButton.setBounds(518, 435, 152, 33);
				ASD_Core_Panel.add(btnNewButton);
				
			
				
				/*************************************************/
		 		
		 	}
		 });
		sd.add(asd);
		
		 msd = new JMenuItem("Modify Staff Detail");
		 msd.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) 
		 	{
		 		
				
		 		
				/*
				 * On click event of menu item follow two way process
				 * 
				 * first we need to - set the visiblity of main Panel inside Frame
				 * Off.
				 * So that we can so the desire Pannel inside Frame.
				 * 
				 * Second we need to - "disabled" the clicked 'Menu' / 'MenuItems'.
				 * 
				 * 
				 * Third  we need to - Enabled the all 'Menu or MenuItems' other than
				 * the clicked one.
				 * 
				 * Let's check the below code
				 */
				
			/*	first we need to - set the visiblity of main Panel inside Frame
				  Off.
				  */
				
		 		/*
		 		 * 
		 		 * Important Note - when whever we move to new link by clicking on it
		 		 * we always use contentPane.setVisible(false)  to clear data
		 		 * 
		 		 * this command will all data except MenuItems.
		 		 * 
		 		 */
		 		
		 		contentPane.setVisible(false);
		 		
				
			/*	Second we need to - "disabled" the clicked 'Menu' / 'MenuItems'.
			 * 
			 */
				
				
				msd.setEnabled(false);
				
				/*Third  we need to - Enabled the all 'Menu or MenuItems' other than
				 * the clicked one.
				 */
				
				
				/*
				 * Below are the varialbles of MenuItem of
				 * Administrators Detail
				 */
			vad.setEnabled(true);
				sad.setEnabled(true);
		aad.setEnabled(true);
				 mad.setEnabled(true);
			//	 dad.setEnabled(true);
				
				
				/*
				 * Below are the varialbles of MenuItem of
				 * Prisoners Detail
				 */
				
				 vmd.setEnabled(true);
				smd.setEnabled(true);
				amd.setEnabled(true);
		  md.setEnabled(true);

				
				/*
				 * Below are the varialbles of MenuItem of
				 * Staffs Detail
				 */
				
				vsd.setEnabled(true);
				 ssd.setEnabled(true);
				  asd.setEnabled(true);
				// msd.setEnabled(true);
		//	dsd.setEnabled(true);

				
				
				/*
				 * Below are the varialbles of MenuItem of
				 * Wards Detail
				 */
				
				 vwd.setEnabled(true);
				 swd.setEnabled(true);
				 anw.setEnabled(true);
			 mwd.setEnabled(true);
			//	  dwd.setEnabled(true);

				
				/*
				 * Below are the varialbles of Menu  of
				 * our application
				 */
				  mnHome.setEnabled(true);
				
				cu.setEnabled(true);
				
		
				/* ++++++++++++++++++++++++++++++++++++++++++++++
				 * 
				 * 
				 *  Code Starts : Now we are good to go to show the content
				 * related to the clicked link
				 * 
				 * 
				 ++++++++++++++++++++++++++++++++++++++++++++++++*/
		
				// This is our core Panel over which we will
				// perform all our design work
				
				MSD_Core_Panel = new JPanel();
				MSD_Core_Panel.setBounds(0, 0, 1183, 525);
				
				
				MSD_Core_Panel.setBorder(new EmptyBorder(5, 5, 5, 5));
				setContentPane(MSD_Core_Panel);
				
				
				// Now we will set "Absolute Layout"  so that 
				// we can place our elements on frame  as per 
				// the desire  X-Coordinates and Y- Coordinates
		
				
				
				MSD_Core_Panel.setLayout(null);
				
				
				/*************************************************/
				
				
				/********************************************************/
				
				JLabel lblNewLabel = new JLabel("Update Staff  Detail");
				lblNewLabel.setForeground(Color.GRAY);
				lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 35));
				lblNewLabel.setBounds(392, 28, 455, 54);
				MSD_Core_Panel.add(lblNewLabel);
				
				JLabel lblNewLabel_1 = new JLabel("Choose Field :");
				lblNewLabel_1.setForeground(Color.GRAY);
				lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
				lblNewLabel_1.setBounds(323, 133, 120, 25);
				MSD_Core_Panel.add(lblNewLabel_1);
				
				
				
				JLabel lblNewLabel_7 = new JLabel("Enter Staff ID :");
				lblNewLabel_7.setForeground(Color.GRAY);
				lblNewLabel_7.setFont(new Font("Times New Roman", Font.BOLD, 20));
				lblNewLabel_7.setBounds(710, 123, 195, 25);
				MSD_Core_Panel.add(lblNewLabel_7);
				
				
				 DefaultListModel<String> dlm = new DefaultListModel<>();  
		         dlm.addElement("Staff ID");  
		         dlm.addElement("Staff  Name");  
		         dlm.addElement("Date Of  Joining");  
		         
		         
		         dlm.addElement("Age");  
		         dlm.addElement("Date Of Birth");  
		         dlm.addElement("Ward Alloted");  
		         dlm.addElement("Shift"); 
				
		JList<String>  list = new JList<>(dlm);
				list.setBounds(462, 178, 212, 160);
				MSD_Core_Panel.add(list);
				
				JTextField	textField_1 = new JTextField();   // For "Enter Admin ID"
				textField_1.setBounds(710, 169, 182, 34);
				MSD_Core_Panel.add(textField_1);
				textField_1.setColumns(10);
				
				JLabel lblEnterNewValue = new JLabel("Enter New Value :");
				lblEnterNewValue.setForeground(Color.GRAY);
				lblEnterNewValue.setFont(new Font("Times New Roman", Font.BOLD, 20));
				lblEnterNewValue.setBounds(710, 243, 195, 25);
				MSD_Core_Panel.add(lblEnterNewValue);
				
				JTextField textField_2 = new JTextField();  // For "Enter New Value"
				textField_2.setColumns(10);
				textField_2.setBounds(710, 294, 182, 34);
				MSD_Core_Panel.add(textField_2);
				
				JButton btnNewButton = new JButton("Update");
				btnNewButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e)
					{
						
					
					      
					       
			                 if (list.getSelectedIndex() != -1)   // to check whether item selected or not
			                 {    
			                	 
			                	 
			                	    if( list.getSelectedValue()== "Staff ID" )
					                  {
					                	  
					                	  
					                	  /*
											 * Code Starts : Create Database connection
											 */
											
											/*
											 * 
											 *  Important Note : 
											 *  
											 *  For Test Path Url Would be -
											 *  
											 *  	
											 *  
											 *  
											 *    For Executable Jar  Url Would be -
											 *  
											 *  	 String url = "jdbc:sqlite::resource:Prison_Management_System.db";
											 */
											
											String url = "jdbc:sqlite::resource:Prison_Management_System.db";
											// String sql = "insert into Admin_Details values ('"+ adminid+"'"+","+"'"+adminname+"'"+","+"'"+doj+"'"+","+"'"+tenure+"'"+")";
											 
										        Connection conn = null;
										        try
										        {
										            conn = DriverManager.getConnection(url);
										     
										            /*
										             * Starts : Check whether updated entry existed or not
										             */
										            
						       String fetch_sql = "select  *  from Staffs_Detail where Staff_Id="+"'"+textField_1.getText().toString().toUpperCase()+"'";
										            
						       PreparedStatement check_statement = conn.prepareStatement(fetch_sql);
						       
						       ResultSet rows_count = check_statement .executeQuery();
						       
						       int counter = 0;
						       while(rows_count.next())
						       {
						         counter++;
						       }
										             				         				            				        
										            if (counter < 1)
										            {
										            	
										            
										            JOptionPane.showMessageDialog(null, "Staff  Doesn't  Exist !!!", "Prison Management System", 1);
											           				       		
									            }
									          
										            else
										            {
									   		        
										            /*
										             * Ends : Check entry existed already or not
										             */	   	
															           
										            String sql3 = "update Staffs_Detail  set Staff_Id="+"'"+ textField_2.getText().toString().toUpperCase() +"'"+"  where Staff_Id= "+"'"+textField_1.getText().toString().toUpperCase()+"'";
									            	
										           Statement statement3 = conn.createStatement();
									            	
									            try
									            {
										            statement3.execute(sql3);
										            
										           
										         
										               
										                JOptionPane.showMessageDialog(null, "Details Updated Successfully !!!", "Prison Management System", 1);
										           
									            }
									            
									            catch(Exception e2)
									            {
										        
										                JOptionPane.showMessageDialog(null, "Please try again, Technical Error !!!", "Prison Management System", 1);
												           
									            }
											       		
							
										            }
										        }
										        
										catch (SQLException sqliteex) {
										            System.out.println(sqliteex.getMessage());
										        }
										
										/*
										 * Code Ends : Create Database connection
										 */
											
					                	  
					                	  
					                	  
					                	  
					                  }
			                	 
			                	
			                   	 
			                	    else    if( list.getSelectedValue()== "Staff  Name" )
					                  {
					                	  
					                	  
					                	  /*
											 * Code Starts : Create Database connection
											 */
											
											/*
											 * 
											 *  Important Note : 
											 *  
											 *  For Test Path Url Would be -
											 *  
											 *  	
											 *  
											 *  
											 *    For Executable Jar  Url Would be -
											 *  
											 *  	 String url = "jdbc:sqlite::resource:Prison_Management_System.db";
											 */
											
											String url = "jdbc:sqlite::resource:Prison_Management_System.db";
											// String sql = "insert into Admin_Details values ('"+ adminid+"'"+","+"'"+adminname+"'"+","+"'"+doj+"'"+","+"'"+tenure+"'"+")";
											 
										        Connection conn = null;
										        try
										        {
										            conn = DriverManager.getConnection(url);
										     
										            /*
										             * Starts : Check whether updated entry existed or not
										             */
										            
						       String fetch_sql = "select  *  from Staffs_Detail where Staff_Id="+"'"+textField_1.getText().toString().toUpperCase()+"'";
										            
						       PreparedStatement check_statement = conn.prepareStatement(fetch_sql);
						       
						       ResultSet rows_count = check_statement .executeQuery();
						       
						       int counter = 0;
						       while(rows_count.next())
						       {
						         counter++;
						       }
										             				         				            				        
										            if (counter < 1)
										            {
										            	
										            
										            JOptionPane.showMessageDialog(null, "Staff  Doesn't  Exist !!!", "Prison Management System", 1);
											           				       		
									            }
									          
										            else
										            {
									   		        
										            /*
										             * Ends : Check entry existed already or not
										             */	   	
															           
										            String sql3 = "update Staffs_Detail  set Staff_Name="+"'"+ textField_2.getText().toString().toUpperCase() +"'"+"  where Staff_Id= "+"'"+textField_1.getText().toString().toUpperCase()+"'";
									            	
										           Statement statement3 = conn.createStatement();
									            	
									            try
									            {
										            statement3.execute(sql3);
										            
										           
										         
										               
										                JOptionPane.showMessageDialog(null, "Details Updated Successfully !!!", "Prison Management System", 1);
										           
									            }
									            
									            catch(Exception e2)
									            {
										        
										                JOptionPane.showMessageDialog(null, "Please try again, Technical Error !!!", "Prison Management System", 1);
												           
									            }
											       		
							
										            }
										        }
										        
										catch (SQLException sqliteex) {
										            System.out.println(sqliteex.getMessage());
										        }
										
										/*
										 * Code Ends : Create Database connection
										 */
											
					                	  
					                	  
					                	  
					                	  
					                  }
			                	 
			                	

			                	    else    if( list.getSelectedValue()== "Date Of  Joining" )
					                  {
					                	  
					                	  
					                	  /*
											 * Code Starts : Create Database connection
											 */
											
											/*
											 * 
											 *  Important Note : 
											 *  
											 *  For Test Path Url Would be -
											 *  
											 *  	
											 *  
											 *  
											 *    For Executable Jar  Url Would be -
											 *  
											 *  	 String url = "jdbc:sqlite::resource:Prison_Management_System.db";
											 */
											
											String url = "jdbc:sqlite::resource:Prison_Management_System.db";
											// String sql = "insert into Admin_Details values ('"+ adminid+"'"+","+"'"+adminname+"'"+","+"'"+doj+"'"+","+"'"+tenure+"'"+")";
											 
										        Connection conn = null;
										        try
										        {
										            conn = DriverManager.getConnection(url);
										     
										            /*
										             * Starts : Check whether updated entry existed or not
										             */
										            
						       String fetch_sql = "select  *  from Staffs_Detail where Staff_Id="+"'"+textField_1.getText().toString().toUpperCase()+"'";
										            
						       PreparedStatement check_statement = conn.prepareStatement(fetch_sql);
						       
						       ResultSet rows_count = check_statement .executeQuery();
						       
						       int counter = 0;
						       while(rows_count.next())
						       {
						         counter++;
						       }
										             				         				            				        
										            if (counter < 1)
										            {
										            	
										            
										            JOptionPane.showMessageDialog(null, "Staff  Doesn't  Exist !!!", "Prison Management System", 1);
											           				       		
									            }
									          
										            else
										            {
									   		        
										            /*
										             * Ends : Check entry existed already or not
										             */	   	
															           
										            String sql3 = "update Staffs_Detail  set Date_Of_Joining="+"'"+ textField_2.getText().toString().toUpperCase() +"'"+"  where Staff_Id= "+"'"+textField_1.getText().toString().toUpperCase()+"'";
									            	
										           Statement statement3 = conn.createStatement();
									            	
									            try
									            {
										            statement3.execute(sql3);
										            
										           
										         
										               
										                JOptionPane.showMessageDialog(null, "Details Updated Successfully !!!", "Prison Management System", 1);
										           
									            }
									            
									            catch(Exception e2)
									            {
										        
										                JOptionPane.showMessageDialog(null, "Please try again, Technical Error !!!", "Prison Management System", 1);
												           
									            }
											       		
							
										            }
										        }
										        
										catch (SQLException sqliteex) {
										            System.out.println(sqliteex.getMessage());
										        }
										
										/*
										 * Code Ends : Create Database connection
										 */
											
					                	  
					                	  
					                	  
					                	  
					                  }

			                	    else    if( list.getSelectedValue()== "Age" )
					                  {
					                	  
					                	  
					                	  /*
											 * Code Starts : Create Database connection
											 */
											
											/*
											 * 
											 *  Important Note : 
											 *  
											 *  For Test Path Url Would be -
											 *  
											 *  	
											 *  
											 *  
											 *    For Executable Jar  Url Would be -
											 *  
											 *  	 String url = "jdbc:sqlite::resource:Prison_Management_System.db";
											 */
											
											String url = "jdbc:sqlite::resource:Prison_Management_System.db";
											// String sql = "insert into Admin_Details values ('"+ adminid+"'"+","+"'"+adminname+"'"+","+"'"+doj+"'"+","+"'"+tenure+"'"+")";
											 
										        Connection conn = null;
										        try
										        {
										            conn = DriverManager.getConnection(url);
										     
										            /*
										             * Starts : Check whether updated entry existed or not
										             */
										            
						       String fetch_sql = "select  *  from Staffs_Detail where Staff_Id="+"'"+textField_1.getText().toString().toUpperCase()+"'";
										            
						       PreparedStatement check_statement = conn.prepareStatement(fetch_sql);
						       
						       ResultSet rows_count = check_statement .executeQuery();
						       
						       int counter = 0;
						       while(rows_count.next())
						       {
						         counter++;
						       }
										             				         				            				        
										            if (counter < 1)
										            {
										            	
										            
										            JOptionPane.showMessageDialog(null, "Staff  Doesn't  Exist !!!", "Prison Management System", 1);
											           				       		
									            }
									          
										            else
										            {
									   		        
										            /*
										             * Ends : Check entry existed already or not
										             */	   	
															           
										            String sql3 = "update Staffs_Detail  set Age="+"'"+ textField_2.getText().toString().toUpperCase() +"'"+"  where Staff_Id= "+"'"+textField_1.getText().toString().toUpperCase()+"'";
									            	
										           Statement statement3 = conn.createStatement();
									            	
									            try
									            {
										            statement3.execute(sql3);
										            
										           
										         
										               
										                JOptionPane.showMessageDialog(null, "Details Updated Successfully !!!", "Prison Management System", 1);
										           
									            }
									            
									            catch(Exception e2)
									            {
										        
										                JOptionPane.showMessageDialog(null, "Please try again, Technical Error !!!", "Prison Management System", 1);
												           
									            }
											       		
							
										            }
										        }
										        
										catch (SQLException sqliteex) {
										            System.out.println(sqliteex.getMessage());
										        }
										
										/*
										 * Code Ends : Create Database connection
										 */
											
					                	  
					                	  
					                	  
					                	  
					                  }

			                	    else    if( list.getSelectedValue()== "Date Of Birth" )
					                  {
					                	  
					                	  
					                	  /*
											 * Code Starts : Create Database connection
											 */
											
											/*
											 * 
											 *  Important Note : 
											 *  
											 *  For Test Path Url Would be -
											 *  
											 *  	
											 *  
											 *  
											 *    For Executable Jar  Url Would be -
											 *  
											 *  	 String url = "jdbc:sqlite::resource:Prison_Management_System.db";
											 */
											
											String url = "jdbc:sqlite::resource:Prison_Management_System.db";
											// String sql = "insert into Admin_Details values ('"+ adminid+"'"+","+"'"+adminname+"'"+","+"'"+doj+"'"+","+"'"+tenure+"'"+")";
											 
										        Connection conn = null;
										        try
										        {
										            conn = DriverManager.getConnection(url);
										     
										            /*
										             * Starts : Check whether updated entry existed or not
										             */
										            
						       String fetch_sql = "select  *  from Staffs_Detail where Staff_Id="+"'"+textField_1.getText().toString().toUpperCase()+"'";
										            
						       PreparedStatement check_statement = conn.prepareStatement(fetch_sql);
						       
						       ResultSet rows_count = check_statement .executeQuery();
						       
						       int counter = 0;
						       while(rows_count.next())
						       {
						         counter++;
						       }
										             				         				            				        
										            if (counter < 1)
										            {
										            	
										            
										            JOptionPane.showMessageDialog(null, "Staff  Doesn't  Exist !!!", "Prison Management System", 1);
											           				       		
									            }
									          
										            else
										            {
									   		        
										            /*
										             * Ends : Check entry existed already or not
										             */	   	
															           
										            String sql3 = "update Staffs_Detail  set Date_Of_Birth="+"'"+ textField_2.getText().toString().toUpperCase() +"'"+"  where Staff_Id= "+"'"+textField_1.getText().toString().toUpperCase()+"'";
									            	
										           Statement statement3 = conn.createStatement();
									            	
									            try
									            {
										            statement3.execute(sql3);
										            
										           
										         
										               
										                JOptionPane.showMessageDialog(null, "Details Updated Successfully !!!", "Prison Management System", 1);
										           
									            }
									            
									            catch(Exception e2)
									            {
										        
										                JOptionPane.showMessageDialog(null, "Please try again, Technical Error !!!", "Prison Management System", 1);
												           
									            }
											       		
							
										            }
										        }
										        
										catch (SQLException sqliteex) {
										            System.out.println(sqliteex.getMessage());
										        }
										
										/*
										 * Code Ends : Create Database connection
										 */
											
					                	  
					                	  
					                	  
					                	  
					                  }

			                	    else    if( list.getSelectedValue()== "Ward Alloted" )
					                  {
					                	  
					                	  
					                	  /*
											 * Code Starts : Create Database connection
											 */
											
											/*
											 * 
											 *  Important Note : 
											 *  
											 *  For Test Path Url Would be -
											 *  
											 *  	
											 *  
											 *  
											 *    For Executable Jar  Url Would be -
											 *  
											 *  	 String url = "jdbc:sqlite::resource:Prison_Management_System.db";
											 */
											
											String url = "jdbc:sqlite::resource:Prison_Management_System.db";
											// String sql = "insert into Admin_Details values ('"+ adminid+"'"+","+"'"+adminname+"'"+","+"'"+doj+"'"+","+"'"+tenure+"'"+")";
											 
										        Connection conn = null;
										        try
										        {
										            conn = DriverManager.getConnection(url);
										     
										            /*
										             * Starts : Check whether updated entry existed or not
										             */
										            
						       String fetch_sql = "select  *  from Staffs_Detail where Staff_Id="+"'"+textField_1.getText().toString().toUpperCase()+"'";
										            
						       PreparedStatement check_statement = conn.prepareStatement(fetch_sql);
						       
						       ResultSet rows_count = check_statement .executeQuery();
						       
						       int counter = 0;
						       while(rows_count.next())
						       {
						         counter++;
						       }
										             				         				            				        
										            if (counter < 1)
										            {
										            	
										            
										            JOptionPane.showMessageDialog(null, "Staff  Doesn't  Exist !!!", "Prison Management System", 1);
											           				       		
									            }
									          
										            else
										            {
									   		        
										            /*
										             * Ends : Check entry existed already or not
										             */	   	
															           
										            String sql3 = "update Staffs_Detail  set Ward_Allot="+"'"+ textField_2.getText().toString().toUpperCase() +"'"+"  where Staff_Id= "+"'"+textField_1.getText().toString().toUpperCase()+"'";
									            	
										           Statement statement3 = conn.createStatement();
									            	
									            try
									            {
										            statement3.execute(sql3);
										            
										           
										         
										               
										                JOptionPane.showMessageDialog(null, "Details Updated Successfully !!!", "Prison Management System", 1);
										           
									            }
									            
									            catch(Exception e2)
									            {
										        
										                JOptionPane.showMessageDialog(null, "Please try again, Technical Error !!!", "Prison Management System", 1);
												           
									            }
											       		
							
										            }
										        }
										        
										catch (SQLException sqliteex) {
										            System.out.println(sqliteex.getMessage());
										        }
										
										/*
										 * Code Ends : Create Database connection
										 */
											
					                	  
					                	  
					                	  
					                	  
					                  }

			                	    else    if( list.getSelectedValue()== "Shift" )
					                  {
					                	  
					                	  
					                	  /*
											 * Code Starts : Create Database connection
											 */
											
											/*
											 * 
											 *  Important Note : 
											 *  
											 *  For Test Path Url Would be -
											 *  
											 *  	
											 *  
											 *  
											 *    For Executable Jar  Url Would be -
											 *  
											 *  	 String url = "jdbc:sqlite::resource:Prison_Management_System.db";
											 */
											
											String url = "jdbc:sqlite::resource:Prison_Management_System.db";
											// String sql = "insert into Admin_Details values ('"+ adminid+"'"+","+"'"+adminname+"'"+","+"'"+doj+"'"+","+"'"+tenure+"'"+")";
											 
										        Connection conn = null;
										        try
										        {
										            conn = DriverManager.getConnection(url);
										     
										            /*
										             * Starts : Check whether updated entry existed or not
										             */
										            
						       String fetch_sql = "select  *  from Staffs_Detail where Staff_Id="+"'"+textField_1.getText().toString().toUpperCase()+"'";
										            
						       PreparedStatement check_statement = conn.prepareStatement(fetch_sql);
						       
						       ResultSet rows_count = check_statement .executeQuery();
						       
						       int counter = 0;
						       while(rows_count.next())
						       {
						         counter++;
						       }
										             				         				            				        
										            if (counter < 1)
										            {
										            	
										            
										            JOptionPane.showMessageDialog(null, "Staff  Doesn't  Exist !!!", "Prison Management System", 1);
											           				       		
									            }
									          
										            else
										            {
									   		        
										            /*
										             * Ends : Check entry existed already or not
										             */	   	
															           
										            String sql3 = "update Staffs_Detail  set Shift="+"'"+ textField_2.getText().toString().toUpperCase() +"'"+"  where Staff_Id= "+"'"+textField_1.getText().toString().toUpperCase()+"'";
									            	
										           Statement statement3 = conn.createStatement();
									            	
									            try
									            {
										            statement3.execute(sql3);
										            
										           
										         
										               
										                JOptionPane.showMessageDialog(null, "Details Updated Successfully !!!", "Prison Management System", 1);
										           
									            }
									            
									            catch(Exception e2)
									            {
										        
										                JOptionPane.showMessageDialog(null, "Please try again, Technical Error !!!", "Prison Management System", 1);
												           
									            }
											       		
							
										            }
										        }
										        
										catch (SQLException sqliteex) {
										            System.out.println(sqliteex.getMessage());
										        }
										
										/*
										 * Code Ends : Create Database connection
										 */
											
					                	  
					                	  
					                	  
					                	  
					                  }
			                	 
			                    
			                 }  //  Main 'If' ends // to check whther field need to modify selected or not
						
						
					}
				});
				btnNewButton.setForeground(Color.GRAY);
				btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 20));
				btnNewButton.setBounds(497, 387, 152, 33);
				MSD_Core_Panel.add(btnNewButton);
				
				/*************************************************/
				
				
				
			
			

		 		
		 	}
		 });
		sd.add(msd);
		
		// dsd = new JMenuItem("Delete Staff Detail");
		//sd.add(dsd);
		
		
		

		JMenu pwd = new JMenu(" Wards  Detail");
		pwd.setForeground(Color.GRAY);
		pwd.setFont(new Font("Segoe UI", Font.BOLD, 15));
		menuBar.add(pwd);
		
	 vwd = new JMenuItem("View Wards Detail");
	 vwd.addActionListener(new ActionListener() {
	 	public void actionPerformed(ActionEvent e)
	 	{
	 		
			/*
			 * On click event of menu item follow two way process
			 * 
			 * first we need to - set the visiblity of main Panel inside Frame
			 * Off.
			 * So that we can so the desire Pannel inside Frame.
			 * 
			 * Second we need to - "disabled" the clicked 'Menu' / 'MenuItems'.
			 * 
			 * 
			 * Third  we need to - Enabled the all 'Menu or MenuItems' other than
			 * the clicked one.
			 * 
			 * Let's check the below code
			 */
			
		/*	first we need to - set the visiblity of main Panel inside Frame
			  Off.
			  */
			
	 		/*
	 		 * 
	 		 * Important Note - when whever we move to new link by clicking on it
	 		 * we always use contentPane.setVisible(false)  to clear data
	 		 * 
	 		 * this command will all data except MenuItems.
	 		 * 
	 		 */
	 		
	 		contentPane.setVisible(false);
	 		
			
		/*	Second we need to - "disabled" the clicked 'Menu' / 'MenuItems'.
		 * 
		 */
			
			
			vwd.setEnabled(false);
			
			/*Third  we need to - Enabled the all 'Menu or MenuItems' other than
			 * the clicked one.
			 */
			
			
			/*
			 * Below are the varialbles of MenuItem of
			 * Administrators Detail
			 */
			
		vad.setEnabled(true);
			 sad.setEnabled(true);
		 aad.setEnabled(true);
			 mad.setEnabled(true);
		//	 dad.setEnabled(true);
			
			
			/*
			 * Below are the varialbles of MenuItem of
			 * Prisoners Detail
			 */
			
			 vmd.setEnabled(true);
			smd.setEnabled(true);
			amd.setEnabled(true);
		 md.setEnabled(true);

			
			/*
			 * Below are the varialbles of MenuItem of
			 * Staffs Detail
			 */
			
			vsd.setEnabled(true);
			 ssd.setEnabled(true);
			  asd.setEnabled(true);
			 msd.setEnabled(true);
			//dsd.setEnabled(true);

			
			
			/*
			 * Below are the varialbles of MenuItem of
			 * Staffs Detail
			 */
			
			// vwd.setEnabled(true);
			 swd.setEnabled(true);
			 anw.setEnabled(true);
		 mwd.setEnabled(true);
		//	  dwd.setEnabled(true);

			
			/*
			 * Below are the varialbles of Menu  of
			 * our application
			 */
			  mnHome.setEnabled(true);
			
			cu.setEnabled(true);
	

			/* ++++++++++++++++++++++++++++++++++++++++++++++
			 * 
			 * 
			 *  Code Starts : Now we are good to go to show the content
			 * related to the clicked link
			 * 
			 * 
			 ++++++++++++++++++++++++++++++++++++++++++++++++*/
	
			// This is our core Panel over which we will
			// perform all our design work
			
			VWD_Core_Panel = new JPanel();
			VWD_Core_Panel.setBounds(0, 0, 1183, 525);
			
			
			VWD_Core_Panel.setBorder(new EmptyBorder(5, 5, 5, 5));
			setContentPane(VWD_Core_Panel);
			
			
			// Now we will set "Absolute Layout"  so that 
			// we can place our elements on frame  as per 
			// the desire  X-Coordinates and Y- Coordinates
	
			
			
			VWD_Core_Panel.setLayout(null);
			
			/* ++++++++++++++++++++++++++++++++++++++++++++++
			 * 
			 * 
			 *  Code Starts : Now we are good to go to show the content
			 * related to the clicked link
			 * 
			 * 
			 ++++++++++++++++++++++++++++++++++++++++++++++++*/
			
			/************Table code*********************/
			
			
			/*************************************************/
			
			JPanel panel = new JPanel();
			panel.setBounds(0, 0, 1183, 525);
			VWD_Core_Panel.add(panel);
			panel.setLayout(null);
			
			JLabel lblNewLabel = new JLabel("View Wards Detail");
			lblNewLabel.setForeground(Color.GRAY);
			lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 35));
			lblNewLabel.setBounds(327, 21, 433, 77);
			panel.add(lblNewLabel);
			
			JScrollPane scrollPane = new JScrollPane();
			scrollPane.setBounds(74, 97, 1036, 400);
			panel.add(scrollPane);
			
			JTable table = new JTable();
			scrollPane.setViewportView(table);
			
			

			
			/*
			 * Code Starts : Create Database connection
			 */
			
			/*
			 * 
			 *  Important Note : 
			 *  
			 *  For Test Path Url Would be -
			 *  
			 *  	 
			 *  
			 *    For Executable Jar  Url Would be -
			 *  
			 *  	 String url = "jdbc:sqlite::resource:Prison_Management_System.db";
			 */
			
			 String url = "jdbc:sqlite::resource:Prison_Management_System.db";
			 String sql = "select * from  Wards_Detail";
			 
		        Connection conn = null;
		        try {
		            conn = DriverManager.getConnection(url);
		     
		        		   		        
		                PreparedStatement pstmt = conn.prepareStatement(sql);
		         
		          //  pstmt.executeUpdate();

	ResultSet rs = pstmt.executeQuery();

	  table.setModel(DbUtils.resultSetToTableModel(rs));

	/*

	For Modelling ResultSet into table we will 
	use rs2XML jar file, it's a class file
	which help in modelling result set into Table.

	*/

		        } 
		catch (SQLException sqliteex) {
		            System.out.println(sqliteex.getMessage());
		        }
		
		/*
		 * Code Ends : Create Database connection
		 */

		
	 		
	 	}
	 });
		pwd.add(vwd);
		
	swd = new JMenuItem("Search Ward Detail");
	swd.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) 
		{
			
			/*
			 * On click event of menu item follow two way process
			 * 
			 * first we need to - set the visiblity of main Panel inside Frame
			 * Off.
			 * So that we can so the desire Pannel inside Frame.
			 * 
			 * Second we need to - "disabled" the clicked 'Menu' / 'MenuItems'.
			 * 
			 * 
			 * Third  we need to - Enabled the all 'Menu or MenuItems' other than
			 * the clicked one.
			 * 
			 * Let's check the below code
			 */
			
		/*	first we need to - set the visiblity of main Panel inside Frame
			  Off.
			  */
			
	 		/*
	 		 * 
	 		 * Important Note - when whever we move to new link by clicking on it
	 		 * we always use contentPane.setVisible(false)  to clear data
	 		 * 
	 		 * this command will all data except MenuItems.
	 		 * 
	 		 */
	 		
	 		contentPane.setVisible(false);
	 		
			
		/*	Second we need to - "disabled" the clicked 'Menu' / 'MenuItems'.
		 * 
		 */
			
			
			swd.setEnabled(false);
			
			/*Third  we need to - Enabled the all 'Menu or MenuItems' other than
			 * the clicked one.
			 */
			
			
			/*
			 * Below are the varialbles of MenuItem of
			 * Administrators Detail
			 */
		vad.setEnabled(true);
			 sad.setEnabled(true);
		 aad.setEnabled(true);
			 mad.setEnabled(true);
	//		 dad.setEnabled(true);
			
			
			/*
			 * Below are the varialbles of MenuItem of
			 * Prisoners Detail
			 */
			
			 vmd.setEnabled(true);
			smd.setEnabled(true);
			amd.setEnabled(true);
		 md.setEnabled(true);

			
			/*
			 * Below are the varialbles of MenuItem of
			 * Staffs Detail
			 */
			
			vsd.setEnabled(true);
		 ssd.setEnabled(true);
			  asd.setEnabled(true);
			 msd.setEnabled(true);
	//		dsd.setEnabled(true);

			
			
			/*
			 * Below are the varialbles of MenuItem of
			 * Staffs Detail
			 */
			
			 vwd.setEnabled(true);
			// swd.setEnabled(true);
			 anw.setEnabled(true);
		 mwd.setEnabled(true);
		//	  dwd.setEnabled(true);

			
			/*
			 * Below are the varialbles of Menu  of
			 * our application
			 */
			  mnHome.setEnabled(true);
			
			cu.setEnabled(true);
			
	
			/* ++++++++++++++++++++++++++++++++++++++++++++++
			 * 
			 * 
			 *  Code Starts : Now we are good to go to show the content
			 * related to the clicked link
			 * 
			 * 
			 ++++++++++++++++++++++++++++++++++++++++++++++++*/
	
			// This is our core Panel over which we will
			// perform all our design work
			
			SWD_Core_Panel = new JPanel();
			SWD_Core_Panel.setBounds(0, 0, 1183, 525);
			
			
			SWD_Core_Panel.setBorder(new EmptyBorder(5, 5, 5, 5));
			setContentPane(SWD_Core_Panel);
			
			
			// Now we will set "Absolute Layout"  so that 
			// we can place our elements on frame  as per 
			// the desire  X-Coordinates and Y- Coordinates
	
			
			
			SWD_Core_Panel.setLayout(null);
			
			
	 		
/*************************************************/
			
			JPanel panel = new JPanel();
			panel.setBounds(0, 0, 1183, 525);
			SWD_Core_Panel.add(panel);
			panel.setLayout(null);
			
			JLabel lblNewLabel = new JLabel("Search Ward Detail");
			lblNewLabel.setForeground(Color.GRAY);
			lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 35));
			lblNewLabel.setBounds(327, 21, 433, 77);
			panel.add(lblNewLabel);
			
			JScrollPane scrollPane = new JScrollPane();
			scrollPane.setBounds(10, 231, 1163, 217);
			panel.add(scrollPane);
			
			JTable table = new JTable();
			scrollPane.setViewportView(table);
			
			JLabel lblNewLabel_1 = new JLabel("Enter Ward Code :");
			lblNewLabel_1.setForeground(Color.GRAY);
			lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 22));
			lblNewLabel_1.setBounds(228, 145, 256, 47);
			panel.add(lblNewLabel_1);
			
	
			
			JTextField textField = new JTextField();
			textField.setBounds(482, 154, 168, 37);
			panel.add(textField);
			textField.setColumns(10);
			
			JButton btnNewButton = new JButton("Search");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0)
				{
					
					/*
					 * 
					 * Get text  from input field
					 * 
					 */
					String str = textField.getText().toString().toUpperCase();
					
					/*
					 * Code Starts : Create Database connection
					 */
					
					/*
					 * 
					 *  Important Note : 
					 *  
					 *  For Test Path Url Would be -
					 *  
					 *  	
					 *  
					 *  
					 *    For Executable Jar  Url Would be -
					 *  
					 *  	 String url = "jdbc:sqlite::resource:Prison_Management_System.db";
					 */
					
					String url = "jdbc:sqlite::resource:Prison_Management_System.db";
					 String sql = "select  *  from  Wards_Detail where  Ward_Code="+"'"+str+"'";
					 
				        Connection conn = null;
				        try {
				            conn = DriverManager.getConnection(url);
				     
				        		   		        
				                PreparedStatement pstmt = conn.prepareStatement(sql);
				         
				          //  pstmt.executeUpdate();

			ResultSet rs = pstmt.executeQuery();

			  table.setModel(DbUtils.resultSetToTableModel(rs));

			/*

			For Modelling ResultSet into table we will 
			use rs2XML jar file, it's a class file
			which help in modelling result set into Table.

			*/

				        } 
				catch (SQLException sqliteex) {
				            System.out.println(sqliteex.getMessage());
				        }
				
				/*
				 * Code Ends : Create Database connection
				 */

				
					
				}
			});
			btnNewButton.setForeground(Color.GRAY);
			btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 20));
			btnNewButton.setBounds(688, 153, 102, 33);
			panel.add(btnNewButton);
			
	 		
	 		

			
			
		}
	});
		pwd.add(swd);
		
	 anw = new JMenuItem("Add New Ward");
	 anw.addActionListener(new ActionListener() {
	 	public void actionPerformed(ActionEvent e)
	 	{
	 		

			/*
			 * On click event of menu item follow two way process
			 * 
			 * first we need to - set the visiblity of main Panel inside Frame
			 * Off.
			 * So that we can so the desire Pannel inside Frame.
			 * 
			 * Second we need to - "disabled" the clicked 'Menu' / 'MenuItems'.
			 * 
			 * 
			 * Third  we need to - Enabled the all 'Menu or MenuItems' other than
			 * the clicked one.
			 * 
			 * Let's check the below code
			 */
			
		/*	first we need to - set the visiblity of main Panel inside Frame
			  Off.
			  */
			
	 		/*
	 		 * 
	 		 * Important Note - when whever we move to new link by clicking on it
	 		 * we always use contentPane.setVisible(false)  to clear data
	 		 * 
	 		 * this command will all data except MenuItems.
	 		 * 
	 		 */
	 		
	 		contentPane.setVisible(false);
	 		
			
		/*	Second we need to - "disabled" the clicked 'Menu' / 'MenuItems'.
		 * 
		 */
			
			
			anw.setEnabled(false);
			
			/*Third  we need to - Enabled the all 'Menu or MenuItems' other than
			 * the clicked one.
			 */
			
			
			/*
			 * Below are the varialbles of MenuItem of
			 * Administrators Detail
			 */
		vad.setEnabled(true);
			sad.setEnabled(true);
	aad.setEnabled(true);
			 mad.setEnabled(true);
		//	 dad.setEnabled(true);
			
			
			/*
			 * Below are the varialbles of MenuItem of
			 * Prisoners Detail
			 */
			
			 vmd.setEnabled(true);
		smd.setEnabled(true);
			amd.setEnabled(true);
		 md.setEnabled(true);

			
			/*
			 * Below are the varialbles of MenuItem of
			 * Staffs Detail
			 */
			
			vsd.setEnabled(true);
			 ssd.setEnabled(true);
			asd.setEnabled(true);
			 msd.setEnabled(true);
	//	dsd.setEnabled(true);

			
			
			/*
			 * Below are the varialbles of MenuItem of
			 * Wards Detail
			 */
			
			 vwd.setEnabled(true);
			 swd.setEnabled(true);
			// anw.setEnabled(true);
		 mwd.setEnabled(true);
		//	  dwd.setEnabled(true);

			
			/*
			 * Below are the varialbles of Menu  of
			 * our application
			 */
			  mnHome.setEnabled(true);
			
			cu.setEnabled(true);
			
	
			/* ++++++++++++++++++++++++++++++++++++++++++++++
			 * 
			 * 
			 *  Code Starts : Now we are good to go to show the content
			 * related to the clicked link
			 * 
			 * 
			 ++++++++++++++++++++++++++++++++++++++++++++++++*/
	
			// This is our core Panel over which we will
			// perform all our design work
			
			AWD_Core_Panel = new JPanel();
			AWD_Core_Panel.setBounds(0, 0, 1183, 525);
			
			
			AWD_Core_Panel.setBorder(new EmptyBorder(5, 5, 5, 5));
			setContentPane(AWD_Core_Panel);
			
			
			// Now we will set "Absolute Layout"  so that 
			// we can place our elements on frame  as per 
			// the desire  X-Coordinates and Y- Coordinates
	
			
			
			AWD_Core_Panel.setLayout(null);
			
			
			/*************************************************/
			
			/********************************************************/
			
			JLabel lblNewLabel = new JLabel("Add Ward Detail");
			lblNewLabel.setForeground(Color.GRAY);
			lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 35));
			lblNewLabel.setBounds(426, 28, 309, 54);
			AWD_Core_Panel.add(lblNewLabel);
			
			JLabel lblNewLabel_1 = new JLabel("Ward Code :");
			lblNewLabel_1.setForeground(Color.GRAY);
			lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
			lblNewLabel_1.setBounds(164, 116, 120, 25);
			AWD_Core_Panel.add(lblNewLabel_1);
			
			JLabel lblNewLabel_2 = new JLabel("Number Of Cells :");
			lblNewLabel_2.setForeground(Color.GRAY);
			lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 20));
			lblNewLabel_2.setBounds(110, 220, 190, 33);
			AWD_Core_Panel.add(lblNewLabel_2);
			
			JLabel lblNewLabel_3 = new JLabel("Per Cell Prisoners :");
			lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 20));
			lblNewLabel_3.setForeground(Color.GRAY);
			lblNewLabel_3.setBounds(590, 109, 195, 39);
			AWD_Core_Panel.add(lblNewLabel_3);
			
			JLabel lblNewLabel_4 = new JLabel("Total Prisoners :");
			lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 20));
			lblNewLabel_4.setForeground(Color.GRAY);
			lblNewLabel_4.setBounds(596, 210, 173, 43);
			AWD_Core_Panel.add(lblNewLabel_4);
			
			JTextField textField_1 = new JTextField();
			textField_1.setBounds(326, 113, 174, 36);
			AWD_Core_Panel.add(textField_1);
			textField_1.setColumns(10);
			
			JTextField txtEx = new JTextField();
			txtEx.setForeground(Color.LIGHT_GRAY);
			txtEx.setHorizontalAlignment(SwingConstants.LEFT);
			txtEx.setBounds(326, 220, 174, 36);
			AWD_Core_Panel.add(txtEx);
			txtEx.setColumns(10);
			
			JTextField textField_3 = new JTextField();
			textField_3.setBounds(795, 113, 181, 36);
			AWD_Core_Panel.add(textField_3);
			textField_3.setColumns(10);
			
			JTextField textField_4 = new JTextField();
			textField_4.setBounds(795, 220, 181, 36);
			AWD_Core_Panel.add(textField_4);
			textField_4.setColumns(10);
			
			JLabel lblNewLabel_6 = new JLabel("Ward Officer :");
			lblNewLabel_6.setFont(new Font("Times New Roman", Font.BOLD, 20));
			lblNewLabel_6.setForeground(Color.GRAY);
			lblNewLabel_6.setBounds(132, 330, 152, 26);
			AWD_Core_Panel.add(lblNewLabel_6);
			
			JTextField textField_2 = new JTextField();
			textField_2.setBounds(326, 320, 167, 37);
			AWD_Core_Panel.add(textField_2);
			textField_2.setColumns(10);
			
			/*
			JLabel lblNewLabel_7 = new JLabel("Date Of Birth :");
			lblNewLabel_7.setForeground(Color.GRAY);
			lblNewLabel_7.setFont(new Font("Times New Roman", Font.BOLD, 20));
			lblNewLabel_7.setBounds(89, 193, 195, 25);
			AWD_Core_Panel.add(lblNewLabel_7);
			
			JTextField textField_5 = new JTextField();
			textField_5.setBounds(326, 189, 174, 33);
			AWD_Core_Panel.add(textField_5);
			textField_5.setColumns(10);
			
			JLabel lblNewLabel_8 = new JLabel("Shift :");
			lblNewLabel_8.setForeground(Color.GRAY);
			lblNewLabel_8.setFont(new Font("Times New Roman", Font.BOLD, 20));
			lblNewLabel_8.setBounds(596, 189, 173, 33);
			AWD_Core_Panel.add(lblNewLabel_8);
			
			JTextField textField_6 = new JTextField();
			textField_6.setBounds(795, 189, 181, 33);
			AWD_Core_Panel.add(textField_6);
			textField_6.setColumns(10);
			*/
			/*
			JLabel lblNewLabel_9 = new JLabel("Remark :");
			lblNewLabel_9.setFont(new Font("Times New Roman", Font.BOLD, 20));
			lblNewLabel_9.setForeground(Color.GRAY);
			lblNewLabel_9.setBounds(655, 362, 92, 33);
			ASD_Core_Panel.add(lblNewLabel_9);
			
			
			JTextField textField_7 = new JTextField();
			textField_7.setBounds(795, 355, 167, 33);
			ASD_Core_Panel.add(textField_7);
			textField_7.setColumns(10);
			
			*/
			
			JButton btnNewButton = new JButton("Add");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) 
				{
					
					
					/*
					 * 
					 * Get text  from input field
					 * 
					 */
					String  wc = textField_1.getText().toString().toUpperCase();
					
					int  pcp = Integer.parseInt(textField_3.getText().toString());
					
					int noc = Integer.parseInt(txtEx.getText().toString().toUpperCase());
					
				//	String  dob = textField_5.getText().toString();
					
                  int  tp = Integer.parseInt(textField_4.getText().toString());
					
					String  wo = textField_2.getText().toString();
					
		//			String shift= textField_6.getText().toString().toUpperCase();
					
				//	String rem = textField_7.getText().toString();
					
					/*
					 * Code Starts : Create Database connection
					 */
					
					/*
					 * 
					 *  Important Note : 
					 *  
					 *  For Test Path Url Would be -
					 *  
					 *  	
					 *  
					 *  
					 *    For Executable Jar  Url Would be -
					 *  
					 *  	 String url = "jdbc:sqlite::resource:Prison_Management_System.db";
					 */
					
					String url = "jdbc:sqlite::resource:Prison_Management_System.db";
					// String sql = "insert into Admin_Details values ('"+ adminid+"'"+","+"'"+adminname+"'"+","+"'"+doj+"'"+","+"'"+tenure+"'"+")";
					 
				        Connection conn = null;
				        try
				        {
				            conn = DriverManager.getConnection(url);
				     
				        		   		        
				            /*
				             * Starts : Check entry existed already or not
				             */
				            
       String fetch_sql = "select  *  from Wards_Detail where Ward_Code="+"'"+wc+"'";
				            
       PreparedStatement check_statement = conn.prepareStatement(fetch_sql);
       
       ResultSet rows_count = check_statement .executeQuery();
       
       int counter = 0;
       while(rows_count.next())
       {
         counter++;
       }
				             				         				            				        
				            if (counter > 0)
				            {
				            	
				            
				            JOptionPane.showMessageDialog(null, "Ward  Already Exist !!!", "Prison Management System", 1);
					           				       		
			            }
			          
				            else
				            {
			   		        
				            /*
				             * Ends : Check entry existed already or not
				             */
				            
				            String sql = "INSERT INTO Wards_Detail (Ward_Code, Number_Of_Cells, Per_Cell_Prisoners, Total_Prisoners,Ward_Officer) VALUES (?, ?, ?,?, ?)";
				            
				            PreparedStatement statement = conn.prepareStatement(sql);
				            statement.setString(1, wc);
				            statement.setInt(2, noc);
				            statement.setInt(3, pcp);
				      ///      statement.setString(4, dob);
				            
				            statement.setInt(4, tp);
				            statement.setString(5, wo);
				       //     statement.setString(7, shift);
				        //    statement.setString(8, rem);
				             
				            int rowsInserted = statement.executeUpdate();
				            if (rowsInserted > 0)
				            {
				            //    System.out.println("A new user was inserted successfully!");
				            
				            	
				            	/*
				            	 * Code Starts : Update Ward Table  if query get successfule
				            	 */
				            	
				            	//String url = "jdbc:sqlite::resource:Prison_Management_System.db";
								
							   //    Connection conn2 = null;
				          //  try
				         //   {
				            //	 conn2 = DriverManager.getConnection(url);
							     
				            	
				            //	String sql1 = "select Per_Cell_Prisoners from Wards_Detail where Ward_Code="+"'"+wa+"'";
				            	
				            	// PreparedStatement statement2 = conn2.prepareStatement(sql1);
					            
			            //	ResultSet rs2 = statement2.executeQuery();
			            	
			            	
			            //	int current_prisoners_perCell = rs2.getInt("Per_Cell_Prisoners");
			            	
			            //	int new_value_prisoners_perCell = current_prisoners_perCell +  1;
			            	
			            	
			            	// Get total number of cells in a Ward
			            	
			            	//String sql4 = "select Number_Of_Cells from Wards_Detail where Ward_Code="+"'"+wa+"'";
			            	
			            //	 PreparedStatement statement4 = conn2.prepareStatement(sql4);
				            
		            //	ResultSet rs4 = statement4.executeQuery();
		            	
		            	
		            //	int current_value_number_Cell = rs4.getInt("Number_Of_Cells");
			            	
			            	/*
			            	 * 
			            	 * Now we will update new value in Ward Table and Total number of prisoners also
			            	 */
			            	
			         //   	String sql3 = "update Wards_Detail  set Ward_Officer="+"'"+sname +"'"+"  where Ward_Code= "+"'"+wa+"'";
			            	
			            	//String sql6 = "update Wards_Detail  set Total_Prisoners="+"'"+new_value_prisoners_perCell*current_value_number_Cell +"'"+"  where Ward_Code= "+"'"+wa+"'";
			            	
			         //   	 PreparedStatement statement3 = conn2.prepareStatement(sql3);
			            	 
			            	// PreparedStatement statement6 = conn2.prepareStatement(sql6);
			            	 
			       //     	 statement3.executeUpdate();
			            	 
			            //	 statement6.executeUpdate();
			            	
			            //	System.out.println("Per Cell : "+current_prisoners_perCell);
			            	
				    //        }
				    //        catch(Exception ee)
				     //       {
				      //      	System.out.println(ee);	
				       //     }
				            	/*
				            	 * Code Ends : Update Ward Table  if query get successfule
				            	 */
				               
				                JOptionPane.showMessageDialog(null, "Ward  Added Successfully !!!", "Prison Management System", 1);
				           
					       						       		
				            }
				            else
				            {
				                JOptionPane.showMessageDialog(null, "Please try again, Technical Error !!!", "Prison Management System", 1);
						           
				            }
					       		
		//	ResultSet rs = pstmt.executeQuery();

			//  table.setModel(DbUtils.resultSetToTableModel(rs));

			/*

			For Modelling ResultSet into table we will 
			use rs2XML jar file, it's a class file
			which help in modelling result set into Table.

			*/

				        } 
				            
				        }
				catch (SQLException sqliteex) {
				            System.out.println(sqliteex.getMessage());
				        }
				
				
				        
				/*
				 * Code Ends : Create Database connection
				 */
					
					
					
					
				}
			});
			btnNewButton.setForeground(Color.GRAY);
			btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 20));
			btnNewButton.setBounds(518, 420, 152, 33);
			AWD_Core_Panel.add(btnNewButton);
			
		
			
			/*************************************************/
	 		
	 	}
	 });
		pwd.add(anw);
		
	 mwd = new JMenuItem("Modify Ward Detail");
	 mwd.addActionListener(new ActionListener() {
	 	public void actionPerformed(ActionEvent e)
	 	{
	 		

			/*
			 * On click event of menu item follow two way process
			 * 
			 * first we need to - set the visiblity of main Panel inside Frame
			 * Off.
			 * So that we can so the desire Pannel inside Frame.
			 * 
			 * Second we need to - "disabled" the clicked 'Menu' / 'MenuItems'.
			 * 
			 * 
			 * Third  we need to - Enabled the all 'Menu or MenuItems' other than
			 * the clicked one.
			 * 
			 * Let's check the below code
			 */
			
		/*	first we need to - set the visiblity of main Panel inside Frame
			  Off.
			  */
			
	 		/*
	 		 * 
	 		 * Important Note - when whever we move to new link by clicking on it
	 		 * we always use contentPane.setVisible(false)  to clear data
	 		 * 
	 		 * this command will all data except MenuItems.
	 		 * 
	 		 */
	 		
	 		contentPane.setVisible(false);
	 		
			
		/*	Second we need to - "disabled" the clicked 'Menu' / 'MenuItems'.
		 * 
		 */
			
			
			mwd.setEnabled(false);
			
			/*Third  we need to - Enabled the all 'Menu or MenuItems' other than
			 * the clicked one.
			 */
			
			
			/*
			 * Below are the varialbles of MenuItem of
			 * Administrators Detail
			 */
		vad.setEnabled(true);
			sad.setEnabled(true);
	aad.setEnabled(true);
			 mad.setEnabled(true);
		//	 dad.setEnabled(true);
			
			
			/*
			 * Below are the varialbles of MenuItem of
			 * Prisoners Detail
			 */
			
			 vmd.setEnabled(true);
			smd.setEnabled(true);
			amd.setEnabled(true);
	  md.setEnabled(true);

			
			/*
			 * Below are the varialbles of MenuItem of
			 * Staffs Detail
			 */
			
			vsd.setEnabled(true);
			 ssd.setEnabled(true);
			  asd.setEnabled(true);
			msd.setEnabled(true);
	//	dsd.setEnabled(true);

			
			
			/*
			 * Below are the varialbles of MenuItem of
			 * Wards Detail
			 */
			
			 vwd.setEnabled(true);
			 swd.setEnabled(true);
			 anw.setEnabled(true);
		 //mwd.setEnabled(true);
		//	  dwd.setEnabled(true);

			
			/*
			 * Below are the varialbles of Menu  of
			 * our application
			 */
			  mnHome.setEnabled(true);
			
			cu.setEnabled(true);
			
	
			/* ++++++++++++++++++++++++++++++++++++++++++++++
			 * 
			 * 
			 *  Code Starts : Now we are good to go to show the content
			 * related to the clicked link
			 * 
			 * 
			 ++++++++++++++++++++++++++++++++++++++++++++++++*/
	
			// This is our core Panel over which we will
			// perform all our design work
			
			MWD_Core_Panel = new JPanel();
			MWD_Core_Panel.setBounds(0, 0, 1183, 525);
			
			
			MWD_Core_Panel.setBorder(new EmptyBorder(5, 5, 5, 5));
			setContentPane(MWD_Core_Panel);
			
			
			// Now we will set "Absolute Layout"  so that 
			// we can place our elements on frame  as per 
			// the desire  X-Coordinates and Y- Coordinates
	
			
			
			MWD_Core_Panel.setLayout(null);
			
			
			/*************************************************/
			
			
			/********************************************************/
			
			JLabel lblNewLabel = new JLabel("Update Ward  Detail");
			lblNewLabel.setForeground(Color.GRAY);
			lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 35));
			lblNewLabel.setBounds(392, 28, 455, 54);
			MWD_Core_Panel.add(lblNewLabel);
			
			JLabel lblNewLabel_1 = new JLabel("Choose Field :");
			lblNewLabel_1.setForeground(Color.GRAY);
			lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
			lblNewLabel_1.setBounds(323, 133, 120, 25);
			MWD_Core_Panel.add(lblNewLabel_1);
			
			
			
			JLabel lblNewLabel_7 = new JLabel("Enter Ward Code :");
			lblNewLabel_7.setForeground(Color.GRAY);
			lblNewLabel_7.setFont(new Font("Times New Roman", Font.BOLD, 20));
			lblNewLabel_7.setBounds(710, 123, 195, 25);
			MWD_Core_Panel.add(lblNewLabel_7);
			
			
			 DefaultListModel<String> dlm = new DefaultListModel<>();  
	         dlm.addElement("Ward Code");  
	         dlm.addElement("Number Of Cells");  
	         dlm.addElement("Per Cell Prisoner");  
	         
	         
	         dlm.addElement("Total Prisoners");  
	         dlm.addElement("Ward Officer");  
	        
			
	JList<String>  list = new JList<>(dlm);
			list.setBounds(462, 178, 212, 160);
			MWD_Core_Panel.add(list);
			
			JTextField	textField_1 = new JTextField();   // For "Enter Admin ID"
			textField_1.setBounds(710, 169, 182, 34);
			MWD_Core_Panel.add(textField_1);
			textField_1.setColumns(10);
			
			JLabel lblEnterNewValue = new JLabel("Enter New Value :");
			lblEnterNewValue.setForeground(Color.GRAY);
			lblEnterNewValue.setFont(new Font("Times New Roman", Font.BOLD, 20));
			lblEnterNewValue.setBounds(710, 243, 195, 25);
			MWD_Core_Panel.add(lblEnterNewValue);
			
			JTextField textField_2 = new JTextField();  // For "Enter New Value"
			textField_2.setColumns(10);
			textField_2.setBounds(710, 294, 182, 34);
			MWD_Core_Panel.add(textField_2);
			
			JButton btnNewButton = new JButton("Update");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e)
				{
					
				
				       
		                 if (list.getSelectedIndex() != -1)   // to check whether item selected or not
		                 {    
		                	 
		                	 
		                	    if( list.getSelectedValue()== "Ward Code" )
				                  {
				                	  
				                	  
				                	  /*
										 * Code Starts : Create Database connection
										 */
										
										/*
										 * 
										 *  Important Note : 
										 *  
										 *  For Test Path Url Would be -
										 *  
										 *  	
										 *  
										 *  
										 *    For Executable Jar  Url Would be -
										 *  
										 *  	 String url = "jdbc:sqlite::resource:Prison_Management_System.db";
										 */
										
										String url = "jdbc:sqlite::resource:Prison_Management_System.db";
										// String sql = "insert into Admin_Details values ('"+ adminid+"'"+","+"'"+adminname+"'"+","+"'"+doj+"'"+","+"'"+tenure+"'"+")";
										 
									        Connection conn = null;
									        try
									        {
									            conn = DriverManager.getConnection(url);
									     
									            /*
									             * Starts : Check whether updated entry existed or not
									             */
									            
					       String fetch_sql = "select  *  from Wards_Detail where Ward_Code="+"'"+textField_1.getText().toString().toUpperCase()+"'";
									            
					       PreparedStatement check_statement = conn.prepareStatement(fetch_sql);
					       
					       ResultSet rows_count = check_statement .executeQuery();
					       
					       int counter = 0;
					       while(rows_count.next())
					       {
					         counter++;
					       }
									             				         				            				        
									            if (counter < 1)
									            {
									            	
									            
									            JOptionPane.showMessageDialog(null, "Ward  Doesn't  Exist !!!", "Prison Management System", 1);
										           				       		
								            }
								          
									            else
									            {
								   		        
									            /*
									             * Ends : Check entry existed already or not
									             */	   	
														           
									            String sql3 = "update Wards_Detail  set Ward_Code="+"'"+ textField_2.getText().toString().toUpperCase() +"'"+"  where Ward_Code= "+"'"+textField_1.getText().toString().toUpperCase()+"'";
								            	
									           Statement statement3 = conn.createStatement();
								            	
								            try
								            {
									            statement3.execute(sql3);
									            
									           
									         
									               
									                JOptionPane.showMessageDialog(null, "Details Updated Successfully !!!", "Prison Management System", 1);
									           
								            }
								            
								            catch(Exception e2)
								            {
									        
									                JOptionPane.showMessageDialog(null, "Please try again, Technical Error !!!", "Prison Management System", 1);
											           
								            }
										       		
						
									            }
									        }
									        
									catch (SQLException sqliteex) {
									            System.out.println(sqliteex.getMessage());
									        }
									
									/*
									 * Code Ends : Create Database connection
									 */
										
				                	  
				                	  
				                	  
				                	  
				                  }
		                	 
		                	
		                	    else  if( list.getSelectedValue()== "Number Of Cells" )
				                  {
				                	  
				                	  
				                	  /*
										 * Code Starts : Create Database connection
										 */
										
										/*
										 * 
										 *  Important Note : 
										 *  
										 *  For Test Path Url Would be -
										 *  
										 *  	
										 *  
										 *  
										 *    For Executable Jar  Url Would be -
										 *  
										 *  	 String url = "jdbc:sqlite::resource:Prison_Management_System.db";
										 */
										
										String url = "jdbc:sqlite::resource:Prison_Management_System.db";
										// String sql = "insert into Admin_Details values ('"+ adminid+"'"+","+"'"+adminname+"'"+","+"'"+doj+"'"+","+"'"+tenure+"'"+")";
										 
									        Connection conn = null;
									        try
									        {
									            conn = DriverManager.getConnection(url);
									     
									            /*
									             * Starts : Check whether updated entry existed or not
									             */
									            
					       String fetch_sql = "select  *  from Wards_Detail where Ward_Code="+"'"+textField_1.getText().toString().toUpperCase()+"'";
									            
					       PreparedStatement check_statement = conn.prepareStatement(fetch_sql);
					       
					       ResultSet rows_count = check_statement .executeQuery();
					       
					       int counter = 0;
					       while(rows_count.next())
					       {
					         counter++;
					       }
									             				         				            				        
									            if (counter < 1)
									            {
									            	
									            
									            JOptionPane.showMessageDialog(null, "Ward  Doesn't  Exist !!!", "Prison Management System", 1);
										           				       		
								            }
								          
									            else
									            {
								   		        
									            /*
									             * Ends : Check entry existed already or not
									             */	   	
														           
									            String sql3 = "update Wards_Detail  set Number_Of_Cells="+"'"+ textField_2.getText().toString().toUpperCase() +"'"+"  where Ward_Code= "+"'"+textField_1.getText().toString().toUpperCase()+"'";
								            	
									           Statement statement3 = conn.createStatement();
								            	
								            try
								            {
									            statement3.execute(sql3);
									            
									           
									         
									               
									                JOptionPane.showMessageDialog(null, "Details Updated Successfully !!!", "Prison Management System", 1);
									           
								            }
								            
								            catch(Exception e2)
								            {
									        
									                JOptionPane.showMessageDialog(null, "Please try again, Technical Error !!!", "Prison Management System", 1);
											           
								            }
										       		
						
									            }
									        }
									        
									catch (SQLException sqliteex) {
									            System.out.println(sqliteex.getMessage());
									        }
									
									/*
									 * Code Ends : Create Database connection
									 */
										
				                	  
				                	  
				                	  
				                	  
				                  }
		                	 
		                	    
		                	    else   if( list.getSelectedValue()== "Per Cell Prisoner" )
				                  {
				                	  
				                	  
				                	  /*
										 * Code Starts : Create Database connection
										 */
										
										/*
										 * 
										 *  Important Note : 
										 *  
										 *  For Test Path Url Would be -
										 *  
										 *  	
										 *  
										 *  
										 *    For Executable Jar  Url Would be -
										 *  
										 *  	 String url = "jdbc:sqlite::resource:Prison_Management_System.db";
										 */
										
										String url = "jdbc:sqlite::resource:Prison_Management_System.db";
										// String sql = "insert into Admin_Details values ('"+ adminid+"'"+","+"'"+adminname+"'"+","+"'"+doj+"'"+","+"'"+tenure+"'"+")";
										 
									        Connection conn = null;
									        try
									        {
									            conn = DriverManager.getConnection(url);
									     
									            /*
									             * Starts : Check whether updated entry existed or not
									             */
									            
					       String fetch_sql = "select  *  from Wards_Detail where Ward_Code="+"'"+textField_1.getText().toString().toUpperCase()+"'";
									            
					       PreparedStatement check_statement = conn.prepareStatement(fetch_sql);
					       
					       ResultSet rows_count = check_statement .executeQuery();
					       
					       int counter = 0;
					       while(rows_count.next())
					       {
					         counter++;
					       }
									             				         				            				        
									            if (counter < 1)
									            {
									            	
									            
									            JOptionPane.showMessageDialog(null, "Ward  Doesn't  Exist !!!", "Prison Management System", 1);
										           				       		
								            }
								          
									            else
									            {
								   		        
									            /*
									             * Ends : Check entry existed already or not
									             */	   	
														           
									            String sql3 = "update Wards_Detail  set Per_Cell_Prisoners="+"'"+ textField_2.getText().toString().toUpperCase() +"'"+"  where Ward_Code= "+"'"+textField_1.getText().toString().toUpperCase()+"'";
								            	
									           Statement statement3 = conn.createStatement();
								            	
								            try
								            {
									            statement3.execute(sql3);
									            
									           
									         
									               
									                JOptionPane.showMessageDialog(null, "Details Updated Successfully !!!", "Prison Management System", 1);
									           
								            }
								            
								            catch(Exception e2)
								            {
									        
									                JOptionPane.showMessageDialog(null, "Please try again, Technical Error !!!", "Prison Management System", 1);
											           
								            }
										       		
						
									            }
									        }
									        
									catch (SQLException sqliteex) {
									            System.out.println(sqliteex.getMessage());
									        }
									
									/*
									 * Code Ends : Create Database connection
									 */
										
				                	  
				                	  
				                	  
				                	  
				                  }
		                	 
		                	    
		                	    else if( list.getSelectedValue()== "Total Prisoners" )
				                  {
				                	  
				                	  
				                	  /*
										 * Code Starts : Create Database connection
										 */
										
										/*
										 * 
										 *  Important Note : 
										 *  
										 *  For Test Path Url Would be -
										 *  
										 *  	
										 *  
										 *  
										 *    For Executable Jar  Url Would be -
										 *  
										 *  	 String url = "jdbc:sqlite::resource:Prison_Management_System.db";
										 */
										
										String url = "jdbc:sqlite::resource:Prison_Management_System.db";
										// String sql = "insert into Admin_Details values ('"+ adminid+"'"+","+"'"+adminname+"'"+","+"'"+doj+"'"+","+"'"+tenure+"'"+")";
										 
									        Connection conn = null;
									        try
									        {
									            conn = DriverManager.getConnection(url);
									     
									            /*
									             * Starts : Check whether updated entry existed or not
									             */
									            
					       String fetch_sql = "select  *  from Wards_Detail where Ward_Code="+"'"+textField_1.getText().toString().toUpperCase()+"'";
									            
					       PreparedStatement check_statement = conn.prepareStatement(fetch_sql);
					       
					       ResultSet rows_count = check_statement .executeQuery();
					       
					       int counter = 0;
					       while(rows_count.next())
					       {
					         counter++;
					       }
									             				         				            				        
									            if (counter < 1)
									            {
									            	
									            
									            JOptionPane.showMessageDialog(null, "Ward  Doesn't  Exist !!!", "Prison Management System", 1);
										           				       		
								            }
								          
									            else
									            {
								   		        
									            /*
									             * Ends : Check entry existed already or not
									             */	   	
														           
									            String sql3 = "update Wards_Detail  set Total_Prisoners="+"'"+ textField_2.getText().toString().toUpperCase() +"'"+"  where Ward_Code= "+"'"+textField_1.getText().toString().toUpperCase()+"'";
								            	
									           Statement statement3 = conn.createStatement();
								            	
								            try
								            {
									            statement3.execute(sql3);
									            
									           
									         
									               
									                JOptionPane.showMessageDialog(null, "Details Updated Successfully !!!", "Prison Management System", 1);
									           
								            }
								            
								            catch(Exception e2)
								            {
									        
									                JOptionPane.showMessageDialog(null, "Please try again, Technical Error !!!", "Prison Management System", 1);
											           
								            }
										       		
						
									            }
									        }
									        
									catch (SQLException sqliteex) {
									            System.out.println(sqliteex.getMessage());
									        }
									
									/*
									 * Code Ends : Create Database connection
									 */
										
				                	  
				                	  
				                	  
				                	  
				                  }
		                	 
		                	    
		                	    else   if( list.getSelectedValue()== "Ward Officer" )
				                  {
				                	  
				                	  
				                	  /*
										 * Code Starts : Create Database connection
										 */
										
										/*
										 * 
										 *  Important Note : 
										 *  
										 *  For Test Path Url Would be -
										 *  
										 *  	
										 *  
										 *  
										 *    For Executable Jar  Url Would be -
										 *  
										 *  	 String url = "jdbc:sqlite::resource:Prison_Management_System.db";
										 */
										
										String url = "jdbc:sqlite::resource:Prison_Management_System.db";
										// String sql = "insert into Admin_Details values ('"+ adminid+"'"+","+"'"+adminname+"'"+","+"'"+doj+"'"+","+"'"+tenure+"'"+")";
										 
									        Connection conn = null;
									        try
									        {
									            conn = DriverManager.getConnection(url);
									     
									            /*
									             * Starts : Check whether updated entry existed or not
									             */
									            
					       String fetch_sql = "select  *  from Wards_Detail where Ward_Code="+"'"+textField_1.getText().toString().toUpperCase()+"'";
									            
					       PreparedStatement check_statement = conn.prepareStatement(fetch_sql);
					       
					       ResultSet rows_count = check_statement .executeQuery();
					       
					       int counter = 0;
					       while(rows_count.next())
					       {
					         counter++;
					       }
									             				         				            				        
									            if (counter < 1)
									            {
									            	
									            
									            JOptionPane.showMessageDialog(null, "Ward  Doesn't  Exist !!!", "Prison Management System", 1);
										           				       		
								            }
								          
									            else
									            {
								   		        
									            /*
									             * Ends : Check entry existed already or not
									             */	   	
														           
									            String sql3 = "update Wards_Detail  set Ward_Officer="+"'"+ textField_2.getText().toString().toUpperCase() +"'"+"  where Ward_Code= "+"'"+textField_1.getText().toString().toUpperCase()+"'";
								            	
									           Statement statement3 = conn.createStatement();
								            	
								            try
								            {
									            statement3.execute(sql3);
									            
									           
									         
									               
									                JOptionPane.showMessageDialog(null, "Details Updated Successfully !!!", "Prison Management System", 1);
									           
								            }
								            
								            catch(Exception e2)
								            {
									        
									                JOptionPane.showMessageDialog(null, "Please try again, Technical Error !!!", "Prison Management System", 1);
											           
								            }
										       		
						
									            }
									        }
									        
									catch (SQLException sqliteex) {
									            System.out.println(sqliteex.getMessage());
									        }
									
									/*
									 * Code Ends : Create Database connection
									 */
										
				                	  
				                	  
				                	  
				                	  
				                  }
		                	 
		                	    
		                	    
		                	    
		                 }  //  Main 'If' ends // to check whther field need to modify selected or not
					
					
				}
			});
			btnNewButton.setForeground(Color.GRAY);
			btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 20));
			btnNewButton.setBounds(497, 387, 152, 33);
			MWD_Core_Panel.add(btnNewButton);
			
			/*************************************************/
			
			
			
		
		

	 		
	 		
	 		
	 	}
	 });
		pwd.add(mwd);
		
		//dwd = new JMenuItem("Delete Ward Detail");
		//pwd.add(dwd);
		
		
		
		 cu = new JMenu("Contact Us");
		cu.addMenuListener(new MenuListener() {
			public void menuCanceled(MenuEvent e) {
			}
			public void menuDeselected(MenuEvent e) {
			}
			public void menuSelected(MenuEvent e) 
			{
				
				
				/*
				 * On click event of menu item follow two way process
				 * 
				 * first we need to - set the visiblity of main Panel inside Frame
				 * Off.
				 * So that we can so the desire Pannel inside Frame.
				 * 
				 * Second we need to - "disabled" the clicked 'Menu' / 'MenuItems'.
				 * 
				 * 
				 * Third  we need to - Enabled the all 'Menu or MenuItems' other than
				 * the clicked one.
				 */
				
				// First we will Disable the clicked Menu / MenuItem.
				
				cu.setEnabled(false);
				
				
				// Now  we will Enabled the all Menus / MenuItems  other than the clicked one.
				
				/*
				 * Below are the varialbles of MenuItem of
				 * Administrators Detail
				 */
				
			vad.setEnabled(true);
				 sad.setEnabled(true);
			 aad.setEnabled(true);
				 mad.setEnabled(true);
			//	 dad.setEnabled(true);
				
				
				/*
				 * Below are the varialbles of MenuItem of
				 * Prisoners Detail
				 */
				
				 vmd.setEnabled(true);
				smd.setEnabled(true);
				amd.setEnabled(true);
			 md.setEnabled(true);

				
				/*
				 * Below are the varialbles of MenuItem of
				 * Staffs Detail
				 */
				
				//vsd.setEnabled(true);
				 ssd.setEnabled(true);
				  asd.setEnabled(true);
				 msd.setEnabled(true);
			//	dsd.setEnabled(true);

				
				
				/*
				 * Below are the varialbles of MenuItem of
				 * Staffs Detail
				 */
				
				 vwd.setEnabled(true);
				 swd.setEnabled(true);
				 anw.setEnabled(true);
			 mwd.setEnabled(true);
		//		  dwd.setEnabled(true);

				
				/*
				 * Below are the varialbles of Menu  of
				 * our application
				 */
				 
		

				
				mnHome.setEnabled(true);
	/*   ----------------------------------------------------------------------------------------------  */ 			
				
				/* Code Starts :
				 * Hide all current JFrame window i.e landingPage
				 * once we hide all elements then show 
				 * elements of contact us Frame.
				 */
			
			contentPane.setVisible(false);
				
			/* Code Ends :
			 * Hide all current JFrame window i.e landingPage
			 * once we hide all elements then show 
			 * elements of contact us Frame.
			 */
		
			/*
			 * Code Starts :
			 * 
			 * Now as we have already hide all the content of  JFrame
			 * now its time to show content of "Contact us page"
			 * 
			 */
			
			setTitle("Tihar Prison Management Sytem");
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 1189, 577);
			setResizable(false);

			
			
			contentPane = new JPanel();
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			setContentPane(contentPane);
			contentPane.setLayout(null);
			
			main_Panel_without_menuBar = new JPanel();
			main_Panel_without_menuBar.setBackground(new Color(211, 211, 211));
			main_Panel_without_menuBar.setBounds(245, 45, 693, 394);
			contentPane.add(main_Panel_without_menuBar);
			main_Panel_without_menuBar.setLayout(null);
			
			
			
			
			JLabel lblNewLabel = new JLabel("Contact Us");
			lblNewLabel.setForeground(new Color(0, 128, 128));
			lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 35));
			lblNewLabel.setBounds(230, 26, 179, 64);
			main_Panel_without_menuBar.add(lblNewLabel);
			
			JLabel lblNewLabel_1 = new JLabel("Tihar Prison Complex, Tihar Central Jail");
			lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
			lblNewLabel_1.setBounds(184, 121, 329, 42);
			main_Panel_without_menuBar.add(lblNewLabel_1);
			
			JLabel lblNewLabel_2 = new JLabel("Tihar Jail, New Delhi, Delhi 110058");
			lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 18));
			lblNewLabel_2.setBounds(194, 174, 288, 31);
			main_Panel_without_menuBar.add(lblNewLabel_2);
			
			JLabel lblNewLabel_3 = new JLabel("Phone No.  : 9958745258, 8547852458");
			lblNewLabel_3.setFont(new Font("Times New Roman", Font.PLAIN, 18));
			lblNewLabel_3.setBounds(184, 216, 301, 31);
			main_Panel_without_menuBar.add(lblNewLabel_3);
			
			JLabel lblNewLabel_4 = new JLabel("Email-Id  :  trjail@ gmail.com");
			lblNewLabel_4.setFont(new Font("Times New Roman", Font.PLAIN, 18));
			lblNewLabel_4.setBounds(205, 258, 256, 42);
			main_Panel_without_menuBar.add(lblNewLabel_4);
			
			
			/*
			 * Code Ends :
			 * 
			 * Now as we have already hide all the content of  JFrame
			 * now its time to show content of "Contact us page"
			 * 
			 */
				
			}
		});
		cu.setFont(new Font("Segoe UI", Font.BOLD, 15));
		cu.setForeground(Color.GRAY);
		
		menuBar.add(cu);
		
	
		
			contentPane = new JPanel();
		
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
	
		
		JLabel lblNewLabel = new JLabel("");
		
		Image img = new ImageIcon(this.getClass().getResource("/tihar-jail1.jpg")).getImage();
		lblNewLabel.setIcon(new ImageIcon(img));
		lblNewLabel.setBounds(0, 0, 375, 525);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Welcome To Tihar JAIL");
		lblNewLabel_1.setForeground(new Color(112, 128, 144));
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 35));
		lblNewLabel_1.setBounds(570, 11, 375, 60);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Prison Management System");
		lblNewLabel_2.setForeground(new Color(112, 128, 144));
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 35));
		lblNewLabel_2.setBounds(549, 46, 497, 76);
		contentPane.add(lblNewLabel_2);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 240));
		panel.setForeground(new Color(255, 255, 255));
		panel.setBounds(403, 118, 757, 379);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("About Us");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 19));
		lblNewLabel_3.setBounds(26, 23, 188, 41);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("complex in the world comprising of nine central prisons and one District Prison at Rohini");
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblNewLabel_4.setBounds(53, 104, 668, 41);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Delhi Prisons has two Prison Complexes, one at Tihar being one of the largest prison ");
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblNewLabel_5.setBounds(53, 74, 668, 41);
		panel.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Prison Complex. The total population in ten prisons is around 14000 prisoners against");
		lblNewLabel_6.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblNewLabel_6.setBounds(53, 135, 638, 41);
		panel.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("the sanctioned capacity of 6250 prisoners. There was steady increase in the prisoner\u2019s");
		lblNewLabel_7.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblNewLabel_7.setBounds(53, 163, 638, 51);
		panel.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel(" population over the last years which is effectively catered by our Software system.");
		lblNewLabel_8.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblNewLabel_8.setBounds(53, 200, 638, 41);
		panel.add(lblNewLabel_8);
		
		JLabel lblNewLabel_10 = new JLabel("Thanks,");
		lblNewLabel_10.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_10.setBounds(26, 267, 78, 25);
		panel.add(lblNewLabel_10);
		
		JLabel lblNewLabel_9 = new JLabel("Director - Tihar Jail");
		lblNewLabel_9.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		lblNewLabel_9.setBounds(26, 289, 178, 35);
		panel.add(lblNewLabel_9);
		
			
	}
	
	
	
	
	
}
