package CollectionFramework;

import java.util.ArrayList;
import java.util.ListIterator;

public class Iterator_2 {
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
            String ele =it.next();
            if (ele.length()<=4){
                it.set("byee");
            }
        }
        System.out.println(names+" ");

        int count =0;
        while (it.hasPrevious()){
            String backward = it.previous();
            count++;
            if (count != names.size()){
                it.set("Hello");
            }
        }
        System.out.println(names+" ");
    }
}
