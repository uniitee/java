// class Person{
//     double height;
//     double weight;
//     char gender;
//     Person(double height, double weight, String gender){
//         this.height = height;
//         this.weight = weight;
//         this.gender = gender.toUpperCase().charAt(0);
//     }
// }
// interface Employee{
//     public String designation="";
//     public double salary=0;
//     void empDetails();
// }

// class Teacher extends Person implements Employee{
//     String name;
//     Teacher(double h, double w, String g, String n){
//         super(h,w,g);
//         this.name = n;
//     }
//     void empDetails(String desig, double sal){
//         this.designation = desig;
//         this.salary = sal;
//         System.out.println("Designation: "+this.designation);
//         System.out.println("Salary: "+this.salary);
//     }
// }

// public class InheritMain{
//     public static void main(String[] args){
//         Teacher t = new Teacher(5.5, 60, "M", "John");
//         t.empDetails("Professor", 50000);
//         System.out.println("Name: "+t.name);
//         System.out.println("Height: "+t.height);
//         System.out.println("Weight: "+t.weight);

//     }

// }

class Person {
    double height;
    double weight;
    char gender;
    Person(double height, double weight, String gender) {
        this.height = height;
        this.weight = weight;
        this.gender = gender.toUpperCase().charAt(0);
    }
}

interface Employee {
    String designation = "";
    double salary = 0.0;
    void empDetails(); // Method signature, no parameters in interface
}

class Teacher extends Person implements Employee {
    String name;
    String designation;
    double salary;
    Teacher(double h, double w, String g, String n) {
        super(h, w, g);
        this.name = n;
    }    
    // Implementing empDetails method from the Employee interface
    public void empDetails() {
        // You can initialize designation and salary here, or you could set them in a constructor
        this.designation = "Teacher";
        this.salary = 50000.0; // Example salary
    }
}

public class InheritMain {
    public static void main(String[] args) {
        Teacher teacher = new Teacher(5.8, 70, "Male", "John");
        teacher.empDetails(); // Call empDetails to set designation and salary
        System.out.println("Name: " + teacher.name);
        System.out.println("Designation: " + teacher.designation);
        System.out.println("Salary: " + teacher.salary);
    }
}
