package project;
import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

import javax.swing.*;
public class projecttt3 extends JFrame implements ActionListener {
	JButton b1,b2,b6;
	JLabel l1;
	JTextField t0,t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11;
	projecttt3() throws Exception
	{
		 b1=new JButton("Update");
			b1.setBounds(700,870,100,50);
			add(b1);
			b1.addActionListener(this);
			 b2=new JButton("Search");
				b2.setBounds(850,870,100,50);
				add(b2);
				b2.addActionListener(this);
			ImageIcon i6 = new ImageIcon("D:\\Java project\\ICONS\\backs.png");
			b6=new JButton("Back",i6);
			b6.setBounds(1000,870,100,50);
			add(b6);
			b6.addActionListener(this);
			l1=new JLabel("Enter Id");
			t0=new JTextField();
			t1 = new JTextField();
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

			JLabel l4 = new JLabel("SerialNumber")	;
			JLabel l5 = new JLabel("Date")	;
			JLabel l6 = new JLabel("ID")	;
			JLabel l7 = new JLabel("Name")	;
			JLabel l8 = new JLabel("Age")	;
			JLabel l9 = new JLabel("Gender")	;
			JLabel l10 = new JLabel("Address")	;
			JLabel l11 = new JLabel("MobileNumber")	;
			JLabel l12 = new JLabel("MaritialStatus")	;
			JLabel l13 = new JLabel("DiseaseName")	;
			JLabel l14 = new JLabel("WardNumber")	;
			
			l1.setBounds(850,830,100,20);
			t0.setBounds(850,850,100,20);
			t1.setBounds(30,800,170,30);
			t2.setBounds(200,800,170,30);
			t3.setBounds(370,800,170,30);
			t4.setBounds(540,800,170,30);
			t5.setBounds(710,800,170,30);
			t6.setBounds(880,800,170,30);
			t7.setBounds(1050,800,170,30);
			t8.setBounds(1220,800,170,30);
			t9.setBounds(1390,800,170,30);
			t10.setBounds(1560,800,170,30);
			t11.setBounds(1730,800,170,30);

			l4.setBounds(30,780,170,20);
			l5.setBounds(200,780,170,20);
			l6.setBounds(370,780,170,20);
			l7.setBounds(540,780,170,20);
			l8.setBounds(710,780,170,20);
			l9.setBounds(880,780,170,20);
			l10.setBounds(1050,780,170,20);
			l11.setBounds(1220,780,170,20);
			l12.setBounds(1390,780,170,20);
			l13.setBounds(1560,780,170,20);
			l14.setBounds(1730,780,170,20);
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
			add(t0);
			add(l1);
			add(l4);
			add(l5);
			add(l6);
			add(l7);
			add(l8);
			add(l9);
			add(l10);
			add(l11);
			add(l12);
			add(l13);
			add(l14);
		 try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","rishab123");
		Statement stm=con.createStatement();
	    String sql = "select SerialNumber,Date,ID,Name,Age,Gender,Address,MobileNumber,MaritialStatus,DiseaseName,WardNumber from patient";
	    ResultSet rs=stm.executeQuery(sql);
	    
	    String[] columns = {"SerialNumber","Date","ID","Name","Age","Gender","Address","MobileNumber","MaritialStatus","DiseaseName","WardNumber"};
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
          
                String Disease = rs.getString("DiseaseName");
             
                int Ward = rs.getInt("WardNumber");
                
                Object [] data = {Serial,Date,Id,Name,Age,Gender,Address,Number,Status,Disease,Ward};
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
		projecttt3 ob=new projecttt3();

}
	public void actionPerformed(ActionEvent ae) {
		ResultSet rs=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","rishab123");
			Statement stm=con.createStatement();
			
			if(ae.getActionCommand().contentEquals("Search"))
			{	
				String nn=t0.getText();
				//int k=Integer.parseInt(nn);
		rs=	stm.executeQuery("select * from patient where ID='"+nn+"'");
			while(rs.next())
			{
				int Serial1 = rs.getInt("SerialNumber");
                String str=Integer.toString(Serial1);
                String Date1 = rs.getString("Date");
                String Id1 = rs.getString("ID");
                String Name1 = rs.getString("Name");            
                int Age1 = rs.getInt("Age");   
                String str1=Integer.toString(Age1);
                String Gender1 = rs.getString("Gender");             
                String Address1 = rs.getString("Address");          
                String Number1 = rs.getString("MobileNumber");           
                String Status1 = rs.getString("MaritialStatus");          
                String Disease1 = rs.getString("DiseaseName");             
                int Ward1 = rs.getInt("WardNumber");
                String str2=Integer.toString(Ward1);
			
            	t1.setText(str);
				t2.setText(Date1);
				t3.setText(Id1);
				t4.setText(Name1);
				t5.setText(str1);
				t6.setText(Gender1);
				t7.setText(Address1);
				t8.setText(Number1);
				t9.setText(Status1);
				t10.setText(Disease1);
				t11.setText(str2);
			
			
				
			}
			}
			else if(ae.getActionCommand().equals("Update"))
			{
				String Serial1 =t1.getText();
				String Date1 =t2.getText();
				String Id1 =t3.getText();
				String Name1 =t4.getText();
				String str1 =t5.getText();
				String Gender1 =t6.getText();
				String Address1 =t7.getText();
				String Number1 =t8.getText();
				String Status1 =t9.getText();
				String Disease1 =t10.getText();
				String str2 =t11.getText();
			System.out.println(Serial1+Date1+Id1+Name1+str1+Gender1+Address1+Number1+Status1+Disease1+str2);
                stm.executeUpdate("update patient set Date='"+Date1+"' ,ID='"+Id1+"' ,Name='"+Name1+"',Age='"+str1+"', Gender='"+Gender1+"' ,Address='"+Address1+"' ,MobileNumber='"+Number1+"' ,MaritialStatus='"+Status1+"',DiseaseName='"+Disease1+"' ,WardNumber='"+str2+"'where ID='"+Id1+"'");			
			projecttt3 ob=new projecttt3();
		}
			else if(ae.getActionCommand().contentEquals("Back"))
			{
				setVisible(false);
				projecttt ob=new projecttt();
				 setSize(1950,1950);
				 }
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
}
}