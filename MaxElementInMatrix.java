public class MyClass 
{
		public static void main(String[] args) 
	{
		int[][] a= 
		{
			{
				1,2,3
			}
			,
			{
				4,23,5
			}
			,
			{
				5,4,7
			}
		}
		;
		myCode(a);
	}
		private static void myCode(int[][] a) 
	{
		int max = 0;
		for(int i = 0;i<a.length;i++) 
		{
			for(int j = 0;j<a[i].length;j++) 
			{
				if(a[i][j]>max) 
				{
					max = a[i][j];
				}
			}
		}
		System.out.println(max);
	}
}
