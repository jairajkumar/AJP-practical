package secondProject;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseMotionListener;

public class secondapplet extends Applet implements KeyListener {
	String str;

	public void init() {
		addKeyListener(this);
	}

	@Override
	public void keyPressed(KeyEvent e) {
		str = "Key Pressed";
		showStatus("Key is Pressed");
		repaint();
	}

	@Override
	public void keyReleased(KeyEvent e) {
		str = "Key Released";
		showStatus("Key is Released");
		repaint();
	}

	@Override
	public void keyTyped(KeyEvent e) {
		char key = e.getKeyChar();
		str = "Key Typed : ";
		str += key;
		showStatus("Key is Typed");
		repaint();
	}

	public void paint(Graphics g) {
		g.drawString(str, 50, 50);
	}

}



// EXP2


package secondProject;

import java.awt.*;
import java.awt.event.*;

public class secondExp extends Frame implements MouseListener {
	String str;
	Frame f;
	TextField tf;

	secondExp() {
		f = new Frame("Mouse Action");
		f.setSize(300, 300);
		f.setLayout(new FlowLayout());
		tf = new TextField("Mouse Event");
		tf.setSize(100, 50);
		f.add(tf);
		f.addMouseListener(this);
		f.setVisible(true);
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				f.dispose();
			}
		});
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		str = "Mouse Clicked";
		tf.setText(str);
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		str = "Mouse Entered";
		tf.setText(str);
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		str = "Mouse Exited";
		tf.setText(str);
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		str = "Mouse Button Pressed";
		tf.setText(str);
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		str = "Mouse Button Released";
		tf.setText(str);
	}

	public static void main(String[] args) {
		secondExp obj = new secondExp();
	}
}



// EXP 3



package secondProject;

import java.awt.*;
import java.awt.event.*;

public class thirdExp {
	Frame f, f2;
	TextField tf1, tf2, tf3, tf4, tf5, tfn;

	thirdExp() {
		f = new Frame("Student Result");
		f.setLayout(null);
		f.setSize(800, 800);
		f.setVisible(true);
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				f.dispose();
			}
		});
		Label ln = new Label("Enter Name");
		ln.setBounds(10, 50, 90, 20);
		f.add(ln);
		tfn = new TextField();
		tfn.setBounds(100, 50, 100, 20);
		f.add(tfn);
		Label l = new Label("Subject");
		l.setBounds(10, 80, 50, 20);
		f.add(l);
		Label l1 = new Label("Enter Marks: ");
		l1.setBounds(70, 80, 70, 20);
		f.add(l1);
		Label l2 = new Label("Marathi");
		l2.setBounds(10, 110, 60, 20);
		f.add(l2);
		tf1 = new TextField();
		tf1.setBounds(70, 110, 70, 20);
		f.add(tf1);
		Label l3 = new Label("Hindi");
		l3.setBounds(10, 140, 60, 20);
		f.add(l3);
		tf2 = new TextField();
		tf2.setBounds(70, 140, 70, 20);
		f.add(tf2);
		Label l4 = new Label("English");
		l4.setBounds(10, 170, 60, 20);
		f.add(l4);
		tf3 = new TextField();
		tf3.setBounds(70, 170, 70, 20);
		f.add(tf3);
		Label l5 = new Label("Maths");
		l5.setBounds(10, 200, 60, 20);
		f.add(l5);
		tf4 = new TextField();
		tf4.setBounds(70, 200, 70, 20);
		f.add(tf4);
		Label l6 = new Label("Science");
		l6.setBounds(10, 230, 60, 20);
		f.add(l6);
		tf5 = new TextField();
		tf5.setBounds(70, 230, 70, 20);
		f.add(tf5);
		Button b = new Button("Submit");
		b.setBounds(30, 270, 50, 20);
		f.add(b);
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				f2 = new Frame("Student Result");
				f2.setLayout(null);
				f2.setSize(400, 400);
				f2.setVisible(true);
				f2.addWindowListener(new WindowAdapter() {
					public void windowClosing(WindowEvent e) {
						f2.dispose();
					}
				});
				Label lb = new Label("Result of " + tfn.getText());
				lb.setBounds(10, 30, 200, 20);
				f2.add(lb);
				int s1 = Integer.parseInt(tf1.getText());
				int s2 = Integer.parseInt(tf2.getText());
				int s3 = Integer.parseInt(tf3.getText());
				int s4 = Integer.parseInt(tf4.getText());
				int s5 = Integer.parseInt(tf5.getText());
				Label lb1 = new Label("Marathi: " + s1);
				lb1.setBounds(10, 60, 90, 20);
				f2.add(lb1);
				Label lb2 = new Label("Hindi: " + s2);
				lb2.setBounds(10, 90, 90, 20);
				f2.add(lb2);
				Label lb3 = new Label("English: " + s3);
				lb3.setBounds(10, 120, 90, 20);
				f2.add(lb3);
				Label lb4 = new Label("Maths: " + s4);
				lb4.setBounds(10, 150, 90, 20);
				f2.add(lb4);
				Label lb5 = new Label("Science: " + s5);
				lb5.setBounds(10, 180, 90, 20);
				f2.add(lb5);
				int sum = s1 + s2 + s3 + s4 + s5;
				float pctg = (float) sum / 5;
				Label lb6 = new Label("Total Marks : " + sum);
				lb6.setBounds(10, 210, 100, 20);
				f2.add(lb6);
				Label lb7 = new Label("Percentage : " + pctg);
				lb7.setBounds(10, 240, 100, 20);
				f2.add(lb7);
				String str;
				if (pctg >= 40) {
					str = "PASS";
				} else {
					str = "FAIL";
				}
				Label lb8 = new Label("Status : " + str);
				lb8.setBounds(10, 270, 100, 20);
				f2.add(lb8);

			}
		});
	}

	public static void main(String[] args) {
		thirdExp ex = new thirdExp();
	}
}




