import java.awt.*;
import java.io.*;
import java.util.*;
import java.awt.event.*;
import javax.swing.*;
import java.lang.*;
class Main_Frame11 extends Frame
{
	Label main;
	String name,marks;
	Font f;
	ArrayList<Main_Frame11> data1;
	Main_Frame11(String n,String m)
	{
		this.name = n;
		this.marks = m;
	}
	public String toString()
	{
		return this.name+","+this.marks;
	}
	Main_Frame11()
	{
		super("Quiz Detail");
		setLayout(null);
		setBounds(0,0,650,650);
		setBackground(Color.PINK);
 		f = new Font("Times",Font.BOLD,25);
        int count=0;
		try
		{
			File f=new File("Student_Login.txt");
			Scanner f1=new Scanner(f);
			while(f1.hasNextLine())
			{
				f1.nextLine();
				count++;
			}
			System.out.println(count);
		}
		catch(Exception e)
		{
			e.getStackTrace();
		}
		JLabel[] l1 = new JLabel[count-2];
		JLabel[] l2 = new JLabel[count-2];	
		try
		{
			BufferedReader br = new BufferedReader(new FileReader("Student_Login.txt"));
			//String line1 = br.readLine();
			data1=new ArrayList<Main_Frame11>();
			setLayout(new GridLayout(count-2,2));
			for(int j=0;j<count-2;j++)
			{
				String st1=br.readLine();
				String arr[] = st1.split(",");
				data1.add(new Main_Frame11(arr[0],arr[1]));  
				
		        l1[j] = new JLabel(arr[0],SwingConstants.CENTER);
		        l2[j] = new JLabel(arr[1],SwingConstants.CENTER);
		        l1[j].setBorder(BorderFactory.createLineBorder(Color.BLACK));
		        l2[j].setBorder(BorderFactory.createLineBorder(Color.BLACK));

		        add(l1[j]);
		        add(l2[j]);

		        l1[j].setFont(f);
		        l2[j].setFont(f);
			}		
			br.close();
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
		     										
	    addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent w)
			{
				System.exit(0);
			}
		});   
	}
	public static void main(String s[]) throws IOException
	{
		Main_Frame11 fm = new Main_Frame11();
		fm.setVisible(true);
	}
}