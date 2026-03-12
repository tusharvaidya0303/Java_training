public class ReverseArr {
    public static void main(String[] args) {
        int arr[]= {1,2,3,4,5,6,7,8,9};
        int rev =0;
        for (int i = arr.length-1; i >= 0; i--) {
            rev = arr[i];
            System.out.println(rev);
        }
    }
}