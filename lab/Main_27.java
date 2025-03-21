class SharedData {
    synchronized void printNumbers(int n) {
        for (int i = 1; i <= 5; i++) {
            System.out.println(n * i);
            try {
                Thread.sleep(500);
            } catch (Exception e) {
            }
        }
    }
}
public class Main_27 {
    public static void main(String[] args) {
        SharedData data = new SharedData();
        Thread t1 = new Thread(() -> data.printNumbers(2));
        Thread t2 = new Thread(() -> data.printNumbers(3));
        t1.start();
        t2.start();
    }
}