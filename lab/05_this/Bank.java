// Write a class bank, containing data member: Name of Depositor, A/c type, Balance amount.
// Member function: To assign initial value, To deposit an amount , to withdraw an amount after checking the balance 
// (which should be greater than Rs. 500),To display name & balance.

import java.util.Scanner;

public class Bank {
    String name, acType;
    double balance;
    Bank(String name, String acType, double balance){
        this.name = name;
        this.acType = acType;
        this.balance = balance;
    }
    Bank(){
        this.name = "";
        this.acType = "";
        this.balance = 0;
    }
    void deposit(double amount){
        this.balance += amount;
    }
    void withdraw(double amount){
        if(this.balance - amount >= 500){
            this.balance -= amount;
            System.out.println("Withdrawal successful\nBalance: "+this.balance);
        }else{
            System.out.println("Insufficient balance");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name, account type and balance");
        Bank account = new Bank(sc.nextLine(), sc.nextLine(), sc.nextDouble());
        System.out.println("Enter amount to deposit");
        account.deposit(sc.nextDouble());
        System.out.println("Enter amount to withdraw");
        account.withdraw(sc.nextDouble());
        sc.close();
    }
}