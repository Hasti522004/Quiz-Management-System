import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.lang.*;
import java.util.*;
public class MyActionListener extends JComponent implements ActionListener,ItemListener
{
	String s1,s2,s3,s4;
	Main_Frame mf;
	Main_Frame1 mf1;
	Main_Frame2 mf2;
	Main_Frame3 mf3;
	Main_Frame4 mf4;
	Main_Frame5 mf5;
	Main_Frame6 mf6;
	Main_Frame7 mf7;
	MyActionListener(Main_Frame m)
	{
		this.mf=m;
	}
	MyActionListener(Main_Frame1 m)
	{
		this.mf1=m;
	}
	MyActionListener(Main_Frame2 m)
	{
		this.mf2=m;
	}
	MyActionListener(Main_Frame3 m)
	{
		this.mf3=m;
	}
	MyActionListener(Main_Frame4 m)
	{
		this.mf4=m;
	}
	MyActionListener(Main_Frame5 m)
	{
		this.mf5=m;
	}
	MyActionListener(Main_Frame6 m)
	{
		this.mf6=m;
	}
	MyActionListener(Main_Frame7 m)
	{
		this.mf7=m;
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getActionCommand().equals("Student Login"))
		{
			mf1 = new Main_Frame1();
			System.out.println("Student Login");
			this.mf1.setVisible(true);
			this.mf.setVisible(false);
		}
		if(e.getActionCommand().equals("Teacher Login"))
		{
			mf2 = new Main_Frame2();
			System.out.println("Teacher Login");
			this.mf2.setVisible(true);
			this.mf.setVisible(false);
		}
		if(e.getActionCommand().equals("Login"))
		{
			mf = new Main_Frame();
			//mf1 = new Main_Frame1();
			s1 = this.mf1.tId.getText();
			s2 = this.mf1.tpassword.getText();
			System.out.println(s1);
			System.out.println(s2);
			JOptionPane.showMessageDialog(null,"Login Successfull...","Congratulation",JOptionPane.PLAIN_MESSAGE);
			this.mf1.setVisible(false);
			this.mf.setVisible(true);
			try
			{
				BufferedWriter bw = new BufferedWriter(new FileWriter("student.txt",true));
				bw.write(s1+"#"+s2);
				bw.newLine();
				bw.close();
			}
			catch(Exception e1){}
		}
		if(e.getActionCommand().equals("login"))
		{
			mf = new Main_Frame();
			//mf2 = new Main_Frame2();
			s1 = this.mf2.tId.getText();
			s2 = this.mf2.tpassword.getText();
			System.out.println(s1);
			System.out.println(s2);
			JOptionPane.showMessageDialog(null,"Login Successfull...","Congratulation",JOptionPane.PLAIN_MESSAGE);
			this.mf2.setVisible(false);
			this.mf.setVisible(true);
			try
			{
				BufferedWriter bw = new BufferedWriter(new FileWriter("Teacher.txt",true));
				bw.write(s1+"#"+s2);
				bw.newLine();
				bw.close();
			}
			catch(Exception e2){}
		}
		if(e.getActionCommand().equals("Back"))
		{
			mf = new Main_Frame();
			mf1 = new Main_Frame1();
			mf2 = new Main_Frame2();
			mf.setVisible(true);
			mf1.setVisible(false);
			mf2.setVisible(false);
		}
		if(e.getActionCommand().equals("Register here"))
		{
			mf3 = new Main_Frame3();
			mf1 = new Main_Frame1();
			mf2 = new Main_Frame2();
			mf3.setVisible(true);
			mf1.setVisible(false);
			mf2.setVisible(false);
		}
		if(e.getActionCommand().equals("Register Now"))
		{
			mf3 = new Main_Frame3();
			mf = new Main_Frame();
			mf3.setVisible(false);
			mf.setVisible(true);
		}
	}
	public void itemStateChanged(ItemEvent it) 
	{
	}
	// public void Button(){}
	// public void keyPressed(KeyEvent ke)
	// {
	// 	System.out.println("Hello");
	// 	if(ke.getKeyCode()==KeyEvent.VK_ENTER)
	// 	{
	// 		//mf1 = new Main_Frame1();
	// 		mf2 = new Main_Frame2();
	// 		s1 = this.mf1.tId.getText();
	// 		s2 = this.mf1.tpassword.getText();
	// 		s3 = this.mf2.tId.getText();
	// 		s4 = this.mf2.tpassword.getText();
	// 		System.out.println(s1);
	// 		System.out.println(s2);
	// 	}		
	// 	try
	// 	{
	// 		FileWriter fw1 = new FileWriter("1.txt");
	// 		fw1.write(s1+"#"+s2);
	// 		f w1.close();
	// 		FileWriter fw2 = new FileWriter("2.txt");
	// 		fw2.write(s3+"#"+s4);
	// 		fw2.close();
	// 	}
	// 	catch(Exception e)
	// 	{
	// 		//System.out.println(e);
	// 	}
	// }
	// public void keyReleased(KeyEvent ke){}
	// public void keyTyped(KeyEvent ke){}
}
