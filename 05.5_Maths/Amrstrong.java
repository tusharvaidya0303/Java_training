public class Amrstrong {
    public static boolean isArmstrong(int num) {
        int sum = 0;
        int temp = num;
        while (temp != 0) {
            int rem = temp % 10;
            sum += rem * rem * rem;
            temp /= 10;
        }
        return num == sum;
    }

    public static void main(String[] args) {
        int num = 153;
        System.out.println(isArmstrong(num));
    }
}
