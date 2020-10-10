package com.cruds.swings;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingUtilities;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class ListDemo extends JFrame {
	
	
	private JLabel label;
	private JList<String> techlist;
	private String[] techarray={"java","c++",".net"};
	
	public ListDemo() {
		setTitle("JList Example");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout());
		panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
		
		techlist=new JList<String>(techarray);
		techlist.addListSelectionListener(new ListSelectionListener() {
			
			@Override
			public void valueChanged(ListSelectionEvent e) {
				if(! e.getValueIsAdjusting())
				{
					String techname=techlist.getSelectedValue();
					label.setText(techname);
				}
				
			}
		});
		
		JScrollPane pane = new JScrollPane();
		pane.getViewport().add(techlist);
		pane.setPreferredSize(new Dimension(250, 200));
		
		panel.add(pane);
		label = new JLabel("Tech?");
		add(label, BorderLayout.SOUTH); // add label to frame

		add(panel); // add jpanel to frame
		pack();

		setLocationRelativeTo(null);
		setVisible(true);

	}

	public static void main(String[] args) {
		
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				new ListDemo();
				
			}
		});
	}

}
 