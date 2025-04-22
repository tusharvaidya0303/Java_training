package Array;

public class merge {
    public static void main(String[] args) {
        int[] arr1={1,2,3,4};
        int[] arr2={2,3,4,5};

        int[] arr3= new int[arr1.length+arr2.length];

        for(int i=0;i< arr1.length;i++) {
            arr3[i] = arr1[i];
        }
            for(int i=0;i< arr2.length;i++){
                arr3[arr1.length+i]=arr2[i];
                }
            System.out.print("Merged array = ");
            for(int arr : arr3){
                System.out.print(arr+" ");
            }
        }
    }
