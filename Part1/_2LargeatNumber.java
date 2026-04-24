package Part1;

public class _2LargeatNumber {
    public static void main (String args[]){
        int arr[] = {1,2,3,4,7,5,6};
        int largest = Integer.MIN_VALUE;
        
        for (int i=0; i<arr.length; i++){
            largest = Math.max(largest, arr[i]);
        }
        System.out.print (largest);
    }
}
