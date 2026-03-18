public class majorityElement {
    public static int MajorityElement(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < nums.length; i++) {
            int freq = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    freq++;
                }
            }
            if(freq > n/2){
                return nums[i];
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int nums[] = {2,2,1,1,1,2,2};
        System.out.println(MajorityElement(nums));
    }
}
