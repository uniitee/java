// ArrayList  -> insertion and deletion is O(n) in the worst case, but O(1) in the best case (if you insert at the end of the list).
//            -> accesing elements is O(1) in the best and worst case (because it uses an array internally).
// LinkedList -> insertion and deletion is O(1) in the best case (if you insert at the beginning of the list), but O(n) in the worst case (if you insert at the end of the list).
//            -> accesing elements is O(n) in the best and worst case (because it uses a linked list internally). 

import java.util.*;
import java.util.LinkedList;

public class Main_LinkedList {
    public static void main(String[] args){
        LinkedList<Integer> l1 = new LinkedList<>(); // generics syntax with type parameter
        LinkedList<Integer> l2 = new LinkedList<>(); // generics syntax with type parameter
        l1.add(6);
        l1.add(7);
        l1.add(8);
        l1.add(6);
        l1.add(0,7);
        l2.add(10);
        l2.add(20);
        l2.add(30);
        l2.add(40);
        l2.add(50);

        l1.addAll(0,l2); // addAll() method to add all elements from l2 to l1 at index 0
        
        l1.remove(0); // remove() method to remove element at index 0
        
        l1.addLast(100); // addLast() method to add element at the end of the list
        l1.addFirst(200);// addFirst() method to add element at the beginning of the list
        
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