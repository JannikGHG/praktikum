package jan.praktikum;

import com.sun.org.apache.bcel.internal.generic.BREAKPOINT;

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
        double EinzelPreisWurst = 4.20;
        double EinzelPreisKaese = 2.30;
        double EinzelPreisBrot = 2.10;
        double EinzelPreisDVD = 12.00;
        double GesamtPreisWurst = 0;
        double GesamtPreisKaese = 0;
        double GesamtPreisBrot = 0;
        double GesamtPreisDVD = 0;
        double Gesamt = 0;
        double Gegeben = 0;
        double Zurueck = 0;
        double Fehlt = 0;
        try {
            System.out.println("Willkommen bei der Rand OHG!");
            System.out.println("Bitte geben sie die gewünschte Anzahl an Lebensmitteln an!");
            System.out.println("Wiviel Wurst möchtest du kaufen?");
            AnzahlWurst = new java.util.Scanner(System.in).nextInt();

            System.out.println("Wiviel Käse möchtest du kaufen?");
            AnzahlKaese = new java.util.Scanner(System.in).nextInt();

            System.out.println("Wiviele Brote möchtest du kaufen?");
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
                System.exit(0);
            }

            Zurueck = Gesamt - Gegeben;
            Zurueck = Zurueck * (-1);

            System.out.printf("Wurst %5d x %.2f EUR%n", AnzahlWurst, EinzelPreisWurst);
            System.out.printf("%24.2f EUR%n", GesamtPreisWurst);
            System.out.printf("Käse %6d x %.2f EUR%n", AnzahlKaese, EinzelPreisKaese);
            System.out.printf("%24.2f EUR%n", GesamtPreisKaese);
            System.out.printf("Brot %6d x %.2f EUR%n", AnzahlBrot, EinzelPreisBrot);
            System.out.printf("%24.2f EUR%n", GesamtPreisBrot);
            System.out.printf("DVD %7d x %.2f EUR%n", AnzahlDVD, EinzelPreisDVD);
            System.out.printf("%24.2f EUR%n", GesamtPreisDVD);
            System.out.printf("----------------------------%n");
            System.out.printf("Gesamt %17.2f EUR%n", Gesamt);
            System.out.printf("Gegeben %16.2f EUR%n", Gegeben);
            System.out.printf("%n");
            System.out.printf("Zurück %17.2f EUR%n", Zurueck);
            System.out.printf("%n");
            System.out.printf("Vielen Dank für ihren%n");
            System.out.printf("Besuch bei der RandOHG!%n");

        } catch (InputMismatchException E) {
            System.err.println("Falsche Eingabe!");
            System.err.println("Bitte nochmal versuchen!");
        }
    }
}
