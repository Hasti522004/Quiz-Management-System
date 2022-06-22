import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Main_Frame12 extends Frame
{
	Label l1,l2,l3,l4,l5,l6,l7,l8,l9;
	JButton b1;
	TextField t[];
	Font f;
	MyActionListener ml = new MyActionListener(this);
	Main_Frame12()
	{
		super("Register");
		setLayout(null);
		setBounds(0,0,650,650);
		// setResizable(false);
		// //mf.setExtendedState(mf.getExtendedState() | JFrame.MAXIMIZED_BOTH);
		// setExtendedState(JFrame.MAXIMIZED_BOTH);
		setBackground(Color.LIGHT_GRAY);
		//setLocation(300,0);
		 t= new TextField[8];
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
		l4 = new Label("Subject");
		l5 = new Label("Department");
		l6 = new Label("Year");
		l7 = new Label("Mobile No");
		l8 = new Label("Password");
		l9 = new Label("Email ID");
		t[0] = new TextField();
		t[1] = new TextField();
		t[2] = new TextField();
		t[3] = new TextField();
		t[4] = new TextField();
		t[5] = new TextField();
		t[6] = new TextField();
		t[7] = new TextField();
		b1 = new JButton("Register now"); 
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
		add(t[0]);
		add(t[1]);
		add(t[2]);
		add(t[3]);
		add(t[4]);
		add(t[5]);
		add(t[6]);
		add(t[7]);
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
		t[0].setBounds(300,120,250,40);
		t[1].setBounds(300,180,250,40);
		t[2].setBounds(300,240,250,40);
		t[3].setBounds(300,300,250,40);
		t[4].setBounds(300,360,250,40);
		t[5].setBounds(300,420,250,40);
		t[6].setBounds(300,480,250,40);
		t[7].setBounds(300,540,250,40);
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
		t[0].setFont(f);
		t[1].setFont(f);
		t[2].setFont(f);
		t[3].setFont(f);
		t[4].setFont(f);
		t[5].setFont(f);
		t[6].setFont(f);
		t[7].setFont(f);
		b1.setFont(f);
	}
	public void addmyactionListener()
	{
		b1.addActionListener(ml);
		// t[0].addActionListener(ml);
		// t[1].addActionListener(ml);
		// t[2].addActionListener(ml);
		// t[3].addActionListener(ml);
		// t[4].addActionListener(ml);
		// t[5].addActionListener(ml);
		// t[6].addActionListener(ml);
		// t[7].addActionListener(ml);
		// t[0].addKeyListener(ml);
		// t[1].addKeyListener(ml);
		// t[2].addKeyListener(ml);
		// t[3].addKeyListener(ml);
		// t[4].addKeyListener(ml);
		// t[5].addKeyListener(ml);
		// t[6].addKeyListener(ml);
		// t[7].addKeyListener(ml);
	}
	public static void main(String s[])
	{
		Main_Frame3 mf = new Main_Frame3();
		mf.setVisible(true);
	}
}