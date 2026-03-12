public class LargestNum {
    public static int getLargest(int arr[]){
        int largest = Integer.MIN_VALUE;  //Minus Infinity
        int Smallest = Integer.MAX_VALUE;  //Plus Infinity

        for(int i = 0;i<arr.length;i++){
            if (largest<arr[i]) {
                largest = arr[i];
            }  
            if (Smallest>arr[i]) {
                Smallest = arr[i];
            }  
        }
        System.out.println("Smallest Value is : "+Smallest);
        return largest;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9};
        System.out.println("Largest Value is : "+getLargest(arr));
    }
}
