import java.util.*;
class VectExternal
{
	public static void main(String args[])
	{
		Vector v=new Vector();
		v.addElement("muzzamil");
		v.addElement("chaitanya");
		v.addElement("suraj");
		System.out.print("vector elements are");
		for(int i=0;i<v.size();i++)
		{
			System.out.print(v.elementAt(i).toString());
		}
		v.removeElement("suraj");
		System.out.print("New vector elements are");
		for(int j=0;j<v.size();j++)
		{
			System.out.print(v.elementAt(j).toString());
		}
	}
}