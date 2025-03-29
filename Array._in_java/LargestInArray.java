public class LargestInArray {
    public static int LI(int a[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0 ; i< a.length ; i++){
            if(a[i]>largest){
                largest=a[i];
            }
        }
       return largest; 
    }
    public static void main(String args[]){
        int a[]={9,7,9,5,4,5,7,8,2,1,90,76,99};
        System.out.println(LI(a));
    }
}
