package Part1;

public class _4BinarySearch {
    public static int binarySearch (int arr[], int tar){
        int si = 0;
        int ei = arr.length-1;

        while (si <= ei){
            int mid = si+(ei-si)/2;
            if (arr[mid] == tar){
                return mid;
            }
            if (arr[mid] < tar){
                si = mid+1;
            }else{
                ei = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        System.out.println(binarySearch(arr, 3));
        System.out.println(binarySearch(arr, 6));
        System.out.println(binarySearch(arr, 1));
    }
}
