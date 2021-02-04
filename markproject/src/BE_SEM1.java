import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import java.awt.Color;

public class BE_SEM1 extends JFrame {

	private JPanel contentPane;
	private JTextField txtName;
	private JTextField txtRollno;
	private JTextField txtmr1;
	private JTextField txtmr2;
	private JTextField txtmr3;
	private JTextField txtmr4;
	private JTextField txtmr5;
	private JTextField txtmr6;
	private JTextField txtmr7;
	public static JLabel lblgs1;
	public static JLabel lblgps1;
	public static JLabel lblgs2;
	public static JLabel lblgps2;
	public static JLabel lblgs3;
	public static JLabel lblgps3;
	public static JLabel lblgs4;
	public static JLabel lblgps4;
	public static JLabel lblgs5;
	public static JLabel lblgps5;
	public static JLabel lblgs6;
	public static JLabel lblgps6;
	public static JLabel lblgs7;
	public static JLabel lblgps7;
	public static JLabel lblgs8;
	public static JLabel lblgps8;
	public static String gr;
	public static String grps;
	public static String ercr;
	public static int m1;
	public static int m2;
	public static int m3;
	public static int m4;
	public static int m5;
	public static int m6;
	public static int m7;
	public static int m8;
	public static float avg;
	public static float per;
	public static String savg;
	public static String sper;
	private JTextField txtmr8;
	
	

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BE_SEM1 frame = new BE_SEM1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public String disgrade(int mr)
	{
	
		if(mr>=80 && mr <=100)
		{
			 return gr = "O";
		}
		else if(mr>=70 && mr <=79)
		{
			 return gr = "A+";
		}
		else if(mr>=60 && mr <=69)
		{
			 return gr = "A";
		}
		else if(mr>=55 && mr <=59)
		{
			 return gr = "B+";
		}
		else if(mr>=50 && mr <=54)
		{
			 return gr = "B";	
		}
		else if(mr>=45 && mr <=49)
		{
			 return gr = "C";
		}
		else if(mr>=40 && mr <=44)
		{
			 return gr = "P";
		}
		else
		{
			 return gr = "F";
		}
		
	};

	
	public String disgradepts(int mr1)
	{
	
		if(mr1>=80 && mr1 <=100)
		{
			 return grps = "10";
		}
		else if(mr1>=70 && mr1 <=79)
		{
			return grps = "9";		}
		else if(mr1>=60 && mr1 <=69)
		{
			return grps = "8";
		}
		else if(mr1>=55 && mr1 <=59)
		{
			return grps = "7";
		}
		else if(mr1>=50 && mr1 <=54)
		{
			return grps = "6";	
		}
		else if(mr1>=45 && mr1 <=49)
		{
			return grps = "5";
		}
		else if(mr1>=40 && mr1 <=44)
		{
			return grps = "4";
		}
		else
		{
			return grps = "0";
		}
		
	};

	
	
	public BE_SEM1() {
		setBackground(SystemColor.inactiveCaptionBorder);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1100,800);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtName = new JTextField();
		txtName.setFont(new Font("Tahoma", Font.BOLD, 20));
		txtName.setBounds(175, 11, 283, 48);
		contentPane.add(txtName);
		txtName.setColumns(10);
		
		JLabel lblName = new JLabel("NAME   : ");
		lblName.setFont(new Font("Modern No. 20", Font.BOLD, 25));
		lblName.setHorizontalAlignment(SwingConstants.CENTER);
		lblName.setBounds(10, 11, 126, 48);
		contentPane.add(lblName);
		
		JLabel lblRollNo = new JLabel("ROLL NO :");
		lblRollNo.setFont(new Font("Modern No. 20", Font.BOLD, 25));
		lblRollNo.setHorizontalAlignment(SwingConstants.CENTER);
		lblRollNo.setBounds(10, 69, 126, 48);
		contentPane.add(lblRollNo);
		
		txtRollno = new JTextField();
		txtRollno.setFont(new Font("Tahoma", Font.BOLD, 20));
		txtRollno.setBounds(175, 69, 283, 48);
		contentPane.add(txtRollno);
		txtRollno.setColumns(10);
		
		JLabel lblsub1 = new JLabel("HPC");
		lblsub1.setHorizontalAlignment(SwingConstants.CENTER);
		lblsub1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblsub1.setBounds(10, 200, 126, 42);
		contentPane.add(lblsub1);
		
