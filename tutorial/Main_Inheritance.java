import java.util.ArrayList;

abstract class Shape{
    double dim1, dim2, dim3;
    Shape(double d1, double d2, double d3){
        dim1 = d1;
        dim2 = d2;
        dim3 = d3;
    }
    Shape(double d1, double d2){
        dim1 = d1;
        dim2 = d2;
        dim3 = 0;
    }
    Shape(double d1){
        dim1 = d1;
        dim2 = 0;
        dim3 = 0;
    }
    abstract double area();
    abstract double volume();
}

class Cuboid extends Shape{
    Cuboid(double d1, double d2, double d3){
        super(d1,d2,d3);
    }
    @Override
    double area(){
        return 2*(dim1*dim2 + dim2*dim3 + dim1*dim3);
    }
    @Override
    double volume(){
        return dim1*dim2*dim3;
    }
}

class Sphere extends Shape{
    Sphere(double d1){
        super(d1);
    }
    @Override
    double area(){
        return 4*Math.PI*dim1*dim1;
    }
    @Override
    double volume(){
        return (4/3)*Math.PI*dim1*dim1*dim1;
    }
}

class Cylinder extends Shape{
    Cylinder(double d1, double d2){
        super(d1,d2);
    }
    @Override
    double area(){
        return 2*Math.PI*dim1*(dim1+dim2);
    }
    @Override
    double volume(){
        return Math.PI*dim1*dim1*dim2;
    }
}

public class Main_Inheritance {
    public static void main(String[] args) {
        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(new Cuboid(2, 3, 4));
        shapes.add(new Sphere(5));
        shapes.add(new Cylinder(3, 7));
        // iterator to iterate through the shapes list
        for (Shape shape : shapes){
            System.err.println(shape.getClass().getSimpleName());
            System.out.printf("Area: %.2f Volume: %.2f\n", shape.area(), shape.volume());
        }
    }   
}