// EXP 4


package secondProject;

import java.security.acl.LastOwnerException;
import java.sql.*;

public class exp4 {
	public static void main(String[] args) { //Create database : "jdbcdb" 
		//Create table in this database
		/*
		CREATE TABLE studentdata ( SrNo INT(5), RollNo INT(6), first_name VARCHAR(255), last_name VARCHAR(255), email_id VARCHAR(255), mobile BIGINT(10)
		); */
		String url = "jdbc:mysql://localhost:3306/jdbcdb"; 
		String usr = "root"; 
		String psw = "Jairaj@31"; 
		String query1 = "insert into studentdata values(1, 304, 'Karan', 'Kumar', 'abc@gmail.com', 1239874560)"; 
		String query2 = "select * from studentdata"; 
		
		try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,
		usr, psw);
		Statement stmt = con.createStatement();
		System.out.println("Inserting data...");
		stmt.execute(query1);
		System.out.println("Data after insertion..."); 
		ResultSet rs = stmt.executeQuery(query2); 
		System.out.println("Sr.No. " + "Roll No. " + "First	Name " + "Last Name " + " Email ID " + " Mobile No.");
		while(rs.next()){ System.out.println(" " + rs.getInt("SrNo") +
		" " + rs.getInt("RollNo") +	" "+rs.getString("first_name")+ " "+ " " + "" + rs.getString("last_name")
					+" "	+ " " + " " + rs.getString("email_id") + 
		rs.getString("mobile"));  
		}
		} catch (SQLException e) { e.printStackTrace();
		} catch (ClassNotFoundException e) { e.printStackTrace();
		} }

}





// EXP6



package secondProject;

import java.net.*;

public class exp6 {
	public static void main(String args[]) throws UnknownHostException {
		System.out.println("Details of Machine getLocalHost(): ");
		InetAddress Address = InetAddress.getLocalHost();
		System.out.println(Address);
		System.out.println();
		System.out.println("Details of Machine getByName(): ");
//		Address = InetAddress.getByName("DESKTOP-6BINVTE"); // PC Name System.out.println(Address);
		System.out.println();
		System.out.println("Details 'www.google.com' getByName(): ");
		InetAddress SW1[] = InetAddress.getAllByName("www.google.com");
		for (int i = 0; i < SW1.length; i++)
			System.out.println(SW1[i]);
		System.out.println();
		System.out.println("Details 'www.sinhgad.com' getByName(): ");
		InetAddress SW2[] = InetAddress.getAllByName("www.sinhgad.com");
		for (int i = 0; i < SW2.length; i++)
			System.out.println(SW2[i]);
	}

}






// EXP 9

// HTML FILE
<!DOCTYPE html> 
<html> 
<head> 
<meta charset="ISO-8859-1"> 
<title>AJP Exp-9</title> 
</head>
<body>
<form action="index.jsp"> 
<label>Enter the number : 
</label> 
<input type="text" name="un"> 
<input type="submit" value="Submit"> 
<br>
</form>
</body> 
</html>



// JSP FILE
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>

<body>
	<h1>Welcome to JSP</h1>
	<br>
	<% String n=request.getParameter("un"); 
	int no=Integer.parseInt(n); 
	out.println("number entered is : " + no); 
	out.println(" <br> <br>"); 
	out.println("Cube of Number: " + no*no*no);
            %>
</body>

</html>