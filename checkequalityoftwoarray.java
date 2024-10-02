public class MyClass {


	public static void main(String[] args) 
	{
		int[] a= {1,2,3,4,5};
		int[] b= {1,2,3,5,4};
		myCode(a,b);
	}
	

	private static void myCode(int[] a,int[] b) {
		int c = 0;
		if(a.length!=b.length){
		    System.out.println("not same");
		    return;
		}
		for(int i = 0;i<a.length;i++) {
for(int j = 0;j<b.length;j++) {
if(a[i]!=b[j] && i==j) {
c++;
}
}}
if(c==0)
System.out.println("same");
else
System.out.println("not same");

	}
}
