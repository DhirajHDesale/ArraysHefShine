class LeaderElement {
    public static void main(String[] args) {
       int a[] = {8,2,20,5,30,9,1};
       for(int i = 0;i<a.length;i++){
           int c = 0;
           for(int j = i+1;j<a.length;j++){
               if(a[i]<a[j])
               c++;
           }
           if(c==0)
           System.out.print(a[i]+" ");
       }
    }
}
