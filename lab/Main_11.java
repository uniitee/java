public class Main_11 {
    public static void main(String args[]) {
        int a[] = { 5, 10 };
        int c = 5;
        int b = 5;
        try {
            int x = a[1] / (b - c);
        } catch (ArithmeticException e) {
            System.out.println("Division by zero");
        }
        try {
            int y = a[2] / 5;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Error");
        }
    }
}