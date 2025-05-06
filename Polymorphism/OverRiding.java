package Polymorphism;

class Vehicle{
    void run(){
        System.out.println("Run krta ha");
    }
}
class Bike extends Vehicle{
    @Override
    void run() {
        System.out.println("Ya be chalti ha");
        super.run();   //super keyword used to call parent class.
    }
}
public class OverRiding {
    public static void main(String[] args) {
        Vehicle obj = new Bike();
        obj.run();

    }
}
