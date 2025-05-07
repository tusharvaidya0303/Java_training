package Polymorphism;
// overloading
class Parent1{
    void sum (int a ){
        System.out.println("value of a is :"+a);
    }

    void sum (int a , int b){
        System.out.println("sum of a and b is :"+(a+b));
    }
}

public class pratice {
    public static void main(String[] args) {

        Parent1 obj = new Parent1();
        obj.sum(2);
        obj.sum(2,5);

    }
}
