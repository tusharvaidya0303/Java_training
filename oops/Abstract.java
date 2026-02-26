package oops;
interface animal {
    void run();
    
}
class Dog implements animal{
    public void run(){
        System.out.println("runn....");
    }
}
public class Abstract {
     public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.run();
     }
}
