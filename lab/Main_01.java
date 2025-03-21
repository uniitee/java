// 1.	WAP to find greatest of three numbers. 
// package lab;
import java.util.Scanner;
public class Main_01 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        sc.close();
        // int max = Math.max(a, Math.max(b,c));
        int max = (a>b)?(a>c?a:c):(b>c?b:c);
        System.out.println("The greatest number is: " + max);
    }
}