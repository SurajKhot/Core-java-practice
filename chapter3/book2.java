import java.io.*;
class book
{
String book_name;
int book_id;
int count=10;
int y,n;
synchronized void issues()
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
try
{
System.out.println("Enter the name of the book:");
book_name=br.readLine();
if(book_name.equals("JAVA"))
{
book_id=111;
}
}
catch(IOException e){}
System.out.println("name:"+book_name);
System.out.println("id:"+book_id);
System.out.println("number of book available:"+count);
try
{
System.out.println("Press 1. to issue a book");
try
{
y=Integer.parseInt(br.readLine());
}
catch(Exception ae){}
if(y==1)
{
System.out.println("Enter the number of book to be issued");
n=Integer.parseInt(br.readLine());
Thread.sleep(5000);
count=count-n;
}
}
catch(InterruptedException ie){}
catch(IOException e){}
System.out.println("Number of books remaining:"+count);
}
}
class book1 implements Runnable
{
Thread t;
book b;
public book1(book b1)
{
b=b1;
t=new Thread(this);
t.start();
}
public void run()
{
b.issues();
}
}
class book2
{
public static void main(String args[])
{
book ob=new book();
new book1(ob);
new book1(ob);
}
}
