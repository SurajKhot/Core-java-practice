import java.lang.*;
abstract class shape
{
	int dim1,dim2;
	void disp(int a,int b)
	{
		dim1=a;
		dim2=b;
	}
	abstract void area();}
class rectangle extends shape
{
	void getd(int x,int y)
	{
		dim1=x;
		dim2=y;
	}
	void area()
	{
		int c;
		c=dim1*dim2;
		System.out.println("Area of rectangle:"+c);
	}
}
class triangle extends shape
{
	void getd(int c,int d)
	{
		dim1=c;
		dim2=d;
	}
	void area()
	{
		Double a;
		a=0.5*dim1*dim2;
		System.out.println("Area of triangle:"+a);
	}
}
class ExampleE
{
	public static void main (String args[])
	{
		triangle t=new triangle();
		rectangle r=new rectangle();
		r.getd(10,20);
		t.getd(8,5);
		r.area();
		t.area();
	}
}
