import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashMap;
public class haspMapDemo {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>(); //key and value pair
        map.put(101, "Tushar");    //Key must be unique and value can be duplicate
        map.put(102, "Rahul");
        map.put(103, "Aman");

        System.out.println(map);   //Order is not guaranteed and it is random

        System.out.println(map.get(101)); //Tushar
        System.out.println(map.get(999)); //Null

        System.out.println(map.containsKey(101)); //true
        System.out.println(map.containsValue("Tushar")); //true

        System.out.println("Before : "+map);
        HashMap<Integer,String> map2 = new HashMap<>();
        map2.put(104, "Rohit");
        map2.put(105, "Rahul");
        map.putAll(map2);
        System.out.println("After : "+map);  
        

        System.out.println(map.remove(103)); //Aman removed
        System.out.println(map);

        System.out.println(map.size()); //2

        System.out.println(map.isEmpty());  //false

        //map.clear(); //remove all elements

        System.out.println("Before Replace"+map);

        map.replace(104, "Ketan");
        System.out.println("After Replace"+map);

        Set<Integer> keySet = map.keySet(); //set of keys
        System.out.println(keySet);

        Collection<String> value = map.values(); //collection of values
        System.out.println(value);

        Set<Map.Entry<Integer, String>> entrySet = map.entrySet(); //set of entry
        System.out.println(entrySet);

        //Iterating HashMap
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

    }
}
