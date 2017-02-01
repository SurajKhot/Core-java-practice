import java.io.*;
class Student
{
int roll_no;
String name="";
void getData()
{
try
{
RandomAccessFile ff=new RandomAccessFile("Student.dat","rw");
BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
String choice="";
do
{
System.out.println("Enter Student RollNo:");
roll_no=Integer.parseInt(in.readLine());
System.out.println("Enter Student Name:");
name=in.readLine();
ff.writeInt(roll_no);
ff.writeUTF(name);
System.out.println("Add Another Record?(Y/N)");
choice=in.readLine();
}
while(choice.compareTo("Y")==0||choice.compareTo("y")==0);
}
catch(IOException e){}
}
void putData()
{
try
{
RandomAccessFile ff=new RandomAccessFile("Student.dat","r");
while(ff.getFilePointer()<ff.length())
{

roll_no=ff.readInt();
name=ff.readUTF();
System.out.println("Student RollNo="+roll_no);
System.out.println("Enter Student Name="+name);
}
}
catch(IOException e){}
}
public static void main(String args[])
{
Student s=new Student();
s.getData();
s.putData();
}
}
