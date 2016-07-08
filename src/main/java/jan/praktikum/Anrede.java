package jan.praktikum;


/**
 * Created by Praktikant on 08.07.2016.
 */
public class Anrede {
    public static void main(String... args) {
        String nachname;
        System.out.print("Wie ist ihr Nachname?");
        nachname = Terminal.readString();
        int geschlecht;
        System.out.print("Von welchem Geschlecht sind sie(1=Mann)(2=Frau)(3=anderes)?");
        geschlecht = Terminal.readInt();
        switch (geschlecht) {
            case(1): //
                System.out.print("Hallo Herr " + nachname);
                break;
            case(2): //
                System.out.print("Hallo Frau " + nachname);
                break;
            case(3): //
                System.out.print("Hallo" + nachname);
        }
    }
}
