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
