class PriorityThread extends Thread {
    PriorityThread(String name) {
        super(name);
    }
    public void run() {
        System.out.println(getName() + " Running...");
    }
}
public class Main_26 {
    public static void main(String[] args) {
        PriorityThread t1 = new PriorityThread("Low Priority");
        PriorityThread t2 = new PriorityThread("High Priority");
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t2.start();
    }
}