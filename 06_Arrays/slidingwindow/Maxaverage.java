public class Maxaverage {
    public static double findMaxAverage(int[] nums, int k) {
        double currsum =0;
        for (int i = 0; i < k; i++) {
            currsum +=nums[i];
        }
        double maxAvg = currsum/k;

        for (int i = k; i < nums.length; i++) {
            currsum += nums[i] - nums[i-k];
            maxAvg = Math.max(maxAvg, currsum/k);
        }
        return maxAvg;
    }
    public static void main(String[] args) {
        int nums[] ={1,12,-5,-6,50,3};
        int k= 4;
        System.out.println(findMaxAverage(nums, k));
    }
}
