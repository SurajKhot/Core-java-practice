import java.util.*;

class Arr
{
public static void main(String args[])
{
	int a[]={1,2,3,4,5};
	for(int i=0;i<=4;i++)
	{
		System.out.println(a[i]);
	}
	
	System.out.println("bleow items are from vector");
	
	Vector v = new Vector();
	
	v.addElement(new Integer(6));
	v.addElement(new Integer(7));
	v.addElement(new Integer(8));
	v.addElement(new Integer(9));
	v.addElement(new Integer(10));
	
	v.addElement(new String("I am Back"));
	
		System.out.println(v);
}
}