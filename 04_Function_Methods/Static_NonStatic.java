
public class Static_NonStatic {

//    method with static
//    public static int sum(int a,int b){
//        return a+b;
//    }
//    public static void main(String[] args) {
//        System.out.println(sum(2, 5));
//    }

//    method with non_static
//    public int sum(int a,int b){
//        return a+b;
//    }
//    public static void main(String[] args) {
//        Static_NonStatic obj = new Static_NonStatic();
//        System.out.println(obj.sum(2,5));
//    }

//    method with local Variable
    int a = 10;                 //lacal variable
    public static void main(String[] args) {
        Static_NonStatic obj = new Static_NonStatic();
        System.out.println(obj.a);
    }
}
