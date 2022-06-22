import p1.Register;
import p2.Login_model;
import p1.Question;
import org.apache.poi.*;
import org.apache.poi.ss.usermodel.Cell;  
import org.apache.poi.ss.usermodel.Row;  
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFSheet;  
import org.apache.poi.xssf.usermodel.XSSFWorkbook;  
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import java.io.File;  
import java.io.FileInputStream;  
import java.io.FileOutputStream;  
import java.util.Iterator;  
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.lang.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Calendar;  
import java.util.Timer;  
import java.util.TimerTask;  

public class MyActionListener extends JComponent implements ActionListener,ItemListener,Serializable
{
	String s1,s2,s3,s4,s5,sanswer,sans;
	int row = 0,flag=0,count=0,tick=0;
	int count1=0;
	ArrayList<String> ans = new ArrayList<String>();
	ArrayList<String> cans =new ArrayList<String>();
	ArrayList<String> slogin =new ArrayList<String>();
	ArrayList<String> scheck =new ArrayList<String>();
	Main_Frame mf;
	Main_Frame1 mf1;
	Main_Frame2 mf2;
	Main_Frame3 mf3;
	Main_Frame4 mf4;
	Main_Frame5 mf5;
	Main_Frame6 mf6;
	Main_Frame7 mf7;
	Main_Frame8 mf8;
	Main_Frame9 mf9;
	Main_Frame10 mf10;
	Main_Frame11 mf11;
	Main_Frame12 mf12;
	Main_Frame13 mf13;
	MyActionListener(Main_Frame m)
	{
		this.mf=m;
	}
	MyActionListener(Main_Frame1 m)
	{
		this.mf1=m;
	}
	MyActionListener(Main_Frame2 m)
	{
		this.mf2=m;
	}
	MyActionListener(Main_Frame3 m)
	{
		this.mf3=m;
	}
	MyActionListener(Main_Frame4 m)
	{
		this.mf4=m;
	}
	MyActionListener(Main_Frame5 m)
	{
		this.mf5=m;
	}
	MyActionListener(Main_Frame6 m)
	{
		this.mf6=m;
	}
	MyActionListener(Main_Frame7 m)
	{
		this.mf7=m;
	}
	MyActionListener(Main_Frame8 m)
	{
		this.mf8=m;
	}
	MyActionListener(Main_Frame9 m)
	{
		this.mf9=m;
	}
	MyActionListener(Main_Frame10 m)
	{
		this.mf10=m;
	}
	MyActionListener(Main_Frame11 m)
	{
		this.mf11=m;
	}
	MyActionListener(Main_Frame12 m)
	{
		this.mf12=m;
	}
	MyActionListener(Main_Frame13 m)
	{
		this.mf13=m;
	}
	public String toString()
	{
		return this.sans;
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getActionCommand().equals("Student Login"))
		{
			mf1=new Main_Frame1();
			this.mf1.setVisible(true);
			this.mf.setVisible(false);
		}
		if(e.getActionCommand().equals("Teacher Login"))
		{
			mf2 = new Main_Frame2();
			this.mf2.setVisible(true);
			this.mf.setVisible(false);
		}
		if(e.getActionCommand().equals("Add Question"))
		{
			mf10 = new Main_Frame10();
			this.mf9.setVisible(false);
			this.mf10.setVisible(true);
		}
		if(e.getActionCommand().equals("Back Again"))
		{
			mf9 = new Main_Frame9();
			this.mf9.setVisible(true);
			this.mf10.setVisible(false);	
		}
		if(e.getActionCommand().equals("Update Question"))
		{
			try
			{
				File file = new File("/D:/OOP/Quiz_Project/Quiz_Excel.xlsx");
				Desktop.getDesktop().open(file);
			}
			catch(Exception exe1){}
		}
		if(e.getActionCommand().equals("Quiz Detail"))
		{
			mf13 = new Main_Frame13();
			this.mf9.setVisible(false);
			this.mf13.setVisible(true);
		}
		if(e.getActionCommand().equals("Register here"))
		{
			mf3 = new Main_Frame3();
			mf3.setVisible(true);
			mf1.setVisible(false);
		}

