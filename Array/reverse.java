package Array;

public class reverse {
    public static void main(String[] args) {
        int[] arr ={0,10,20,40,50};

        System.out.println("Reverse array : ");
        for (int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
    }
}
