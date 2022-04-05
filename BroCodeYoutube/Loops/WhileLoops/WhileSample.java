package BroCodeYoutube.Loops.WhileLoops;

import java.util.Scanner;

public class WhileSample {
    // WHILE LOOP = EXECUTES A BLOCK OF CODE AS LONG AS ITS CONDITION REMAINS TRUE
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = "";

        // WHILE LOOP
        // while (name.equals("")) {
        // System.out.print("Enter your name: ");
        // name = scan.nextLine();
        // }

        // DO WHILE LOOP
        do {
            System.out.print("Enter your name: ");
            name = scan.nextLine();
        } while (name.equals(""));

        System.out.println("Hello " + name);
        scan.close();
    }

}
