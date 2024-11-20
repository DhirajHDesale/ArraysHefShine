/*
First digit in product of an array of numbers
Given an array of ‘n’ numbers. We need to find the first digit of product of these ‘n’ numbers 
Examples : 
 

Input  : arr[] = {5, 8, 3, 7}
Output : 8
        Product of 5, 8, 3, 7 is 840
        and its first  digit is 8

Input  : arr[] = {6, 7, 9}
Output : 3
  */
public class MyClass 
{
	public static void main(String[] args) 
	{
		int[] n =
		{
			5,8,3,7
		}
		;
		myCode(n);
	}
	private static void myCode(int[] a)
	{
		int sum = 1;
		for(int i = 0;i<a.length;i++)
		{
			sum = sum * a[i];
		}
		String ans = String.valueOf(sum);
		System.out.println(ans.charAt(0));
	}
}
