class ShareData extends Thread
{
int c,count;
ShareData(String n,int a)
{
super(n);
c=a;
}
synchronized void getdata()
{
count=c; 
System.out.println(this+"Count initialized to:"+count);
}
synchronized void putdata()
{
System.out.println(this+"Count:"+count);
}
public void run()
{
getdata();
putdata();
}
}
class example
{
public static void main(String args[])
{
ShareData s1=new ShareData("ONE",15);
ShareData s2=new ShareData("TWO",20);
s1.start();
s2.start();
}
}
