import java.io.*;
class MyException
{
	public static void main(String args[])
	{
		BufferedReader d=new BufferedReader(new InputStreamReader(System.in));
		String s="Hi Suraj";
		String password;
		
		try
		{
			System.out.println("Enter The Password :: ");
			password=d.readLine();
			if(password.equalsIgnoreCase(s))
			{
				System.out.println("  :: Access Granted :: ");
				System.out.println("  :: Password is Correct :: ");
			}
			else
			throw new Authenticationfailure(" :: Access Denied :: ");
		}
			
		catch(Authenticationfailure e)
		{
			System.out.println("  :: Access Denied :: ");
			System.out.println("  :: Incorrect Password :: ");
		}
		catch(Exception e)
		{
			System.out.println(" "+e);
		}
	}
}	
class Authenticationfailure extends Exception
{
	Authenticationfailure(String msg)
	{
		super(msg);
	}
}