		if(e.getActionCommand().equals("Register Now"))
		{
			mf1 = new Main_Frame1();
			mf3.setVisible(false);
			mf1.setVisible(true);
			try
			{
				BufferedWriter bw = new BufferedWriter(new FileWriter("Student_Login.txt",true));
				bw.write(this.mf3.t[0].getText()+"#"+this.mf3.t[1].getText()+"#"+this.mf3.t[2].getText()+"#"+this.mf3.t[3].getText()+"#"+this.mf3.t[4].getText()+"#"+this.mf3.t[5].getText()+"#"+this.mf3.t[6].getText()+"#"+this.mf3.t[7].getText());
				bw.write("\n");
				bw.close();
			}
			catch(Exception ep){}
		}
		if(e.getActionCommand().equals("login"))
		{
			mf9 = new Main_Frame9();
			try
			{
				BufferedReader br = new BufferedReader(new FileReader("Teacher_Login.txt"));
				String st1=br.readLine();
				s1 = this.mf2.tId.getText();
				s2 = this.mf2.tpassword.getText();
				s3 = this.mf2.tsub.getText();
				while(st1!=null)
				{
					//System.out.println(st1);
					String arr[] = st1.split("#");
					System.out.println(arr[7]);
					System.out.println(s1);
					if(arr[7].equals(s1) && arr[6].equals(s2) && arr[2].equals(s3))
					{
						System.out.println("hi");
						JOptionPane.showMessageDialog(null,"Login Successfull...","Congratulation",JOptionPane.PLAIN_MESSAGE);
						this.mf9.setVisible(true);
						this.mf2.setVisible(false);
						flag=1;
						break;
					}
					st1=br.readLine();
				}
				if(flag!=1)
				{
					JOptionPane.showMessageDialog(null,"Incorret username/password","Sad",JOptionPane.PLAIN_MESSAGE);
					this.mf2.tId.setText("");
					this.mf2.tpassword.setText("");
					this.mf2.tsub.setText("");
					this.mf2.setVisible(true);
					this.mf9.setVisible(false);
				}	
			}
			catch(Exception epe){}
		}
		if(e.getActionCommand().equals("Login"))
		{
			mf8 = new Main_Frame8();
			try
			{
				BufferedReader br = new BufferedReader(new FileReader("Student_Login.txt"));
				String st1=br.readLine();
				s1 = this.mf1.tId.getText();
				s2 = this.mf1.tpassword.getText();
				while(st1!=null)
				{
					//System.out.println(st1);
					String arr[] = st1.split("#");
					System.out.println(arr[7]);
					System.out.println(s1);
					if(arr[7].equals(s1) && arr[6].equals(s2))
					{
						System.out.println("hi");
						JOptionPane.showMessageDialog(null,"Login Successfull...","Congratulation",JOptionPane.PLAIN_MESSAGE);
						this.mf8.setVisible(true);
						this.mf1.setVisible(false);
						tick=1;
						break;
					}
					st1=br.readLine();
				}
				if(tick!=1)
				{
					JOptionPane.showMessageDialog(null,"Incorret username/password","Sad",JOptionPane.PLAIN_MESSAGE);
					this.mf1.tId.setText("");
					this.mf1.tpassword.setText("");
					this.mf1.setVisible(true);
					this.mf8.setVisible(false);
				}	
			}
			catch(Exception epe){}
		}	
		if(e.getActionCommand().equals("Register Here"))
		{
			mf12 = new Main_Frame12();
			mf12.setVisible(true);
			mf2.setVisible(false);
		}
		if(e.getActionCommand().equals("Register now"))
		{
			mf2 = new Main_Frame2();
			mf12.setVisible(false);
			mf2.setVisible(true);
			try
			{
				BufferedWriter bw = new BufferedWriter(new FileWriter("Teacher_Login.txt",true));
				bw.write(this.mf12.t[0].getText()+"#"+this.mf12.t[1].getText()+"#"+this.mf12.t[2].getText()+"#"+this.mf12.t[3].getText()+"#"+this.mf12.t[4].getText()+"#"+this.mf12.t[5].getText()+"#"+this.mf12.t[6].getText()+"#"+this.mf12.t[7].getText());
				bw.write("\n");
				bw.close();
			}
			catch(Exception ep){}
		}
		if(e.getActionCommand().equals("Back"))
		{
			mf = new Main_Frame();
			mf1 = new Main_Frame1();
			mf2 = new Main_Frame2();
			mf.setVisible(true);
			mf1.setVisible(false);
			mf2.setVisible(false);
		}

		if(e.getActionCommand().equals("Start"))
        {
        	try
	    	{
	    		mf4 = new Main_Frame4();
	    		this.mf4.setVisible(true);
				this.mf8.setVisible(false);
				this.mf4.bSave.setEnabled(false);
				this.mf4.bSubmit.setEnabled(false);
	    		File file = new File("Quiz_Excel.xlsx");		
				FileInputStream fis = new FileInputStream(file);  
				XSSFWorkbook wb = new XSSFWorkbook(fis);
				XSSFSheet sheet = wb.getSheetAt(0); 
				
				this.mf4.tque.setText(sheet.getRow(row).getCell(0).toString());
				this.mf4.l[0].setText(sheet.getRow(row).getCell(1).toString());
				this.mf4.l[1].setText(sheet.getRow(row).getCell(2).toString());
				this.mf4.l[2].setText(sheet.getRow(row).getCell(3).toString());
				this.mf4.l[3].setText(sheet.getRow(row).getCell(4).toString());	
				String sanswer = sheet.getRow(row).getCell(5).toString();	

				FileWriter fw = new FileWriter("Current.txt");
				fw.write(0);
				fw.close();
			}
			catch(Exception exe){}	
        }

