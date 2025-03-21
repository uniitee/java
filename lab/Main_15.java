// Write a program in Java to create an immutable class.
final class Person {
    private final String name;
    private final int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public void display() {
        System.out.println("Person Details:");
        System.out.println("Name: " + name + ", Age: " + age);
    }
}
public class Main_15 {
    public static void main(String[] args) {
        Person p = new Person("Alice", 25);
        p.display();
        // Uncommenting this will cause an error (immutable object)
        // p.name = "Bob";  // ERROR: Cannot modify final fields
    }
}
