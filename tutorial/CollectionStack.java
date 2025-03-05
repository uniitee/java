import java.util.*;

public class CollectionStack{
    public static void main(String[] args){
        Stack<String> stack = new Stack<String>();
        stack.push("First");
        stack.push("Second");
        stack.push("Third");
        
        System.out.println(stack);
        
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        
        System.out.println(stack);
        
    }
}