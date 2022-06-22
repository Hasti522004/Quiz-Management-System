package p3;
import java.io.Serializable;
public class Student implements Serializable
{
	String name,marks;
	public Student(String a1,String a2)
	{
		this.name = a1;
		this.marks= a2;
	}
	public String toString()
	{
		return this.name+"#"+this.marks;
	}
}