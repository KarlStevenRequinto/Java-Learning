package BroCodeYoutube.Methods;

public class Overloading {
    // OVERLOADED METHODS = METHODS THAT SHARE THE SAME NAME BUT HAVE DIFFERENT
    // PARAMETERS
    public static void main(String[] args) {
        int x = add(1, 2, 3);
        System.out.println(x);
    }

    static int add(int a, int b) {
        System.out.println("This is overload method 1");
        return a + b;
    }

    static int add(int c, int d, int e) {
        System.out.println("This is overload method 2");
        return d + c + e;
    }
}
