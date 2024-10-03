public class MyClass 
{
	public static void main(String[] args) 
	{
		int[] a= 
		{
			2,4,6,8,9,10,12
		}
		;
		int[] b= 
		{
			2,4,6,8,10,12
		}
		;
		myCode(a,b);
	}
	public static void myCode(int[] a,int[] b)
	{
		for(int i = 0;i<a.length;i++) 
		{
			for(int j = 0;j<b.length;j++) 
			{
				if(a[i]!=b[j] && i==j)
				{
					System.out.println(i);
					return;
				}
			}
		}
	}
}
