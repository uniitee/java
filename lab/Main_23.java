class BankAccount {
    private int balance = 10000;
    public void withdraw(String name, int amount) {
        System.out.println(name + " is trying to withdraw " + amount);
        synchronized (this) { // Synchronized block to ensure safe withdrawal
            if (balance >= amount) {
                System.out.println(name + " is withdrawing " + amount);
                balance -= amount;
                System.out.println(name + " successfully withdrew.\nRemaining balance: " + balance);
            } else {
                System.out.println(name + " tried to withdraw " + amount + " but insufficient balance!");
            }
        }
    }
}
class User extends Thread {
    private BankAccount account;
    private int amount;
    private String userName;
    public User(BankAccount account, String userName, int amount) {
        this.account = account;
        this.userName = userName;
        this.amount = amount;
    }
    public void run() {
        account.withdraw(userName, amount);
    }
}

public class Main_23 {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        Thread user1 = new User(account, "MiLady", 5000);
        Thread user2 = new User(account, "MiJesty", 7000);
        Thread user3 = new User(account, "MiLord", 3000);
        user1.start();
        user2.start();
        user3.start();
    }
}
