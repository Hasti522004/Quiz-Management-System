import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Main_Frame7 extends Frame
{
	JLabel l1;
	Font f;
	MyActionListener ml1 = new MyActionListener(this);
	Main_Frame7()
	{
		super("result Page");
		setLayout(null);
		setBounds(0,0,650,650);
		setBackground(Color.LIGHT_GRAY);
		setLocation(300,0);
		init();
		addComponenet();
		componentSetBound();
		addfont();
		addmyactionListener();
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
		l1 = new JLabel("Result");
	}
	public void addComponenet()
	{
		add(l1);
	}
	public void componentSetBound()
	{
		l1.setBounds(250,50,100,40);
	}
	public void addfont()
	{
		l1.setFont(new Font("Times",Font.BOLD,20));
	}
	public void addmyactionListener()
	{
	}
	public static void main(String s[])
	{
		Main_Frame7 mf = new Main_Frame7();
		mf.setVisible(true);
	}
} 


