package p1;
import java.io.Serializable;
public class Question implements Serializable
{
	String s1,s2,s3,s4,s5;
	public Question(String a1,String a2,String a3,String a4,String a5)
	{
		this.s1 = a1;
		this.s2 = a2;
		this.s3 = a3;
		this.s4 = a4;
		this.s5 = a5;
	}
	public String toString()
	{
		return this.s1+"#"+this.s2+"#"+this.s3+"#"+this.s4+"#"+this.s5;
	}
}