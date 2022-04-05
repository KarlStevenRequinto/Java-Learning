package BroCodeYoutube.Arrays;

public class TwoDArrays {
    // 2D ARRAY = AN ARRAY OF AN ARRAY

    public static void main(String[] args) {
        String[][] cars = {
                { "car-0-0", "car-0-1", "car-0-2" },
                { "car-1-0", "car-1-1", "car-1-2" },
                { "car-2-0", "car-2-1", "car-2-2" },
                { "car-3-0", "car-3-1", "car-3-2" }
        };

        // cars[0][0] = "car-0-0";
        // cars[0][1] = "car-0-1";
        // cars[0][2] = "car-0-2";
        // cars[1][0] = "car-1-0";
        // cars[1][1] = "car-1-1";
        // cars[1][2] = "car-1-2";
        // cars[2][0] = "car-2-0";
        // cars[2][1] = "car-2-1";
        // cars[2][2] = "car-2-2";
        // cars[3][0] = "car-3-0";
        // cars[3][1] = "car-3-1";
        // cars[3][2] = "car-3-2";

        for (int i = 0; i < cars.length; i++) {
            System.out.println();
            for (int j = 0; j < cars[i].length; j++) {
                System.out.print(cars[i][j] + " ** ");
            }

        }

    }
}
