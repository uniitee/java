import java.util.Scanner;
class Geometry {
    double area(double radius) {
        return Math.PI * radius * radius;
    }
    double area(double length, double width) {
        return length * width;
    }
    double area(int side) {
        return side * side;
    }
    double area(double base, double height, boolean isTriangle) {
        return 0.5 * base * height;
    }
}
public class Main_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Geometry g = new Geometry();
        System.out.print("Enter radius of circle: ");
        System.out.println("Area: " + g.area(sc.nextDouble()));
        System.out.print("Enter length and width of rectangle: ");
        System.out.println("Area: " + g.area(sc.nextDouble(), sc.nextDouble()));
        System.out.print("Enter side of square: ");
        System.out.println("Area: " + g.area(sc.nextInt()));
        System.out.print("Enter base and height of triangle: ");
        System.out.println("Area: " + g.area(sc.nextDouble(), sc.nextDouble(), true));
        sc.close();
    }
}