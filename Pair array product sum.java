/*
Given a array a[] of non-negative integers. Count the number of pairs (i, j) in the array such that a[i] + a[j] < a[i]*a[j]. (the pair (i, j) and (j, i) are considered same and i should not be equal to j)

Input:
N=3
arr[] = {3, 4, 5} 
Output: 3
Explanation: Pairs are (3, 4) , (4, 5) and (3,5).  
*/

public class MyClass 
{

	public static void main(String[] args) 
	{
		int[] a= 
		{
			3,4,5
		}
		;
		int n=a.length;
		myCode(a, n);
	}
	
	public static void myCode(int[] a,int n) 
	{

		int cnt = 0;
		for(int i = 0;i<n;i++)
		{
			for(int j = i+1;j<n;j++)
			{
				if(a[i]+a[j]<a[i]*a[j])
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}
