package BroCodeYoutube.Methods;

import java.util.Scanner;

public class MethodSample {
    // METHOD = A BLOCK OF CODE THAT IS EXECUTED WHENEVER IT IS CALLED UPON
    public static void main(String[] args) {
        // String name = "Lerd";
        // int age = 21;
        // hello(name, age);
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter two numbers");
        int firstNum = scan.nextInt();
        int secondNum = scan.nextInt();

        System.out.println(sum(firstNum, secondNum));
        scan.close();
    }

    static void hello(String winner, int myAge) {
        System.out.println("This method is called to say Hello to " + winner + ". He is " + myAge + " years old");
    }

    // CREATE A METHOD TO ADD TWO NUMBERS
    static int sum(int x, int y) {

        return x + y;

    }
}