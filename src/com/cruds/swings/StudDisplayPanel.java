package com.cruds.swings;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import com.cruds.db.StudentDAO;

public class StudDisplayPanel extends JPanel {

	JButton btnBack;
	JFrame parent;
	JPanel currentPanel;
	
	JLabel lblName,lblRollno,lblline,lblcity,lblpin,lblAddress;
	JTextField txtName,txtRollno,txtLine,txtCity,txtPin,txtaddress;
	JButton btnClick;
	JPanel panel=new JPanel();
	
	JTable table , ADDRESS;
	JScrollPane scrollPane,addresspane;
	JButton btndel;
	Vector<String> colNames= new Vector<>();
	
	
	StudDisplayPanel(JFrame parent)
	{
		this.parent=parent;
		currentPanel=this;
		btnBack=new JButton("back");
		
		/*StudentDAO dao=new StudentDAO();
		table=new JTable(new DefaultTableModel(dao.getAllStuddentsForJTable(),colNames));*/
		colNames.add("rollno :");
		colNames.add("names :");

		colNames.add("line :");
		colNames.add("city :");
		colNames.add("pin :"); 
		StudentDAO dao2=new StudentDAO();
		table=new JTable(new DefaultTableModel(dao2.getAllStuddentsForJTable(),colNames));
		
		btndel=new JButton("delete");
		btndel.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				int index=table.getSelectedRow();
				
				String selrollno= (String)table.getModel().getValueAt(index,0);
				//roll no is taken as string bcz vector is defined as string.
				StudentDAO dao=new StudentDAO();
				dao.delete(Integer.parseInt(selrollno));
				table.setModel(new DefaultTableModel(dao.getAllStuddentsForJTable(),colNames));
				
				
				
			}
		});
		
		btnBack.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				
				//another way of creating table.
				parent.remove(currentPanel);
				parent.add(new StudCreatePanel(parent));
				parent.revalidate();
				
			}
		});
		
		
		panel.add(btndel);
		scrollPane=new JScrollPane(table);
		 add(scrollPane);
		
		add(btnBack);
		 
		
	}
	
}
