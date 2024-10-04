public class MyClass
{
	public static void main(String[] args) 
	{
		String[] s=
		{
			"hef", "he", "hefs",
			"hefshin", "hefshine" 
		}
		;
		myCode(s);
	}
	public static void myCode(String[] s) 
	{
		String max = "";
		for(int i = 0;i<s.length;i++) 
		{
			if(s[i].length()>max.length())
			max = s[i];
		}
		System.out.println(max);
	}
}
