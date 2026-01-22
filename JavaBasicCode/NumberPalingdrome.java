import java.util.Scanner;


public class NumberPalingdrome {
    
    public static void main(String[] args) {
        Scanner reff = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = reff.nextInt();
        
        int sum  = 0;
        while(num > 0){
            sum = sum * 10 + (num % 10);

            num /= 10;
        }
        System.out.println("The reverse of the number is: " + sum);
        reff.close();
    }
}
