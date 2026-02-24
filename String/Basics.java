package String;

public class Basics {
    public static void main(String[] args) {
        String s1="hello";
        // String s2="";
        // s2=s1+"hiii";
        // System.out.println(s2);
        
        // s1 = s1.concat("hiii");
        // System.out.println(s1);

        String s2 = new String("hello");
        String s3 = new String("hello");
        System.out.println(s1==s2); // false
        System.out.println(s2==s3); // false

        System.out.println(s1.equals(s2)); // true
        System.out.println(s2.equals(s3)); // true
        

    }
}
