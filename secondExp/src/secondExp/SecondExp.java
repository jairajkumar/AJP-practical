package secondExp;

import java.awt.*;
import java.awt.event.*;

public class SecondExp extends Frame implements MouseListener {
	String str;
	Frame f;
	TextField tf;

	SecondExp() {
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
		SecondExp obj1 = new SecondExp();
	}
}
