// 12.	WAP to create and handle your own Exception.
class AgeException extends Exception {
    public AgeException(String message) {
        super(message);
    }
}
class Voter {
    static void checkEligibility(int age) throws AgeException {
        if (age < 18) {
            throw new AgeException("You must be 18 or older to vote!");
        }
        System.out.println("You are eligible to vote.");
    }
}
public class Main_12 {
    public static void main(String[] args) {
        try {
            Voter.checkEligibility(16); // Will throw AgeException
        } catch (AgeException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}