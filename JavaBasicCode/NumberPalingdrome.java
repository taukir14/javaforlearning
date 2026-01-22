import java.util.Scanner;
// Program to check if a number is a palindrome 
// and to print its reverse
// A palindrome number reads the same backward as forward
// Example: 121, 1331, 12321

public class NumberPalingdrome {
    
    public static void main(String[] args) {
        Scanner reff = new Scanner(System.in);
        System.out.print("Enter a number :");
        int num = reff.nextInt();
        int real = num; // Store the original number
        
        int sum  = 0;
        while(0 < num){
            sum = sum * 10 + (num % 10);

            num /= 10;
        }
        System.out.println("The reverse of the number is: " + sum);
       
        if(sum == real){
            System.out.println("The number is a palindrome.");
        } 
        else {
            System.out.println("The number is not a palindrome.");
        }
        reff.close(); // Close the scanner
    }
}
