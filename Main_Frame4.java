import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Main_Frame4 extends JFrame
{
	JLabel l1,l2,lTime,lTTime;
	JButton bSave,bNext,bSubmit;
	TextArea tque;
	JLabel l[] = new JLabel[4];
	ButtonGroup bg;
	JRadioButton r1,r2,r3,r4;
	Font f;
	int count = 0;
	MyActionListener ml1 = new MyActionListener(this);
	Main_Frame4()
	{
		super("Quiz Page");
		setLayout(null);
		// setResizable(false);
		// //mf.setExtendedState(mf.getExtendedState() | JFrame.MAXIMIZED_BOTH);
		// setExtendedState(JFrame.MAXIMIZED_BOTH);
		setBounds(0,0,650,650);
		setBackground(Color.LIGHT_GRAY);
		setLocation(300,0);
		init();
		addComponenet();
		componentSetBound();
		addfont();
		addmyactionListener();
		r1.setBackground(Color.LIGHT_GRAY);
		r2.setBackground(Color.LIGHT_GRAY);
		r3.setBackground(Color.LIGHT_GRAY);
		r4.setBackground(Color.LIGHT_GRAY);
		//lTTime.setBackground(Color.RED);
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
		l2 = new JLabel("Question-1");
		l1 = new JLabel("Quiz");
		lTime = new JLabel("Time");
		lTTime = new JLabel("Time");
		r1 = new JRadioButton("A");
		r2 = new JRadioButton("B");
		r3 = new JRadioButton("C");
		r4 = new JRadioButton("D");
		l[0] = new JLabel("Option A");
		l[1] = new JLabel("Option B");
		l[2] = new JLabel("Option C");
		l[3] = new JLabel("Option D");
		bg = new ButtonGroup();
		// CheckboxGroup cbg = new CheckboxGroup();  
		tque = new TextArea("Question TExtArea",10,20,TextArea.SCROLLBARS_VERTICAL_ONLY);
	}
	public void addComponenet()
	{
		add(l1);
		add(l2);
		add(lTime);
		add(lTTime);
		add(bSave);
		add(bNext);
		add(bSubmit);
		add(r1);
		add(r2);
		add(r3);
		add(r4);
		bg.add(r1);
		bg.add(r2);
		bg.add(r3);
		bg.add(r4);
		add(l[0]);
		add(l[1]);
		add(l[2]);
		add(l[3]);
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
		r1.setBounds(20,290,70,40);
		r2.setBounds(20,350,70,40);
		r3.setBounds(20,410,70,40);
		r4.setBounds(20,470,70,40);
		l[0].setBounds(100,290,500,40);
		l[1].setBounds(100,350,500,40);
		l[2].setBounds(100,410,500,40);
		l[3].setBounds(100,470,500,40);
		tque.setBounds(50,180,550,90);
	}
	public void addfont()
	{
		l1.setFont(new Font("Times",Font.BOLD,20));
		l2.setFont(f);
		lTime.setFont(f);
		lTTime.setFont(f);
		bSave.setFont(f);
		bNext.setFont(f);
		bSubmit.setFont(f);
		r1.setFont(f);
		r2.setFont(f);
		r3.setFont(f);
		r4.setFont(f);
		l[0].setFont(f);
		l[1].setFont(f);
		l[2].setFont(f);
		l[3].setFont(f);
		tque.setFont(f);
	}
	public void addmyactionListener()
	{
		r3.addActionListener(ml1);
		r4.addActionListener(ml1);
		r2.addActionListener(ml1);
		bSave.addActionListener(ml1);
		bNext.addActionListener(ml1);
		bSubmit.addActionListener(ml1);
		r1.addActionListener(ml1);
		// l[0].addActionListener(ml1);
		// l[1].addActionListener(ml1);
		// l[2].addActionListener(ml1);
		// l[3].addActionListener(ml1);
		//tque.addItemListener(ml1);
	}
	public static void main(String s[])
	{
		Main_Frame4 mf = new Main_Frame4();
		mf.setVisible(true);
	}
} 


