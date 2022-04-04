package BroCodeYoutube.Randoms;

import java.util.Random;

public class RandomClassMain {
    public static void main(String[] args) {
        Random random = new Random();

        int integer = random.nextInt(6) + 1;
        double doubleNum = random.nextDouble();
        boolean tralse = random.nextBoolean();
        System.out.println(integer);
        System.out.println(doubleNum);
        System.out.println(tralse);
    }
}
