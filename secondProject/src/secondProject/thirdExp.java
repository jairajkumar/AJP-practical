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
