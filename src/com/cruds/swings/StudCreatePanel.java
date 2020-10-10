package com.cruds.swings;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import com.cruds.db.StudentDAO;
import com.cruds.exception.SMSException;
import com.cruds.training.Address;
import com.cruds.training.Student;

public class StudCreatePanel extends JPanel
{
	
	JLabel lblName,lblRollno,lblline,lblcity,lblpin,lblAddress;
	JTextField txtName,txtRollno,txtLine,txtCity,txtPin,txtaddress;
	//JButton btnClick;
	JPanel panel;

	JTable table;
	JScrollPane scrollPane,addresspane;
	JButton btndel;
	Vector<String> colNames= new Vector<>();
	
	
	JButton btnCreate;
	JFrame parent;
	JPanel currentPanel;
	
	StudCreatePanel(JFrame parent)//wrt to parent frame,panel is created
	{
		 panel=new JPanel();
		 txtRollno=new JTextField(5);
		 txtName=new JTextField(5);
		 txtLine=new JTextField(5);
		 txtCity=new JTextField(5);
		 txtPin=new JTextField(5);
		 txtaddress=new JTextField(5);
		 
		 
		 lblRollno=new JLabel("roll no:");
		 lblName=new JLabel("name :");
		 lblline=new JLabel("line :");
		 lblcity=new JLabel("city :");
		 lblpin=new JLabel("pin :");
		 lblAddress=new JLabel("address :");
		
		 
		
		this.parent=parent;//handling wrt to parent-frame
		currentPanel=this;//create panel
		btnCreate=new JButton("create");
		
		btnCreate.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				String name=txtName.getText().trim();
				String rollno=txtRollno.getText().trim();
				String line=txtLine.getText().trim();
				String city=txtCity.getText().trim();
				String pin=txtPin.getText().trim();
				

				
				
				try
				{
					if(name.equals("") || rollno.equals("") || line.equals("")  || city.equals("") || pin.equals(""))
					{
						JOptionPane.showMessageDialog(panel, "rollno , name , address cannot be empty", "warning", JOptionPane.WARNING_MESSAGE);
						return;
					}
					
					
					
					Address ad=new Address(line, city, pin);
					Student s=new Student(Integer.parseInt(rollno), name,ad);
					
					StudentDAO dao=new StudentDAO();
					if(dao.create(s))
					{
						
						txtLine.setText("");
						txtCity.setText("");
						txtPin.setText("");
						
						txtRollno.setText("");
						txtName.setText("");
						txtaddress.setText("");
						
					    //table.setModel(new DefaultTableModel(dao.getAllStuddentsForJTable(),colNames));
					    parent.remove(currentPanel);//remove current create panel
						parent.add(new StudDisplayPanel(parent));//add display panel to place of create
						parent.revalidate();//replacement oprn
						JOptionPane.showMessageDialog(panel, "student added successfully", "success", JOptionPane.INFORMATION_MESSAGE);
						
					}
					
				}catch(NumberFormatException nfe)
				{
					getToolkit().beep();
					JOptionPane.showMessageDialog(panel, "inavlid rollno", "error", JOptionPane.ERROR_MESSAGE);
				}
				catch(NullPointerException npe)
				{
					npe.printStackTrace();
				}
				catch(SMSException smse)
				{
					getToolkit().beep();
					JOptionPane.showMessageDialog(panel, smse.getInfo(), "error", JOptionPane.ERROR_MESSAGE);
				}
				
				
			}
		});
			
			
			scrollPane=new JScrollPane(table);
			 add(scrollPane);
				
			 panel.add(lblRollno);
			 panel.add(txtRollno);
			 
			 panel.add(lblName);
			 panel.add(txtName);
			 
			 
			 panel.add(lblline);
			 panel.add(txtLine);
			
			 panel.add(lblcity);
			 panel.add(txtCity);
			
			 panel.add(lblpin);
			 panel.add(txtPin);
			 
			panel.add(scrollPane);
			add(panel);
		
		add(btnCreate);
	}
	
	
}

/*parent JFRAME- 2 children
				jPanel-create and display
				
*/
