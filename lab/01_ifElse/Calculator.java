
// use of switch case, nested if-else, recursion
import java.util.Scanner;

public class Calculator {
    public static int add(int a, int b){
        return a + b;
    }
    public static int substract(int a, int b){
        return a - b;
    } 
    public static int multiply(int a, int b){
        return a * b;
    }
    public static int divide(int a, int b){
        return a / b;
    }
    public static int factorial(int n){
        if(n < 0){
            return -1;
        }
        else{
            if (n == 0){
                return 1;
            } else {
                return n* factorial(n-1);
            }
        }
    }
    public static void main(String[] args){
        char operator;
        System.out.println("Enter the operator: ");
        Scanner sc = new Scanner(System.in);
        operator = sc.next().charAt(0);
        sc.close();
        switch(operator){
            case '+':
                System.out.println("The sum is: " + add(10,20));
                break;
            case '-':
                System.out.println("The difference is: " + substract(10,20));
                break;
            case '*':
                System.out.println("The product is: " + multiply(10,20));
                break;
            case '/':
                System.out.println("The quotient is: " + divide(10,20));
                break;
            case '!':
                System.out.println("The factorial is: " + factorial(5));
                break;
            default:
                System.out.println("Invalid operator");
        }

    }
    
}