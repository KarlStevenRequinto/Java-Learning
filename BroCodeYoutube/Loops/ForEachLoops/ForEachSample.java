package BroCodeYoutube.Loops.ForEachLoops;

import java.util.ArrayList;
import java.util.Scanner;

public class ForEachSample {
    // FOR-EACH = TRAVERSING TECHNIQUE TO ITERATE THROUGH THE ELEMENTS IN AN
    // ARRAY/COLLECTION
    public static void main(String[] args) {
        // String[] animals = { "cat", "dog", "rat", "bird" };
        ArrayList<String> animals = new ArrayList<String>();
        Scanner scan = new Scanner(System.in);
        System.out.println("Please add an animal in the array");
        animals.add(scan.nextLine());

        System.out.println("The animals in the array are: ");
        for (String element : animals) {
            System.out.println(element);
        }

        scan.close();
    }
}
