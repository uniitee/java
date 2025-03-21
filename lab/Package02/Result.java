package Package02;
import Package01.Student;

class Marks extends Student {
    protected int[] marks = new int[3];

    public void getMarks(int m1, int m2, int m3) {
        marks[0] = m1;
        marks[1] = m2;
        marks[2] = m3;
    }
}

public class Result extends Marks {
    private int totalMarks;
    private double average;
    public void calculateResult() {
        totalMarks = marks[0] + marks[1] + marks[2];
        average = totalMarks / 3.0;
    }
    public void displayResult() {
        System.out.println("\nStudent Details:");
        System.out.println("Roll No: " + rollNo + "\nName: " + name);
        System.out.println("Marks: " + marks[0] + ", " + marks[1] + ", " + marks[2]);
        System.out.println("Total: " + totalMarks + "\nAverage: " + average);
    }
}