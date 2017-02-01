public class Test
{
	String s="suraj khot";
	int a,b,c;
	void display()
	{
		System.out.println(s);		
	}
/*	public void display(int b,int c)
	{
		System.out.println("second method"+(b+c));		
	}
*/
}
class TestDemo
{
	public static void main(String[] args)
	{
		Test t = new Test();
		t.display();
	}
}