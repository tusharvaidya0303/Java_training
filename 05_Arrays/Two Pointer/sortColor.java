public class sortColor {
    public static void main(String[] args) {
        int nums [] = {2,0,2,1,1,0};
        int start = 0;
        int mid = 0;
        int end = nums.length - 1;

        while(mid <= end){

            if(nums[mid] == 0){
                int temp = nums[start];
                nums[start] = nums[mid];
                nums[mid] = temp;

                start++;
                mid++;
            }

            else if(nums[mid] == 1){
                mid++;
            }

            else{ // nums[mid] == 2
                int temp = nums[mid];
                nums[mid] = nums[end];
                nums[end] = temp;

                end--;
            }
        }

        for(int num : nums){
            System.out.print(num + " ");
        }
    }
}
