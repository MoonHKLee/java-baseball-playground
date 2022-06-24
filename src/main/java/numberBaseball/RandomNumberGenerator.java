package numberBaseball;

import java.util.Random;

public class RandomNumberGenerator {
    private static final int BOUND = 10;
    private static boolean[] usedNumberCheckingArray = new boolean[BOUND];
    private static final Random random = new Random();

    private RandomNumberGenerator() {

    }

    public static String generate() {
        init();
        return String.valueOf(getRandomNumber())
            + getRandomNumber()
            + getRandomNumber();
    }

    private static int getRandomNumber() {
        int number = 0;
        while(usedNumberCheckingArray[number]) {
            number = random.nextInt(BOUND);
        }
        usedNumberCheckingArray[number] = true;
        return number;
    }

    private static void init() {
        cleanArray();
        usedNumberCheckingArray[0] = true;
    }

    private static void cleanArray() {
        for (int i = 0; i < BOUND; i++) {
            usedNumberCheckingArray[i] = false;
        }
    }
}
