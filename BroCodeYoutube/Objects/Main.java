package BroCodeYoutube.Objects;

public class Main {
    public static void main(String[] args) {
        Cars myCar1 = new Cars();
        Cars myCar2 = new Cars();
        System.out.println(myCar1.make);
        System.out.println(myCar2.make);
        
        myCar1.brake();
        myCar1.drive();
    }
}
