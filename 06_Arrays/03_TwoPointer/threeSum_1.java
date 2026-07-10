//Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
//Notice that the solution set must not contain duplicate triplets.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class threeSum_1{
public List<List<Integer>> threeSum(int[] nums) {

    List<List<Integer>> res = new ArrayList<>();
    if (nums.length < 3) return res;   //if result array size is less than 3, return empty

    int n = nums.length;
    Arrays.sort(nums);

    for (int i = 0; i < n - 2; i++) {                  //n-2 because we need 3 numbers
        if (i > 0 && nums[i] == nums[i - 1]) continue; // skip duplicates
        if (nums[i] > 0) break; 

        int left = i + 1, right = n - 1;
        int target = -nums[i];
            
            while (left < right) {
                int sum = nums[left] + nums[right];
                if (sum == target) {
                    res.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;

                    // skip duplicates
                    while (left < right && nums[left] == nums[left - 1]) left++;
                    while (left < right && nums[right] == nums[right + 1]) right--;
                } else if (sum < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        return res;
        }     
    public static void main(String[] args) {
        int nums[] ={-1,0,1,2,-1,-4};
        threeSum_1 obj = new threeSum_1();
        List<List<Integer>> res = obj.threeSum(nums);
        System.out.println(res);
    }
}