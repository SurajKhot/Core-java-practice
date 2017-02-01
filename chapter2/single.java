import java.lang.*;
class person
{
	String name;
	int age;
	person(String a,int b)
	{
		name=a;
		age=b;
	}
}
class employee extends person
{
	String emp_designation;
	float emp_salary;
	employee(String a,int b,String c,float d)
	{
		super(a,b);
		emp_designation=c;
		emp_salary=d;
	}
	void display()
	{
		System.out.println("Name="+name);
		System.out.println("Age="+age);
		System.out.println("Designation="+emp_designation);
		System.out.println("salary="+emp_salary);
	}
}

class single
{
	public static void main(String args[])throws Exception
	{
		employee e=new employee("Suraj",19,"CEO",999999s);
		e.display();
	}
}
