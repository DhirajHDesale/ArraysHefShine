public class MyClass 
{
	public static void main(String[] args) 
	{
		int arr[]= 
		{
			1,2,4,3,8
		}
		;
		int x = 2;
		myCode(arr,x);
	}
	public static void myCode(int[] arr, int x) 
	{
		int c = 0;
		for(int i = 0;i<arr.length;i++) 
		{
			if(arr[i]==x)
			c++;
			
		}
		
		System.out.println(c);
	}
}
