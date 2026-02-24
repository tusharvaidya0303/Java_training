package String;

public class frequency {
    public static void main(String[] args) {
        String s1 = "hello world";
        char c = 'o';
        int count = 0;
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)==c){
                count++;
            }
        }
        System.out.println("Frequency of " + c + " is: " + count);
    }
}
