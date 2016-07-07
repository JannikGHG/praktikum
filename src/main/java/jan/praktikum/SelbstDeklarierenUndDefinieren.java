package jan.praktikum;

/**
 * Created by Praktikant on 07.07.2016.
 */
public class SelbstDeklarierenUndDefinieren {
    public static void main(String... args) {
        int birnen;

        birnen = 3;

        System.out.println("3 erwartet: " + birnen);
        birnen = birnen + 5;

        System.out.println("8 erwartet: " + birnen);
        int aepfel = 5;

        System.out.println("5 erwartet: " + aepfel);
        aepfel = aepfel - 2;

        System.out.println("3 erwartet: " + aepfel);
    }
}
