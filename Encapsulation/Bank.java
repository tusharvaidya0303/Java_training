package Encapsulation;
class BankAccount {
    private double balance;

    // Getter and Setter for balance
    public void setBalance(double balance) {
        if (balance >= 0)
            this.balance = balance;
        else
            System.out.println("Invalid Initial Balance");
    }

    public double getBalance() {
        return balance;
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: Rs." + amount);
        } else {
            System.out.println("Invalid Deposit Amount");
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: Rs." + amount);
        } else {
            System.out.println("Insufficient Balance or Invalid Amount");
        }
    }

    // Display balance
    public void display() {
        System.out.println("Current Balance: Rs." + balance);
    }
}
public class Bank {
    public static void main(String[] args) {
        BankAccount obj = new BankAccount();
        obj.setBalance(10000.00);   // Set initial balance
        obj.display();
        obj.deposit(5000.00);       // Deposit money
        obj.withdraw(2000.00);      // Withdraw money
        obj.display();              // Display current balance
    }
}
