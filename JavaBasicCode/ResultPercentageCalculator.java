import java.util.Scanner;


public class ResultPercentageCalculator {
    public static void main(String[] args){
        Scanner rslt = new Scanner(System.in);
        System.out.println("Enter marks of subject 1:");
        int sub1 = rslt.nextInt();
        System.out.println("Enter marks of subject 2:");
        int sub2 = rslt.nextInt();
        System.out.println("Enter marks of subject 3:");
        int sub3 = rslt.nextInt();
        int total = sub1 + sub2 + sub3;
        System.out.println("Total marks: " + total);
        System.out.println("Percentage: " + (total / 3.0) + "%");
        rslt.close(); // Closing the scanner resource
    }
    
}
