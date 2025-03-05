import java.util.*;

class NegativeNumberThread extends Thread {
    private final List<Integer> nums;
    public NegativeNumberThread(List<Integer> nums) {
        this.nums = nums;
    }
    @Override
    public void run() {
        System.out.println("Negative nums:");
        nums.stream().filter(n -> n < 0).forEach(n -> System.out.print(n + " "));
        System.out.println();
    }
}

class PositiveEvenThread extends Thread {
    private final List<Integer> nums;
    public PositiveEvenThread(List<Integer> nums) {
        this.nums = nums;
    }
    @Override
    public void run() {
        System.out.println("Positive Even nums:");
        nums.stream().filter(n -> n > 0 && n % 2 == 0).forEach(n -> System.out.print(n + " "));
        System.out.println();
    }
}

class PositiveOddThread extends Thread {
    private final List<Integer> nums;
    public PositiveOddThread(List<Integer> nums) {
        this.nums = nums;
    }
    @Override
    public void run() {
        System.out.println("Positive Odd nums:");
        nums.stream().filter(n -> n > 0 && n % 2 != 0).forEach(n -> System.out.print(n + " "));
        System.out.println();
    }
}

public class ThreadMain {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < 8; i++) {
            nums.add(rand.nextInt(201) - 100);
        }
        System.out.println("Generated nums: " + nums);
        Thread negativeThread = new NegativeNumberThread(nums);
        Thread evenThread = new PositiveEvenThread(nums);
        Thread oddThread = new PositiveOddThread(nums);
        negativeThread.start();
        evenThread.start();
        oddThread.start();
    }
}