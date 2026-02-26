package oops;
interface A {
    void run();
    
}
interface B {
    void run();
    
}
class C implements A,B{
    public void run(){
        System.out.println("run....");
    }
}

public class multiinheritance {
    public static void main(String[] args) {
        C c1 = new C();
        c1.run();
    }
}
