package DSA;

import java.util.HashSet;  //used to avoid dublicate of elements of array
import java.util.TreeSet;   //used to avoid dublicate and sort array.

public class Sets {
//    public static void main(String[] args) {
//        int [] arr ={1,23,43,55,23,44,55};
//        HashSet<Integer> set= new HashSet<>();
//        for(int i : arr){
//            set.add(i);
//        }
//        System.out.println(set);
//    }
    public static void main(String[] args) {
        int [] arr ={1,23,43,55,23,44,55};
        TreeSet<Integer> set= new TreeSet<>();
        for(int i : arr){
            set.add(i);
        }
        System.out.println(set);
    }
}
