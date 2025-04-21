class ThreadPriority extends Thread{
    public ThreadPriority(String name){
        super(name);
    }
    public void run(){
        for(int i = 0; i <5; i++){
            System.out.println(this.getName() + ":" + i);
        }
    }
}

public class Main_ThreadPriority {
    public static void main(String[] args){
        ThreadPriority t1 = new ThreadPriority("Thread 1");
        ThreadPriority t2 = new ThreadPriority("Thread 2");
    
        t1.getPriority(); // Default priority is 5
        t2.getPriority(); // Default priority is 5
    
        t1.setPriority(Thread.MIN_PRIORITY); // Set to minimum priority (1)
        t2.setPriority(Thread.MAX_PRIORITY); // Set to maximum priority (10)
        t1.start();
        t2.start();
        try {
            t1.join(); // Wait for Thread 1 to finish
            t2.join(); // Wait for Thread 2 to finish
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    
        System.out.println("Thread 1 priority: " + t1.getPriority());
        System.out.println("Thread 2 priority: " + t2.getPriority());
    }
}
