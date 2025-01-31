// Create a class Triangle add attributes and methods to it.
// Create another class TestTriangle to test the functionality of Triangle class.

class Triangle {
    private double s1, s2, s3;
    private double a1, a2, a3;

    Triangle(double s1, double s2, double s3) {
        if (isValidTriangle(s1, s2, s3)) {
            this.s1 = s1;
            this.s2 = s2;
            this.s3 = s3;
        } else {
            throw new IllegalArgumentException("The given sides do not form a valid triangle.");
        }
    }

    Triangle(double s1, double s2, double s3, double a1, double a2, double a3) {
        if (isValidTriangle(s1, s2, s3)) {
            this.s1 = s1;
            this.s2 = s2;
            this.s3 = s3;
            this.a1 = a1;
            this.a2 = a2;
            this.a3 = a3;
        } else {
            throw new IllegalArgumentException("The given sides do not form a valid triangle.");
        }
    }

    private boolean isValidTriangle(double s1, double s2, double s3) {
        return (s1 + s2 > s3 && s2 + s3 > s1 && s1 + s3 > s2);
    }

    double calculatePerimeter() {
        return s1 + s2 + s3;
    }

    void display() {
        System.out.println("Triangle Sides: " + s1 + ", " + s2 + ", " + s3);
        if (a1 > 0 && a2 > 0 && a3 > 0) {
            System.out.println("Triangle Angles: " + a1 + ", " + a2 + ", " + a3);
        } else {
            System.out.println("Angles are not provided.");
        }
    }
}

// Test class
class TestTriangle {
    public static void main(String[] args) {
        try {
            Triangle t1 = new Triangle(3, 4, 5);
            t1.display();
            System.out.println("Perimeter: " + t1.calculatePerimeter());

            Triangle t2 = new Triangle(1, 2, 10); // This will throw an exception
            t2.display();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