		JLabel lblsub2 = new JLabel("AI & R");
		lblsub2.setHorizontalAlignment(SwingConstants.CENTER);
		lblsub2.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblsub2.setBounds(10, 260, 126, 42);
		contentPane.add(lblsub2);
		
		JLabel lblsub3 = new JLabel("DA");
		lblsub3.setHorizontalAlignment(SwingConstants.CENTER);
		lblsub3.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblsub3.setBounds(10, 320, 126, 42);
		contentPane.add(lblsub3);
		
		JLabel lblsub4 = new JLabel("E I");
		lblsub4.setHorizontalAlignment(SwingConstants.CENTER);
		lblsub4.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblsub4.setBounds(10, 380, 126, 42);
		contentPane.add(lblsub4);
		
		JLabel lblsub5 = new JLabel("E II");
		lblsub5.setHorizontalAlignment(SwingConstants.CENTER);
		lblsub5.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblsub5.setBounds(10, 440, 126, 42);
		contentPane.add(lblsub5);
		
		JLabel lblsub6 = new JLabel("LP I");
		lblsub6.setHorizontalAlignment(SwingConstants.CENTER);
		lblsub6.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblsub6.setBounds(10, 500, 126, 42);
		contentPane.add(lblsub6);
		
		JLabel lblsub7 = new JLabel("LP II");
		lblsub7.setHorizontalAlignment(SwingConstants.CENTER);
		lblsub7.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblsub7.setBounds(10, 561, 126, 42);
		contentPane.add(lblsub7);
		

		JLabel lblsub8 = new JLabel("PW STAGE I");
		lblsub8.setHorizontalAlignment(SwingConstants.CENTER);
		lblsub8.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblsub8.setBounds(10, 624, 126, 42);
		contentPane.add(lblsub8);
		
		JLabel lblcr1 = new JLabel("4");
		lblcr1.setHorizontalAlignment(SwingConstants.CENTER);
		lblcr1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblcr1.setBounds(264, 200, 126, 42);
		contentPane.add(lblcr1);
		
		JLabel lblcr2 = new JLabel("3");
		lblcr2.setHorizontalAlignment(SwingConstants.CENTER);
		lblcr2.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblcr2.setBounds(264, 260, 126, 42);
		contentPane.add(lblcr2);
		
		JLabel lblcr3 = new JLabel("3");
		lblcr3.setHorizontalAlignment(SwingConstants.CENTER);
		lblcr3.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblcr3.setBounds(264, 320, 126, 42);
		contentPane.add(lblcr3);
		
		JLabel lblcr4 = new JLabel("3");
		lblcr4.setHorizontalAlignment(SwingConstants.CENTER);
		lblcr4.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblcr4.setBounds(264, 380, 126, 42);
		contentPane.add(lblcr4);
		
		JLabel lblcr5 = new JLabel("3");
		lblcr5.setHorizontalAlignment(SwingConstants.CENTER);
		lblcr5.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblcr5.setBounds(264, 440, 126, 42);
		contentPane.add(lblcr5);
		
		JLabel lblcr6 = new JLabel("2");
		lblcr6.setHorizontalAlignment(SwingConstants.CENTER);
		lblcr6.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblcr6.setBounds(264, 500, 126, 42);
		contentPane.add(lblcr6);
		
		JLabel lblcr7 = new JLabel("2");
		lblcr7.setHorizontalAlignment(SwingConstants.CENTER);
		lblcr7.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblcr7.setBounds(264, 561, 126, 42);
		contentPane.add(lblcr7);
		
		JLabel lblcr8 = new JLabel("2");
		lblcr8.setHorizontalAlignment(SwingConstants.CENTER);
		lblcr8.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblcr8.setBounds(264, 624, 126, 42);
		contentPane.add(lblcr8);
		
		
		txtmr1 = new JTextField();
		txtmr1.setFont(new Font("Tahoma", Font.BOLD, 16));
		txtmr1.setBounds(518, 200, 126, 42);
		contentPane.add(txtmr1);
		txtmr1.setColumns(10);
		
		txtmr2 = new JTextField();
		txtmr2.setFont(new Font("Tahoma", Font.BOLD, 16));
		txtmr2.setColumns(10);
		txtmr2.setBounds(518, 260, 126, 42);
		contentPane.add(txtmr2);
		
