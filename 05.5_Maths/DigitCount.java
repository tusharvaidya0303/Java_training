public class DigitCount {

    //Optimized
    public static int count(int num) {
        int cnt = 0;
            cnt = (int)(Math.log10(num)+1);
        return cnt;
    }

    // public static int count1(int num) {
    //     int cnt = 0;
    //     while (num != 0) {
    //         num = num / 10;
    //         cnt++;
    //     }
    //     return cnt;
    // }

    public static void main(String[] args) {
        int num = 12345;
        System.out.println("No. of digits present in " + num + " is " + count(num));
    }
}
