public class InsertionSort {
    public static void Sorted(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            int curr = nums[i];
            int j = i - 1;

            // shift elements to the right
            while (j >= 0 && nums[j] > curr) {
                nums[j + 1] = nums[j];
                j--;
            }

            // insert at correct position
            nums[j + 1] = curr;
        }
    }
    public static void print(int[] nums){
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]+",");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int nums[]={5,4,1,3,2};
        Sorted(nums);
        print(nums);
    }    
}
