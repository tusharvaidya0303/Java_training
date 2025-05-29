package Sets_Lists_Maps;
import java.util.ArrayList;
public class Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        // Add in the list
        list.add(0);
        list.add(3);
        list.add(6);
        System.out.println(list);

        //set element or takes its place
        list.set(2,3);
        System.out.println(list);

        // add element in between
        list.add(1,1);
        list.add(2,2);
        System.out.println(list);

        //Delete an element
        list.remove(1);
        System.out.println(list);

//        //size of list
//        System.out.println(list.size());
//
//        //loop in arraylist
//        for(int i=0,i<list.size(),i++){

//        }

    }
}
