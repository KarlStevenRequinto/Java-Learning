package BroCodeYoutube.LogicalOperators;

import java.util.Scanner;

import javax.swing.plaf.TreeUI;

public class Logicals {
    public static void main(String[] args) {
        // LOGICAL OPERATORS = USED TO CONNECT TWO OR MORE EXPRESSIONS
        // && (AND) = BOTH CONDITIONS MUST BE TRUE
        // || (OR) = EITHER CONDITION MUST BE TRUE
        // ! (NOT) = REVERSES BOOLEAN VALUE OF A CONDITION

        Scanner scan = new Scanner(System.in);

        System.out.println("You are playing a game! Press q or Q to quit");
        String response = scan.next();
        if (!response.equals("q") && !response.equals("Q")) {
            System.out.println("You are still playing the game!");

        } else {
            System.out.println("You quit the game. Goodbye!");

        }

        scan.close();
    }
}
