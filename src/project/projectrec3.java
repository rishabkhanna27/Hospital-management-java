package project;
import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

import javax.swing.*;
public class projectrec3 extends JFrame implements ActionListener{
	JButton b6;
	
	projectrec3() throws Exception
	{
		ImageIcon i6 = new ImageIcon("D:\\Java project\\ICONS\\backs.png");
		b6=new JButton("Back",i6);
		b6.setBounds(900,950,100,50);
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
                String Disease = rs.getString("BloodGroup");
                String email = rs.getString("Email");
                String user = rs.getString("Username");
                String pass = rs.getString("Password");
                
                	
                
                
                Object [] data = {Serial,Date,Id,Name,Age,Gender,Address,Number,Status,Disease,email,user,pass};
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
		projectrec3 ob=new projectrec3();

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
