package Part1;

public class _3SmallestNumber {
    public static void main(String[] args) {
     int arr[] = {1,2,3,4,7,5,6};
        int smallest = Integer.MAX_VALUE;
        
        for (int i=0; i<arr.length; i++){
            smallest = Math.min(smallest, arr[i]);
        }
        System.out.print (smallest);
    }
}
