// 3.	WAP to read a set of numbers in an array & to find the sum and average of them.
// package lab;
import java.util.Scanner;
public class Main_03 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements to be added: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements: ");
        for ( int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int sum =0;
        for (int i = 0; i < n; i++){
            sum += arr[i];
        }
        System.out.println("Sum :" + sum);
        System.out.println("Average :" + sum/n);
    }
}