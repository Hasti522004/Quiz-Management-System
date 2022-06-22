import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Main_Frame13 extends Frame
{
	//quiz title,start button,quiz information,total marks,time,question detail
	JLabel l1,l2,l3,l4,l5,l6,l7;
	JTextField t1,t2,t3,t4,t5,t6;
	JButton b1;
	Font f;
	MyActionListener ml1 = new MyActionListener(this);
	Main_Frame13()
	{
		super("Quiz Detail");
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
		f = new Font("Times",Font.BOLD,16);
		l1 = new JLabel("Welcome to Quiz");
		b1 = new JButton("Start");
		t1 = new JTextField("Quiz Information");
		l2 = new JLabel("Question Detail : ");
		l3 = new JLabel("Single Correct :");
		l4 = new JLabel("Multipal Correct :");
		l5 = new JLabel("Numerical :");
		t2 = new JTextField();	
		t3 = new JTextField();	
		t4 = new JTextField();	
		t5 = new JTextField();	
		t6 = new JTextField();	
		l6 = new JLabel("Total Marks");
		l7 = new JLabel("Total Time");
	}
	public void addComponenet()
	{
		add(l1);
		add(l2);
		add(l3);
		add(l4);
		add(l5);
		add(l6);
		add(l7);
		add(t1);
		add(t2);
		add(t3);
		add(t4);
		add(t5);
		add(t6);
		add(b1);
	}
	public void componentSetBound()
	{
		l1.setBounds(200,100,250,40);
		l2.setBounds(50,280,200,40);
		l3.setBounds(275,230,200,40);
		l4.setBounds(275,280,200,40);
		l5.setBounds(275,330,200,40);
		l6.setBounds(275,390,200,40);
		l7.setBounds(275,450,200,40);
		t1.setBounds(50,170,550,40);
		t2.setBounds(500,230,100,40);
		t3.setBounds(500,280,100,40);
		t4.setBounds(500,330,100,40);
		t5.setBounds(500,390,100,40);
		t6.setBounds(500,450,100,40);
		b1.setBounds(225,510,100,40);
	}
	public void addfont()
	{
		l1.setFont(new Font("Times",Font.BOLD,20));
		l2.setFont(f);
		l3.setFont(f);
		l4.setFont(f);
		l5.setFont(f);
		l6.setFont(f);
		l7.setFont(f);
		t1.setFont(f);
		t2.setFont(f);
		t3.setFont(f);
		t4.setFont(f);
		t5.setFont(f);
		t6.setFont(f);
		b1.setFont(f);
	}
	public void addmyactionListener()
	{
		t1.addActionListener(ml1);
		t2.addActionListener(ml1);
		t3.addActionListener(ml1);
		t4.addActionListener(ml1);
		t5.addActionListener(ml1);
		t6.addActionListener(ml1);
		b1.addActionListener(ml1);
	}
	public static void main(String s[])
	{
		Main_Frame13 mf = new Main_Frame13();
		mf.setVisible(true);
	}
} 


