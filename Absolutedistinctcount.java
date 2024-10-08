public class MyClass 
{
	public static void main(String[] args) 
	{
		int[] a= 
		{
			-3, -2, 0, 3, 4, 5
		}
		;
		int n=a.length;
		myCode(a,n);
	}
	public static void myCode(int[] a,int n) 
	{
		int ans = 0;
	for(int i = 0;i<n;i++){
	    a[i] = Math.abs(a[i]);
	}
		for(int i = 0;i<n;i++)
		{
			int c = 0;
			for(int j = 0;j<i;j++)
			{
				if(a[i]==a[j])
				c++;
			}
			if(c==0)
			ans++;
		}
		System.out.println(ans);
	}
}
