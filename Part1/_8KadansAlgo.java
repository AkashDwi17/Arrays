package Part1;
public class _8KadansAlgo {
    public static int kadans (int arr[]){
        int currSum = arr[0];
        int maxSum = arr[0];
        for (int i=1; i<arr.length; i++){
            currSum = Math.max(arr[i], currSum+arr[i]);
            maxSum = Math.max(currSum, maxSum);
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,-25,8};
        System.out.println(kadans(arr));
    }
}
