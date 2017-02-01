import java.io.*;
class MyException2
{
	public static void main(String args[])
	{
		BufferedReader d=new BufferedReader(new InputStreamReader(System.in));
		String s="";
		int count=0;
		try 
		{
			System.out.println("Enter The String :: ");
			s=d.readLine();
			for(int i=0;i<s.length();i++)
			{
				if('a'==s.charAt(i))
				{
					count++;
				}
			}
			if(count!=0)
			{
				System.out.println(" a is present ");
			}
			else
			{
				throw new Meraexception(" a is absent ");
			}
		}
		catch(Meraexception e)
		{
			System.out.println(" a is absent \n"+e);
		}
		catch(Exception e)
		{
			System.out.println(" "+e);
		}
	}
}
class Meraexception extends Exception
{
	Meraexception(String msg)
	{
		super(msg);
	}
}
