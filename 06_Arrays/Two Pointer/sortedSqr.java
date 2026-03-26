public class sortedSqr {
    public static int[] sortedSquare(int nums []) {
        int n = nums.length;
        int ans [] = new int [n];
        int start=0;
        int end=n-1;
        int index = n-1;
        while(start <= end) {
            int left = nums[start]*nums[start];
            int right = nums[end]*nums[end];
            if(left>right) {
                ans[index] = left;
                start++;
            } else {
                ans[index] = right;
                end--;
            }
            index--;
        }
        return ans;
    }
    public static void main(String[] args) {
        int nums[] = {-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5};
        int ans [] = sortedSquare(nums);
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }
    }
}