        if(e.getActionCommand().equals("Next"))
		{
			try
	    	{
	    		FileReader fr = new FileReader("Current.txt");
	    		int q = fr.read();
	    		fr.close();
	    		q++;
	    		row = q;

	    		File file = new File("Quiz_Excel.xlsx");		
				FileInputStream fis = new FileInputStream(file);  
				XSSFWorkbook wb = new XSSFWorkbook(fis);
				XSSFSheet sheet = wb.getSheetAt(0);  

				Integer a=row;
        		String s = a.toString(); 

				this.mf4.l2.setText("Question-"+s);
				this.mf4.bSave.setEnabled(true);
				this.mf4.bSubmit.setEnabled(false);
				this.mf4.tque.setText(sheet.getRow(row).getCell(0).toString());
				this.mf4.l[0].setText(sheet.getRow(row).getCell(1).toString());
				this.mf4.l[1].setText(sheet.getRow(row).getCell(2).toString());
				this.mf4.l[2].setText(sheet.getRow(row).getCell(3).toString());
				this.mf4.l[3].setText(sheet.getRow(row).getCell(4).toString());
				if(row==12)
				{
					this.mf4.bSubmit.setEnabled(true);
					this.mf4.bNext.setEnabled(false);
				}
	        	this.mf4.tque.setEnabled(false);

				String sanswer = sheet.getRow(row).getCell(5).toString();
				FileWriter fw = new FileWriter("Current.txt");
				fw.write(row);
				fw.close();
				ans.add(new String(sanswer));
			}
			catch(Exception exe){}	
		}
	 	if(e.getActionCommand().equals("Add"))
		{
			try
			{
				String excelFilePath = "Quiz_Excel.xlsx";
				FileInputStream inputStream = new FileInputStream(new File(excelFilePath));
	            Workbook workbook = WorkbookFactory.create(inputStream);
	 
	            Sheet sheet = workbook.getSheetAt(0);
	            Object[] bookData = {this.mf10.tque.getText(),this.mf10.l[0].getText(),this.mf10.l[1].getText(),this.mf10.l[2].getText(),this.mf10.l[3].getText()};
	 
	            int rowCount = sheet.getLastRowNum();
	 
	                Row row = sheet.createRow(++rowCount);
	 				System.out.println(rowCount);
	                int columnCount = 0;
	                 
	                Cell cell = row.createCell(columnCount);
	                 
	                for (Object field : bookData) 
	                {
	                    cell = row.createCell(columnCount++);
	                    if (field instanceof String)
	                    {
	                        cell.setCellValue((String) field);
	                   	}
	                   	else if (field instanceof Integer)
	                   	{
	                        cell.setCellValue((Integer) field);
	                    }
	                }

	            inputStream.close();
	 
	            FileOutputStream outputStream = new FileOutputStream("Quiz_Excel.xlsx");
	            workbook.write(outputStream);
	            workbook.close();
	            outputStream.close();
         	}
         	catch(Exception exe2){}
		}
		if(e.getActionCommand().equals("Save"))
		{
			if(this.mf4.r1.isSelected())
			{
				cans.add(new String(this.mf4.l[0].getText()));
			}	
			else if(this.mf4.r2.isSelected())
			{
				cans.add(new String(this.mf4.l[1].getText()));
			}
			else if(this.mf4.r3.isSelected())
			{
				cans.add(new String(this.mf4.l[2].getText()));
			}
			else if(this.mf4.r4.isSelected())
			{
				cans.add(new String(this.mf4.l[3].getText()));
			}
			else
			{
				System.out.println("Please Select any one option");
			}
		} 
		if(e.getActionCommand().equals("Submit Quiz"))
		{
			//mf7 = new Main_Frame7();
			for(int i=0;i<ans.size();i++)
			{
				if(ans.get(i).equals(cans.get(i)))
				{
					count++;
				}	
				else
				{
					System.out.println(ans.get(i));
					System.out.println(cans.get(i));
				}
			}
			JOptionPane.showMessageDialog(null,"Your Score is :"+count,"Score",JOptionPane.PLAIN_MESSAGE);
		}

	}
	public void itemStateChanged(ItemEvent it) {}
}