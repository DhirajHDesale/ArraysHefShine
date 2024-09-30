public class MyClass{
      
	public static void main(String[] args) {
		int[] a={1,0,1,0,1,0,1,0};
		replace(a);
	
	}

	private static void replace(int[] a) {
		
 for(int i = 0;i<a.length;i++){
     if(a[i]==0){
         a[i] = 1;
     }
 }
 for(int i:a){
     System.out.print(i+" ");
 }
       }
}