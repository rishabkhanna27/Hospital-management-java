package project;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;

public class projectdoc2 extends JFrame implements ActionListener{
	JLabel la,lb,lc,ld,le,lf,lg,l1,l2,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14;
	JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12;
	JButton b1,b2,b6;
	projectdoc2()
	{
		setLayout(null);

		ImageIcon i6 = new ImageIcon("D:\\Java project\\ICONS\\backs.png");
		b1=new JButton("Submit");
		b2=new JButton("Reset");
		b6=new JButton("Back",i6);
		t1=new JTextField();
		t2=new JTextField();
		t3=new JTextField();
		t4=new JTextField();
		t5=new JTextField();
		t6=new JTextField();
		t7=new JTextField();
		t8=new JTextField();
		t9=new JTextField();
		t10=new JTextField();
                t11=new JTextField();
		t12=new JTextField();
		
                l1 = new JLabel();
		l2 = new JLabel();
		l4 = new JLabel();
		l5 = new JLabel();
		l6 = new JLabel();
		l7 = new JLabel();
		l8 = new JLabel();
		l9 = new JLabel();
		l10 = new JLabel();
		l11 = new JLabel();
		l12 = new JLabel();
		l13 = new JLabel();
		la=new JLabel();
		lb=new JLabel();
		lc=new JLabel();
		ld=new JLabel();
		le=new JLabel();
		lf=new JLabel();
		lg=new JLabel();
		
		
		b1.setBounds(1000,800,100,50);
		b2.setBounds(750,800,100,50);
		b6.setBounds(1800,10,70,50);
		

		t1.setBounds(600,200,200,30);
		t2.setBounds(600,300,200,30);
		t3.setBounds(600,400,200,30);
		t4.setBounds(600,500,200,30);
		t5.setBounds(600,600,200,30);
                t11.setBounds(600,700,200,30);
		
		t6.setBounds(1400,200,200,30);
		t7.setBounds(1400,300,200,30);
		t8.setBounds(1400,400,200,30);
		t9.setBounds(1400,500,200,30);
		t10.setBounds(1400,600,200,30);
		t12.setBounds(1400,700,200,30);
		
		l4.setBounds(400,200,200,20);
		l5.setBounds(400,300,200,20);
		l6.setBounds(400,400,200,20);
		l7.setBounds(400,500,200,20);
		l8.setBounds(400,600,200,20);
                l1.setBounds(400,700,200,20);
		
		l9.setBounds(1200,200,200,20);
		l10.setBounds(1200,300,200,20);
		l11.setBounds(1200,400,200,20);
		l12.setBounds(1200,500,200,20);
		l13.setBounds(1200,600,200,20);
		l2.setBounds(1200,700,200,20);
		
		la.setBounds(1,1,2000,70);
		le.setBounds(10,300,250,70);
		lb.setBounds(10,370,250,70);
		lc.setBounds(10,440,250,70);
		ld.setBounds(10,510,250,70);
		lf.setBounds(10,580,250,70);
		lg.setBounds(10,650,250,70);
		
		
		
		add(t1);
		add(t2);
		add(t3);
		add(t4);
		add(t5);
		add(t6);
		add(t7);
		add(t8);
		add(t9);
		add(t10);
		add(t11);
                add(t12);
		
		add(b1);
		add(b2);
		
		add(l4);
		add(l5);
		add(l6);
		add(l7);
		add(l8);
		add(l1);

                add(l9);
		add(l10);
		add(l11);
		add(l12);
		add(l13);
		add(l2);

		add(la);
		add(lb);
		add(lc);
		add(ld);
		add(le);
		add(lf);
		add(lg);
		
		add(b6);
		

		
	l4.setFont(new Font("Courier New", Font.BOLD, 20));
        l4.setForeground(Color.blue);
        l4.setText("DOJ");
        l4.setOpaque(true);
        
        l5.setFont(new Font("Courier New", Font.BOLD, 20));
        l5.setForeground(Color.blue);
        l5.setText("ID");
        l5.setOpaque(true);
		
    	l6.setFont(new Font("Courier New", Font.BOLD, 20));
        l6.setForeground(Color.blue);
        l6.setText("Name");
        l6.setOpaque(true);
        
    	l7.setFont(new Font("Courier New", Font.BOLD, 20));
        l7.setForeground(Color.blue);
        l7.setText("Age");
        l7.setOpaque(true);
        
    	l8.setFont(new Font("Courier New", Font.BOLD, 20));
        l8.setForeground(Color.blue);
        l8.setText("Gender");
        l8.setOpaque(true);

        l1.setFont(new Font("Courier New", Font.BOLD, 20));
        l1.setForeground(Color.blue);
        l1.setText("Username");
        l1.setOpaque(true);
        
    	l9.setFont(new Font("Courier New", Font.BOLD, 20));
        l9.setForeground(Color.blue);
        l9.setText("Department");
        l9.setOpaque(true);
        
    	l10.setFont(new Font("Courier New", Font.BOLD, 20));
        l10.setForeground(Color.blue);
        l10.setText("Mobile Number");
        l10.setOpaque(true);
        
    	l11.setFont(new Font("Courier New", Font.BOLD, 20));
        l11.setForeground(Color.blue);
        l11.setText("Maritial Status");
        l11.setOpaque(true);
        
    	l12.setFont(new Font("Courier New", Font.BOLD, 20));
        l12.setForeground(Color.blue);
        l12.setText("Email");
        l12.setOpaque(true);
        
    	l13.setFont(new Font("Courier New", Font.BOLD, 20));
        l13.setForeground(Color.blue);
        l13.setText("Ward Number");
        l13.setOpaque(true);
        
        l2.setFont(new Font("Courier New", Font.BOLD, 20));
        l2.setForeground(Color.blue);
        l2.setText("Password");
        l2.setOpaque(true);
        
	la.setBackground(Color.blue);     
	la.setHorizontalAlignment(SwingConstants.CENTER);
	la.setFont(new Font("Courier New", Font.BOLD, 40));
        la.setForeground(Color.WHITE);
        la.setText("Add Doctor");
        la.setOpaque(true);
        b6.setOpaque(true);
        
        
        lb.setFont(new Font("Courier New", Font.BOLD, 30)); 
        lb.setForeground(Color.WHITE);
        lb.setBackground(Color.blue);
        lb.setHorizontalAlignment(SwingConstants.CENTER);
        lb.setText("Welcome");
        lb.setOpaque(true);

        lc.setFont(new Font("Courier New", Font.BOLD, 24));
        lc.setForeground(Color.WHITE);
        lc.setBackground(Color.blue);
        lc.setHorizontalAlignment(SwingConstants.CENTER);
        lc.setText("to");
        lc.setOpaque(true);

        ld.setFont(new Font("Courier New", Font.BOLD, 30)); 
        ld.setForeground(Color.WHITE);
        ld.setBackground(Color.blue);
        ld.setHorizontalAlignment(SwingConstants.CENTER);
        ld.setText("Doctor Panel");
        ld.setOpaque(true);
        le.setOpaque(true);
        lf.setOpaque(true);
        lg.setOpaque(true);
        le.setBackground(Color.blue);
        lf.setBackground(Color.blue);
        lg.setBackground(Color.blue);

		
        setSize(1950,1950);
		setVisible(true);
		b1.addActionListener(this);
		b2.addActionListener(this);
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
		projectdoc2 ob=new projectdoc2();

	}
	public void actionPerformed(ActionEvent ae) {
	try
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","rishab123");
		Statement stm=con.createStatement();
		if(ae.getActionCommand().contentEquals("Back"))
		{
			setVisible(false);
			projectdoc ob=new projectdoc();
			 setSize(1950,1950);

		}
		else if(ae.getActionCommand().contentEquals("Submit")) 
		{
			String DOJ=t1.getText();
			String ID=t2.getText();
			String Name=t3.getText();
			String Age=t4.getText();
			int ag=Integer.parseInt(Age);
			String Gender=t5.getText();
            String Username=t11.getText();
			String Department=t6.getText();
			String Number=t7.getText();
			String Status=t8.getText();
			String Email=t9.getText();
			String Ward=t10.getText();
			int Wardd=Integer.parseInt(Ward);
            String Password=t12.getText();
			
			
			
            stm.executeUpdate("insert into doctor values(null,'"+DOJ+"','"+ID+"','"+Name+"','"+ag+"','"+Gender+"','"+Username+"','"+Department+"','"+Number+"','"+Status+"','"+Email+"','"+Wardd+"','"+Password+"')");
            setVisible(false);
            projectdoc2 ob=new projectdoc2();
		}
		else if(ae.getActionCommand().contentEquals("Reset")) 
		{
			setVisible(false);
			projectdoc2 ob=new projectdoc2();
			 setSize(1950,1950);
		}
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	}

}
