package BroCodeYoutube.Loops.NestedLoops;

import java.util.Scanner;

public class NestedLoopSample {
    // NESTED LOOP = LOOP INSIDE A LOOP
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = scan.nextInt();

        System.out.print("Enter number of columns: ");
        int columns = scan.nextInt();

        System.out.print("Enter symbol to use: ");
        String symbol = scan.next();

        for (int i = 1; i <= rows; i++) {
            System.out.println();
            for (int j = 1; j <= columns; j++) {
                System.out.print(symbol);
            }
        }

        scan.close();
    }
}
