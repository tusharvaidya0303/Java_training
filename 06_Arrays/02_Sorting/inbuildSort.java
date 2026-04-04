import java.util.Arrays;
import java.util.Collections;
public class inbuildSort {
    public static void print(int[] nums){
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]+",");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int nums[]={5,4,1,3,2};
        Arrays.sort(nums);
        print(nums);
        Integer[] nums1={5,4,1,3,2};
        Arrays.sort(nums1, Collections.reverseOrder()); //Collections.reverseOrder() onlu work for Object datatype not primitive
        print(nums);

    }    
}
