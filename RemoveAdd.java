import java.util.*;
class RemoveAdd
{
	public static void main(String args[])
	{
		Vector v=new Vector();
		v.addElement("suraj");
		v.addElement("Muzammil");
		v.addElement("chaitanya");
		for(int i=0;i<v.size();i++)
		{
			System.out.println(v.get(i));
		}
		System.out.println("							");
		System.out.println("removing an element");
		v.removeElement("suraj");
		for(int i=0;i<v.size();i++)
		{
			System.out.println(v.get(i));
		}
	}
}