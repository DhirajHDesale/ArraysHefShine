/*
Given an array Arr of N positive integers and another number X. Determine whether or not there exist two elements in Arr whose sum is exactly X.
*/

public class MyClass 
{
	public static void main(String[] args) 
	{
		int[] a= 
		{
			1, 2, 3, 4, 5, 6
		}
		;
		int x=3;
		myCode(a,x);
	}
	public static void myCode(int[] a,int x) 
	{
		String ans="";
		for(int i = 0;i<a.length;i++) 
		{
			for(int j = i+1;j<a.length;j++)
			{
				if(a[i]+a[j]==x)
				{
					ans = "Yes";
					System.out.println(ans);
					return;
				}
			}
		}
		ans = "No";
		System.out.println(ans);
	}
}
