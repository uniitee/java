// public class Main {
//     public static void main(String[] args){
//         int a = 1920;
//         int b = 0;
//         try {
//             int c = a/b;
//             System.out.println("The result is:" + c); 
//             // Exception in thread "main" java.lang.ArithmeticException: / by zero
//         }
//         catch(Exception e){
//             System.out.println("we failed to divide by zero"+ e.getMessage());
//         }
//         System.out.println("This is the end of the program");
//     }
// }


// class Division {
//     // This method declares that it might throw an ArithmeticException
//     static int divide(int a, int b) throws ArithmeticException {
//         if (b == 0) {
//             throw new ArithmeticException("Cannot divide by zero");
//         }
//         return a / b;
//     }
// }
// public class Main {
//     public static void main(String[] args) {
//         try {
//             int result = Division.divide(10, 0); // This will throw an exception
//             System.out.println("Result: " + result);
//         } catch (ArithmeticException e) {
//             System.out.println("Exception caught: " + e.getMessage());
//         }
//     }
// }


// Define a custom checked exception
class AgeException extends Exception {
    public AgeException(String message) {
        super(message);
    }
}
class Voter {
    // Method that throws the custom exception
    static void checkEligibility(int age) throws AgeException {
        if (age < 18) {
            throw new AgeException("You must be 18 or older to vote!");
        }
        System.out.println("You are eligible to vote.");
    }
}
public class Main {
    public static void main(String[] args) {
        try {
            Voter.checkEligibility(16); // Will throw AgeException
        } catch (AgeException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