		txtmr3 = new JTextField();
		txtmr3.setFont(new Font("Tahoma", Font.BOLD, 16));
		txtmr3.setColumns(10);
		txtmr3.setBounds(518, 320, 126, 42);
		contentPane.add(txtmr3);
		
		txtmr4 = new JTextField();
		txtmr4.setFont(new Font("Tahoma", Font.BOLD, 16));
		txtmr4.setColumns(10);
		txtmr4.setBounds(518, 380, 126, 42);
		contentPane.add(txtmr4);
		
		txtmr5 = new JTextField();
		txtmr5.setFont(new Font("Tahoma", Font.BOLD, 16));
		txtmr5.setColumns(10);
		txtmr5.setBounds(518, 440, 126, 42);
		contentPane.add(txtmr5);
		
		txtmr6 = new JTextField();
		txtmr6.setFont(new Font("Tahoma", Font.BOLD, 16));
		txtmr6.setColumns(10);
		txtmr6.setBounds(518, 500, 126, 42);
		contentPane.add(txtmr6);
		
		txtmr7 = new JTextField();
		txtmr7.setFont(new Font("Tahoma", Font.BOLD, 16));
		txtmr7.setColumns(10);
		txtmr7.setBounds(518, 561, 126, 42);
		contentPane.add(txtmr7);
		
		txtmr8 = new JTextField();
		txtmr8.setFont(new Font("Tahoma", Font.BOLD, 16));
		txtmr8.setColumns(10);
		txtmr8.setBounds(518, 624, 126, 42);
		contentPane.add(txtmr8);
		
		JLabel lblSubjects = new JLabel("SUBJECTS");
		lblSubjects.setHorizontalAlignment(SwingConstants.CENTER);
		lblSubjects.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblSubjects.setBounds(10, 155, 126, 43);
		contentPane.add(lblSubjects);
		
		JLabel lblTotCrd = new JLabel("TOT . CRD");
		lblTotCrd.setHorizontalAlignment(SwingConstants.CENTER);
		lblTotCrd.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblTotCrd.setBounds(275, 155, 115, 43);
		contentPane.add(lblTotCrd);
		
		JLabel lblMarks = new JLabel("MARKS");
		lblMarks.setHorizontalAlignment(SwingConstants.CENTER);
		lblMarks.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblMarks.setBounds(518, 155, 126, 43);
		contentPane.add(lblMarks);
		
		JLabel lblGrd = new JLabel("GRD");
		lblGrd.setHorizontalAlignment(SwingConstants.CENTER);
		lblGrd.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblGrd.setBounds(744, 155, 115, 43);
		contentPane.add(lblGrd);
		
		JLabel lblGrdPts = new JLabel("GRD . PTS");
		lblGrdPts.setHorizontalAlignment(SwingConstants.CENTER);
		lblGrdPts.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblGrdPts.setBounds(933, 155, 115, 43);
		contentPane.add(lblGrdPts);
		
		lblgs1 = new JLabel("");
		lblgs1.setHorizontalAlignment(SwingConstants.CENTER);
		lblgs1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblgs1.setBounds(744, 203, 126, 42);
		contentPane.add(lblgs1);
		
		lblgs2 = new JLabel("");
		lblgs2.setHorizontalAlignment(SwingConstants.CENTER);
		lblgs2.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblgs2.setBounds(744, 260, 126, 42);
		contentPane.add(lblgs2);
		
		lblgs3 = new JLabel("");
		lblgs3.setHorizontalAlignment(SwingConstants.CENTER);
		lblgs3.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblgs3.setBounds(744, 320, 126, 42);
		contentPane.add(lblgs3);
		
		lblgs4 = new JLabel("");
		lblgs4.setHorizontalAlignment(SwingConstants.CENTER);
		lblgs4.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblgs4.setBounds(744, 380, 126, 42);
		contentPane.add(lblgs4);
		
		lblgs5 = new JLabel("");
		lblgs5.setHorizontalAlignment(SwingConstants.CENTER);
		lblgs5.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblgs5.setBounds(744, 440, 126, 42);
		contentPane.add(lblgs5);
		
		lblgs6 = new JLabel("");
		lblgs6.setHorizontalAlignment(SwingConstants.CENTER);
		lblgs6.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblgs6.setBounds(744, 500, 126, 42);
		contentPane.add(lblgs6);
		
