package com.cruds.eventhandling;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyEventDemo extends Applet implements KeyListener{

	String msg=" ";
	
	@Override
	public void init() {
		addKeyListener(this);
	}
	@Override
	public void paint(Graphics g) {
		g.drawString(msg, 100, 100);
	}
	
	@Override
	public void keyPressed(KeyEvent e) {
		msg=msg+e.getKeyChar();
		repaint();
		
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		showStatus("KEY RELEASED ===");
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		showStatus("KEY TYPED +++");
	}

}
