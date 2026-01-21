import java.util.Scanner;
// ResultPercentageCalculator ক্লাসটি ব্যবহারকারীর কাছ থেকে তিনটি বিষয়ের মার্কস ইনপুট নিয়ে মোট এবং শতাংশ হিসাব করে প্রদর্শন করে
// Scanner ক্লাসটি ব্যবহার করে ইনপুট নেওয়া হয়েছে
// মোট মার্কস এবং শতাংশ হিসাব করার জন্য সহজ গাণিতিক অপারেশন ব্যবহার করা হয়েছে
// ইনপুট নেওয়ার পরে Scanner অবজেক্টটি বন্ধ করা হয়েছে যাতে রিসোর্স লিক না হয়
// প্রতিটি বিষয়ের মার্কস পূর্ণসংখ্যা হিসেবে নেওয়া হয়েছে এবং শতাংশ দশমিক সহ প্রদর্শন করা হয়েছে
// উদাহরণস্বরূপ, যদি ব্যবহারকারী 80, 90, এবং 70 ইনপুট দেয়, তাহলে মোট হবে 240 এবং শতাংশ হবে 80.0%
// প্রোগ্রামটি কনসোল আউটপুটে ফলাফল প্রদর্শন করে 
// যেমন: Total marks: 240 এবং Percentage: 80.0%


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
