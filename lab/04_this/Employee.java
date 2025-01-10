// WAP to increment the employee salaries on the basis of their designation(Manager-5000, General Manager-10000, CEO-20000, worker-2000).
// Use employee name, id, designation , salary as data member and inc_sal as member function.

import java.util.Scanner;

class Employee{
    String name; 
    int id;
    String designation;
    double salary;

    Employee(String name, int id, String designation, double salary){
        this.name = name;
        this.id = id;
        this.designation = designation;
        this.salary = salary;
    }
    Employee(){
        this.name = "";
        this.id = 0;
        this.designation = "";
        this.salary = 0;
    }

    void inc_sal(){
        switch (this.designation) {
            case "Manager":
                this.salary += 5000;                
                break;
            case "General Manager":
                this.salary += 10000;                
                break;
            case "CEO":
                this.salary += 20000;
                break;
            case "Worker":
                this.salary += 2000;
                break;
            default:
                break;
        }
    }

// The toString method for class Object returns a string consisting of the name of the class of which the object is an instance,
// the at-sign character `@', and the unsigned hexadecimal representation of the hash code of the object.
// In other words, this method returns a string equal to the value of:
// getClass().getName() + '@' + Integer.toHexString(hashCode())

    @Override
    public String toString() {
        return "Name: " + name + ", ID: " + id + ", Designation: " + designation + ", Salary: " + salary;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of employees: ");
        int n = sc.nextInt();
        Employee[] emp = new Employee[n];
        for(int i=0; i<n; i++){
            System.out.println("Enter the name, id, designation and salary of employee "+(i+1)+": ");
            emp[i] = new Employee(sc.next(), sc.nextInt(), sc.next(), sc.nextDouble());
        }
        for(int i=0; i<n; i++){
            emp[i].inc_sal();
            System.out.println("Employee "+(i+1)+": " +emp[i]);
        }
        sc.close();
            
    };
}