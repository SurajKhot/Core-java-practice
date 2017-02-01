import java.io.*;
import java.util.*;
import java.util.Enumeration;

class VectorDemo1
{
	public static void main(String args[])throws Exception
	{
		Vector<Object>v=new Vector<Object>(12,2);
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str="";
		
			v.addElement(new Integer(1));
			v.addElement(new Integer(2));
			v.addElement(new Integer(4));
			v.addElement(new Integer(8));
			v.addElement(new Integer(3));
			v.addElement(new String("TYIF"));
			v.addElement(new String("TYCO"));
			v.addElement(new String("TYCM"));
			v.addElement(new Character('C'));
			v.addElement(new Character('A'));
			v.addElement(new Float("5.3"));
			v.addElement(new Float("8.3"));
			System.out.println("Enter Element At Last Position:");
			v.addElement(br.readLine());
			for(int i=0;i<v.size();i++)
			{
				System.out.print("Element at"+(i+1)+":"+v.elementAt(i));
				v.removeElementAt(2);
				System.out.print("Enter element to be searched:");
				str=br.readLine();
			}
			for(int i=0;i<v.size();i++)
			{
				if(str.equals(v.elementAt(i).toString()))
				{
					System.out.println("Enter Found at:"+(i+1));
				}
			}
			System.out.println("Elements at First Position:"+v.firstElement());
			System.out.println("Element at last position:"+v.lastElement());
			for(int i=0;i<v.size();i++)
			{
				System.out.println("Element At:"+(i+1)+":"+v.elementAt(i));
			}
			
		
	}
}
