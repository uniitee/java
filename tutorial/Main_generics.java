// package tutorial;
// import java.util.*;

class GenericList<T> {
    @SuppressWarnings("unchecked")
    public T[] items = (T[]) new Object[10];
    private int count;

    public void add(T item) {
        items[count++] = item;
    }

    public T get(int index) {
        return items[index];
    }
}

public class Main_generics {
    // public static void main(String[] args){
        // Generics are a way to create classes, interfaces, and methods with a placeholder for the type of data they operate on.
        // This allows for code reusability and type safety.
        // Generics are defined using angle brackets <>.

        // ArrayList arrList = new ArrayList();
        // arrList.add("Hello");
        // arrList.add(123);
        // arrList.add(45.67);
        // arrList.add(true);
        // int a = arrList.get(2); // This will cause a compile-time error because the type is not specified.
        // int a = (int) arrList.get(2); .
    // }
        
        public static void main(String[] args){
        var list = new GenericList<String>();
        list.add("a");
        list.add("b");
        for (var item :list.items) {
            System.out.println(item);
        }
        list.items[0] = "c"; // This is allowed, but not type-safe
        System.out.println(list.items.length); 
    }
}
