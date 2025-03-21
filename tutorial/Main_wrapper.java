public class Main_wrapper {
    public static void main(String[] args) {
        // Converting int to Integer (Autoboxing)
        int num = 10;
        Integer wrappedNum = num; // Autoboxing
        System.out.println("Integer Object: " + wrappedNum);

        // Converting Integer to int (Unboxing)
        Integer obj = new Integer(20); // Explicit Object Creation
        int primitiveNum = obj; // Unboxing
        System.out.println("Primitive int: " + primitiveNum);

        // Using Wrapper Class Methods
        System.out.println("Max Value of Integer: " + Integer.MAX_VALUE);
        System.out.println("Parsed Integer from String: " + Integer.parseInt("123"));
    }
}
