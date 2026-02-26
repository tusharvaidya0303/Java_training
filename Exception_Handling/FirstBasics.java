package Exception_Handling;

public class FirstBasics {
    public static void main(String[] args) {
        int a=500;
        int b=0;
        try {
            int c= a/b;
            System.out.println(c);
        }catch (Exception e){
            System.out.println("We cannot divide by 0");
            System.out.println(e);
        }
    }

}
