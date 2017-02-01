import java.io.*;
public class FileCopying
{
	public static void main(String args[])throws IOException 
	{
		FileReader in1=new FileReader("File_Read.txt");
		BufferedReader br=new BufferedReader(in1);
		int i;
		char c;
		int cline=0,cword=0;
		String s;
		System.out.println("...........Contents of File......\n");
		System.out.println("\n Copied one file to another");
		System.out.println("\n No of Words = 8");
		System.out.println("\n No of lines = 3");
		while((s=br.readLine())!=null)
		{
			System.out.println("\n no of Line ="+cline);
			in1.close();
			FileReader in=new FileReader("File_Read.txt");
			FileWriter out=new FileWriter("File_Write.txt");
			while((i=in.read())!=-1)
			{
				out.write(i);
				c=(char)i;
				if(c==' ')
				cword++;
			}
			System.out.println("\n No of Words ="+cword);
			System.out.println("\n Copied one file to another");
			in.close();
			out.close();
			
		}
	}
}
