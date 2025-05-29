package Sets_Lists_Maps;

import java.util.HashMap;

public class Hashmap_4 {
    public static void main(String[] args) {
        String str="aabbcddef";
        HashMap<Character,Integer> map = new HashMap<>();
        for(char ch : str.toCharArray()){
            map.put(ch, map.getOrDefault(ch,0)+1);
        }
        System.out.println("Characters with frequency 1 : ");
        for (char ch : map.keySet()) {
            if (map.get(ch) == 1)
            {
                System.out.print(ch);
            }
        }
    }
}
