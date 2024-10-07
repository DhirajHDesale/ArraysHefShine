public class MyClass 
{
	public static void main(String[] args) 
	{
		int n=5;
		int[] arr= 
		{
			0,0,0,0,1,1,1
		}
		;
		myCode(arr,n);
	}
	public static void myCode(int[]a,int n)
	{
		//Write code here
		for(int i = 0;i<n;i++) 
		{
			if(a[i]==1)
			{
				System.out.println(i);
				return;
			}
		}
		System.out.println(-1);			
	}
}
