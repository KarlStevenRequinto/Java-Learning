package BroCodeYoutube.Objects.Exceptions;

import java.util.Scanner;

public class Main {
	//EXCEPTIONS = AN EVENT THAT OCCURS DURING THE EXECUTION OF A PROGRAM THAT,
	//             DISRUPTS THE NORMAL FLOW OF INSTRUCTIONS
	
	public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
		try {
			
			System.out.println("Enter a whole number to divide: ");
			int x = scan.nextInt();
		
			System.out.println("Enter a whole number to divide: ");
			int y = scan.nextInt();
		
			System.out.println("Result is "+ x/y);
		} catch (Exception e) {
			System.out.println("You cant divide like that idiot");
		} finally {
			System.out.println("This will always execute");
		}
		
		scan.close();
	}
}
