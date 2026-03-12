public class SubArr {

    public static void printSubarr(int arr[]) {
        int total = 0;
        int maxSum = Integer.MIN_VALUE;
        int minSum = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            int start = i;

            for (int j = i; j < arr.length; j++) {
                int end = j;
                int sum = 0;   // reset for every subarray

                for (int k = start; k <= end; k++) {
                    sum += arr[k];
                    System.out.print(arr[k] + " ");
                }

                System.out.print(" Sum = " + sum);

                // check max
                if (sum > maxSum) {
                    maxSum = sum;
                }

                // check min
                if (sum < minSum) {
                    minSum = sum;
                }

                total++;
                System.out.println();
            }
            System.out.println();
        }

        System.out.println("Total SubArrays : " + total);
        System.out.println("Maximum Sum : " + maxSum);
        System.out.println("Minimum Sum : " + minSum);
    }

    public static void main(String[] args) {
        int arr[] = {2, 4, 6, 8, 10};
        printSubarr(arr);
    }
}