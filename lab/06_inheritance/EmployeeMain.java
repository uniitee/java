// Create a class Employee. Create 3 more classes namely, Programmer, Analyst & Project Leader. 
// Take attributes and operations on your own

class Employee {
    String name;
    int age;
    String designation;
    double salary;

    Employee(String name, int age, String designation, double salary) {
        this.name = name;
        this.age = age;
        this.designation = designation;
        this.salary = salary;
    }
    void display(){
        System.out.println("\n"+ this.getClass().getName());
        System.out.println( "Name:" + name + " Age:" + age + " Designation:" + designation + " Salary:" + salary);
    }
}

class Programmer extends Employee{
    String language;
    Programmer(String name, int age, String designation, double salary, String language) {
        super(name, age, designation, salary); 
        this.language = language;
    }
    @Override
    void display() {
        super.display();
        System.out.println("Programming_Language: " + language);
    }
}

class Analyst extends Employee{
    String domain;
    Analyst(String name, int age, String designation, double salary, String domain){
        super(name, age, designation, salary);
        this.domain = domain;
    }
    @Override
    void display() {
        super.display();
        System.out.println("Domain: " + domain); 
    }
}

class ProjectLeader extends Employee{
    String project;
    ProjectLeader(String name, int age, String designation, double salary, String project){
        super(name, age, designation, salary);
        this.project = project;
    }
    @Override
    void display() {
        super.display();
        System.out.println("Project: " + project); 
    }
}

public class EmployeeMain {
    public static void main(String  args[]){
        Programmer p = new Programmer("MiLady", 20, "Programmer", 1500000, "Java");
        Analyst a = new Analyst("MiLord", 21, "Analyst", 2000000, "Data_Science");
        ProjectLeader pl = new ProjectLeader("MiJesty", 21, "Project_Leader", 3000000, "Data_Science");
        p.display();
        a.display();
        pl.display();
    }
}