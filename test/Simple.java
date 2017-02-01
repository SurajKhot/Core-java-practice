import java.util.*;
public class Simple{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int i;
int max=0;
int small=0;
double m;
int k=0;
System.out.println("enter no");
int n=sc.nextInt();
int arr[]=new int[n];
System.out.println("enter nos");
for(i=0;i<arr.length;i++)
{
arr[i]=sc.nextInt();
}
System.out.println(Arrays.toString(arr));

for(i=0;i<4;i++)
{
k +=arr[i];
}
m=k/4;
System.out.println("addition is : "+k+" and mean is :"+m);
max=arr[0];
small=arr[0];
for(i=0;i<arr.length;i++)
{
	
	if(arr[i]>max)
	{
		max=arr[i];	
	}
	else if(arr[i]<small)
	{
		small=arr[i];
	}
}
System.out.println("Largest no : "+max+" || smallest no : "+small);

System.out.println("Enter no to search");
int sr=sc.nextInt();

for(i=0;i<arr.length;i++)
{
	if(sr==arr[i])
	{
		System.out.println("Match found at "+i+" location");
	}
}

for(i=0;i<arr.length;i++)
{
	if(arr[i]%2==0)
	{
		System.out.println(arr[i]+" this no is even");
	}
	else if(arr[i]%2!=0){
		System.out.println(arr[i]+" this no is not even");
	}
}

System.out.println("enter no for second array");
int t=sc.nextInt();
int arr2[]=new int[t];
System.out.println("enter nos for 2nd array");
for(i=0;i<arr2.length;i++)
{
arr2[i]=sc.nextInt();
}

int a1=arr.length;
int a2=arr2.length;
int sum[]=new int[a1];

if(a1==a2)
{
	for(i=0;i<a1;i++)
	{
		sum[i]+=arr[i]+arr2[i];
	}
}
System.out.println("Addition of");
System.out.println(Arrays.toString(arr));
System.out.println("||.. And ..||");
System.out.println(Arrays.toString(arr2));
System.out.println("||.. Is ..||");
System.out.println(Arrays.toString(sum));


}
}
