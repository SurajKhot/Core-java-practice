import box1.BoxClass;
class BoxDemo
{
	public static void main(String args[])
	{
		BoxClass b= new BoxClass(10,20,25);
		b.disp();
		double vol=b.width*b.height*b.depth;
		System.out.println("Volume is"+vol);
	}
}
