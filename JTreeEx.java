//Program to demonstrate JTree

import javax.swing.*;
import java.awt.*;
// import java.lang.*;
import java.util.*;
import javax.swing.tree.*;

class JTreeEx extends JFrame
{
	JTreeEx()
	{
		FlowLayout fl = new FlowLayout();
		this.setLayout(fl);
				
		Container c = this.getContentPane();
		
		DefaultMutableTreeNode root = new DefaultMutableTreeNode("object");
		
		DefaultMutableTreeNode comp = new DefaultMutableTreeNode("Component");
		root.add(comp);
		
		DefaultMutableTreeNode cont = new DefaultMutableTreeNode("Container");
		comp.add(cont);
		
		DefaultMutableTreeNode jcomp = new DefaultMutableTreeNode("JComponent");
		cont.add(jcomp);
		
		DefaultMutableTreeNode jcomb = new DefaultMutableTreeNode("JComboBox");
		jcomp.add(jcomb);
		
		DefaultMutableTreeNode jtr = new DefaultMutableTreeNode("JTree");
		jcomp.add(jtr);
		
		DefaultMutableTreeNode jsr = new DefaultMutableTreeNode("JScrollBar");
		jcomp.add(jsr);
		
		JTree t = new JTree(root);
		c.add(t);
		
	}
	public static void main(String ar[])
	{
		JTreeEx f = new JTreeEx();
		f.setSize(500,400);
		f.setVisible(true);
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}	
}	