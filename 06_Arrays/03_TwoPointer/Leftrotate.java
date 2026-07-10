public class Leftrotate {
    public static int[] rotate(int[] nums) {
        int n=nums.length-1;
        int i =0;
        while(i<n){
            int temp = nums[i];
            nums[i] = nums[i+1];
            nums[i+1] = temp;
            i++;
        }
        return nums;  
    }
    public static void main(String[] args) {
        int arr[] ={1, 2, 3, 4, 5};
        rotate(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
