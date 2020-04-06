package project;
import javax.swing.*; 
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import javax.swing.event.*;
import javax.swing.table.*;
public class projectdoc66 extends JFrame implements ActionListener{
	
projectdoc66() throws Exception
{
final JTextField t0 = new JTextField(15);
setTitle("Searching In JTable");
JLabel l1 = new JLabel("Search");
ImageIcon i6 = new ImageIcon("D:\\Java project\\ICONS\\backs.png");
JButton b6=new JButton("Back",i6);
b6.setBounds(800,950,100,50);
add(b6);
b6.addActionListener(this);


setDefaultCloseOperation(EXIT_ON_CLOSE); 

try {
Class.forName("com.mysql.jdbc.Driver");
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","rishab123");
Statement stm=con.createStatement();
String sql = "select SerialNumber,DOJ,ID,Name,Age,Gender,Username,Department,MobileNumber,MaritialStatus,Email,WardNumber,Password from doctor";
String[] columns = {"SerialNumber","DOJ","ID","Name","Age","Gender","Username","Department","MobileNumber","MaritialStatus","Email","WardNumber","Password"};
ResultSet rs=stm.executeQuery(sql);
DefaultTableModel model = new DefaultTableModel(columns, 0);
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
    String Password = rs.getString("Password");
    
    Object [] data = {Serial,DOJ,Id,Name,Age,Gender,Username,Department,Number,Status,Email,Ward,Password};
    model.addRow(data);
}
JTable tabel1 = new JTable(model);
JScrollPane jps = new JScrollPane(tabel1);



TableRowSorter<TableModel> sorter1 = new TableRowSorter<>(model); 
tabel1.setRowSorter(sorter1);
setLayout(null);




add(t0);
t0.setBounds(900,900,100,20);
add(l1);
l1.setBounds(850,885,100,50);
add(jps);
jps.setBounds(10,10,1900,1900);
t0.getDocument().addDocumentListener(new DocumentListener(){
public void insertUpdate(DocumentEvent e) {
search(t0.getText());

}
public void removeUpdate(DocumentEvent e) {
search(t0.getText());
}
public void changedUpdate(DocumentEvent e) {
search(t0.getText());
}
public void search(String s)
{
if (s.length() == 0) {

sorter1.setRowFilter(null);
} 
else {

sorter1.setRowFilter(RowFilter.regexFilter(s));
}
}
});
setSize(1950,1950);
setVisible(true);

}
catch(Exception e)
{
	System.out.println(e);
}
}


public static void main(String[] args) throws Exception  {

projectdoc66 x= new projectdoc66();

}


@Override
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
	}
		catch(Exception e)
	{
			System.out.println(e);
	}
	
}
}

