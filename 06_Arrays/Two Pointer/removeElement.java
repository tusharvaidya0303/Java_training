public class removeElement {
    public static int removed(int[] nums, int val) {
        int n = nums.length;
        int j=0;
        for(int i=0;i<n;i++){
            if(nums[i]!=val){
                nums[j]=nums[i];
                j++;
            }
        }
        return j;
    }
    public static void main(String[] args) {
        int nums[]={3,2,2,3};
        int val=3;
        int k = removed(nums, val);
        System.out.print(k+",");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i]);
        }
    }
}
