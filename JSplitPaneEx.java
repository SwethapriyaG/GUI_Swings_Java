//Program to demonstrate JSplitPane

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

class JSplitPaneEx extends JFrame
{
	JSplitPaneEx()
	{
		// FlowLayout fl = new FlowLayout();
		// this.setLayout(fl);
		
		Container c = this.getContentPane();
		
		JButton l = new JButton("Clike me");
		JCheckBox r = new JCheckBox("button clicked");
		JSplitPane js = new JSplitPane(JSplitPane.VERTICAL_SPLIT, l,r);
		
		c.add(js);
		
			
	}	
	
	public static void main(String ar[])
	
	{
		JSplitPaneEx f = new JSplitPaneEx();
		f.setSize(500,400);
		f.setVisible(true);
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	    
	}
	
}		