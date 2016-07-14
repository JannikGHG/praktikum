package jan.praktikum;

/**
 * Created by Praktikant on 14.07.2016.
 */
public class ZweiUndVierzigProzent {
    public static void main (String... args) {
        double randomValue = Math.random();
        if (randomValue>0.42) {
            System.out.println("Verloren!");
        }
            else {
                System.out.println("Gewonnen!");
        }
    }
}
