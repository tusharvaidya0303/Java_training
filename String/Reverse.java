package String;

public class Reverse {
    public static void main(String[] args) {
        String str="Hello";
        String rev="";
        for(int i=str.length()-1;i>=0;i--){
            rev+=str.charAt(i);
        }
        System.out.println(rev);
        if(str.equals(rev)){
            System.out.println("Palandrome");
        }else
            System.out.println("Not palendrone");
    }
}
