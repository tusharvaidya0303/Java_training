public class singleNumber {
//Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
    public static int number(int nums[]){
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
           ans ^= nums[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        int nums [] = {4,1,2,1,4};
        System.out.println(number(nums));
    }
}