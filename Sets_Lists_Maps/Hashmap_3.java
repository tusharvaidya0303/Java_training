package Sets_Lists_Maps;

import java.util.HashMap;

public class Hashmap_3 {
    public static void main(String[] args) {
        String str="java is programming and programming is java";
        String[] newStr=str.split(" ");
        HashMap<String,Integer> map = new HashMap<>();
        for(String i : newStr){
            map.put(i, map.getOrDefault(i,0)+1);
        }
        System.out.println(map);
    }
}
