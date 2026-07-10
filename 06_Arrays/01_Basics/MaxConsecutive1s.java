public class MaxConsecutive1s {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int max = Integer.MIN_VALUE;
        int count = 0;
        for (int i = 0; i <= nums.length-1; i++) {
            if (nums[i] == 1) {
                count++;
            } else {
                count = 0;
            }
            max = Math.max(max, count);
        }
        return max;
    }
    public static void main(String[] args) {
        int nums[] ={1,1,0,1,1,1};
        System.out.println(findMaxConsecutiveOnes(nums));
    }
}
