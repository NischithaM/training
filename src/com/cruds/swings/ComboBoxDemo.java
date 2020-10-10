package com.cruds.swings;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class ComboBoxDemo extends JFrame {
	
	final String[] deptid={"1","2","3","4"};
	final String[] deptname={"CSE","ISE","CV","EC"};
	
	private JLabel lblDept=null;
	private JComboBox<String> deptcombo=new JComboBox<>(deptid);
	private JPanel panel;
	
	public ComboBoxDemo() {
		setTitle("JComboBox Demo");
		setSize(300, 300);

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);

		panel=new JPanel();
		
		lblDept=new JLabel();
		lblDept.setPreferredSize(new Dimension(100,127));
		lblDept.setMaximumSize(new Dimension(100,127));
		
		panel.add(lblDept);
		
		deptcombo.setSelectedIndex(-1);
		deptcombo.setPreferredSize(new Dimension(140,22));
		deptcombo.setMaximumSize(new Dimension(140,22));
		
		deptcombo.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent ae) {
			
				int index=deptcombo.getSelectedIndex();
				String deptName=deptname[index];
				lblDept.setText(deptName);
				
			}
		});
		
		panel.add(deptcombo);
		add(panel);
		//setVisible(true);
		
	}

	public static void main(String[] args) {
		
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				new ComboBoxDemo();
				
			}
		});
	}

}
