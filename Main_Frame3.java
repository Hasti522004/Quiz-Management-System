import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Main_Frame3 extends Frame
{
	Label l1,l2,l3,l4,l5,l6,l7,l8,l9;
	JButton b1;
	TextField t1,t2,t3,t4,t5,t6,t7,t8;
	Font f;
	MyActionListener ml = new MyActionListener(this);
	Main_Frame3()
	{
		super("login");
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
		l1 = new Label("--------- Register ---------");
		l2 = new Label("First Name");
		l3 = new Label("Last Name");
		l4 = new Label("Enrollment No");
		l5 = new Label("Department");
		l6 = new Label("Year");
		l7 = new Label("Mobile No");
		l8 = new Label("Password");
		l9 = new Label("Email ID");
		t1 = new TextField();
		t2 = new TextField();
		t3 = new TextField();
		t4 = new TextField();
		t5 = new TextField();
		t6 = new TextField();
		t7 = new TextField();
		t8 = new TextField();
		b1 = new JButton("Register Now"); 
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
		add(l8);
		add(l9);
		add(t1);
		add(t2);
		add(t3);
		add(t4);
		add(t5);
		add(t6);
		add(t7);
		add(t8);
		add(b1);
	}
	public void componentSetBound()
	{
		l1.setBounds(225,50,200,40);
		l2.setBounds(100,120,150,40);
		l3.setBounds(100,180,150,40);
		l4.setBounds(100,240,150,40);
		l5.setBounds(100,300,150,40);
		l6.setBounds(100,360,150,40);
		l7.setBounds(100,420,150,40);
		l8.setBounds(100,480,150,40);
		l9.setBounds(100,540,150,40);
		t1.setBounds(300,120,250,40);
		t2.setBounds(300,180,250,40);
		t3.setBounds(300,240,250,40);
		t4.setBounds(300,300,250,40);
		t5.setBounds(300,360,250,40);
		t6.setBounds(300,420,250,40);
		t7.setBounds(300,480,250,40);
		t8.setBounds(300,540,250,40);
		b1.setBounds(225,600,200,40);
	}
	public void addfont()
	{
		l1.setFont(f);
		l2.setFont(f);
		l3.setFont(f);
		l4.setFont(f);
		l5.setFont(f);
		l6.setFont(f);
		l7.setFont(f);
		l8.setFont(f);
		l9.setFont(f);
		t1.setFont(f);
		t2.setFont(f);
		t3.setFont(f);
		t4.setFont(f);
		t5.setFont(f);
		t6.setFont(f);
		t7.setFont(f);
		t8.setFont(f);
		b1.setFont(f);
	}
	public void addmyactionListener()
	{
		b1.addActionListener(ml);
		t1.addActionListener(ml);
		t2.addActionListener(ml);
		t3.addActionListener(ml);
		t4.addActionListener(ml);
		t5.addActionListener(ml);
		t6.addActionListener(ml);
		t7.addActionListener(ml);
		t8.addActionListener(ml);
	}
	public static void main(String s[])
	{
		Main_Frame3 mf = new Main_Frame3();
		mf.setVisible(true);
	}
}