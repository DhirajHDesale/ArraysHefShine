public class MyClass 
{
	public static void main(String[] args) 
	{
		int[] a= 
		{
			1,5,7,1
		}
		;
		int k=6;
		myCode(a,k);
	}
	public static void myCode(int[] a,int k)
	{
		int c = 0;
		for(int i = 0;i<a.length;i++) 
		{
			for(int j = i+1;j<a.length;j++) 
			{
				if(a[i]+a[j]==k) 
				{
					c++;
				}
			}
		}
		System.out.println(c);		
	}
}
