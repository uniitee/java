import java.util.Scanner;

public class Main_Exception {
    // public static void main(String[] args) {
    //     int a = 1000;
    //     int b = 0;
    //     try{
    //         int c = a/b;
    //         System.out.println("c = " + c);
    //     }
    //     catch (Exception e) {
    //         System.out.println("We failed to devide. Reason:" + e.getMessage());
    //     }
    //     System.out.println("This is the end of the program.");
    // }

    public static void main(String[] args) {
        int[] marks = new int [3];
        marks[0] = 100;
        marks[1] = 90;
        marks[2] = 80;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The devisor:");
        int div = sc.nextInt();

        System.out.println("Enter Array index:");
        int idx = sc.nextInt();
        
        try{
            System.out.println("quotient = " + (marks[idx]/div)); 
            try{
                System.out.println("marks    = " + marks[idx]);
            }
            catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("ArrayIndexOutOfBoundsException Occured: " + e.getMessage());
            }
        }
        catch (ArithmeticException e) {
            System.out.println("ArrithemeticException Occured: " + e.getMessage());
        }
        catch (Exception e) {
            System.out.println("Some other Exception Occured: " + e.getMessage());
        }
        finally {
            sc.close();
        }
    }
}
