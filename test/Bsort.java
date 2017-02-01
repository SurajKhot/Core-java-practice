class Bsort
{
	int i,j,temp;
	int k=arr.length;
	void dis()
	{
		for(i=0;i<k;i++)
		{
			System.out.print(arr[i]);
		}
	}
	void swap()
	{
		for(int i=0; i < k; i++){  
                 for(int j=1; j < (k-i); j++){  
                          if(arr[j-1] > arr[j]){  
                                 //swap elements  
                                 temp = arr[j-1];  
                                 arr[j-1] = arr[j];  
                                 arr[j] = temp;  
                         }  
                          
                 }  
         }  
	}
	public static void main(String[] args)
	{
		Bsort b=new Bsort();
		Scanner sc=new Scanner(Sytem.in);
				
		System.out.println("Enter how many nos to be sorted");
		int n=sc.nextInt();
		int[] arr=new Int[n];
		System.out.println("Enter nos in");
		for(i=0;i<=n;i++)
		{
			arr[i]=sc.nextInt();
		}


		b.dis();
		System.out.println(" ");
		b.swap();
		System.out.println("after swapping");
		b.dis();
	}
}