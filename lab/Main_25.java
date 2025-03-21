class Communication {
    int num;
    boolean flag = false;

    synchronized void produce(int num) {
        while (flag) {
            try {
                wait();
            } catch (Exception e) {
            }
        }
        this.num = num;
        flag = true;
        System.out.println("Produced: " + num);
        notify();
    }
    synchronized void consume() {
        while (!flag) {
            try {
                wait();
            } catch (Exception e) {
            }
        }
        System.out.println("Consumed: " + num);
        flag = false;
        notify();
    }
}
public class Main_25{
    public static void main(String[] args) {
        Communication com = new Communication();
        Thread producer = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                com.produce(i);
                try {
                    Thread.sleep(500);
                } catch (Exception e) {
                }
            }
        });
        Thread consumer = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                com.consume();
                try {
                    Thread.sleep(500);
                } catch (Exception e) {
                }
            }
        });
        producer.start();
        consumer.start();
    }
}