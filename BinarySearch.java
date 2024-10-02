public class MyClass 
{
	public static void main(String[] args) 
	{
		int[] a=
		{
			23,45,67,88,90
		}
		;
		int num=90;
		int start=0;
		int end=a.length-1;
		binarysearch(a,num,start,end);
	}
	private static void binarysearch(int[] a, int num, int start, int end) 
	{
		while (start <= end) 
		{
			int mid = (start + end) / 2; 
			if (a[mid] == num) 
			{
				System.out.println("found at index " + mid);
				return; 
			}
			else if (a[mid] > num) 
			{
				end = mid - 1;
			}
			else 
			{
				start = mid + 1; 
			}
		}
		System.out.println("index not found"); 		
	}
}
