package CollectionFramework;
import java.util.HashSet;   //to avoid dublicates
public class Sets {
    public static void main(String[] args) {
        int [] arr ={1,23,43,55,23,44,55};
        HashSet<Integer> set= new HashSet<>();
        for(int i : arr){
            set.add(i);
        }
        System.out.println(set);
    }
}
