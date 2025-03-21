// 16.	Write a program with given interfaces MotorBike and Cycle, then implement in child class TwoWheeler and display distance & speed.
// Interface for MotorBike
interface MotorBike {
    int maxSpeed = 150; // Default max speed
    void setSpeed(int speed);
}

// Interface for Cycle
interface Cycle {
    int maxDistance = 100; // Default max distance
    void setDistance(int distance);
}

// TwoWheeler class implementing both interfaces
class TwoWheeler implements MotorBike, Cycle {
    private int speed;
    private int distance;

    // Implementing setSpeed method
    public void setSpeed(int speed) {
        this.speed = Math.min(speed, maxSpeed); // Ensures speed is within limit
    }

    // Implementing setDistance method
    public void setDistance(int distance) {
        this.distance = Math.min(distance, maxDistance); // Ensures distance is within limit
    }

    // Display method
    public void display() {
        System.out.println("TwoWheeler Details:");
        System.out.println("Speed: " + speed + " km/h");
        System.out.println("Distance: " + distance + " km");
    }
}

// Driver Class
public class Main_14 {
    public static void main(String[] args) {
        TwoWheeler bike = new TwoWheeler();
        bike.setSpeed(120);
        bike.setDistance(90);
        bike.display();
    }
}
