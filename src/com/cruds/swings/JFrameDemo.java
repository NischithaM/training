package com.cruds.swings;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class JFrameDemo extends JFrame {
	
	
	JLabel lblmsg;
	
	  JFrameDemo() {
		
		 setTitle("jframe demo");
		 setSize(1000,500);
		 setLocationRelativeTo(null);//places window to  middle of the screen
		 setDefaultCloseOperation(EXIT_ON_CLOSE);
		 lblmsg=new JLabel("hello world");
		 add(lblmsg);
		 setVisible(true);
	}

	public static void main(String[] args) {
		new JFrameDemo();

	}

}
//swings donot rely on os ,so remains same on evry os system. swings has its own window,donto relay on os to provide window.
//color is dull when compared to awt.