package p2;
import java.io.Serializable;
public class Login_model implements Serializable
{
	String s1,s2;
	public Login_model(String a1,String a2)
	{
		this.s1 = a1;
		this.s2 = a2;
	}
	public String toString()
	{
		return this.s1+"#"+this.s2;
	}
}