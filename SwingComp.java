//Program to demonstrate JMenu, JCheckBox, JRadioButton, JTextField, JTextArea

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

class SwingComp extends JFrame
{
	SwingComp()
	{
		Container c = this.getContentPane();
		
		BorderLayout bl = new BorderLayout();
		
		JMenuBar mb = new JMenuBar();		
		
		JMenu fil = new JMenu("File");
		mb.add(fil);
		
		JMenu edt = new JMenu("Edit");
		mb.add(edt);
		
		JMenuItem n = new JMenuItem("New");
		JCheckBoxMenuItem s = new JCheckBoxMenuItem("Save");
		JMenuItem o = new JMenuItem("Open");
		
		fil.add(n);
		fil.add(s);
		fil.add(o);
		
		JMenuItem cu = new JMenuItem("Cut");
		JMenuItem co = new JMenuItem("Copy");
		JCheckBoxMenuItem ps = new JCheckBoxMenuItem("Past");
		
		edt.add(cu);
		edt.add(co);
		edt.add(ps);
		
		c.add("North",mb);	
	}	
	
	public static void main(String ar[])
	
	{
		SwingComp f = new SwingComp();
		f.setSize(500,400);
		f.setVisible(true);
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	    
	}
	
}			