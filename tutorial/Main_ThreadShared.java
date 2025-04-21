class Counter{
    private int count = 0;
    public void increment(){
        synchronized(this){
            count++;
        }
    }
    public void getCount(){
        System.out.println("Count : " + count);
    }
}

class MyThread extends Thread {
    private Counter ctr;
    public MyThread(Counter ctr){
        this.ctr = ctr;
    }
    @Override
    public void run(){
        for(int i = 0; i <1000; i++){
            ctr.increment();
        }
    }
}

public class Main_ThreadShared {
    public static void main(String[] args){
        Counter ctr = new Counter();
        MyThread t1 = new MyThread(ctr);
        MyThread t2 = new MyThread(ctr);
        MyThread t3 = new MyThread(ctr);

        t1.start();
        t2.start();
        t3.start();

        try{
            t1.join();
            t2.join();
            t3.join();
        } catch( Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        ctr.getCount();
    }
}
