public class MaxSum {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,10};
        int k = 4;

        int sum = 0;

        // first window
        for(int i = 0; i < k; i++){
            sum += arr[i];
        }

        int max = sum;

        // sliding window
        for(int i = k; i < arr.length; i++){
            sum += arr[i];       // add next element
            sum -= arr[i-k];     // remove previous element

            if(sum > max){
                max = sum;
            }
        }

        System.out.println("Max sum : " + max);
    }
}
