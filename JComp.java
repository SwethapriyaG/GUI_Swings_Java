//Program to demonstrate JMenu, JCheckBox, JRadioButton, JTextField, JTextArea

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

class JComp extends JFrame
{
	JComp()
	{
		Container c = this.getContentPane();
		c.setLayout(null);
		
		JLabel n = new JLabel("Name");
		n.setBounds(100,100,130,25);
		c.add(n);
		
		JTextField t = new JTextField();
		t.setBounds(250,100,130,35);
		c.add(t);
		
		
		JLabel a = new JLabel("Address");
		a.setBounds(100,170,130,25);
		c.add(a);
		
		
		JTextArea addr = new JTextArea();
		addr.setBounds(250,170,130,100);
		c.add(addr);
		
		JLabel g = new JLabel("Gender");
		g.setBounds(100,300,130,25);
		c.add(g);
		
		JRadioButton m = new JRadioButton("M");
		m.setBounds(250,300,75,25);
		c.add(m);
		
		JRadioButton f = new JRadioButton("F");
		f.setBounds(335,300,75,25);
		c.add(f);
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(m);
		bg.add(f);
		
		JLabel ln = new JLabel("Languages");
		ln.setBounds(100,350,130,25);
		c.add(ln);
		
		JCheckBox c1 = new JCheckBox("Swedish");
		c1.setBounds(250,350,75,25);
		c.add(c1);
		
		JCheckBox c2 = new JCheckBox("Swedish");
		c2.setBounds(335,350,75,25);
		c.add(c2);
		
		JButton submit = new JButton("Submit");
		submit.setBounds(165,400,150,35);
		c.add(submit);
		
			
	}	
	
	public static void main(String ar[])
	
	{
		JComp f = new JComp();
		f.setSize(500,400);
		f.setVisible(true);
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	    
	}
	
}			