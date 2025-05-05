package Polymorphism;
class str{
    void input(String s){
        System.out.println(s);;
    }
    void input(int a){
        System.out.println("Square is : "+a*a);
    }
}
public class Str_OL {
    public static void main(String[] args) {
        str obj = new str();
        obj.input("Have a Nice Day!");
        obj.input(5);
    }
}
