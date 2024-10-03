public class MyClass 
{
	public static void main(String[] args) 
	{
		int a[]= 
		{
			1,2,3
		}
		;
		myCode(a);
	}
	
		public static void myCode(int a[]) 
	{
		int product = 1;
		for(int i = 0;i<a.length;i++) 
		{
			product = product * a[i];
		}
		System.out.println(product);
	}
}
