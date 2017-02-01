class person
{
	int age;
	static int count=0;
}
class persontest
{
	public static void main(String args[])
	{
		person p1=new person();
		p1.age=18;
		person.count=1;
		person p2=new person();
		p2.age=18;
		person.count=2;
		
	}
}
