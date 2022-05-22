import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Main_Frame5 extends Frame
{
	JLabel l1,l2,lA,lB,lC,lD,lTime,lTTime;
	JButton bSave,bNext,bSubmit;
	TextArea tque;
	//ButtonGroup bg;
	Checkbox c1,c2,c3,c4;
	Font f;
	MyActionListener ml1 = new MyActionListener(this);
	Main_Frame5()
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
		l2 = new JLabel("Multipal Choice Question");
		l1 = new JLabel("Quiz");
		lTime = new JLabel("Time");
		lTTime = new JLabel("Time");
		c1 = new Checkbox();
		c2 = new Checkbox();
		c3 = new Checkbox();
		c4 = new Checkbox();
		lA = new JLabel("Option A");
		lB = new JLabel("Option B");
		lC = new JLabel("Option C");
		lD = new JLabel("Option D");
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
		add(c1);
		add(c2);
		add(c3);
		add(c4);
		add(lA);
		add(lB);
		add(lC);
		add(lD);
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
		c1.setBounds(70,290,20,40);
		c2.setBounds(70,350,20,40);
		c3.setBounds(70,410,20,40);
		c4.setBounds(70,470,20,40);
		lA.setBounds(100,290,100,40);
		lB.setBounds(100,350,100,40);
		lC.setBounds(100,410,100,40);
		lD.setBounds(100,470,100,40);
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
		c1.setFont(f);
		c2.setFont(f);
		c3.setFont(f);
		c4.setFont(f);
		lA.setFont(f);
		lB.setFont(f);
		lC.setFont(f);
		lD.setFont(f);
		tque.setFont(f);
	}
	public void addmyactionListener()
	{
		bSave.addActionListener(ml1);
		bNext.addActionListener(ml1);
		bSubmit.addActionListener(ml1);
		c1.addItemListener(ml1);
		c2.addItemListener(ml1);
		c3.addItemListener(ml1);
		c4.addItemListener(ml1);
	}
	public static void main(String s[])
	{
		Main_Frame5 mf = new Main_Frame5();
		mf.setVisible(true);
	}
} 


