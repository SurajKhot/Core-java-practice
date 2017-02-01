package box1;
public class BoxClass
{
	public double width;
	public double height;
	public double depth;
	public BoxClass(double w,double h,double d)
	{
		width=w;
		height=h;
		depth=d;
	}
	public void disp()
	{
		System.out.println("Box Width="+width+"\t Height="+height+"\t Depth="+depth);
	}
}
