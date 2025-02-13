interface Shape {
    String color = "red"; // This is now a constant
    void area();
    void perimeter();
}

class Circle implements Shape {
    int radius;

    Circle(int r) {
        this.radius = r;
    }

    @Override
    public void area() {
        System.out.println("Area: " + (22 * this.radius * this.radius) / 7);
    }

    @Override
    public void perimeter() {
        System.out.println("Perimeter: " + (2 * 22 * this.radius) / 7);
    }
}

public class InterfaceMain {
    public static void main(String[] args) {
        Circle c1 = new Circle(7);
        c1.area();
        c1.perimeter();
        System.out.println("Color: " + Shape.color); // Access interface constant
    }
}
