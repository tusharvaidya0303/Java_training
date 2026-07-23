public class longestSubarraySum {
    public static int longestSubarray(int[] nums, int k) {
        int maxsublength=0;
        int low =0;
        int high =0;
        int sum =0;
        while(high<nums.length){

            sum+=nums[high];
            //shrink window from left
            while(low<=high&&sum>k){
                sum-=nums[low++];
            }
            if(sum==k){
                maxsublength = Math.max(maxsublength, high-low+1);
            }
            high++;
        }
        return maxsublength;
    }
    public static void main(String[] args) {
        int nums[] = {10, 5, 2, 7, 1, 9}, k = 15;
        System.out.println(longestSubarray(nums, k));
    }
}
