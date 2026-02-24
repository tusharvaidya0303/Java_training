package String;

public class Skip_repeating_str {
    public static void main(String[] args) {
        String str="helllo";
        String newStr="";

       for(int i=0;i<str.length();i++) {
           char c = str.charAt(i);

           if(newStr.indexOf(c)==-1)
           newStr+=c;
       }
       System.out.println("new string is : "+newStr);

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (newStr.indexOf(c) != -1) {
                System.out.println("First repeating character: " + c);
                break;
            } else {
                newStr += c;
            }
        }
    }
}