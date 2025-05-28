package DSA;

import java.util.HashMap;
public class Hashmap {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("id0",1);
        map.put("id1",2);
        map.put("id2",3);
        System.out.println(map);

        System.out.println(map.get("id0"));
        System.out.println(map.getOrDefault("id3",4));     // not in list print default value
        System.out.println(map.getOrDefault("id0",null)); //if in list print he value

        System.out.println("Shows keys : "+map.keySet());
        System.out.println("Shows values : "+map.values());

    }
}
