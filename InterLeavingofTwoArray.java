{
	//StartOfMainMethod
	public static void main(String[] args) 
	{
		char[] a= 
		{
			'a','b','c','d','e','f','g'
		}
		;
		char[] b= 
		{
			'w','x','y','z'
		}
		;
		myCode(a,b);
	}
	//EndOfMainMethod
	private static void myCode(char[] a,char[] b) 
	{
		int size = a.length + b.length;
		String ans = "";
		if(a.length>b.length) 
		{
			for(int i = 0;i<a.length;i++) 
			{
				int k  = 0;
				for(int j = 0;j<b.length;j++)
				{
					if(i==j)
					ans = ans + a[i] + b[j];
					k++;
				}
				if(i>=k)
				ans = ans + a[i];
			}
		}
		else 
		{
			for(int i = 0;i<b.length;i++) 
			{
				int k = 0;
				for(int j = 0;j<a.length;j++) 
				{
					if(i==j)
					ans = ans + a[i] + b[j];
					k++;
				}
				if(i>=k)
				ans = ans + b[i];
			}
		}
		char d[] = ans.toCharArray();
		for(char c:d)
		System.out.print(c+" ");
	}
}
