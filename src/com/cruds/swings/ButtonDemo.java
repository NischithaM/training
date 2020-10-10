package com.cruds.swings;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class ButtonDemo  extends JFrame{
	
	
	JButton btnclose;
	JButton btnping;
	JPanel panel;
	
	 ButtonDemo() {
		
		 
		 //System.out.println("cons" +new Thre);
		 
		setTitle("button demo");
		setSize(300,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		 panel= new JPanel();
			
		btnclose =new JButton("close");
		btnping=new JButton("ping");
		
		btnping.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				getToolkit().beep();
			}
		});
		
		btnclose.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//System.out.println("button");
				System.exit(0);
				
			}
		});
		
		/*add(btnclose);//add to frame
		add(btnping.paintBorder("south");*/
		
		
		panel.add(btnclose);//add to jpanel
		panel.add(btnping);
		add(panel);//add jpnael to frame
		
		setVisible(true);
		
	}

	public static void main(String[] args) {
		
		//new ButtonDemo();

			SwingUtilities.invokeLater(new Runnable() {
				
				@Override
				public void run() {
					new ButtonDemo();
					
				}
			});
	}

}
