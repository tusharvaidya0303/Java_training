package Inheritance;

interface Walkable {
     void walk();
     void run();
}
interface Runnable {
    void walk();
    void run();
}
class Human implements Walkable,Runnable{
    @Override
    public void walk() {
        System.out.println("Humans can walk");
    }
    @Override
    public void run() {
        System.out.println("Humans can Run also");
    }
}
class main_1 {
    public static void main(String[] args) {
        Human obj = new Human();
        obj.walk();
        obj.run();
    }
}