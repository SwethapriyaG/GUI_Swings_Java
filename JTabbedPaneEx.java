//Program to demonstrate JTabbedPane

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

class JTabbedPaneEx extends JFrame
{
	JTabbedPaneEx()
	{
		FlowLayout fl = new FlowLayout();
		this.setLayout(fl);
		
		JTabbedPane p = new JTabbedPane(JTabbedPane.TOP);
		p.add("one",new Home());
		
		
		ImageIcon img = new ImageIcon("download.png");
		p.addTab("",img,new View());
		
		p.insertTab("three",null,new Tools(),"This is Tools Tab",1);
		this.add(p);
		
		
	}	
	
	public static void main(String ar[])
	
	{
		JTabbedPaneEx f = new JTabbedPaneEx();
		f.setSize(500,400);
		f.setVisible(true);
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	    
	}
	
}	

class Home extends JPanel
{
	Home()
	{
		JButton b1 = new JButton("ClipBoard");
		JButton b2 = new JButton("Image");
		JButton b3 = new JButton("Tools");
		JButton b4 = new JButton("Shapes");
		JButton b5 = new JButton("Colours");
		
		this.add(b1);
		this.add(b2);
		this.add(b3);
		this.add(b4);
		this.add(b5);
	}
}	

class View extends JPanel
{
	View()
	{
		JButton b1 = new JButton("Zoom");
		JButton b2 = new JButton("Show or Hide");
		JButton b3 = new JButton("Display");
		
		this.add(b1);
		this.add(b2);
		this.add(b3);
	}
}	
class Tools extends JPanel
{
	Tools()
	{
		JButton b1 = new JButton("Size");
		JButton b2 = new JButton("Break");
		JButton b3 = new JButton("Add");
		
		this.add(b1);
		this.add(b2);
		this.add(b3);
	}
}	