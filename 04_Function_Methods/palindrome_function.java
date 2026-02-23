public class palindrome_function {
    public static boolean isPalindrome(int n){
        int number = n;
        int reverse = 0;
        while(number > 0){
            int digit = number % 10;        // Get the last digit
            reverse = reverse * 10 + digit;
            number /= 10;                   // Remove the last digit
        }
        return reverse == n;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(123));
    }
}
