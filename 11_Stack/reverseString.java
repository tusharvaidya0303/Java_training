import java.util.Stack;
public class reverseString {
    public static void main(String[] args) {
        String str = "Hello World";
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }
        while (!stack.isEmpty()) {
            String reversedStr = "";
            reversedStr += stack.pop();
            System.out.print(reversedStr);
        }
    }
}
