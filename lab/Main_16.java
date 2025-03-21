// Write a program in Java to use final variables, final methods and final classes. 
final class Vehicle {
    private final int maxSpeed;
    public Vehicle(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
    public final void displayInfo() {
        System.out.println("Max Speed: " + maxSpeed + " km/h");
    }
}
// class Car extends Vehicle { } // ERROR: Cannot inherit from final class
public class Main_16 {
    public static void main(String[] args) {
        Vehicle car = new Vehicle(180);
        car.displayInfo();
        // car.maxSpeed = 200;  // ERROR: Cannot modify final variable
    }
}