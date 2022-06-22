import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import java.util.List;
public class Main_Frame extends JFrame
{
	Label l,l2;
	JButton b1,b2;
	Font f;
	MyActionListener ml = new MyActionListener(this);
	Main_Frame()
	{
		super("login");
		setLayout(null);
		//setResizable(false);
		//mf.setExtendedState(mf.getExtendedState() | JFrame.MAXIMIZED_BOTH);
		//setExtendedState(JFrame.MAXIMIZED_BOTH);
		setBounds(0,0,650,650);
		setBackground(Color.LIGHT_GRAY);
		setLocation(300,0);
		init();
		addComponenet();
		componentSetBound();
		addfont();
		addmyactionListener();
		//paint(Graphics g);
		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent w)
			{
				System.exit(0);
			}
		});
	}
	
	public void init()
	{
		f = new Font("Times",Font.BOLD,16);
		l = new Label("Welcome to Quiz");
		b1 = new JButton("Student Login"); 
		b2 = new JButton("Teacher Login");
	}
	public void addComponenet()
	{
		add(l);
		add(b1);
		add(b2);
	}
	public void componentSetBound()
	{
		l.setBounds(270,65,250,40);
		b1.setBounds(200,170,300,50);
		b2.setBounds(200,250,300,50);
	}
	public void addfont()
	{
		l.setFont(f);
		b1.setFont(f);
		b2.setFont(f);
	}
	public void addmyactionListener()
	{
		b1.addActionListener(ml);
		b2.addActionListener(ml);
	}
	// public void paint(Graphics g) 
	// {  
	// 	System.out.println("Hello");
	//     Toolkit t=Toolkit.getDefaultToolkit();  
	//     Image i=t.getImage("D:/OOP/Quiz_Project/Main_Photo.PNG");  
	//     g.drawImage(i, 0, 0,this);    
	// }
	public static void main(String s[]) throws Exception
	{
		Main_Frame mf = new Main_Frame();
		mf.setVisible(true);
	}
}