package Polymorphism;

//  methood overlading
class Parent{
    void sum(int a ){
        System.out.println("Ketan don no. "+a);
    }
    void sum(int a,int b){
        System.out.println(a+b);
    }

    void sum(int a , int b , int c ){
        System.out.println(a+b*c);
    }

    void sum (double a , double b){
        System.out.println(a+b);
    }
}

public class OverLoading {
    public static void main(String[] args) {
        Parent obj = new Parent();
        obj.sum(420);
        obj.sum(3,10);
        obj.sum(2,3,3);
        obj.sum(23.0,40.0);
    }
}
