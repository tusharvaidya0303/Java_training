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
        arr2.add(100);
        arr2.add(200);
        arr2.add(30);

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

        //Iterator

        Iterator<Integer> iterator = arr.iterator();
        while (iterator.hasNext()) {
            System.out.println("Elements : "+ iterator.next());
        }
        
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(12);
        list.add(13);
        //Get
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        //Set
        System.out.println("Before : "+list);
        list.set(2, 300);
        System.out.println("After : "+list);

        //Toarray
        Object array[] = list.toArray();
        for (Object object : array) {
            System.out.print(object+" ");
        }

        //Contains
        System.out.println(list.contains(300));

        //Sort
        list.add(6);
        list.add(9);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);

        //Clone
        //deep copy
        // ArrayList<Integer> newList = new ArrayList<>(list);
        //Shallow copy
        // System.out.println(list);
        // ArrayList <Integer> newlist = (ArrayList<Integer>)list.clone(); 
        // System.out.println("NewList : "+newlist);

        ArrayList <Integer> marks = new ArrayList<>();
        //Max Capacity
        marks.ensureCapacity(100);  
        //isempty
        System.out.println(marks.isEmpty());
        //indexof tells index

        System.out.println(list.indexOf(6));
    }
    
}