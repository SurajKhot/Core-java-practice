import java.io.*;
class user
{
	public static void main(String args[])
	{
		BufferedReader d=new BufferedReader(new InputStreamReader(System.in));
		int n;
		try
		{
			System.out.println("Enter The Number :: ");
			n=Integer.parseInt(d.readLine());
			if(n%2==0)
			{
				System.out.println(" :: Number is Even :: ");
			}
			else
			{
				throw new Exception(" :: Number is Odd :: ");
			}
		}
		catch(Exception e)
		{
			System.out.println(" "+e);
		}
		
	}
}
