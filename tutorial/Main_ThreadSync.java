// ======================> W/O Synchronization <=========================
// class Counter{
//     private int count = 0;
//     public void increment(){
//         count++;
//     }
//     public void getCount(){
//         System.out.println("Count: " + count);
//     }
// }
// class MyThread extends Thread{
//     private Counter ctr;
//     public MyThread(Counter ctr){
//         this.ctr =ctr;
//     }
//     @Override
//     public void run(){
//         for(int i = 0; i <3000 ; i++){
//             ctr.increment();
//         }
//     }
// }
// public class Main_ThreadSync {
//     public static void main(String[] args) {
//         Counter ctr = new Counter();
//         MyThread t1 = new MyThread(ctr);
//         MyThread t2 = new MyThread(ctr);
//         t1.start();
//         t2.start();
//         try{
//             t1.join();
//             t2.join(); // Wait for threads to finish
//         }catch(Exception e){
//            System.out.println("Error: " + e.getMessage());
//         }
//         ctr.getCount(); // ans should be 2000 but if not synchronized it will vary as only one resource is being shared btw two threads!!
//     }    
// }

// race condition: when two or more threads try to access a shared resource at the same time, leading to inconsistent results.
// This can happen when one thread is modifying the resource while another thread is reading it, causing the second thread to read an inconsistent state of the resource.


// ======================> With Synchronization <=========================
class Counter{
    private int count = 0;
    public synchronized void  increment(){ // use this -- way 1
        // synchronized(this){  // or use this -- way 2
            count++; // critical section
        // }
        }
    public void getCount(){
        System.out.println("Count: " + count);
    }
}
class MyThread extends Thread{
    private Counter ctr;
    public MyThread(Counter ctr){
        this.ctr =ctr;
    }
    @Override
    public void run(){
    // public synchronized void run(){ // or do this -- way 3
        for(int i = 0; i <1000 ; i++){
            ctr.increment();
        }
    }
}
public class Main_ThreadSync {
    public static void main(String[] args) {
        Counter ctr = new Counter();
        MyThread t1 = new MyThread(ctr);
        MyThread t2 = new MyThread(ctr);
        t1.start();
        t2.start();
        try{
            t1.join();
            t2.join(); // Wait for threads to finish
        } catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }
        ctr.getCount();
    }    
}

// mutual exclusion