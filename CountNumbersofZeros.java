/*
Count zeros in a sorted matrix 
Given a N X N binary Square Matrix where each row and column of the matrix is sorted in ascending order. Find the total number of zeros present in the matrix.

Example 1:

Input:
N = 3
A = {{0, 0, 0},
     {0, 0, 1},
     {0, 1, 1}}
Output: 6
*/
public class MyClass 
{

	public static void main(String[] args) 
	{
		int N = 3;
		int A[][] = 
		{
			{
				0, 0, 0
			}
			,
			{
				0, 0, 1
			}
			,
			{
				0, 1, 1
			}
		}
		;
		myCode(A,N);
	}
	public static void myCode(int A[][], int N) 
	{
		int cnt = 0;
		for(int i = 0;i<N;i++) 
		{
			for(int j = 0;j<A[i].length;j++) 
			{
				if(A[i][j]==0)
				{
					cnt++;
				}
			}
		}
		System.out.println(cnt);
	}
}
