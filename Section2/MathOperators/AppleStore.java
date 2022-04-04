package Section2.MathOperators;

public class AppleStore {
    public static void main(String[] args) {
        int numOfApples = 0;
        int numOfCustomers = 0;
        double profit = 0;

        System.out.println("You picked 500 apples from an apple orchard");
        numOfApples += 500;
        System.out.println(numOfApples);

        System.out.println("Time for business! You're selling each apple for 40 cents");
        double applePrice = 0.40;

        System.out.println("One customer walked in. He bought 4 apples!");
        numOfApples -= 4;
        numOfCustomers += 1;
        System.out.println("apples left: " + (numOfApples));
        System.out.println("number of customers: " + (numOfCustomers));
        profit = (4 * applePrice);
        System.out.println("Current Profit: " + (profit));

        System.out.println("Another customer walked in. He bought 20 apples!");
        numOfApples -= 20;
        numOfCustomers += 1;
        System.out.println("apples left: " + (numOfApples));
        System.out.println("number of customers: " + (numOfCustomers));
        profit = +(20 * applePrice);

        System.out.println("Another customer walked in. She bought 200 apples!");
        numOfApples -= 200;
        numOfCustomers += 1;
        System.out.println("apples left: " + (numOfApples));
        System.out.println("number of customers: " + (numOfCustomers));
        profit = +(200 * applePrice);

        System.out.println("Wow! So far, you made: " + profit);
        System.out.println(numOfCustomers + " customers love your apples.");
        System.out.println("You have " + numOfApples + " apples left. We'll sell more tomorrow!");

    }
}
