// 4.	WAP a program to maintain the student record containing roll number, Name, marks1, marks2, marks3 as data member and getdata(), display() and setdata() as member functions.
package lab;
import java.util.Scanner;
class Student {
    private int rollNo;
    private String name;
    private int[] marks = new int[3];
    void getData(Scanner sc) {
        System.out.print("Enter Roll No: ");
        rollNo = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Name: ");
        name = sc.nextLine();
        for (int i = 0; i < 3; i++) {
            System.out.print("Marks in Subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
        }
    }
    void display() {
        int sum = 0;
        for (int m : marks) sum += m;
        System.out.println("\nRoll No: " + rollNo + "\nName: " + name + 
                           "\nMarks: " + marks[0] + ", " + marks[1] + ", " + marks[2] +
                           "\nTotal: " + sum + "\nAverage: " + (sum / 3.0));
    }
}
public class Main_04{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student s = new Student();
        s.getData(sc);
        s.display();
        sc.close();
    }
}