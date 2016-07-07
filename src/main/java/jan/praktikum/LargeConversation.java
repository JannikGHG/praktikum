package jan.praktikum;

/**
 * Created by Praktikant on 05.07.2016.
 */
public class LargeConversation {
    public static void main(String... args) {
        System.out.println("Hey wie heißt du?");
        String name = new java.util.Scanner(System.in).nextLine();
        System.out.println("Ah dein Name ist also " + name + " !");
        System.out.println("Ich heiße Siri");
        System.out.println("Ich habe gehört du machst gerade ein Praktikum?");
        String praktikum = new java.util.Scanner(System.in).nextLine();
        if ("Ja".equalsIgnoreCase(praktikum)) {
            System.out.println("Wie viele Wochen dauert denn dein Praktikum?");
            double dauerpraktikum = new java.util.Scanner(System.in).nextDouble();
            double antwort = dauerpraktikum * 5;
            System.out.println("Wow das sind ja " + antwort + " Tage!");
            System.out.println("Und bei welcher Firma?");
            String firma = new java.util.Scanner(System.in).nextLine();
            if ("natcon7".equalsIgnoreCase(firma)) {
                System.out.println("Ah die kenne ich doch die macht doch Software für Kraftwerke!");
            } else
                System.out.println("Oh die Firma kenne ich leider nicht");
        } else
            System.out.println("Oh dann habe ich mich wohl vertan.");
            System.out.println("Ich muss weiter coden bin dann mal weg bye");
    }
}
