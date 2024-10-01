public class MyClass {

		public static void main(String[] args) 
		{
			int[] a= {3,4,5,2,3,6,7,4};
			myCode(a);
		}
			
		public static void myCode(int[]a)
		{
			int temp = a[a.length-1];
                        for(int i = a.length-1;i>0;i--) {
                   a[i] = a[i-1];
                      }
             a[0] = temp;

for(int i:a) 
System.out.print(i+" ");
			
		}
}
