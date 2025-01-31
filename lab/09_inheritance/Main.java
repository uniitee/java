// Design three classes: Student, Exam and Result. 
// The student class has data members such as roll no, name etc. Create a class Exam by inheriting the student class. 
// The Exam class adds data members representing the marks scored in six subjects.
// Derive the Result from class Exam and it has its own members such as total marks and average.
// Calculate the total marks and average.

import java.util.Scanner;

class Student {
    int rollNo;
    String name;
    public Student() {
        this.rollNo = 0;
        this.name = "";
    }
    public Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }
}

class Exam extends Student {
    int[] marks = new int[6];
    public Exam() {
        this.marks = new int[6];
    }
    public Exam(int rollNo, String name, int[] marks) {
        super(rollNo, name);
        this.marks = marks;
    }
}

class Result extends Exam {
    int totalMarks = 0;
    double average;

    public Result(int rollNo, String name, int[] marks) {
        super(rollNo, name, marks);
        for(int i = 0; i < 6; i++){
            totalMarks +=marks[i];
        }
        average = totalMarks / 6.0;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int[] marks = new int[6];
            System.out.print("Enter the roll number: ");
            int rollNo = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter the name of the student: ");
            String name = sc.nextLine();

            try{
                System.out.println("Enter the marks of the student (out of 100): ");
                if (name == ""){
                    throw new Exception("Name can not be null");
                }
            }catch(Exception e){
                System.out.println("An error occurred: " + e.getMessage());
            }
            for (int i = 0; i < 6; i++) {
                while (true) {
                    try {
                        System.out.print("Subject " + (i + 1) + ": ");
                        marks[i] = sc.nextInt();
                        if (marks[i] < 0 || marks[i] > 100) {
                            throw new Exception("Marks should be between 0 and 100.");
                        }
                        break;
                    } catch (Exception e) {
                        System.out.println("Invalid input. Please enter a valid integer between 0 and 100.");
                        // sc.next();
                    }
                }
            }
            Result r = new Result(rollNo, name, marks);
            System.out.println("Roll number: " + r.rollNo +" Name: " + r.name + " Total Marks: " + r.totalMarks + " Average: " + r.average);

        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
