public class SubArr {

    public static void printSubarr(int arr[]) {
        int total = 0;
        int maxSum = Integer.MIN_VALUE;
        int minSum = Integer.MAX_VALUE;
        int prefix[] = new int[arr.length];

        prefix[0]=arr[0];
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i-1] + arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            int start = i;

            for (int j = i; j < arr.length; j++) {
                int end = j;
                int sum =0;

                //Prefix method
                if (start==0) {
                    sum = prefix[end];
                }else{
                    sum = prefix[end] - prefix[start-1];
                }

                // Brute force approach
                // for (int k = start; k <= end; k++) {
                //     sum += arr[k];
                //     System.out.print(arr[k] + " ");
                // }
                // System.out.print(" Sum = " + sum);

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
    public static void kadanes(int arr[]){
        int maxs = Integer.MIN_VALUE;
        int mins = Integer.MAX_VALUE;
        int curs = 0;

        for (int i = 0; i < arr.length; i++) {
            curs += arr[i];
            maxs = Math.max(curs, maxs);
            mins = Math.min(curs, mins);
            if(curs<0){
                curs=0;
            }

        }
        System.out.println("Max sum using kadanes is : "+ maxs);
        System.out.println("Max sum using kadanes is : "+ mins);
    }

    public static void main(String[] args) {
        int arr[] = {2, 4, 6, 8, 10};
        printSubarr(arr);
        kadanes(arr);
    }
}