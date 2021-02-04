import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.SystemColor;

public class login extends JFrame {

	private JPanel contentPane;
	private JTextField txtUsername;
	private JPasswordField passwordField;


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login frame = new login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100,100, 1125,650);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUsername = new JLabel("Username  :");
		lblUsername.setFont(new Font("Modern No. 20", Font.BOLD, 30));
		lblUsername.setBounds(526, 176, 154, 43);
		contentPane.add(lblUsername);
		
		txtUsername = new JTextField();
		txtUsername.setFont(new Font("Tahoma", Font.BOLD, 20));
		txtUsername.setBackground(SystemColor.activeCaption);
		txtUsername.setBounds(680, 176, 406, 43);
		contentPane.add(txtUsername);
		txtUsername.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password  :");
		lblPassword.setForeground(SystemColor.activeCaptionText);
		lblPassword.setFont(new Font("Modern No. 20", Font.BOLD, 31));
		lblPassword.setBounds(526, 302, 154, 43);
		contentPane.add(lblPassword);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Tahoma", Font.BOLD, 20));
		passwordField.setBackground(SystemColor.activeCaption);
		passwordField.setBounds(680, 302, 406, 43);
		contentPane.add(passwordField);
		
		JButton btnLogin = new JButton("LOGIN");
		btnLogin.setForeground(SystemColor.desktop);
		btnLogin.setBackground(SystemColor.inactiveCaption);
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Connection con = null;
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					con = DriverManager.getConnection("jdbc:mysql://localhost:3306/up", "root", "1234");
					
					PreparedStatement pst = con.prepareStatement("select * from stud where u=? and pass=?");
      				pst.setString(1,txtUsername.getText());
					pst.setString(2,passwordField.getText());
					
					ResultSet rs = pst.executeQuery();
					int count = 0;
					while(rs.next()) {
						count=count+1;
					}
					if(count==1) {
						JOptionPane.showMessageDialog(null, "You are logged in!!!");
						dispose();
						All a1=new All();
						a1.setVisible(true);
					}
				else {
						JOptionPane.showMessageDialog(null, "Username and password is not correct try again..");
					}
					rs.close();
					pst.close();
					con.close();
				} catch (SQLException e1) {
					e1.printStackTrace();
				} catch (ClassNotFoundException e1) {
					e1.printStackTrace();
				}
	
			}
		});
		btnLogin.setFont(new Font("Modern No. 20", Font.BOLD, 30));
		btnLogin.setBounds(767, 453, 142, 53);
		contentPane.add(btnLogin);
		
		JLabel lblbckgrnd = new JLabel("");
		lblbckgrnd.setBackground(SystemColor.textHighlight);
		lblbckgrnd.setIcon(new ImageIcon("C:\\Users\\shivangi singh\\Desktop\\Zeal-Logo.jpeg"));
		lblbckgrnd.setBounds(0, 0, 1111, 629);
		contentPane.add(lblbckgrnd);
	}
}
