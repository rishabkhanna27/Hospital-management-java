package project;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;


public class project8 extends JFrame implements ActionListener{
	JLabel la,l4,l5;
	JPasswordField p1;
	JTextField t1,t2;
	JButton b1,b2,b6;
	project8()
	{
		setLayout(null);

		la=new JLabel();
		ImageIcon i6 = new ImageIcon("D:\\Java project\\ICONS\\backs.png");
		b1=new JButton("Submit");
		b2=new JButton("Reset");
		b6=new JButton("Back",i6);
		t1=new JTextField();
		p1 = new JPasswordField();
		l4 = new JLabel()	;
		l5 = new JLabel()	;
		b1.setBounds(600,400,90,40);
		b2.setBounds(750,400,90,40);
		b6.setBounds(1800,10,70,50);
		t1.setBounds(700,200,200,30);
		p1.setBounds(700,300,200,30);	
		l4.setBounds(600,200,200,20);
		l5.setBounds(600,300,200,20);
		la.setBounds(1,1,2000,70);
	
		add(t1);
		add(p1);
		add(b1);
		add(b2);
		add(la);
		add(l4);
		add(l5);
		add(b6);
		
		
		la.setBackground(Color.blue);
	     
		la.setHorizontalAlignment(SwingConstants.CENTER);
  
		la.setFont(new Font("Courier New", Font.BOLD, 40));
        la.setForeground(Color.WHITE);
        la.setText("Hospital Management System");
        la.setOpaque(true);
        l4.setText("Username");
        l4.setOpaque(true);

        l5.setText("Password");
        l5.setOpaque(true);
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
		project8 ob=new project8();

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
			project7 ob=new project7();
			 setSize(1950,1950);

		}
		else if(ae.getActionCommand().contentEquals("Submit")) 
		{
			String uname = t1.getText();
			   String pass = p1.getText();
			   if(uname.equals("abcdefgh") && pass.equals("abc@123"))
			   {
			      setVisible(false);
			      project ob = new project();
			    }
			    else
			    {
			      JOptionPane.showMessageDialog(this,"Incorrect login or password",
			      "Error",JOptionPane.ERROR_MESSAGE);  
			    }
		}
		
		else if(ae.getActionCommand().contentEquals("Reset")) 
		{
			setVisible(false);
			project8 ob=new project8();
			 setSize(1950,1950);
		}
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	}

}
