package com.cruds.swings;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class CheckBoxDemo extends JFrame{

	JCheckBox checkbox;
	
	public CheckBoxDemo() {
		
		checkbox = new JCheckBox("java");
		checkbox.setFocusable(false);
		checkbox.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent ae) {
				if(checkbox.isSelected())
				{
					System.out.println("java selected");
				}
				else
				{
					System.out.println("java not selected");
				}
				
			}
		});
		
		add(checkbox);
		setSize(300,200);
		setTitle("checkbox demo");
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

	}
	
	
	
	public static void main(String[] args) {
		
		
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				new CheckBoxDemo();
				
			}
		});
		
	}

}
