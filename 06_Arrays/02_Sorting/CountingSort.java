public class CountingSort {
    public static void Sorted(int[] nums) {
        int max = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }

        int[] freq = new int[max + 1];

        for (int i = 0; i < nums.length; i++) {
            freq[nums[i]]++;
        }

        int j = 0;
        for (int i = 0; i < freq.length; i++) {
            while (freq[i] > 0) {
                nums[j++] = i;
                freq[i]--;
            }
        }
    }

    public static void print(int[] nums){
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + ",");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int nums[] = {5,4,1,3,2};
        Sorted(nums);
        print(nums);
    }   
}
