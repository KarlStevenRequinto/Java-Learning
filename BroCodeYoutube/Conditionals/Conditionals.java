package BroCodeYoutube.Conditionals;

import javax.swing.JOptionPane;

public class Conditionals {
    public static void main(String[] args) {
        String day = JOptionPane.showInputDialog("Enter what day today");
        switch (day) {
            case "Monday":
                JOptionPane.showMessageDialog(null, "Today is the first day of the week");
                break;
            case "Tuesday":
                JOptionPane.showMessageDialog(null, "Today is the second day of the week");
                break;
            case "Wednesday":
                JOptionPane.showMessageDialog(null, "Today is the third day of the week");
                break;
            case "Thursday":
                JOptionPane.showMessageDialog(null, "Today is the fourth day of the week");
                break;
            case "Friday":
                JOptionPane.showMessageDialog(null, "Thank God its Friday!");
                break;
            case "Saturday":
                JOptionPane.showMessageDialog(null, "Happy Weekend!");
                break;
            case "Sunday":
                JOptionPane.showMessageDialog(null, "Have a great family day!");
                break;
            default:
                JOptionPane.showMessageDialog(null, "What the fuck is that?");

        }
    }
}
