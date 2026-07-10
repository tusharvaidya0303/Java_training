public class Krotate {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        // int k = 3;

        int n = arr.length; int k = 3;

        // Reverse whole array
        int start = 0, end = n - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

        // Reverse first k elements
        start = 0;
        end = k - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

        // Reverse remaining elements
        start = k;
        end = n - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
