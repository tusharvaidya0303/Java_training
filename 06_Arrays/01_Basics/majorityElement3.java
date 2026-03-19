public class majorityElement3 {
        public static int MajorityElement(int[] nums) {
            int freq=0;int ans=0;
            for (int i = 0; i < nums.length; i++) {
                if (freq==0) {
                    ans = nums[i];
                }
                if (nums[i]==ans) {
                    freq++;
                }else{
                    freq--;
                }
            }
            return ans;
        }
    public static void main(String[] args) {
        int nums[] = {2,2,1,1,1};
        System.out.println(MajorityElement(nums));
    }
}