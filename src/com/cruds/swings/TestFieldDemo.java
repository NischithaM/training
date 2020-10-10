package com.cruds.swings;

import java.awt.BorderLayout;
import java.awt.Button;
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
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

import com.cruds.db.StudentDAO;
import com.cruds.exception.SMSException;
import com.cruds.training.Address;
import com.cruds.training.Student;

public class TestFieldDemo extends JFrame
{

	JLabel lblName,lblRollno,lblline,lblcity,lblpin,lblAddress;
	JTextField txtName,txtRollno,txtLine,txtCity,txtPin,txtaddress;
	JButton btnClick;
	JPanel panel;

	JTable table , ADDRESS;
	JScrollPane scrollPane,addresspane;
	JButton btndel;
	Vector<String> colNames= new Vector<>();
	Vector<String> colAddress=new Vector<>();

	public TestFieldDemo() {

		setTitle("jtextfield demo");
		setSize(1000,500);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);


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


		btnClick=new JButton("click");
		btnClick.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String name=txtName.getText().trim();
				String rollno=txtRollno.getText().trim();
				String line=txtLine.getText().trim();
				String city=txtCity.getText().trim();
				String pin=txtPin.getText().trim();
				//String address=txtaddress.getText().trim();
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

						table.setModel(new DefaultTableModel(dao.getAllStuddentsForJTable(),colNames));
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

		colNames.add("rollno :");
		colNames.add("names :");

		colNames.add("line :");
		colNames.add("city :");
		colNames.add("pin :");

		StudentDAO dao=new StudentDAO();
		table=new JTable(new DefaultTableModel(dao.getAllStuddentsForJTable(),colNames));//another way of creating table.

		scrollPane=new JScrollPane(table);

		btndel=new JButton("delete");
		btndel.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				int index=table.getSelectedRow();
				int index2=table.getSelectedRow();

				String selrollno= (String)table.getModel().getValueAt(index,0);
				//roll no is taken as string bcz vector is defined as string.
				StudentDAO dao=new StudentDAO();
				dao.delete(Integer.parseInt(selrollno));
				table.setModel(new DefaultTableModel(dao.getAllStuddentsForJTable(),colNames));



			}
		});

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


		panel.add(btnClick);
		panel.add(scrollPane);

		panel.add(btndel);
		add(panel);


		setVisible(true);
	}
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				new TestFieldDemo();

			}
		});
	}
}
