package Sets_Lists_Maps;
import java.util.HashMap;
public class Hashmap_2 {
    public static void main(String[] args) {
        String str="programming";
        HashMap<Character,Integer> map = new HashMap<>();
        for(char ch : str.toCharArray()){
            map.put(ch, map.getOrDefault(ch,0)+1);
        }
        System.out.println(map);
    }
}
