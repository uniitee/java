// 8.	Design three classes: Student, Exam and Result. The student class has data members such as roll no, name etc. Create a class Exam by inheriting the Student class. The Exam class adds data members representing the marks scored in six subjects. Derive the Result from class Exam and it has its own members such as total marks and average. Calculate the total marks and average.
// package lab;
import java.util.Scanner;
class Student {
    protected int rollNo;
    protected String name;
    void getStudentData(Scanner sc) {
        System.out.print("Enter Roll No: ");
        rollNo = sc.nextInt();
        sc.nextLine();  
        System.out.print("Enter Name: ");
        name = sc.nextLine();
    }
}
class Exam extends Student {
    protected int[] marks = new int[6];
    void getExamData(Scanner sc) {
        System.out.println("Enter marks for 6 subjects:");
        for (int i = 0; i < 6; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
        }
    }
}
class Result extends Exam {
    private int totalMarks = 0;
    private double average = 0.0;
    void calculateResult() {
        for (int mark : marks) totalMarks += mark;
        average = totalMarks / 6.0;
    }
    void displayResult() {
        System.out.println("\nStudent Details:");
        System.out.println("Roll No: " + rollNo + "\nName: " + name + "\nTotal Marks: " + totalMarks + "\nAverage: " + average);
    }
}
public class Main_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Result student = new Result();
        student.getStudentData(sc);
        student.getExamData(sc);
        student.calculateResult();
        student.displayResult();
        sc.close();
    }
}
