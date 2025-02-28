class FromThread extends Thread{
    // synchronized void printLoop(){
    //     for (int i = 0; i<5; i++){
    //         System.out.println("t1: " + i);
            
    //     }
    // }
    public void run(){
        for (int i = 0; i<5; i++){
            System.out.println("t1: " + i);
        }
        // printLoop();
    }
}
class RunnableThread implements Runnable{
    // synchronized void printLoop(){
    //     for (int i = 0; i<5; i++){
    //         System.out.println("t2: " + i);
    //     }
    // }
    public void run(){
        for (int i = 0; i<5; i++){
            System.out.println("t1: " + i);
        }
        // printLoop();
    }
} 

public class Main {
    public static void main(String[] args){
        FromThread t1 = new FromThread();
        RunnableThread r1 = new RunnableThread();
        Thread t2 = new Thread(r1);
        t1.start();
        t2.start();
        
    }
}
