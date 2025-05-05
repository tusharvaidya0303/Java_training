package Polymorphism;
class Array{
    void display(int[] arr){
        for(int i : arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    void display(String[] str){
        for(String i : str){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    void display(int[][] arr2){
        for(int[] i : arr2) {
            for (int j : i) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
public class Arr_OL {
    public static void main(String[] args) {
        Array obj = new Array();
        obj.display(new int[]{2,4,6,8,10});
        obj.display(new String[]{"A","B","C","D"});
        obj.display(new int[][]{{1,2,3},{4,5,6},{7,8,9}});
    }
}
