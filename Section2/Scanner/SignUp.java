package Section2.Scanner;

import java.util.Scanner;

public class SignUp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to JavaGram! Let's sign you up.");

        // Task 1 - Using Scanner, ask the user questions

        // Ask for their first name.
        System.out.println("\nPlease enter your first name.");
        String firstName = scan.nextLine();

        // Ask for their last name.
        System.out.println("\nPlease enter your last name.");
        String lastName = scan.nextLine();

        // Ask: how old are you?
        System.out.println("\nPlease enter your age.");
        int age = scan.nextInt();

        // Ask them to make a username.
        System.out.println("\nPlease enter your desired username");
        String userName = scan.nextLine();

        // Ask what city they live in.
        System.out.println("\nPlease enter your city address.");
        String city = scan.nextLine();

        // Ask what country that's from.
        System.out.println("Please enter your country.");
        String country = scan.nextLine();
        // Task 2 - Print their information.

        System.out.println("\nThank you for joining JavaGram!");

        // Print their information like so:
        System.out.println("\nPlease verify your information.");
        // Your information:

        // First Name: Rayan
        System.out.println("First Name: " + firstName);
        // Last Name: Slim
        System.out.println("Last Name: " + lastName);
        // Age: 27
        System.out.println("Age: " + age);
        // Username: monotonic_relu
        System.out.println("Username " + userName);
        // City: Ottawa
        System.out.println("City Address " + city);
        // Country: Canada
        System.out.println("Country: " + country);
        //

        // close scanner. It's good practice :D !
        scan.close();
    }
}
