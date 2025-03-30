import java.util.*;

public class BinarySearch {
    public static int BS(int a[], int key) {
        int first = 0, last = a.length - 1;
        
        while (first <= last) {  // Fixed condition
            int mid = (first + last) / 2;
            
            if (key == a[mid]) {
                return mid;  // Key found, return index
            } 
            else if (key > a[mid]) {
                first = mid + 1;  // Search in right half
            } 
            else {
                last = mid - 1;  // Search in left half
            }
        }
        
        return -1;  // Key not found
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[5];

        for (int i = 0; i < a.length; i++) {
            System.out.println("Enter the " + i + "th element:");
            a[i] = sc.nextInt();
        }

        // Sorting the array for Binary Search
        Arrays.sort(a);

        System.out.println("Enter the key for the search: ");
        int k = sc.nextInt();

        int r = BS(a, k);

        if (r == -1) {
            System.out.println("Key not found.");
        } else {
            System.out.println("Key found at index: " + r);
        }

        sc.close();  
    }
}
