//Missing number in shuffled array 
//Given an array A of size N. The contents of A are copied into another array B and numbers are shuffled.
//Also, one element is removed from B. The task is to find the missing element.
public class MyClass 
{
	public static void main(String[] args) 
	{
		long	A[] = 
		{
			4, 8, 1, 3, 7
		}
		;
		long	B[] = 
		{
			7, 4, 3, 1
		}
		;
		myCode(A,B);
	}
	public static void myCode(long A[],long B[]) 
	{
		for(int i = 0;i<A.length;i++) 
		{
			int c = 0;
			for(int j = 0;j<B.length;j++) 
			{
				if(A[i]==B[j])
				c++;
			}
			if(c==0)
			System.out.println(A[i]);
		}
	}
}
