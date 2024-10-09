public class MyClass {

	public static void main(String[] args) 
	{
		int[] a= {0,1,0,1,0};
		myCode(a);
	}

	public static void myCode(int[] a) 
	{
		 for(int i = 0;i<a.length;i++){
      for(int j = 0;j<a.length;j++){
          if(a[i]==0 && a[j]==1){
              int t = a[i];
              a[i] = a[j];
              a[j] = t;
          }
      }
  }
  for(int i:a)
  System.out.print(i+" ");
	}

}
