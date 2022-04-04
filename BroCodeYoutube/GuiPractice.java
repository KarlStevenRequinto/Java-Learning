package BroCodeYoutube;

import javax.swing.JOptionPane;
import java.util.*;

public class GuiPractice {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter your name");
        JOptionPane.showMessageDialog(null, "Hello " + name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
        JOptionPane.showMessageDialog(null, "You are " + age + " years old");
        JOptionPane.showMessageDialog(null, age + " is an " + ((Object) age).getClass().getSimpleName());
        // System.out.println();
        // if (age == (int) age) {
        // System.out.println("True");
        // } else {
        // System.out.println("False");
        // }

    }
}
