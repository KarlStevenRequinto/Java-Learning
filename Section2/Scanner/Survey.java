package Section2.Scanner;

import java.util.Scanner;

public class Survey {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = scan.nextLine();
        System.out.println("Welcome " + name);

        System.out.println("How much do you spend on coffee?");
        double coffeePrice = scan.nextDouble();
        System.out.println(coffeePrice);

        scan.close();
    }
}
