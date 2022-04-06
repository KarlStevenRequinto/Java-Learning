package BroCodeYoutube.Methods;

import javax.print.DocFlavor.CHAR_ARRAY;
import javax.print.DocFlavor.STRING;

public class PrintfMethod {
    // printf() = AN OPTIONAL METHOD TO CONTROL, FORMAT, AND DISPLAY TEXT TO THE
    // CONSOLE WINDOW
    // TWO ARGUMENTS = FORMAT STRING + (OBJECT/VARIABLE/VALUE)
    // %[FLAGS [PRECISION] [WIDTH] [CONVERSION-CHARACTER]
    public static void main(String[] args) {
        // System.out.printf("%d This is a text", 123);

        boolean myBoolean = true;
        char myChar = '$';
        String myString = "This is a String";
        int myInt = 40;
        double myDouble = 2555.36537;

        // %b = WILL PRESENT BOOLEAN
        // %c = WILL PRESENT CHAR
        // %s = WILL PRESENT STRING
        // %d = WILL PRESENT INTEGER
        // %f = WILL PRESENT DOUBLE
        // System.out.printf("%c", myChar);
        // System.out.printf("%b", myBoolean);
        // System.out.printf("%s", myString);
        // System.out.printf("%d", myInt);
        // System.out.printf("%f", myDouble);

        // [WIDTH]
        // MINIMUM NUMBER OF CHARACTERS TO BE WRITTEN AS OUTPUT
        // System.out.printf("%20s", myString);

        // [PRECISION]
        // SETS NUMBER OF DIGITS OF PRECISION WHEN OUTPUTTING FLOATING-POINT VALUES
        // System.out.printf("%.1f", myDouble);

        // [FLAGS]
        // ADDS AN EFFECT TO OUTPUT BASED ON THE FLAG ADDED TO FORMAT SPECIFIER
        // - : LEFT-JUSTIFY
        // + : OUTPUT A PLUS ( + ) OR MINUS ( - ) SIGN FOR A NUMERIC VALUE
        // 0 : NUMERIC VALUES ARE ZERO-PADDED
        // , : COMMA GROUPING SEPARATOR IF NUMBERS > 1000
        System.out.printf("You have this much money %,f", myDouble);

    }
}
