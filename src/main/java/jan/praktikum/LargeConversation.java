package jan.praktikum;

/**
 * Created by Praktikant on 05.07.2016.
 */
public class LargeConversation {
    public static void main( String... args )
    {
        System.out.println("Hey wie heißt du?");
        String name = new java.util.Scanner ( System.in ).nextLine();
        System.out.println("Ah dein Name ist also " + name + " !");
        System.out.println("Machst du gerade ein Praktikum?");
        String praktikum = new java.util.Scanner ( System.in ).nextLine();
        if (praktikum == "Ja") {
            System.out.println("Und bei welcher Firma?");
            String firma = new java.util.Scanner ( System.in ).nextLine();
            if (firma == "") {
                System.out.println("Ah die kenne ich doch die macht doch Software für Kraftwerke!");

            }
         else {
                System.out.println("Na dann wünsche ich dir noch einen schönen Tag!");
            }
        }

    }
}