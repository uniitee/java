// package tutorial;
import java.util.*;

public class Main_ArrayList {
    public static void main(String[] args){
        ArrayList<Integer> l1 = new ArrayList<>(); // generics syntax with type parameter
        l1.add(6);
        l1.add(7);
        l1.add(8);
        l1.add(6);
        l1.add(0,7);
        ArrayList<Integer> l2 = new ArrayList<>(5); // generics syntax with type parameter
        l2.add(10);
        l2.add(20);
        l2.add(30);
        l2.add(40);
        l2.add(50);
        l1.addAll(0,l2); // addAll() method to add all elements from l2 to l1 at index 0

        l1.remove(0); // remove() method to remove element at index 0

        System.out.println(l1.contains(22));

        System.out.println(l1.indexOf(7)); 
        System.out.println(l1.lastIndexOf(7)); 

        l1.set(1,56);

        for( int i=0; i<l1.size(); i++){
            System.out.print(l1.get(i)); // get() method to retrieve elements
            // l1[i]; // ArrayList does not support indexing like arrays
            System.err.print(", ");
        }

    }
}
