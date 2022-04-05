package BroCodeYoutube.StringClassMethods;

public class StringClass {
    // STRING = A REFERENCE DATA TYPE THAT CAN STORE ONE OR MORE CHARACTERS
    public static void main(String[] args) {
        String name = " Karl ";

        boolean resultEquals = name.equals("Wasd");
        int resultLength = name.length();
        char resultChar = name.charAt(0);
        int resultIndex = name.indexOf("a");
        boolean resultEmpty = name.isEmpty();
        String resultUpper = name.toUpperCase();
        String resultLower = name.toLowerCase();
        String resultTrim = name.trim();
        String resultReplace = name.replace("a", "A");
        System.out.println("result of resultEquals " + resultEquals);
        System.out.println("result of resultLength " + resultLength);
        System.out.println("result of resultChar " + resultChar);
        System.out.println("result of resultIndex " + resultIndex);
        System.out.println("result of resultEmpty " + resultEmpty);
        System.out.println("result of resultUpper " + resultUpper);
        System.out.println("result of resultLower " + resultLower);
        System.out.println("result of resultTrim " + resultTrim);
        System.out.println("result of resultReplace " + resultReplace);

    }
}
