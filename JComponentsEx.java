//Program to demonstrate JComponents: JLabel, JButton, Jcombobox, JList

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

class JComponentsEx extends JFrame implements ActionListener
{
	JLabel jl;
	JComponentsEx()
	{
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		FlowLayout fl = new FlowLayout();
		this.setLayout(fl);
		
		Container c = this.getContentPane();
		
		//creating image icon object
		//ImageIcon img = new ImageIcon("download.png");
		ImageIcon img1 = new ImageIcon("images.jpg");
		
		//JButton		
		JButton b1 = new JButton("Click me",img1);
		b1.addActionListener(this);
		c.add(b1);
		
		//JLabel
		 jl = new JLabel();
		c.add(jl);
		
		
		//Jcombo box
		
		// String Countries = {"Asia","Europ","Africa"};
		// JComboBox jc = new JComboBox(Countries);
		JComboBox jc = new JComboBox();
		jc.addItem("India");
		jc.addItem("Sweden");
		jc.addItem("USA");
		jc.addItem("UK");
		
		jc.addActionListener(this);
	
		c.add(jc);
		
		//JList
		JList list = new JList();
		String interests[]={"Reading Books","Coding","Watching TV"};
		list.setListData(interests);
		
		c.add(list);
		
		
	}	
	
	public void actionPerformed(ActionEvent e)
	{
		jl.setText("Button Clicked at "+ new Date());
		
	}	
	public static void main(String ar[])
	
	{
		JComponentsEx f = new JComponentsEx();
		f.setSize(500,400);
		f.setVisible(true);
	    
	}
}	
