public class PairsInArray {
    public static void PA(int a[]){
         for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                System.out.println("( "+a[i]+","+a[j]+")");
            }
            
         }
    }
    public static void main(String args[]){
        int a[]={12,34,65,78,43,46};
        PA(a);
    }
}
