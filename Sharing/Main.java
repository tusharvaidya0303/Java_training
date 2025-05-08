package Sharing;

public class Main {
    public static void main(String[] args) {
        My_detail obj = new My_detail();
        obj.display("Tushar Vaidya");
        obj.display("Cse","W2");
        obj.display(18);
        System.out.println("_______________________________");
        addition obj1 =new addition();
        obj1.display1(30,20);
        System.out.println("________________________________");
        Laptop_detail obj2 =new Laptop_detail();
        obj2.display2("ASUS");
        obj2.display2(18);
    }
}
