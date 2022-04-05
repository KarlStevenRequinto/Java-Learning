package BroCodeYoutube.ArrayLists;

import java.util.ArrayList;

public class ArrayListSample {
    // ARRAYLIST = A TYPE OF RESIZABLE ARRAYS
    // ELEMENTS CAN BE REMOVED AND ADDED AFTER THE COMPILATION PHASE
    // CAN STORE REFERENCE DATA TYPES
    public static void main(String[] args) {
        ArrayList<String> food = new ArrayList<String>();
        food.add("first food");
        food.add("second food");
        food.add("third food");

        // int index = 0;
        // for (String element : food) {
        // System.out.println(element + " - " + index++);

        // }
        System.out.println("The original content of the ArrayList");
        System.out.println(food);
        // CHANGING THE VALUE OF A CERTAIN INDEX
        food.set(1, "replaced food");

        // REMOVING AN ELEMENT USING INDEX
        food.remove(0);

        for (int i = 0; i < food.size(); i++) {
            System.out.println(food.get(i));
        }

        // TO REMOVE ALL ELEMENTS IN THE LIST
        food.clear();
        System.out.println("This is the arraylist after clear method");

        // for (int i = 0; i < food.size(); i++) {

        // System.out.println(food.get(i));
        // }
        System.out.println(food);
        System.out.println(food.size());

        System.out.println("Nothing left");

    }
}
