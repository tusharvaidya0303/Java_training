public class palindrome_function {
    public static boolean isPalindrome(int n){
        int number = n;
        int reverse = 0;
        while(number > 0){
            reverse = reverse * 10 + number % 10;
            number /= 10;
        }
        if(reverse == n){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(123));
    }
}
