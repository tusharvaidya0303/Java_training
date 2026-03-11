public class Leader {
    public static void main(String[] args) {
        int[] arr = {16, 17, 4, 3, 5, 2};
        int [] ans = new int[6];
        int j=0;
        int currentMax = arr[arr.length-1];
        for (int i = arr.length-1; i >= 0; i--) {

            if(arr[i]>=currentMax){
                currentMax = arr[i];
                ans[j] = currentMax;
                j++;
            }
        }
        for (int i = 0; i < j; i++) {
            System.out.println(ans[i]);
        }
    }
}
