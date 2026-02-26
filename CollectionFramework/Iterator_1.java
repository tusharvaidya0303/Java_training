package CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterator_1 {
    public static void main(String[] args) {
        ArrayList<String>names = new ArrayList<>(0);
        names.add("Tushar");
        names.add("Amit");
        names.add("Nabeel");
        names.add("Aman");
        names.add("Ketan");
        names.add("Siddharth");
        System.out.println(names);

        Iterator<String> it = names.iterator();
//        System.out.println(it.hasNext());

        while (it.hasNext()){
            String elem = it.next();
            if (elem.startsWith("A")){
                it.remove();
            }
        }
        System.out.println(names);
    }
}
