package Section2.MathOperators;

public class MathOperations {
    public static void main(String[] args) {
        int bagOfSweet1 = 5;
        int bagOfSweet2 = 10;

        long starsInMilkyWay = 2500000000L;
        long starsInAndromeda = 10000000000L;

        double testScore = 6.7;
        double bonusMarks = 2.5;

        System.out.println("addition is: " + (bagOfSweet1 + bagOfSweet2));
        System.out.println("addition is: " + (starsInMilkyWay + starsInAndromeda));
        System.out.println("addition is: " + (testScore + bonusMarks));

        System.out.println("subtraction is: " + (bagOfSweet1 - bagOfSweet2));
        System.out.println("subtraction is: " + (starsInMilkyWay - starsInAndromeda));
        System.out.println("subtraction is: " + (testScore - bonusMarks));

        System.out.println("division is: " + (bagOfSweet1 / bagOfSweet2));
        System.out.println("division is: " + (starsInMilkyWay / starsInAndromeda));
        System.out.println("division is: " + (testScore / bonusMarks));

        System.out.println("multiplication is: " + (bagOfSweet1 * bagOfSweet2));
        System.out.println("multiplication is: " + (starsInMilkyWay * starsInAndromeda));
        System.out.println("multiplication is: " + (testScore * bonusMarks));

        System.out.println("remainder is: " + (bagOfSweet1 % bagOfSweet2));
        System.out.println("remainder is: " + (starsInMilkyWay % starsInAndromeda));
        System.out.println("remainder is: " + (testScore % bonusMarks));
    }
}
