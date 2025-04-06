import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Main_Exception {
    public static void main(String[] args) {
        int[] marks = new int [3];
        marks[0] = 100;
        marks[1] = 90;
        marks[2] = 80;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array index:");
        int idx = sc.nextInt();
        System.out.println("Enter The devisor:");
        int div = sc.nextInt();

        try{
            try {
                File file = new File("nonexistent.txt");
                FileReader fr = new FileReader(file);
            } catch (FileNotFoundException e) {
                System.out.println("File not found!");
            }
            System.out.println("marks    = " + marks[idx]);
            System.out.println("quotient = " + (marks[idx]/div)); 
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException Occured: " + e.getMessage());
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
