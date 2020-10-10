package com.cruds.swings;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JLabel;

public class FrameDemo extends Frame 
{

	
	
	public FrameDemo() {
		setTitle("AWT demo");
		setSize(100,200);
		setLocation(100,100);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		Frame f=new FrameDemo();
		
		f.addWindowListener(new WindowAdapter() {
			//adapter class provides implementation for required methods.where as listener provides list of all methods
			// of the specified class and its implementation.
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
}