		lblgs7 = new JLabel("");
		lblgs7.setHorizontalAlignment(SwingConstants.CENTER);
		lblgs7.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblgs7.setBounds(744, 561, 126, 42);
		contentPane.add(lblgs7);
		

		lblgs8 = new JLabel("");
		lblgs8.setHorizontalAlignment(SwingConstants.CENTER);
		lblgs8.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblgs8.setBounds(744, 624, 126, 42);
		contentPane.add(lblgs8);
		
		
		
		lblgps1 = new JLabel("");
		lblgps1.setHorizontalAlignment(SwingConstants.CENTER);
		lblgps1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblgps1.setBounds(933, 200, 126, 42);
		contentPane.add(lblgps1);
		
		lblgps2 = new JLabel("");
		lblgps2.setHorizontalAlignment(SwingConstants.CENTER);
		lblgps2.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblgps2.setBounds(933, 260, 126, 42);
		contentPane.add(lblgps2);
		
		lblgps3 = new JLabel("");
		lblgps3.setHorizontalAlignment(SwingConstants.CENTER);
		lblgps3.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblgps3.setBounds(933, 320, 126, 42);
		contentPane.add(lblgps3);
		
		lblgps4 = new JLabel("");
		lblgps4.setHorizontalAlignment(SwingConstants.CENTER);
		lblgps4.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblgps4.setBounds(933, 380, 126, 42);
		contentPane.add(lblgps4);
		
		lblgps5 = new JLabel("");
		lblgps5.setHorizontalAlignment(SwingConstants.CENTER);
		lblgps5.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblgps5.setBounds(933, 440, 126, 42);
		contentPane.add(lblgps5);
		
		lblgps6 = new JLabel("");
		lblgps6.setHorizontalAlignment(SwingConstants.CENTER);
		lblgps6.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblgps6.setBounds(933, 500, 126, 42);
		contentPane.add(lblgps6);
		
		lblgps7 = new JLabel("");
		lblgps7.setHorizontalAlignment(SwingConstants.CENTER);
		lblgps7.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblgps7.setBounds(933, 561, 126, 42);
		contentPane.add(lblgps7);
		
		lblgps8 = new JLabel("");
		lblgps8.setHorizontalAlignment(SwingConstants.CENTER);
		lblgps8.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblgps8.setBounds(933, 624, 126, 42);
		contentPane.add(lblgps8);
		
		
		JLabel lblSGPA = new JLabel("SGPA :");
		lblSGPA.setHorizontalAlignment(SwingConstants.CENTER);
		lblSGPA.setForeground(Color.BLACK);
		lblSGPA.setFont(new Font("Modern No. 20", Font.BOLD, 30));
		lblSGPA.setBounds(10, 683, 160, 70);
		contentPane.add(lblSGPA);
		
		JLabel lblSgpa = new JLabel("");
		lblSgpa.setFont(new Font("Tahoma", Font.PLAIN, 28));
		lblSgpa.setBounds(142, 683, 218, 70);
		
		contentPane.add(lblSgpa);
		
		JLabel lblPER = new JLabel("PERCENTAGE :");
		lblPER.setHorizontalAlignment(SwingConstants.CENTER);
		lblPER.setForeground(Color.BLACK);
		lblPER.setFont(new Font("Modern No. 20", Font.BOLD, 30));
		lblPER.setBounds(336, 683, 279, 70);
		contentPane.add(lblPER);
		
		JLabel lblPer = new JLabel("");
		lblPer.setFont(new Font("Tahoma", Font.PLAIN, 28));
		lblPer.setBounds(599, 683, 218, 70);
		
		contentPane.add(lblPer);
		
		
		JButton btnCalculate = new JButton("CALCULATE");
		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				m1 = Integer.parseInt(txtmr1.getText());
				lblgs1.setText(disgrade(m1));
				lblgps1.setText(disgradepts(m1));
				
				m2 = Integer.parseInt(txtmr2.getText());
				lblgs2.setText(disgrade(m2));
				lblgps2.setText(disgradepts(m2));
				
				m3 = Integer.parseInt(txtmr3.getText());
				lblgs3.setText(disgrade(m3));
				lblgps3.setText(disgradepts(m3));
				
				m4 = Integer.parseInt(txtmr4.getText());
				lblgs4.setText(disgrade(m4));
				lblgps4.setText(disgradepts(m4));
				
