/*
Write a program to check if an array of integers is a palindrome.
*/

public class MyClass 
{
	
	public static void main(String[] args) 
	{
		int[] a= 
		{
			1, 2, 1
		}
		;
		myCode(a);
	}
	
	private static void myCode(int[] a) 
	{
		
		for(int i = 0;i<a.length;i++)
		{
			int c = 0;
			for(int j = a.length-1;j>0;j--)
			{
				if(a[i]==a[j])
				c++;
			}
			if(c==0)
			{
				System.out.println("Is the array a palindrome? "+false);
				return;
			}
		}
		System.out.println("Is the array a palindrome? "+true);
	}
}
