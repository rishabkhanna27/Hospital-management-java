package project;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
import javax.swing.GroupLayout.Alignment;

public class projectdoc extends JFrame implements ActionListener{
	JLabel l1,l2,l3,l4,l5,l6,l7;
	TextField t1,t2,t3,t4;
	JButton b1,b2,b3,b4,b5,b6;
	projectdoc()
	{
		Container con=getContentPane();
		ImageIcon i1 = new ImageIcon("D:\\Java project\\ICONS\\addpatient.png");
		ImageIcon i2 = new ImageIcon("D:\\Java project\\ICONS\\updatepatient.png");
		ImageIcon i3 = new ImageIcon("D:\\Java project\\ICONS\\deletepatient.png");
		ImageIcon i4 = new ImageIcon("D:\\Java project\\ICONS\\searchpatient.png");
		ImageIcon i5 = new ImageIcon("D:\\Java project\\ICONS\\viewpatient.png");
		ImageIcon i6 = new ImageIcon("D:\\Java project\\ICONS\\backs.png");
		setLayout(null);
		l1=new JLabel();
		l2=new JLabel();
		l3=new JLabel();
		l4=new JLabel();
		l5=new JLabel();
		l6=new JLabel();
		l7=new JLabel();
		b1=new JButton("Add Doctor",i1);
		b2=new JButton("Update Doctor",i2);
		b3=new JButton("Delete Doctor",i3);
		b4=new JButton("Search Doctor",i4);
		b5=new JButton("View Doctor",i5);
		b6=new JButton("Back",i6);
		
		l1.setBounds(1,1,2000,70);
		l5.setBounds(10,300,250,70);
		l2.setBounds(10,370,250,70);
		l3.setBounds(10,440,250,70);
		l4.setBounds(10,510,250,70);
		l6.setBounds(10,580,250,70);
		l7.setBounds(10,650,250,70);
		
		b1.setBounds(650,300,200,80);
		b2.setBounds(950,300,200,80);
		b3.setBounds(1250,300,200,80);
		b4.setBounds(800,500,200,80);
		b5.setBounds(1100,500,200,80);
		b6.setBounds(1800,10,70,50);
	
		add(l1);
		add(l2);
		add(l3);
		add(l4);
		add(l5);
		add(l6);
		add(l7);
	
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		add(b6);


		l1.setBackground(Color.blue);
	     
		l1.setHorizontalAlignment(SwingConstants.CENTER);
  
		l1.setFont(new Font("Courier New", Font.BOLD, 40));
        l1.setForeground(Color.WHITE);
        l1.setText("Hospital Management System");
        l1.setOpaque(true);
        b6.setOpaque(true);
        
        
        l2.setFont(new Font("Courier New", Font.BOLD, 30)); 
        l2.setForeground(Color.WHITE);
        l2.setBackground(Color.blue);
        l2.setHorizontalAlignment(SwingConstants.CENTER);
        l2.setText("Welcome");
        l2.setOpaque(true);

        l3.setFont(new Font("Courier New", Font.BOLD, 24));
        l3.setForeground(Color.WHITE);
        l3.setBackground(Color.blue);
        l3.setHorizontalAlignment(SwingConstants.CENTER);
        l3.setText("to");
        l3.setOpaque(true);

        l4.setFont(new Font("Courier New", Font.BOLD, 30)); 
        l4.setForeground(Color.WHITE);
        l4.setBackground(Color.blue);
        l4.setHorizontalAlignment(SwingConstants.CENTER);
        l4.setText("Doctor Panel");
        l4.setOpaque(true);
        l5.setOpaque(true);
        l6.setOpaque(true);
        l7.setOpaque(true);
        l5.setBackground(Color.blue);
        l6.setBackground(Color.blue);
        l7.setBackground(Color.blue);


        setSize(1950,1950);
		setVisible(true);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		
		addWindowListener (new WindowAdapter() 
		{
		public void windowclosing(WindowEvent we)
			{
				System.exit(0);
			}
		}) ;
			
		}

	public static void main(String[] args) {
		projectdoc ob=new projectdoc();

	}
	public void actionPerformed(ActionEvent ae) {
		
		try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","rishab123");
		Statement stm=con.createStatement();
		if(ae.getActionCommand().contentEquals("Add Doctor"))
		{
			setVisible(false);
			projectdoc2 ob=new projectdoc2();
			 setSize(1950,1950);

		}
		else if(ae.getActionCommand().contentEquals("Update Doctor")) 
		{
			setVisible(false);
			projectdoc4 ob=new projectdoc4();
			 setSize(1950,1950);
		}
		else if(ae.getActionCommand().contentEquals("Delete Doctor")) 
		{
			setVisible(false);
			projectdoc1 ob=new projectdoc1();
			 setSize(1950,1950);
		}
		else if(ae.getActionCommand().contentEquals("Search Doctor")) 
		{
			setVisible(false);
			projectdoc66 x= new projectdoc66();
			 setSize(1950,1950);
		}
		else if(ae.getActionCommand().contentEquals("View Doctor")) 
		{
			setVisible(false);
			projectdoc3 ob=new projectdoc3();
			 setSize(1950,1950);
		}
		else if(ae.getActionCommand().contentEquals("Back")) 
		{
			setVisible(false);
			projectbase2 ob=new projectbase2();
			 setSize(1950,1950);
		}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}
}

