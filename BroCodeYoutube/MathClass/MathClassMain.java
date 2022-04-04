package BroCodeYoutube.MathClass;

import javax.swing.JOptionPane;

public class MathClassMain {
    public static void main(String[] args) {

        // CREATE A PROGRAM TO FIND THE HYPOTENUSE OF A TRIANGLE

        // SIDES OF THE TRIANGLE
        double sideA = Double.parseDouble(JOptionPane.showInputDialog("Enter length of first side of a triangle"));
        double sideB = Double.parseDouble(JOptionPane.showInputDialog("Enter length of second side of a triangle"));

        // SOLVING FOR THE HYPOTENUSE SIDE
        double hyp = Math.sqrt(Math.pow(sideA, 2) + Math.pow(sideB, 2));
        JOptionPane.showMessageDialog(null, "The hypotenuse of this triangle is " + hyp);

    }
}
