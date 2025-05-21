package Inheritance;
interface Client1{
    void show();
}
interface Client2{
    void print();
    void show();
}
public class Multiple_interface implements Client1,Client2{
    @Override
    public void show() {
        System.out.println("Show the Menu");
    }
    @Override
    public void print() {
        System.out.println("Print the Bill");
    }
    public static void main(String[] args) {
        Multiple_interface obj = new Multiple_interface();
        obj.show();
        obj.print();
    }
}
