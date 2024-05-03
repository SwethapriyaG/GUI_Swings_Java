//Program to demonstrate JFrame in Java

import javax.swing.*;
import java.awt.*;
import java.lang.*;

class JFrameEx
{
	public static void main(String ar[])
	{
		JFrame f = new JFrame("My Swing");
		f.setSize(500,300);
		f.setVisible(true);
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		FlowLayout fl = new FlowLayout();
		f.setLayout(fl);
		
		Container c = f.getContentPane();
		
		JButton b1 = new JButton("Click me");
		c.add(b1);
	
	
	}
	
	
}	

