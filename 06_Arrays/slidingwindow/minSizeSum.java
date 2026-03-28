public class minSizeSum {
    public static int minsum(int nums[],int target){
        int currsum=0;
        int minlen=Integer.MAX_VALUE;
        int j =0;
        for (int i = 0; i < nums.length; i++) {
            currsum += nums[i];
            while (currsum >= target) {
                minlen = Math.min(minlen, i - j + 1);
                currsum -= nums[j];
                j++;
            }
        }
        return minlen == Integer.MAX_VALUE ? 0 : minlen;
    }
    public static void main(String[] args) {
        int target = 7; int nums[] = {2,3,1,2,4,3};
        System.out.println(minsum(nums, target));
    }
}
