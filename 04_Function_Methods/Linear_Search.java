package FunctionAndMethods;

public class Linear_Search {
    static int search(int[]arr){
        int target=3;
        for (int i=0;i< arr.length;i++){
            if(arr[i]==target){
                System.out.println("Target found at index "+ i);
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr={2,5,3,7,9};
        int result=search(arr);
        if(result==-1){
            System.out.println("Target not Found");
        }
    }
}
