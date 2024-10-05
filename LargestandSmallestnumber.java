public class MyClass 
{
	public static void main(String[] args) 
	{
		int a[] = 
		{
			12, 1234, 45, 67, 1 
		}
		;
		int n = a.length;
		myCode(a, n);
	}
	public static void myCode(int a[],int n) 
	{
		int max = a[0];
		int min = a[0];
		for(int i = 0;i<a.length;i++)
		{
			if(a[i]>max) 
			max = a[i];
		}
		for(int i = 0;i<a.length;i++) 
		{
			if(a[i]<min) 
			{
				min = a[i];
			}
		}
		System.out.println("Max : "+max+"\n"+"Min : "+min);
	}
}
