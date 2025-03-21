// 16.	Write a program with given interfaces MotorBike and Cycle, then implement in child class TwoWheeler and display distance & speed.
interface MotorBike {
    int maxSpeed = 150; 
    void setSpeed(int speed);
}
interface Cycle {
    int maxDistance = 100; 
    void setDistance(int distance);
}
class TwoWheeler implements MotorBike, Cycle {
    private int speed;
    private int distance;
    public void setSpeed(int speed) {
        this.speed = Math.min(speed, maxSpeed); 
    }
    public void setDistance(int distance) {
        this.distance = Math.min(distance, maxDistance); 
    }
    public void display() {
        System.out.println("TwoWheeler Details:");
        System.out.println("Speed: " + speed + " km/h");
        System.out.println("Distance: " + distance + " km");
    }
}
public class Main_14 {
    public static void main(String[] args) {
        TwoWheeler bike = new TwoWheeler();
        bike.setSpeed(120);
        bike.setDistance(90);
        bike.display();
    }
}
