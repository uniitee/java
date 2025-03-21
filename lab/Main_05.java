// WAP to increment the employee salaries on the basis of their designation(Manager-5000, General Manager-10000, CEO-20000, worker-2000). Use employee name, id, designation , salary as data member and inc_sal as member function.
// package lab;
import java.util.Scanner;
import java.util.Vector;
class Employee {
    String name;
    int id;
    String designation;
    double salary;
    Employee(String name, int id, String designation, double salary) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        this.salary = salary;
    }
    void inc_sal(){
        switch (this.designation.toLowerCase()) {
            case "manager":
                this.salary += 5000;                
                break;
            case "general manager":
                this.salary += 10000;                
                break;
            case "ceo":
                this.salary += 20000;
                break;
            case "worker":
                this.salary += 2000;
                break;
            default:
                break;
        }
    }
    @Override
    public String toString() {
        return "Name: " + name + ", ID: " + id + ", Designation: " + designation + ", Salary: " + salary;
    }
}
public class Main_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vector<Employee> employees = new Vector<>();
        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter name, ID, designation, and salary of Employee " + (i + 1) + ": \n");
            employees.add(new Employee(sc.next(), sc.nextInt(), sc.next(), sc.nextDouble()));
        }
        System.out.println("\nUpdated Employee Records:");
        for (Employee emp : employees) {
            emp.inc_sal();
            System.out.println(emp);
        }
        sc.close();
    }
}

// The toString method for class Object returns a string consisting of the name of the class of which the object is an instance,
// the at-sign character `@', and the unsigned hexadecimal representation of the hash code of the object.
// In other words, this method returns a string equal to the value of:
// getClass().getName() + '@' + Integer.toHexString(hashCode())
