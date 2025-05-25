package Exception_Handling;

public class Second {
    public static void main(String[] args) {
        int[] arr1 = {1, 10, 50, 20, 45};
        int[] arr2 = {1, 2, 0, 2, 5};
        int[] div = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            try {
                div[i] = arr1[i] / arr2[i];
            } catch (Exception e) {
                System.out.println("Division by zero at index " + i);
                div[i] = 0; // or handle differently
            }
        }
        for (int arr : div) {
            System.out.print(arr + " ");
        }
    }
}
