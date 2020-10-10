package com.cruds.swings;

import java.awt.BorderLayout;
import java.awt.ScrollPane;
import java.awt.Scrollbar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

import com.cruds.db.StudentDAO;

public class JTableDemo extends JFrame {
	
	
	JTable table;
	JScrollPane scrollPane;
	JButton btndel;
	
	/*Object[] colNames={"rollno " ,"names "};
	Object[][] data={{"101" ,"sada"},
					 {"102" ,"rada"}
	                };
	*/
	
	
	Vector<String> colNames= new Vector<>();//vectors are thread safe , swings are multi threaded, so better to use vector.
	//Vector<Vector<String>> data=new Vector<>();//arraylist are not thread safe
	
	public JTableDemo() {
		
		setTitle("JTable demo");
		setSize(300,300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
		colNames.add("rollno :");
		colNames.add("names :");
		
		/*Vector<String> row1=new Vector<>();
		row1.add("101");
		row1.add("dada");
		
		
		Vector<String> row2=new Vector<>();
		row2.add("102");
		row2.add("sada");
		
		data.add(row1);
		data.add(row2);*/
		
		//table=new JTable(data,colNames);
		
		StudentDAO dao=new StudentDAO();
		table=new JTable(new DefaultTableModel(dao.getAllStuddentsForJTable(),colNames));//another way of creating table.
		scrollPane=new JScrollPane(table);
		
		btndel=new JButton("delete");
		btndel.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				int index=table.getSelectedRow();
				//System.out.println(index);
				/*data.remove(index);// to remove selected index
				table.setModel(new DefaultTableModel(data,colNames));*/// to merge the table with the updated model
				//if we create object,its is long process when data increases and waste of resources.we can just merge table with model data.
				//if we dont call this, data will be displayed even after deletion ,we need to repaint to show updation of table.
				
				String selrollno= (String)table.getModel().getValueAt(index,0);//roll no is taken as string bcz vector is defined as string.
				StudentDAO dao=new StudentDAO();
				dao.delete(Integer.parseInt(selrollno));
				table.setModel(new DefaultTableModel(dao.getAllStuddentsForJTable(),colNames));
				
			}
		});
		
		add(scrollPane);
		add(btndel,BorderLayout.SOUTH);
		setVisible(true);
		
 }
	
public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				new JTableDemo();
			}
		});

	}

}
