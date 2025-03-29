import java.util.*;
public class LinearSearch {
   public static void LS(int a[] , int key){
    for(int i=0; i<a.length ; i++){
        if(a[i]==key){
            System.out.println("Found at" +i+  "th postion");
            return;
        }
    }
    System.out.println("not present");
   }
   public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the size of array:");
    int n=sc.nextInt();
    
   
    int a[] = new int[n];
    System.out.println("enter the elements of array:");
    for(int i=0;i<n;i++){
        a[i]=sc.nextInt();
    }
    System.out.println("enter the key element for the search:");
    int k=sc.nextInt();
    LS(a,k);


   }
    
}
