class Test
{
	string="suraj khot";
	int a,b,;
	public void display()
	{
		System.out.println(string);		
	}
	public void display()
	{
		System.out.println("second method"+string);		
	}
}
class TestDemo
{
	public static void main(String args[])
	{
		Test t = new Test();
		t.display();
		t.display();
	}
}