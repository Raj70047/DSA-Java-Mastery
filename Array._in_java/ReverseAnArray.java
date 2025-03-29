public class ReverseAnArray {
    public static void RS(int a[] ){
      int s=0 , e=a.length-1;
      while(s<e){
        
          int temp=a[s];
          a[s]=a[e];
          a[e]=temp;
        
        s++;
        e--;
      }
    }
    public static void main(String args[]){
      int a[]={1,2,3,4,3,5,6,7};
      RS(a);
      for(int i=0;i<a.length;i++){
        System.out.println(a[i]);
      }
    }
}
