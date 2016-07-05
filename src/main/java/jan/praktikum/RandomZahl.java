package jan.praktikum;

import java.util.Random;

/**
 * Created by Praktikant on 05.07.2016.
 */
public class RandomZahl {
    public static void main(String... args) throws InterruptedException {
        while (true) {
            double number = Math.random();
            System.out.println(number);
            Thread.sleep(500);
        }
    }
}
