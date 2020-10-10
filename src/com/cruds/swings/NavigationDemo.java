package com.cruds.swings;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class NavigationDemo extends JFrame {

	JFrame parent;
	
	NavigationDemo()
	{
		parent=this;// frame handle - removing and adding of panel is frame responsiblity.
		setTitle("navigation demo");
		setSize(1000,1000);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		add(new StudCreatePanel(parent));//creation is handled by parent framework
		//only create panel is added bcz first create panel will be displayed ,next create enroutes to display ,
		//so display is called in create panel.
		
		setVisible(true);
	}
	
	
	
	public static void main(String[] args) {
		
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				new NavigationDemo();
				
			}
		});
	}

	
	
}
