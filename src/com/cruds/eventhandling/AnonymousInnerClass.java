package com.cruds.eventhandling;

import java.applet.Applet;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class AnonymousInnerClass extends Applet{

	
	@Override
	public void init() {
		addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent arg0) {
				showStatus("mouse clicked ***");
			}
			
		});



	}
	
}
