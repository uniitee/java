// WAP to calculate factorial of a number using command line arguments. 
package lab;
public class Main_02 { 
    public static void main(String[] args){ 
        if (args.length == 0){ 
            System.out.println("Please provide a number as command line argument"); 
            return; 
        } 
        try{ 
            int n = Integer.parseInt(args[0]); 
            if (n < 0) { 
                System.out.println("Number should be positive."); 
                return; 
            } 
            long fac = 1; 
            for (int i = 2; i <= n; i++){ 
                fac *= i;  
            } 
            System.out.println("Factorial: " + fac); 
        } catch (NumberFormatException e) { 
            System.out.println("Enter a number."); 

        } 

    } 

} 