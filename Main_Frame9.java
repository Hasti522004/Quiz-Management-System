import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import java.util.List;
public class Main_Frame9 extends JFrame
{
	JLabel l;
	JButton b1,b2,b3;
	Font f;
	MyActionListener ml = new MyActionListener(this);
	Main_Frame9()
	{
		super("Teacher Page");
		setLayout(null);
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
		l = new JLabel("-------- Detail --------");
		b1 = new JButton("Add Question"); 
		b2 = new JButton("Update Question");
		b3 = new JButton("Quiz Detail");
	}
	public void addComponenet()
	{
		add(l);
		add(b1);
		add(b2);
		add(b3);
	}
	public void componentSetBound()
	{
		l.setBounds(250,100,350,40);
		b1.setBounds(150,190,350,40);
		b2.setBounds(150,270,350,40);
		b3.setBounds(150,350,350,40);
	}
	public void addfont()
	{
		l.setFont(f);
		b1.setFont(f);
		b2.setFont(f);
		b3.setFont(f);
	}
	public void addmyactionListener()
	{
		b1.addActionListener(ml);
		b2.addActionListener(ml);
		b3.addActionListener(ml);
	}
	public static void main(String s[]) throws Exception
	{
		Main_Frame9 mf = new Main_Frame9();
		mf.setVisible(true);
	}
}