package Abstraction;

abstract class Payment {
    abstract void pay(int a);
    void success(){
        System.out.println("Payment done ...");
    }
}
class UpiPayment extends Payment {
    void pay(int a){
        System.out.println("Pay via Upi "+a);
    }
}
class NetPayment extends Payment {
    void pay(int b){
        System.out.println("Pay via NetBanking "+b);
    }
}
public class abstractClass1 {
    public static void main(String[] args) {
        Payment obj = new UpiPayment();
        obj.pay(5000);
        obj.success();
        Payment obj1 = new NetPayment();
        obj1.pay(25000);
        obj1.success();

    }
}
