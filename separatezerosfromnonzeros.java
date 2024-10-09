public class MyClass 
{

	public static void main(String[] args) 
	{
		int[] a=
		{
			0, 1, 0, 1, -5, 0, 4
		}
		;
		myCode(a);
	}
	private static void myCode(int[] a) 
	{
		for(int i = 0;i<a.length;i++)
		{
			for(int j = 0;j<a.length;j++)
			{
				if(a[i]!=0 && a[j]==0)
				{
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		for(int i:a)
		System.out.print(i+" ");
	}
}
