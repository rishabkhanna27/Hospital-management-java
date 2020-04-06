package project;
import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

import javax.swing.*;
public class projectrec5 extends JFrame implements ActionListener{
	JButton b1;
	JTextField t1;
	projectrec5() throws Exception
	{
		 b1=new JButton("Delete");
		 t1=new JTextField(8);
		 t1.setBounds(880,900,100,30);
			add(t1);
			b1.setBounds(950,950,100,50);
			add(b1);
			
			b1.addActionListener(this);
			ImageIcon i6 = new ImageIcon("D:\\Java project\\ICONS\\backs.png");
			JButton b6=new JButton("Back",i6);
			b6.setBounds(800,950,100,50);
			add(b6);
			b6.addActionListener(this);
			
		
			 try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","rishab123");
					Statement stm=con.createStatement();
				    String sql = "select SerialNumber,Date,ID,Name,Age,Gender,Address,MobileNumber,MaritialStatus,BloodGroup,Email,Username,Password from recptionist";
				    ResultSet rs=stm.executeQuery(sql);
				    
				    String[] columns = {"SerialNumber","Date","ID","Name","Age","Gender","Address","MobileNumber","MaritialStatus","BloodGroup","Email","Username","Password"};
				    DefaultTableModel tableModel = new DefaultTableModel(columns, 0);
			            while (rs.next()) {
			                int Serial = rs.getInt("SerialNumber");
			                
			                String Date = rs.getString("Date");
			                String Id = rs.getString("ID");
			               
			                String Name = rs.getString("Name");
			            
			                int Age = rs.getInt("Age");
			             
			                String Gender = rs.getString("Gender");
			             
			                String Address = rs.getString("Address");
			          
			                String Number = rs.getString("MobileNumber");
			           
			                String Status = rs.getString("MaritialStatus");
			          
			                String blood = rs.getString("BloodGroup");
			             
			                String email = rs.getString("Email");
			                
			                String user = rs.getString("Username");
			                
			                String pass = rs.getString("Password");
			                
			                Object [] data = {Serial,Date,Id,Name,Age,Gender,Address,Number,Status,blood,email,user,pass};
			                tableModel.addRow(data);
			            };
			            JTable jt = new JTable(tableModel);
			            JScrollPane jps = new JScrollPane(jt);
			            add(jps);
		}
		 
		catch(SQLException e)
		{
			System.out.println(e);
		}
	
		 setSize(1950,1950);
			setVisible(true);
			
			addWindowListener (new WindowAdapter() 
			{
			public void windowclosing(WindowEvent we)
				{
					System.exit(0);
				}
			}) ;
			
			
	}
	
	public static void main(String[] args) throws Exception  {
		projectrec5 ob=new projectrec5();

}

	public void actionPerformed(ActionEvent ae) {
		ResultSet rs;
		// TODO Auto-generated method stub
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","rishab123");
			Statement stm=con.createStatement();
			if(ae.getActionCommand().contentEquals("Delete"))
			{
			String nn=t1.getText();
			int k=Integer.parseInt(nn);
	  stm.executeUpdate("delete from recptionist where SerialNumber='"+k+"'");
	  setVisible(false);
	  
	  projectrec5 ob=new projectrec5();
	  setSize(1950,1950);
	
			}
			else if(ae.getActionCommand().contentEquals("Back"))
			{
				setVisible(false);
				projectrec ob=new projectrec();
				 setSize(1950,1950);
	
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
}

	}
