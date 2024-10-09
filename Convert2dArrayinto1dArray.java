public class MyClass 
{
	public static void main(String[] args) 
	{
		int[][] a= 
		{
			{
				1,2,3,4
			}
			,
			{
				4,5,6,4
			}
			,
			{
				4,5,6,4
			}
			,
			{
				7,8,9,5
			}
		}
		;
		myCode(a);
	}
	public static void myCode(int[][] a) 
	{
		int c = 0;
		for(int i = 0;i<a.length;i++)
		{
			for(int j = 0;j<a[i].length;j++)
			{
				c++;
			}
		}
		int b[] = new int[c];
		int index = 0;
		for(int i = 0;i<a.length;i++)
		{
			for(int j = 0;j<a[i].length;j++)
			{
				b[index++] = a[i][j];
			}
		}
		for(int i:b)
		System.out.print(i+" ");
	}
}
