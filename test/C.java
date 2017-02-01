import java.util.*;

public class A
{
	String a="from a";
	int i=256;
}

public class B extends A
{
	public static void main(String args[])
	{
	String b="from b";
	int j=2;
	System.out.println(a);
	System.out.println(b);
	System.out.println(i+j);
	}
}
