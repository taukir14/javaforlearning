import java.util.Scanner; // Scanner ক্লাস ইম্পোর্ট করা
// Scanner ক্লাস ব্যবহার করে ইউজার থেকে ইনপুট নেওয়ার উদাহরণ
// Scanner ক্লাসটি java.util প্যাকেজের অংশ
// Scanner ক্লাসটি ব্যবহার করতে হলে প্রথমে এটি ইম্পোর্ট করতে হবে
// Scanner ক্লাসটি বিভিন্ন ধরনের ইনপুট নেওয়ার জন্য বিভিন্ন মেথড প্রদান করে যেমন nextInt(), nextLine(), nextFloat(), nextDouble() ইত্যাদি
// Scanner ক্লাসটি ব্যবহার করার পরে এটি বন্ধ করা উচিত যাতে রিসোর্স লিক না হয়
// Scanner ক্লাসটি ব্যবহার করার সময় ইনপুটের ধরন অনুযায়ী সঠিক মেথড ব্যবহার করতে হবে
// উদাহরণস্বরূপ, পূর্ণসংখ্যা ইনপুট নেওয়ার জন্য nextInt() মেথড ব্যবহার করতে হবে, স্ট্রিং ইনপুট নেওয়ার জন্য nextLine() মেথড ব্যবহার করতে হবে ইত্যাদি
// Scanner ক্লাসটি ব্যবহার করার সময় ইনপুট নেওয়ার পরে প্রয়োজন হলে বাফার ক্লিয়ার করতে হবে
// যেমন, nextInt() মেথড ব্যবহার করার পরে nextLine() মেথড ব্যবহার করলে বাফার ক্লিয়ার করতে হবে


public class JavaInput {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // Scanner অবজেক্ট তৈরি করা

        System.out.println("Enter an integer: "); // ইউজারকে একটি পূর্ণসংখ্যা ইনপুট দিতে বলা
        int userInput = sc.nextInt(); // পূর্ণসংখ্যা ইনপুট নেওয়া
        System.out.println("You entered: " + userInput); // ইনপুট প্রদর্শন করা

        sc.nextLine(); // buffer clear করার জন্য

        System.out.println("Enter a string: "); // ইউজারকে একটি স্ট্রিং ইনপুট দিতে বলা
        String userString = sc.nextLine(); // স্ট্রিং ইনপুট নেওয়া
        System.out.println("You entered: " + userString); // ইনপুট প্রদর্শন করা

        System.out.println("Enter a float: "); // ইউজারকে একটি ফ্লোট ইনপুট দিতে বলা
        float f = sc.nextFloat(); // float ইনপুট নেওয়ার জন্য
        System.out.println("You entered float: " + f); // ইনপুট প্রদর্শন করা

        System.out.println("Enter a double: "); // ইউজারকে একটি ডাবল ইনপুট দিতে বলা
        double d = sc.nextDouble(); // double ইনপুট নেওয়ার জন্য
        System.out.println("You entered double: " + d); // ইনপুট প্রদর্শন করা

        sc.close(); // resource বন্ধ করার জন্য 
        // Scanner ক্লাস ব্যবহার করার পরে এটি বন্ধ করা উচিত যাতে রিসোর্স লিক না হয়
        // Scanner ক্লাসটি ব্যবহার করার সময় ইনপুটের ধরন অনুযায়ী সঠিক মেথড ব্যবহার করতে হবে
        // উদাহরণস্বরূপ, পূর্ণসংখ্যা ইনপুট নেওয়ার জন্য nextInt() মেথড ব্যবহার করতে হবে, স্ট্রিং ইনপুট নেওয়ার জন্য nextLine() মেথড ব্যবহার করতে হবে ইত্যাদি
        // Scanner ক্লাসটি ব্যবহার করার সময় ইনপুট নেওয়ার পরে প্রয়োজন হলে বাফার ক্লিয়ার করতে হবে
        // যেমন, nextInt() মেথড ব্যবহার করার পরে nextLine() মেথড ব্যবহার করলে বাফার ক্লিয়ার করতে হবে
    }
}
