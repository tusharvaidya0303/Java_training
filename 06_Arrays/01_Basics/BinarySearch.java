public class BinarySearch {

    public static int binarySearch(int arr[],int target){
        int start =0;
        int end=arr.length-1;
        while (start<=end) {
            int mid = (start+end)/2;
            //comparison
            if (target==arr[mid]) {
                return mid;
            }else if(arr[mid]<target){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9};
        int target = 6;

        System.out.println("Target found at index : "+ binarySearch(arr, target));

    }
}