package Polymorphism;
class Book{
    void detail(String s,String t){
        System.out.println(s);
        System.out.println(t);
    }
    void detail(String s,String t,String r){
        System.out.println(s);
        System.out.println(t);
        System.out.println(r);
    }
}
public class Book_OL {
    public static void main(String[] args) {
        Book obj=new Book();
        obj.detail("House of the Dragon","Author : George RR Martine");
        System.out.println("----------------------------------------");
        obj.detail("House of the Dragon","Author : George RR Martine","Price : $200");
    }
}
