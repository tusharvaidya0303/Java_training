public class RemoveDuplicate {
    public static void main(String[] args) {
        int arr[]={2,3,4,5,5,6,7,7,9};
        int j =0;

        for(int i = 0;i<=arr.length-1;i++){
            if (arr[i]!=arr[j]) {
                j++;
                arr[j] = arr[i];
            }
        }
        for(int i =0 ; i<=j;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
