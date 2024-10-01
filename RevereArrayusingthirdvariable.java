public class MyClass {

	public static void main(String[] args) 
	{
		int[] a= {1,2,3,4,5,6,7,8};
		myCode(a);
	}

	private static void myCode(int[] a) {
		
	int start = 0;
int end = a.length-1;
while(start<=end) {
int t = a[start];
a[start] = a[end];
a[end] = t;
start++;
end--;
}
for(int i:a)
System.out.print(i+" ");

	}
}
