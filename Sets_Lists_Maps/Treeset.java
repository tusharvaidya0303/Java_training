package Sets_Lists_Maps;

import java.util.TreeSet;   //used to avoid dublicate and sort array.

public class Treeset {
    public static void main(String[] args) {
        int [] arr ={1,23,43,55,23,44,55};
        TreeSet<Integer> set= new TreeSet<>();
        for(int i : arr){
            set.add(i);
        }
        System.out.println(set);
    }
}
