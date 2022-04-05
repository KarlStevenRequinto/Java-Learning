package BroCodeYoutube.StringClassMethods;

public class StringClass {
    // STRING = A REFERENCE DATA TYPE THAT CAN STORE ONE OR MORE CHARACTERS
    public static void main(String[] args) {
        String name = "Karl";

        boolean resultEquals = name.equals("Wasd");
        int resultLength = name.length();
        char resultChar = name.charAt(0);
        int resultIndex = name.indexOf("a");
        boolean resultEmpty = name.isEmpty();
        String resultUpper = name.toUpperCase();
        String resultLower = name.toLowerCase();
        String resultTrim = name.trim();
        System.out.println("result of trim " + resultEquals);
        System.out.println("result of trim " + resultLength);
        System.out.println("result of trim " + resultChar);
        System.out.println("result of trim " + resultIndex);
        System.out.println("result of trim " + resultEmpty);
        System.out.println("result of trim " + resultUpper);
        System.out.println("result of trim " + resultLower);
        System.out.println("result of trim " + resultTrim);
    }
}
