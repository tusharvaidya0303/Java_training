import java.util.*;
public class SmallestThreeSum {
    public static int threeSumSmallest(int[] nums, int sum) {
        Arrays.sort(nums);
        int ans = 0;
        for (int i = 0; i < nums.length-2; i++) {
            int left = i+1;
            int right = nums.length-1;
            while (left<right) {
                int newsum = nums[i]+nums[left]+nums[right];
                if (newsum>=sum) {
                    right--;

                } else {
                    ans += right-left;
                    left++;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int nums[]={-2, 0, 1, 3};
        int sum=2;
        System.out.println(threeSumSmallest(nums,sum));
    }
}