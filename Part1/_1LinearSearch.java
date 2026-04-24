package Part1;
import java.util.*;

public class _1LinearSearch {
    public static void linearSearch (int arr[], int target){
        
        
        for (int i=0; i<arr.length; i++){
            if (arr[i] == target){
                System.out.println(i+" found");
                return;
            }
        }
        System.out.println("not found");
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print ("Enter size of array: ");
        int n = sc.nextInt();
        int arr[] = new int [n];

        System.out.print ("Enter array: ");
        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print ("What you want to search: ");
        int target = sc.nextInt();
        linearSearch(arr, target);
    }
}
