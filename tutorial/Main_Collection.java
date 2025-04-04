// package tutorial;
import java.util.Collection.*;

class GenericList<T> {
    public T[] items = (T[]) new Object[10];
    private int count;
    public void add(T item) {items[count++] =item;}
    public T get(int index) {return items[index];}
}

public class Main_Collection {
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
