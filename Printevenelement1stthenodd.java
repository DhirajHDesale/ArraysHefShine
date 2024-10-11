public class MyClass 
{
	public static void main(String[] args) 
	{
		int[] a=
		{
			1,2,3,4,5,6,7,8
		}
		;
		int[] b=new int[a.length];
		MyCode(a,b);
	}
	private static void MyCode(int[] a, int[] b) 
	{
		//Write code here
		int index = 0;
		for(int i = 0;i<a.length;i++) 
		{
			if(a[i]%2==0) 
			{
				b[index++] = a[i];
			}
		}
		for(int j = 0;j<a.length;j++) 
		{
			if(a[j]%2!=0) 
			{
				b[index++] = a[j];
			}
		}
		for(int i:b)
		{
			System.out.println(i+" ");
		}
	}
}
