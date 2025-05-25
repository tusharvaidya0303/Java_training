package Exception_Handling;

public class Third_str {
    public static void main(String[] args) {
        String str = null;
        try {
            System.out.println("Length of string : "+str.length());
        }catch (Exception e){
            System.out.println("String is Null"+e);
        }
    }
}
