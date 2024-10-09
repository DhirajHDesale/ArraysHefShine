public class MyClass 
{

	public static void main(String[] args) 
	{
		int[] a= 
		{
			2, 4, 3, 5, 6, -2, 4, 7, 8, 9
		}
		;
		int ele=7;
		myCode(a,ele);
	}

	private static void myCode(int[] a,int ele) 	
	{
		int size = 0;
		for(int i = 0;i<a.length;i++) 
		{
			int c = 0;
			for(int j = 0;j<i;j++) 
			{
				if(a[i]==a[j])
				c++;
			}
			if(c==0)
			size++;
		}
		int b[] = new int[size];
		int index = 0;
		for(int i = 0;i<a.length;i++) 
		{
			int c = 0;
			for(int j = 0;j<i;j++) 
			{
				if(a[i]==a[j])
				c++;
			}
			if(c==0) 
			b[index++] = a[i];
		}
		for(int i = 0;i<b.length;i++) 
		{
			for(int j = i+1;j<b.length;j++)
			{
				if(b[i]+b[j]==ele)
				System.out.print(b[i]+" "+b[j]+"\n");
			}
			
		}
	}
}
