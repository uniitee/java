// 6.	Write a class bank, containing data member: Name of Depositor, A/c type, Type of A/c, Balance amount. Member function: To assign initial value, To deposit an amount , to withdraw an amount after checking the balance (which should be greater than Rs. 500) , To display name & balance. 
// package lab;
import java.util.Scanner;
class Bank {
    String name, acType;
    double balance;
    Bank(String name, String acType, double balance){
        this.name = name;
        this.acType = acType;
        this.balance = balance;
    }
    void deposit(double amount){
        this.balance += amount;
    }
    void withdraw(double amount){
        if(this.balance - amount >= 500){
            this.balance -= amount;
        }else{
            System.out.println("Insufficient balance");
        }
    }
}
public class Main_06{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name, account type and balance");
        Bank account = new Bank(sc.nextLine(), sc.nextLine(), sc.nextDouble());
        System.out.println("Enter amount to deposit");
        account.deposit(sc.nextDouble());
        System.out.println("Enter amount to withdraw");
        account.withdraw(sc.nextDouble());
        System.out.println("Balance: " + account.balance);
        sc.close();
    }
}