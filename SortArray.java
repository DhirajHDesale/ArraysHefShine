public class MyClass 
{
	public static void main(String[] args) 
	{
		int[] a= 
		{
			33,78,90,20,5,50,40
		}
		;
		myCode(a);
	}
	private static void myCode(int[] a) 
	{
		for(int i = 0;i<a.length;i++) 
		{
			for(int j = i+1;j<a.length;j++) 
			{
				if(a[i]>a[j]) 
				{
					int t = a[i];
					a[i] = a[j];
					a[j] = t;
				}
			}
		}
		for(int i : a) 
		{
			System.out.print(i+" ");
		}
	}
}
