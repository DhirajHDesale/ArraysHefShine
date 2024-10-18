/*
Copy one array into another array
*/
public class MyClass
{

	public static void main(String[] args) 
	{
		int[] a=
		{
			1,2,3,4,5,6,7,8
		}
		;
		int index=0;
		int[] b=new int[a.length];
		copyarray(a,index,b);
	}

	private static void copyarray(int[] a, int index, int[] b) 
	{

		for(int i = 0;i<a.length;i++) 
		{
			b[i] = a[i];
		}
		for(int j:b)
		System.out.println(j);
	}
}
