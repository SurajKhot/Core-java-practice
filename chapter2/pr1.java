import java.util.*;
class pr1
{
	public static void main(String args[])
	{
		Vector<Object>list=new Vector<Object>();
		int length=args.length;
		int size=list.size();
		String listArray[]=new String[size];
		for(int i=0;i<length;i++)
		{
			list.addElement(args[i]);
			
			list.copyInto(listArray);
		}
		for(int i=0;i<length;i++)
		{
			System.out.println("Arr["+i+"]"+"=="+listArray[i]);
		}
	}
}
