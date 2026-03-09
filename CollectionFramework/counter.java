package CollectionFramework;
import java.util.HashMap;
public class counter {
    public static void main(String[] args) {

        //Count of each character in a string
        // String str = "Hello";
        // HashMap<Character, Integer> map = new HashMap<>();
        // for (int i = 0; i < str.length(); i++) {
        //     char ch = str.charAt(i);
        //     map.put(ch, map.getOrDefault(ch, 0) + 1);
        // }
        // System.out.println(map);

        //First repeating character
        String str = "Hello";
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (map.containsKey(ch)) {
                System.out.println("First repeating character: " + ch);
                break;
            } else {
                map.put(ch, 1);
            }
        }
    }
}
