/*
Write a program to rotate an array to the left
i/p :
int[] a= {3,2,4,6,5,6,8};
o/p : 
2 4 6 5 6 8 3 
	*/
public class MyClass 
{

	public static void main(String[] args) 
	{
		int[] a= 
		{
			3,2,4,6,5,6,8
		}
		;
		myCode(a);
	}

	private static void myCode(int[] a) 
	{
		int temp = a[0];
		for(int i = 0;i<a.length-1;i++) 
		{
			a[i] = a[i+1];
		}
		a[a.length-1] = temp;
		for(int i:a) 
		{
			System.out.print(i+" ");
		}
	}
}
