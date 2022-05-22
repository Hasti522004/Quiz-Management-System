import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Main_Frame6 extends Frame
{
	JLabel l1,l2,lTime,lTTime,l3;
	JButton bSave,bNext,bSubmit;
	TextArea tque;
	TextField tans;
	Font f;
	MyActionListener ml1 = new MyActionListener(this);
	Main_Frame6()
	{
		super("Quiz Page");
		setLayout(null);
		setBounds(0,0,650,650);
		setBackground(Color.LIGHT_GRAY);
		setLocation(300,0);
		init();
		addComponenet();
		componentSetBound();
		addfont();
		addmyactionListener();
		lTTime.setForeground(new Color(255,0,0));
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
		bSave = new JButton("Save");
		bNext = new JButton("Next");
		bSubmit = new JButton("Submit Quiz");
		l2 = new JLabel("Numerical Type ");
		l1 = new JLabel("Quiz");
		l3 = new JLabel("Answer :");
		lTime = new JLabel("Time");
		lTTime = new JLabel("Time");
		tans = new TextField(20);
		tque = new TextArea("Question TExtArea",10,20,TextArea.SCROLLBARS_VERTICAL_ONLY);
	}
	public void addComponenet()
	{
		add(l1);
		add(l2);
		add(l3);
		add(lTime);
		add(lTTime);
		add(bSave);
		add(bNext);
		add(bSubmit);
		add(tans);
		add(tque);
	}
	public void componentSetBound()
	{
		l1.setBounds(250,50,100,40);
		l2.setBounds(250,120,150,40);
		lTime.setBounds(480,50,50,40);
		lTTime.setBounds(550,50,50,40);
		bSave.setBounds(100,540,100,40);
		bNext.setBounds(270,540,100,40);
		bSubmit.setBounds(440,540,150,40);
		tans.setBounds(50,350,200,40);
		l3.setBounds(50,290,100,40);
		tque.setBounds(50,180,550,90);
	}
	public void addfont()
	{
		l1.setFont(new Font("Times",Font.BOLD,20));
		l2.setFont(f);
		l3.setFont(f);
		lTime.setFont(f);
		lTTime.setFont(f);
		bSave.setFont(f);
		bNext.setFont(f);
		bSubmit.setFont(f);
		tans.setFont(f);
		tque.setFont(f);
	}
	public void addmyactionListener()
	{
		bSave.addActionListener(ml1);
		bNext.addActionListener(ml1);
		bSubmit.addActionListener(ml1);
		tans.addActionListener(ml1);
	}
	public static void main(String s[])
	{
		Main_Frame6 mf = new Main_Frame6();
		mf.setVisible(true);
	}
} 