				m5 = Integer.parseInt(txtmr5.getText());
				lblgs5.setText(disgrade(m5));
				lblgps5.setText(disgradepts(m5));
				
				m6 = Integer.parseInt(txtmr6.getText());
				lblgs6.setText(disgrade(m6));
				lblgps6.setText(disgradepts(m6));
				
				m7 = Integer.parseInt(txtmr7.getText());
				lblgs7.setText(disgrade(m7));
				lblgps7.setText(disgradepts(m7));
				
				m8 = Integer.parseInt(txtmr8.getText());
				lblgs8.setText(disgrade(m8));
				lblgps8.setText(disgradepts(m8));
			
				
				try {
					Connection con = null;
					Class.forName("com.mysql.cj.jdbc.Driver");
					con = DriverManager.getConnection("jdbc:mysql://localhost:3306/markinsertion", "root", "1234");
					
					PreparedStatement pst = con.prepareStatement("insert into Be_sem1records values (?,?,?,?,?,?,?,?,?,?)");
      				pst.setString(1,txtName.getText());
					pst.setInt(2,Integer.parseInt(txtRollno.getText()));
					pst.setInt(3,Integer.parseInt(txtmr1.getText()));
					pst.setInt(4,Integer.parseInt(txtmr2.getText()));
					pst.setInt(5,Integer.parseInt(txtmr3.getText()));
					pst.setInt(6,Integer.parseInt(txtmr4.getText()));
					pst.setInt(7,Integer.parseInt(txtmr5.getText()));
					pst.setInt(8,Integer.parseInt(txtmr6.getText()));
				    pst.setInt(9,Integer.parseInt(txtmr7.getText()));
				    pst.setInt(10,Integer.parseInt(txtmr8.getText()));
					
					
			    	pst.executeUpdate();
			    	pst.close();
					con.close();
				} catch (SQLException e1) {
					e1.printStackTrace();
				} catch (ClassNotFoundException e1) {
					e1.printStackTrace();
				}
				
				
				String l1=lblgps1.getText();
				String l2=lblgps2.getText();
				String l3=lblgps3.getText();
				String l4=lblgps4.getText();
				String l5=lblgps5.getText();
				String l6=lblgps6.getText();
				String l7=lblgps7.getText();
				String l8=lblgps8.getText();
				
				String c1=lblcr1.getText();
				String c2=lblcr2.getText();
				String c3=lblcr3.getText();
				String c4=lblcr4.getText();
				String c5=lblcr5.getText();
				String c6=lblcr6.getText();
				String c7=lblcr7.getText();
				String c8=lblcr8.getText();
				
				
				float newl1=Float.parseFloat(l1);
				float newl2=Float.parseFloat(l2);
				float newl3=Float.parseFloat(l3);
				float newl4=Float.parseFloat(l4);
				float newl5=Float.parseFloat(l5);
				float newl6=Float.parseFloat(l6);
				float newl7=Float.parseFloat(l7);
				float newl8=Float.parseFloat(l8);
				
				float newc1=Float.parseFloat(c1);
				float newc2=Float.parseFloat(c2);
				float newc3=Float.parseFloat(c3);
				float newc4=Float.parseFloat(c4);
				float newc5=Float.parseFloat(c5);
				float newc6=Float.parseFloat(c6);
				float newc7=Float.parseFloat(c7);
				float newc8=Float.parseFloat(c8);
				
				avg=(((newl1*newc1)+(newl2*newc2)+(newl3*newc3)+(newl4*newc4)+(newl5*newc5)+(newl6*newc6)+(newl7*newc7)+(newl8*newc8))/22);
			    System.out.println(avg);
				
				per=( float )(avg *8.8);
				System.out.println(per);
				
				savg = String.valueOf(avg);
				lblSgpa.setText(savg);
				
				sper = String.valueOf(per);
				lblPer.setText(sper);
				
			
	
			}		
		});
		btnCalculate.setFont(new Font("Modern No. 20", Font.BOLD, 28));
		btnCalculate.setBounds(684, 38, 218, 64);
		contentPane.add(btnCalculate);
		
		JButton btnNewButton = new JButton("HOME");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				All p7 = new All();
				p7.setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("Modern No. 20", Font.BOLD, 28));
		btnNewButton.setBounds(933, 689, 143, 64);
		contentPane.add(btnNewButton);
		
	}
}
