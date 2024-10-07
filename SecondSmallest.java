import java.util.Arrays;
public class MyClass 
{
	//StartOfMainMethod
	public static void main(String[] args) 
	{
		int a[]=
		{
			1,2,5,6,3,2
		}
		;  
		myCode(a);
	}
	//EndOfMainMethod
	private static void myCode(int[] a)
	{
		Arrays.sort(a);
		System.out.println("Second smallest: "+a[1]);
	}
}
