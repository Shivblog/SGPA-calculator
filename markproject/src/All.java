import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.SystemColor;

public class All extends JFrame {

	private JPanel contentPane;
	public static JTextField txtName;
	public static JTextField textRollno;	

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					All frame = new All();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public All() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1125,650);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setForeground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnFeSem_1 = new JButton("FE SEM-1");
		btnFeSem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				dispose();
				FE_SEM1 fe1=new FE_SEM1();
				fe1.setVisible(true);
			}
		});

		btnFeSem_1.setFont(new Font("Modern No. 20", Font.BOLD, 30));
		btnFeSem_1.setBounds(296, 37, 193, 56);
		contentPane.add(btnFeSem_1);
		
		JButton btnFeSem_2 = new JButton("FE SEM-2");
		btnFeSem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dispose();
				FE_SEM2 fe2=new FE_SEM2();
				fe2.setVisible(true);
			}
		});
		btnFeSem_2.setFont(new Font("Modern No. 20", Font.BOLD, 30));
		btnFeSem_2.setBounds(625, 37, 193, 56);
		contentPane.add(btnFeSem_2);
		
		JButton btnSeSem_1 = new JButton("SE SEM-1");
		btnSeSem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dispose();
				SE_SEM1 se1=new SE_SEM1();
				se1.setVisible(true);
			}
		});
		btnSeSem_1.setFont(new Font("Modern No. 20", Font.BOLD, 30));
		btnSeSem_1.setBounds(296, 192, 193, 56);
		contentPane.add(btnSeSem_1);
		
		JButton btnSeSem_2 = new JButton("SE SEM-2");
		btnSeSem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dispose();
				SE_SEM2 se2=new SE_SEM2();
				se2.setVisible(true);
			}
		});
		btnSeSem_2.setFont(new Font("Modern No. 20", Font.BOLD, 30));
		btnSeSem_2.setBounds(625, 192, 193, 56);
		contentPane.add(btnSeSem_2);
		
		JButton btnTeSem_1 = new JButton("TE SEM-1");
		btnTeSem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dispose();
				TE_SEM1 te1=new TE_SEM1();
				te1.setVisible(true);
			}
		});
		btnTeSem_1.setFont(new Font("Modern No. 20", Font.BOLD, 30));
		btnTeSem_1.setBounds(296, 347, 193, 56);
		contentPane.add(btnTeSem_1);
		
		JButton btnTeSem_2 = new JButton("TE SEM-2");
		btnTeSem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dispose();
				TE_SEM2 te2=new TE_SEM2();
				te2.setVisible(true);
			}
		});
		btnTeSem_2.setFont(new Font("Modern No. 20", Font.BOLD, 30));
		btnTeSem_2.setBounds(625, 347, 193, 56);
		contentPane.add(btnTeSem_2);
		
		JButton btnBeSem_1 = new JButton("BE SEM-1");
		btnBeSem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				dispose();
				BE_SEM1 be1=new BE_SEM1();
				be1.setVisible(true);
			}
		});
		btnBeSem_1.setFont(new Font("Modern No. 20", Font.BOLD, 30));
		btnBeSem_1.setBounds(296, 487, 193, 56);
		contentPane.add(btnBeSem_1);
		
		JButton btnBeSem_2 = new JButton("BE SEM-2");
		btnBeSem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dispose();
				BE_SEM2 be2=new BE_SEM2();
				be2.setVisible(true);
			}
		});
		btnBeSem_2.setFont(new Font("Modern No. 20", Font.BOLD, 30));
		btnBeSem_2.setBounds(625, 487, 193, 56);
		contentPane.add(btnBeSem_2);
	}

}
