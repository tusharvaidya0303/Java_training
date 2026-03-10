package Arrayrotation;

public class threeRotation {
    public static void main(String[] args) {

        int arr[] = {1,3,5,7,2,8};
        int arr2[] = new int[arr.length];
        int n = 3;
        int j = 0;

        for(int i = arr.length - n; i < arr.length; i++){
            arr2[j++] = arr[i];
        }

        for(int i = 0; i < arr.length - n; i++){
            arr2[j++] = arr[i];
        }

        for(int i = 0; i < arr2.length; i++){
            System.out.print(arr2[i] + " ");
        }
    }
}
