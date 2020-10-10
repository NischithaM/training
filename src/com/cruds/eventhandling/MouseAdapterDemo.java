package com.cruds.eventhandling;

import java.applet.Applet;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseAdapterDemo extends Applet
{		
	@Override
	public void init() {
		addMouseListener(new MyMouseAdapter(this));  //separation of applet from interface
	}
}

class MyMouseAdapter extends MouseAdapter //interface
{ //adapter class provides empty implementation for all methods. we can override req method and provide implementation 
	Applet parent;
	
	MyMouseAdapter(Applet applet) {
		parent=applet;
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		parent.showStatus("mouse clicked +++");
	}
}