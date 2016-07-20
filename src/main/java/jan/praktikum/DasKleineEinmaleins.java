package jan.praktikum;

/**
 * Created by Praktikant on 15.07.2016.
 */
public class DasKleineEinmaleins {
    public static void main (String... args) {

        for( int z = 1; z <= 10; z++) {
            for( int s = 1; s <= 10; s++) {
                if (z * s < 10) System.out.print(" ");
                if (z * s < 100) System.out.print(" ");
                System.out.print("  " + z * s);
            }
            System.out.println();
        }

    }
}
