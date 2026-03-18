import java.util.Arrays;
public class majorityElement2 {
        public static int MajorityElement(int[] nums) {
            Arrays.sort(nums);
            
            int freq=1;int ans = nums[0];
            int n = nums.length;
            for (int i = 1; i < nums.length; i++) {
                if (nums[i]==nums[i-1]) {
                    freq++;
                }else{
                    freq=1;
                    ans = nums[i];
                }

                if (freq>n/2) {
                    return ans;
                }
            }
            return -1;

        }
    public static void main(String[] args) {
        int nums[] = {2,2,1,1,1};
        System.out.println(MajorityElement(nums));
    }
}
