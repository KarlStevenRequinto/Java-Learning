package BroCodeYoutube.GuiPractice;

import javax.swing.JOptionPane;
import java.util.*;

public class GuiPractice {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter your name");
        JOptionPane.showMessageDialog(null, "Hello " + name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
        JOptionPane.showMessageDialog(null, "You are " + age + " years old");
        JOptionPane.showMessageDialog(null, age + " is an " + ((Object) age).getClass().getSimpleName());

        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your age"));
        JOptionPane.showMessageDialog(null, "You are " + height + " cm tall");

    }
}
