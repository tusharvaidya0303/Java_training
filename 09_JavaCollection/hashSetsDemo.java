import java.util.Set;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;
public class hashSetsDemo {
    public static void main(String[] args) {

        //1. HashSet
        Set<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        System.out.println(set);       // No Guarantee of order randome order

        //2. LinkedHashSet
        Set<Integer> set2 = new LinkedHashSet<>();
        set2.add(10);
        set2.add(20);
        set2.add(30);
        System.out.println(set2);      //Guarantee of order same order as added

        //3. TreeSet
        Set<Integer> set3 = new TreeSet<>();
        set3.add(10);
        set3.add(20);
        set3.add(30);
        System.out.println(set3);      //Guarantee of order and sorted use binary search

        Set<Integer> set4 = new TreeSet<>((a,b)->b-a); //Descending order
        set4.add(10);
        set4.add(20);
        set4.add(30);
        System.out.println(set4);
    }
}
