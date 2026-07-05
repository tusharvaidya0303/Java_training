import java.util.*;
public class arraylistDemo {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        // List<Integer> list = new ArrayList<>();
        // Collection<Integer> collection = new ArrayList<>();

        //Using add
        arr.add(10);
        arr.add(20);
        arr.add(30);
        System.out.println(arr);

        //using addall
        ArrayList<Integer> arr2 = new ArrayList<>();
        arr.add(100);
        arr.add(200);
        arr.add(30);

        arr.addAll(arr2);
        System.out.println(arr);

        //remove
        arr.removeAll(arr2);
        System.out.println(arr);

        //size
        System.out.println("size of arr2 : "+arr2.size());

        //clear
        System.out.println("list of arr2 : "+arr2);
        arr2.clear();
        System.out.println("size of arr2 :"+arr2.size());
        




    }
    
}