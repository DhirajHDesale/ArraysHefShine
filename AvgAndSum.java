public class MyClass 
{
	
	public static void main(String[] args) 
	{
		int[] a= 
		{
			1,2,3,4,5,6,7,8
		}
		;
		myCode(a);
	}
	
	private static void myCode(int[] a) 
	{
		double sum = 0;
		double avg = 0;
		for(int i:a) 
		{
			sum = sum + i;
		}
		avg = sum / a.length;
		System.out.println(sum);
		System.out.println(avg);
	}
}