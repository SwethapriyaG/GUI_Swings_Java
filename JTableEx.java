//Program to demonstrate JTable

import javax.swing.*;
import java.awt.*;
import java.lang.*;
import java.util.*;

class JTableEx extends JFrame
{
	JTableEx()
	{
		FlowLayout fl = new FlowLayout();
		this.setLayout(fl);
		
		Container c =  this.getContentPane();
		
		// String rows[][]={{"1","Swetha","98"},{"2","Priya","99"}};
		// String cols[]={"R.No","Name","Marks"};
		
		Vector<Vector> rows = new Vector<Vector>();
		Vector rowone = new Vector();
		rowone.add("1");
		rowone.add("Swetha");
		rowone.add("98");
		
		Vector rowtwo = new Vector();
		rowtwo.add("2");
		rowtwo.add("Priya");
		rowtwo.add("99");
		
		rows.add(rowone);
		rows.add(rowtwo);
		
		Vector cols = new Vector();
		cols.add("R.No");
		cols.add("Name");
		cols.add("Marks");
		
		
		JTable t = new JTable(rows,cols);
		JScrollPane jsp = new JScrollPane(t);
		
		c.add(jsp);
		
		
	} 	
	public static void main(String ar[])
	{
		JTableEx f = new JTableEx();
		f.setSize(500,400);
		f.setVisible(true);
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}	
	
}	