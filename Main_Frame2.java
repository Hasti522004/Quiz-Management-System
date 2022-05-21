import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Main_Frame2 extends Frame
{
	Label l1,l2,l3,l4;
	JButton blogin,bpassword,bregistor,breset;
	TextField tId,tpassword;
	Font f;
	MyActionListener ml1 = new MyActionListener(this);
	Main_Frame2()
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
		l1 = new Label("Email ID");
		l2 = new Label("Passsword");
		l3 = new Label("--------- Teacher Login ---------");
		l4 = new Label("Don't have an Account ?");
		blogin = new JButton("login"); 
		bpassword = new JButton("Forget Password ?");
		bregistor = new JButton("Register here");
		breset = new JButton("Back");
		tId = new TextField();
		tpassword = new TextField();
	}
	public void addComponenet()
	{
		add(l1);
		add(l2);
		add(l3);
		add(l4);
		add(blogin);
		add(bpassword);
		add(bregistor);
		add(breset);
		add(tId);
		add(tpassword);
	}
	public void componentSetBound()
	{
		l1.setBounds(100,195,200,40);
		l2.setBounds(100,275,200,40);
		l3.setBounds(215,65,250,40);
		l4.setBounds(100,535,200,40);
		blogin.setBounds(100,395,100,40);
		bpassword.setBounds(220,395,210,40);
		bregistor.setBounds(350,535,200,40);
		breset.setBounds(450,395,100,40);
		tId.setBounds(300,195,250,40);
		tpassword.setBounds(300,275,250,40);
	}
	public void addfont()
	{
		l1.setFont(f);
		l2.setFont(f);
		l3.setFont(f);
		l4.setFont(f);
		blogin.setFont(f);
		bpassword.setFont(f);
		bregistor.setFont(f);
		breset.setFont(f);
		tId.setFont(f);
		tpassword.setFont(f);
	}
	public void addmyactionListener()
	{
		// tId.addKeyListener(ml1);
		// tpassword.addKeyListener(ml1);
		blogin.addActionListener(ml1);
		bpassword.addActionListener(ml1);
		bregistor.addActionListener(ml1);
		breset.addActionListener(ml1);
		tId.addActionListener(ml1);
		tpassword.addActionListener(ml1);
	}
	public static void main(String s[])
	{
		Main_Frame2 mf = new Main_Frame2();
		mf.setVisible(true);
	}
} 
//userId
//password
//login
//Forget Password
//registor

