import java.io.*;
class Employee
{
	String name;
	String id;
	int salary;
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	void accept()
	{
		try
		{
			System.out.print("Enter the name = ");
			name=br.readLine();
			System.out.print("Enter the ID = ");
			id=br.readLine();
			System.out.print("Enter the salary = ");
			salary=Integer.parseInt(br.readLine());
		}
		catch(Exception e){}
	}
	void display()
	{
		System.out.println("							");
		System.out.println("The name of Employee is= "+name);
		System.out.println("The ID of Employee is= "+id);
		System.out.println("The salary of Employee is= "+salary);
	}
}
class EmployeeTest
{
	public static void main(String args[])
	{
		Employee e[]=new Employee[5];
		for(int i=0;i<5;i++)
		{
			e[i]=new Employee();
		}
		for(int i=0;i<5;i++)
		{
			e[i].accept();
		}
		for(int i=0;i<5;i++)
		{
			e[i].display();
		}
	}
}