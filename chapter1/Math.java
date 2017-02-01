class Math
{
	public int sum(int a,int b)
	{
		return(a+b);
	}
	public int sub(int a,int b)
	{
		return(a-b);
	}
	public static void main(String args[])
	{
		Math obj=new Math();
		int result=obj.sum(10,20);
		System.out.println("addition is ="+result);
		float result1=obj.sub(10,20);
		System.out.println("substraction is ="+result1);
	}
}
	