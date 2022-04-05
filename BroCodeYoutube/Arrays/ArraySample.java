package BroCodeYoutube.Arrays;

import java.util.Scanner;

public class ArraySample {
    // ARRAYS = USED TO STORE MULTIPLE VALUES IN A SINGLE VARIABLE
    public static void main(String[] args) {
        // String[] cars = { "Car1", "Car2", "Car3", "Car4", "Car5", "Car6" };
        // for (int i = 0; i < cars.length; i++) {
        // System.out.println(cars[i]);
        // }

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter how many items are inside the array");
        int number = scan.nextInt();

        String[] carsAgain = new String[number + 1];
        System.out.println("Enter the items");
        for (int j = 0; j < carsAgain.length; j++) {
            carsAgain[j] = scan.nextLine();
        }
        System.out.println();
        System.out.println("The elements inside the array are:");
        for (String element : carsAgain) {
            System.out.println(element);
        }
        scan.close();
    }
}
