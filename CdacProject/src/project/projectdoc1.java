package project;
import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;

public class projectdoc1 extends JFrame implements ActionListener{
	JButton b1;
	JTextField t1;
	projectdoc1() throws Exception
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
	    String sql = "select SerialNumber,DOJ,ID,Name,Age,Gender,Username,Department,MobileNumber,MaritialStatus,Email,WardNumber,Password from doctor";
	    ResultSet rs=stm.executeQuery(sql);
	    
	    String[] columns = {"SerialNumber","DOJ","ID","Name","Age","Gender","Username","Department","MobileNumber","MaritialStatus","Email","WardNumber","Password"};
	    DefaultTableModel tableModel = new DefaultTableModel(columns, 0);
            while (rs.next()) {
                int Serial = rs.getInt("SerialNumber");
                String DOJ = rs.getString("DOJ");
                String Id = rs.getString("ID");
                String Name = rs.getString("Name");
                int Age = rs.getInt("Age");
                String Gender = rs.getString("Gender");
                String Username = rs.getString("Username");
                String Department = rs.getString("Department");
                String Number = rs.getString("MobileNumber");
                String Status = rs.getString("MaritialStatus");
                String Email = rs.getString("Email");
                int Ward = rs.getInt("WardNumber");
                String Password= rs.getString("Password");
                
                Object [] data = {Serial,DOJ,Id,Name,Age,Gender,Username,Department,Number,Status,Email,Ward,Password};
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
		projectdoc1 ob=new projectdoc1();

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
	  stm.executeUpdate("delete from patient where SerialNumber='"+k+"'");
	  setVisible(false);
	  
	  projectdoc1 ob=new projectdoc1();
	  setSize(1950,1950);
	
			}
			else if(ae.getActionCommand().contentEquals("Back"))
			{
				setVisible(false);
				projectdoc ob=new projectdoc();
				 setSize(1950,1950);
	
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
}

	}
