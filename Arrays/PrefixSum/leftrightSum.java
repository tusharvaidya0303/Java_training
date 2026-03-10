package PrefixSum;

public class leftrightSum {
    public static void main(String[] args) {

        int arr[] = {1,7,3,6,5,6};

        int left[] = new int[arr.length];
        int right[] = new int[arr.length];
        int ans= -1;

        // Left prefix sum
        left[0] = arr[0];
        for(int i = 1; i < arr.length; i++){
            left[i] = left[i-1] + arr[i];
        }

        // Right prefix sum
        right[arr.length-1] = arr[arr.length-1];
        for(int i = arr.length-2; i >= 0; i--){
            right[i] = right[i+1] + arr[i];
        }

        // Check pivot index
        for(int i = 0; i < arr.length; i++){
            if(left[i] == right[i]){
                ans = i;
                break;          //use break for the left most answer.
            }
        }
            System.out.println("Pivot index: " + ans);
    }
}