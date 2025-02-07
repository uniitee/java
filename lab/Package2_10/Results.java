package Package2_10;
import Package1_10.Students;
import java.util.Scanner;

class Marks extends Students{
    int marks[] = new int[5];
    Marks(){
        super();
        for(int i=0; i<5; i++){
            marks[i] = 0;
        }
    }
    Marks(int[] rollNo, String[] name, int[] marks){
        super(rollNo, name);
        for(int i=0; i<5; i++){
            this.marks[i] = marks[i];
        }
    }
}

public class Results extends Marks {
    int total;
    double average;
    int totalMarks(){
        total = 0;
        for(int i=0; i<5; i++){
            total += marks[i];
        }
        return total;
    }
    Results(){
        super();
        total = 0;
        average = 0;
    }
    Results(int[] rollNo, String[] name, int[] marks){
        super(rollNo, name, marks);
        this.total = totalMarks();
        this.average = total/5;
    }
    void display(){
        for(int i=0; i<5; i++){
            System.out.println("Roll No: "+rollNo[i]+", Name: "+name[i]+", Marks: "+marks[i]);
        }
        System.out.println("Total: "+total);
        System.out.println("Average: "+average);
    }

    public static void main(String[] args){
        int rollNo[] = new int[5];
        String name[] = new String[5];
        int marks[] = new int[5];
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<5; i++){
            System.out.println("Enter the roll number: ");
            rollNo[i] = sc.nextInt();
            System.out.println("Enter the name: ");
            name[i] = sc.next();
            System.out.println("Enter the marks: ");
            marks[i] = sc.nextInt();
        }
        sc.close();
        Results r = new Results(rollNo, name, marks);
        r.display();
    }
}
