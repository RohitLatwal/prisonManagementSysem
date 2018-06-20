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

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Toolkit;
import java.awt.Window;
import java.awt.font.TextAttribute;
import java.util.Map;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;

public class adminLogin {

	
	/*
	 * 
	 * We are making following variables public so that we
	 * can access them in other classess.
	 * 
	 * 
	 */
	public JFrame frame;
	public JTextField textField;
	public JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					adminLogin window = new adminLogin();
					window.frame.setVisible(true);
					
				
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public adminLogin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		frame = new JFrame("Tihar Prison - Admin Login");
		frame.getContentPane().setBackground(new Color(127, 255, 212));
		
		/*  Below line of code is to set the width and height of open Frame */
		
		frame.setBounds(100, 100, 1189, 577);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Prison Management System");
		lblNewLabel.setForeground(Color.LIGHT_GRAY);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblNewLabel.setBounds(406, 11, 357, 85);
		
		/* Code Starts - To underline label programmatically */
		
		Font font = lblNewLabel.getFont();
		Map attributes = font.getAttributes();
		attributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
		lblNewLabel.setFont(font.deriveFont(attributes));
		
		/* Code Ends - To underline label programmatically */
		
		frame.getContentPane().add(lblNewLabel);
		
		
		
		JLabel lblNewLabel_1 = new JLabel("Username  :");
		lblNewLabel_1.setForeground(Color.GRAY);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_1.setBounds(388, 208, 121, 36);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Password :");
		lblNewLabel_2.setForeground(Color.GRAY);
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_2.setBounds(399, 312, 121, 28);
		frame.getContentPane().add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(568, 211, 195, 36);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(568, 304, 195, 36);
		frame.getContentPane().add(passwordField);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				
		//		System.out.println(textField.getText().toString().trim());
				if(textField.getText().toString().trim().equals("admin")  &&  passwordField.getText().toString().trim().equals("12345") )
			{
				// This is  to handle when we click on Login Button
				
				/*
				 * Code Starts :  Below code will close the frame previous frame 
				 * and Open the new frame i.e landing Page frame for Admin.
				 * 
				 * We have  used dispose() - this method will release memory and resources as
				 * we don't want to use this frame again.
				 * 
				 * But if we want to use this frame again then we should use
				 * setVisible(false);
				 * as this method will only hide the frame and will not release memory.
				 */
				
				frame.dispose();
							
				/*
				 * 
				 * Below code will open the new Frame and initialise that Frame
				 * with basic elements.
				 */
				MetaCoreHandler alp = new MetaCoreHandler();
				alp.setVisible(true);
				
				}  // if ends
				else
			{
					
				JOptionPane.showMessageDialog(null, "Wrong User Name and Password !!!", "Prison Management System", 1);
					
			}
					
			}
		});
		btnNewButton.setForeground(Color.GRAY);
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnNewButton.setBounds(468, 407, 109, 36);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_3 = new JLabel("For Demo Purpose Use - username - admin  &  password - 12345");
		lblNewLabel_3.setForeground(Color.GRAY);
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_3.setBounds(343, 471, 490, 28);
		frame.getContentPane().add(lblNewLabel_3);
		
		
	}
}
