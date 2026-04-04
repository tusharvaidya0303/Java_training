public class SelectionSort {
    public static void Sorted(int[] nums){
        for (int i = 0; i < nums.length-1; i++) {
            int min = i;
            for (int j = i+1; j < nums.length; j++) {
                if (nums[j]<nums[min]) {
                    min = j;
                }
            }
            int temp = nums[i];
            nums[i] = nums[min];
            nums[min] = temp;
        }
    }
    public static void print(int[] nums){
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]+",");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int nums[]={5,4,1,2,3};
        Sorted(nums);
        print(nums);
    }
}
