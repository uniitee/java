// package tutorial;

interface GreetPerson{
    void sayHi();
    void sayHello(String name);
}

@FunctionalInterface
interface CheckPerson {
    void testAge (int age);
}

public class Main_Lambda{
    public static void main(String[] args){

        // ____________________________________________________________________________

        // Anonymous class 
        // -> a class without a name
        // -> defined and instantiated in a single expression.
        // -> used when you need to create a class that will be used only once.
        
        GreetPerson obj = new GreetPerson(){
            public void sayHi(){
                System.out.println("Hi from Anonymous class!");
            }
            public void sayHello(String name){
                System.out.println("Hello, " + name + " from Anonymous class!");
            }
        };
        
        // Because an anonymous class definition is an expression, it must be part of a statement.
        obj.sayHello("John");

        // ____________________________________________________________________________
        
        // Lambda expression 
        // -> concise way to represent an anonymous function (a function without a name).
        // -> used to implement functional interfaces (SAM).
        // ternary operators -> choosing between values, if-else statements -> choosing between actions.

        CheckPerson check = (age)->{System.out.println("You are " + (age >= 18 ? "an adult" : "a minor") + ".");};
        check.testAge(20);
        check.testAge(15);

        // ____________________________________________________________________________
    }
}

// InterfaceName n1 = new InterfaceName(){ public void func(){}; };
// FuncInterfaceName f1 = (var) -> {  S.o.p("...");};