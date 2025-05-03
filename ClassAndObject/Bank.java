package ClassAndObject;
class BankAccount{
    String accountNumber;
    String accountHolder;
    Double balance;

//    constructor
    BankAccount(String accountNumber,String accountHolder,Double balance){
        this.accountNumber=accountNumber;
        this.accountHolder=accountHolder;
        this.balance = balance;
    }

//    method for deposit
    void deposit(double amount){
        if(amount > 0){
            balance += amount;
            System.out.println("Deposited Rs."+ amount +" .New Balance Rs."+balance);
        }else{
            System.out.println("Invalid Deposit Amount");
        }
    }

//    method for withdrawal
    void withdrawal(double amount){
        if(amount >0 && amount <=balance){
            balance -= amount;
            System.out.println("Withdrawal Rs."+ amount +" .New Balance Rs."+balance);
        }else{
            System.out.println("Insufficient Balance");
        }
    }
//    display
    void display(){
        System.out.println("Account Number : "+accountNumber);
        System.out.println("Account Holder : "+accountHolder);
        System.out.println("Balance in Account : Rs."+balance);
    }

}
public class Bank {
    public static void main(String[] args) {
        BankAccount obj1 = new BankAccount("0237452829","Tushar Vaidya",1000.0);
        obj1.display();

        obj1.deposit(500);
        obj1.withdrawal(300);
        obj1.withdrawal(1500);
    }
}
