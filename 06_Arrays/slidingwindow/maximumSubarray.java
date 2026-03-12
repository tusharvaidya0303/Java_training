package slidingwindow;
public class maximumSubarray {
    public static void main(String[] args) {

        
        int arr[] = {-2,1,-3,4,-1,2,1,-5,4};

        int Global_max = arr[0];
        int Current_max = arr[0];

        for(int i = 1; i < arr.length; i++) {

            if(Current_max < 0){
                Current_max = 0;
            }

            Current_max += arr[i];
            Global_max = Math.max(Current_max, Global_max);
        }

        System.out.println("Maximum Subarray Sum: " + Global_max);
    }
}
