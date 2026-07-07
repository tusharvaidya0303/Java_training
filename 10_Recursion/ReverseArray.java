public class ReverseArray {

    static void reverse(int[] arr, int left, int right) {
        // Base case
        if (left >= right) {
            return;
        }
        // Swap
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;

        // Recursive call
        reverse(arr, left + 1, right - 1);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        reverse(arr, 0, arr.length - 1);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
