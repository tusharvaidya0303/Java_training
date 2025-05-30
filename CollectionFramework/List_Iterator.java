package CollectionFramework;

import java.util.ArrayList;
import java.util.ListIterator;


public class List_Iterator {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>(0);
        names.add("Tushar");
        names.add("Amit");
        names.add("Nabeel");
        names.add("Aman");
        names.add("Ketan");
        names.add("Siddharth");
        System.out.println(names);

        ListIterator<String> it = names.listIterator();
//        System.out.println(it.hasNext());

        while (it.hasNext()){
            String forward = it.next();
            System.out.println(forward+" ");
            }
        System.out.println("-----------------------------");
        while (it.hasPrevious()){
            String backward = it.previous();
            System.out.println(backward);
        }
    }
}
