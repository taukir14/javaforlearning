import java.util.Scanner;

public class JavaInput {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter an integer: ");
        int userInput = sc.nextInt();
        System.out.println("You entered: " + userInput);

        sc.nextLine(); // buffer clear করার জন্য

        System.out.println("Enter a string: ");
        String userString = sc.nextLine();
        System.out.println("You entered: " + userString);

        System.out.println("Enter a float: ");
        float f = sc.nextFloat();
        System.out.println("You entered float: " + f);

        System.out.println("Enter a double: ");
        double d = sc.nextDouble();
        System.out.println("You entered double: " + d);

        sc.close();
    }
}
