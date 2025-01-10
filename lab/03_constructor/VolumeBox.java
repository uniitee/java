import java.util.Scanner;

public class VolumeBox {
    public static void main(String[] args){
        int l, b, h;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length: ");
        l = sc.nextInt();
        System.out.println("Enter the breadth: ");
        b = sc.nextInt();
        System.out.println("Enter the height: ");
        h = sc.nextInt(); 
        
        Box b1 = new Box(l, b, h);
        Box b2 = new Box();
        Box b3 = new Box(l);

        System.out.println("Volume of b1: " + b1.volume());
        System.out.println("Volume of b2: " + b2.volume());
        System.out.println("Volume of b3: " + b3.volume());
    }
}

class Box {
    int length, breadth, height;
    Box(int l, int b, int h) {
        length = l;
        breadth = b;
        height = h;
    }
    Box() {
        length = breadth = height = 0;
    }
    Box(int len) {
        length = breadth = height = len;
    }
    int volume() {
        return length * breadth * height;
    }
}
