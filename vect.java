import java.util.*;
class vect
{
	public static void main(String args[])throws Exception
	{
		Vector v=new Vector();
		v.add("muzzamil");
		v.add("chaitanya");
		v.add("suraj");
		System.out.print("vector elements are");
		for(int i=0;i<v.size();i++)
		{
			System.out.println(v.get(i));
		}
		v.removeElementAt(2);
		System.out.println("New vector elements are :");
		for(int i=0;i<v.size();i++)
		{
			System.out.println(v.get(i));
		}
	}
}