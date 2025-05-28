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


    }
}
