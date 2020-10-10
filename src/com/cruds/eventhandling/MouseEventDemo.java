package com.cruds.eventhandling;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseEventDemo extends Applet implements MouseListener{
	
	
	String msg="";
	
	@Override
	public void init() {
		addMouseListener(this);//applet himself acts as both source and listener , so it should register to itself
	}

	@Override
	public void paint(Graphics g) {
		g.drawString(msg, 100, 100);
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		//System.out.println("mouse clicked");// output is obatined on console
		msg ="mouse clicked" + e.getX() + ":" +e.getY();// output on applet window
		repaint();
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		//System.out.println("mouse entered");
		msg ="mouse enetred";
		repaint();//when changes happen we need to repaint 
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		//System.out.println("mouse exited");
		msg ="mouse exited";
		repaint();
	}

	@Override
	public void mousePressed(MouseEvent e) {
		//System.out.println("mouse pressed");
		msg ="mouse pressed";
		repaint();
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		//System.out.println("mouse released");
		msg ="mouse released";
		repaint();
	}

}
