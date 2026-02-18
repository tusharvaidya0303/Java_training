
public class Binary_Search {
    public static int BinarySearch(){
        int target=4;
        int[] arr={1,2,3,4,5,6};
        int start=0;
        int end= arr.length-1;
        while (start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==target) {
                return mid;
            }else if(arr[mid]>target){
                end=mid-1;
            }else {
                start = mid + 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        System.out.println(BinarySearch());
    }
}
