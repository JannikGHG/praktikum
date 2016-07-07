package jan.praktikum;

import java.util.InputMismatchException;

/**
 * Created by Praktikant on 07.07.2016.
 */
public class Kassenbon {
    public static void main(String... args) {
        int AnzahlWurst = 0;
        int AnzahlKaese = 0;
        int AnzahlBrot = 0;
        int AnzahlDVD = 0;
        double EinzelPreisWurst = 2;
        double EinzelPreisKaese = 2;
        double EinzelPreisBrot = 2;
        double EinzelPreisDVD = 2;
        double GesamtPreisWurst = 0;
        double GesamtPreisKaese = 0;
        double GesamtPreisBrot = 0;
        double GesamtPreisDVD = 0;
        double Gesamt = 0;
        double Gegeben = 0;
        double Zurueck = 0;
        double Fehlt = 0;
        try {
            System.out.println("Wiviel Wurst möchtest du kaufen?");
            AnzahlWurst = new java.util.Scanner(System.in).nextInt();

            System.out.println("Wiviel Kaese möchtest du kaufen?");
            AnzahlKaese = new java.util.Scanner(System.in).nextInt();

            System.out.println("Wiviele Brote möchtest 2 kaufen?");
            AnzahlBrot = new java.util.Scanner(System.in).nextInt();

            System.out.println("Wiviele DVDs möchtest du kaufen?");
            AnzahlDVD = new java.util.Scanner(System.in).nextInt();

            System.out.println("Wiviel Geld hast du zur Verfügung?");
            Gegeben = new java.util.Scanner(System.in).nextDouble();

            GesamtPreisWurst = AnzahlWurst * EinzelPreisWurst;
            GesamtPreisKaese = AnzahlKaese * EinzelPreisKaese;
            GesamtPreisBrot = AnzahlBrot * EinzelPreisBrot;
            GesamtPreisDVD = AnzahlDVD * EinzelPreisDVD;
            Gesamt = GesamtPreisWurst + GesamtPreisKaese + GesamtPreisBrot + GesamtPreisDVD;
            if (Gesamt > Gegeben) {
                Fehlt = Gegeben - Gesamt;
                Fehlt = Fehlt * (-1);
                System.out.println("Oh! Dir fehlen " + Fehlt + " Euro!");
            }

            Zurueck = Gesamt - Gegeben;
            Zurueck = Zurueck * (-1);

            System.out.printf("Wurst%n");
            System.out.printf( GesamtPreisWurst + "%n");
            System.out.printf("Kaese%n");
            System.out.printf( GesamtPreisKaese + "%n");
            System.out.printf("Brot%n");
            System.out.printf( GesamtPreisBrot + "%n");
            System.out.printf("DVD%n");
            System.out.printf( GesamtPreisDVD + "%n");
            System.out.printf("%n");
            System.out.printf("Gesamt" + Gesamt + "%n");
            System.out.printf("Gegeben" + Gegeben + "%n");
            System.out.printf("%n");
            System.out.printf("Zurueck" + Zurueck + "%n");

        } catch (InputMismatchException E) {
            System.err.println("Falsche Eingabe!");
            E.printStackTrace();
        }
    }
}
