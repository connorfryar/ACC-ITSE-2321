// package findingSeed;

import java.util.Random;

public class SeedFinder {
    public static void main(String[] args) {
        // Loop through seeds from 1 to 1000
        for (long seed = 1; seed <= 1000; seed++) {
            if (checkSeed(seed)) {
                System.out.println("Found the correct seed: " + seed);
                break;
            }
        }
    }

    // Method to test if the given seed matches the target output
    private static boolean checkSeed(long seed) {
        Random generator = new Random(seed);  // Initialize random number generator with seed
        byte[] byteArray = new byte[100];     // Create a byte array with 100 elements
        generator.nextBytes(byteArray);       // Fill the array with random bytes

        // Extract required values
        int firstValue = byteArray[0];
        int lastValue = byteArray[99];
        double sum = 0;

        for (byte b : byteArray) {
            sum += b;
        }

        double average = sum / 100;

        // Check if the values match the given output
        return firstValue == -122 && lastValue == 113 && sum == 700.0 && average == 7.0;
    }
}
