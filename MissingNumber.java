public class MyClass{
	public static void main(String[] args) {
	int	N = 5; 
			int	A[] = {5, 4,1,3};
		myCode(N,A);
	}
	public static void myCode(int N,int A[]) {
for(int i = 1;i<=N;i++) {
int c = 0;
for(int j = 0;j<A.length;j++) {
if(A[j]==i)
c++;
}
if(c==0)
System.out.println(i);
}

	}
}
