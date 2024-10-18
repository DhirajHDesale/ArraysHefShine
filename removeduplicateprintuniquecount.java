/*
Write a program to remove the duplicate elements of a given array and return the new length of the array
i/p : int[] a = {2,1,5,4,3,2,1,6,4,2};
o/p : new length of array : 6
	*/
public class MyClass 
{
	public static void main(String[] args) 
	{
		int[] a = 
		{
			2,1,5,4,3,2,1,6,4,2
		}
		;
		myCode(a);
	}
	private static void myCode(int[] a) 	
  {
		int c = 0;
		for(int i = 0;i<a.length;i++) 
		{
			int k = 0;
			for(int j = 0;j<i;j++) 
			{
				if(a[i]==a[j])
				{
					k++;
				}
			}
			if(k==0)
			c++;
		}
		System.out.println("new length of array : "+c);
	}
}
