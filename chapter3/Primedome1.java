import java.io.*;
class prime extends Thread
{
prime()
{
setName("Prime");
setPriority(10);
start();
}
public void run()
{
try
{
for(int i=1;i<=10;i++)
{
int flag=0;
int a;
for(a=2;a<i;a++)
{
if(i%a==0)
{
flag =1;
break;
}
}
if(flag==0)
System.out.println(getName()+""+i);
Thread.sleep(500);
}
}
catch(InterruptedException i){}
}
}
class nonprime extends Thread
{
nonprime()
{
setName("Non Prime");
setPriority(10);
start();
}
public void run()
{
try

{
for(int i=1;i<=10;i++)
{
int a;
int flag=0;
for(a=2;a<i;a++)
{
if(i%a==0)
{
System.out.println(getName()+""+i);
break;
}
}
Thread.sleep(500);
}
}
catch(InterruptedException ie){}
}
}
class Primedome1
{
public static void main(String args[])
{
prime p=new prime();
nonprime n=new nonprime();
}
}
