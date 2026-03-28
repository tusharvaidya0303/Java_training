public class MaxSum {
    public static int returnSum(int[] arr, int k) {
        int maxSum = 0;
        int cursum = 0;
        for(int i = 0; i < k; i++){
            cursum += arr[i];
        }
        maxSum = cursum;
        for(int i = k; i < arr.length; i++){
            cursum += arr[i] - arr[i-k];
            maxSum = Math.max(maxSum, cursum);
        }
        return maxSum;
    }
    public static void main(String[] args) {

        int[] arr = {1,12,-5,-6,50,3};
        int k = 4;
        System.out.println(returnSum(arr, k));
    }
}
