// package lab;

import java.util.Scanner;

public class lab02_UserInput {
    public static void main(String[] args) {
        //input string 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        //input integer
        System.out.println("Enter an integer: ");
        int num = sc.nextInt();
        System.out.println("You entered: " + str);
        System.out.println("You entered: " + num);
        sc.close();
    }
}
