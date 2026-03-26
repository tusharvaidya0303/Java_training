package String;
public class palindrome {
    public static boolean isalphanum(char c) {
    if((c>='a' && c<='z') || (c>='A' && c<='Z') || (c>='0' && c<='9')) {
        return true;
    }
    return false;
}
public static boolean isPalindrome(String s) {
    int start = 0;
    int end = s.length() - 1;

    while (start <= end) {
        if (!isalphanum(s.charAt(start))) {      //skiping spaces and non-alphanumeric characters
            start++;
            continue;
        }
        if (!isalphanum(s.charAt(end))) {        //skiping spaces and non-alphanumeric characters
            end--;
            continue;
        }
        if (Character.toLowerCase(s.charAt(start)) != Character.toLowerCase(s.charAt(end))) {
            return false;
        }
        start++;
        end--;
    }
    return true;
}
    public static void main(String[] args) {
        String s="A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }
}
